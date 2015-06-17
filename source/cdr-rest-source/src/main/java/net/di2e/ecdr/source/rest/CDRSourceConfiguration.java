/**
 * Copyright (C) 2014 Cohesive Integrations, LLC (info@cohesiveintegrations.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.di2e.ecdr.source.rest;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.net.ssl.KeyManager;

import net.di2e.ecdr.api.cache.Cache;
import net.di2e.ecdr.api.cache.CacheManager;
import net.di2e.ecdr.commons.constants.SearchConstants;
import net.di2e.ecdr.commons.filter.config.AtomSearchResponseTransformerConfig;
import net.di2e.ecdr.commons.filter.config.AtomSearchResponseTransformerConfig.AtomContentXmlWrapOption;
import net.di2e.ecdr.commons.util.SearchUtils;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.KeyManagerUtils;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;
import org.opengis.filter.sort.SortBy;
import org.opengis.filter.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ddf.catalog.data.Metacard;
import ddf.catalog.util.impl.MaskableImpl;

public abstract class CDRSourceConfiguration extends MaskableImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger( CDRSourceConfiguration.class );
    private static final String SSL_KEYSTORE_JAVA_PROPERTY = "javax.net.ssl.keyStore";
    private static final String SSL_KEYSTORE_PASSWORD_JAVA_PROPERTY = "javax.net.ssl.keyStorePassword";

    public enum PingMethod {
        GET, HEAD, NONE
    }

    // matches 'user-friendly' OS terms with parameter
    private static Map<String, String> parameterMatchMap = new HashMap<>();

    static {
        parameterMatchMap.put( "os:searchTerms", SearchConstants.KEYWORD_PARAMETER );
        parameterMatchMap.put( "os:count", SearchConstants.COUNT_PARAMETER );
        parameterMatchMap.put( "os:startIndex", SearchConstants.STARTINDEX_PARAMETER );
        parameterMatchMap.put( "cdrs:timeout", SearchConstants.TIMEOUT_PARAMETER );
        parameterMatchMap.put( "cdrsx:originQueryID", SearchConstants.OID_PARAMETER );
        parameterMatchMap.put( "ddf:resource-uri", SearchConstants.RESOURCE_URI_PARAMETER );
        parameterMatchMap.put( "cdrb:path", SearchConstants.PATH_PARAMETER );
        parameterMatchMap.put( "cdrsx:strictMode", SearchConstants.STRICTMODE_PARAMETER );
        parameterMatchMap.put( "cdrsx:caseSensitive", SearchConstants.CASESENSITIVE_PARAMETER );
        parameterMatchMap.put( "ecdr:fuzzy", SearchConstants.FUZZY_PARAMETER );
        parameterMatchMap.put( "ecdr:collections", SearchConstants.CONTENT_COLLECTIONS_PARAMETER );
        parameterMatchMap.put( "ddf:metadata-content-type", SearchConstants.CONTENT_TYPE_PARAMETER );
        parameterMatchMap.put( "ecdr:textPath", SearchConstants.TEXTPATH_PARAMETER );
        parameterMatchMap.put( "time:start", SearchConstants.STARTDATE_PARAMETER );
        parameterMatchMap.put( "time:end", SearchConstants.ENDDATE_PARAMETER );
        parameterMatchMap.put( "cdrsx:dateType", SearchConstants.DATETYPE_PARAMETER );
        parameterMatchMap.put( "time:relation", SearchConstants.DATE_RELATION_PARAMETER );
        parameterMatchMap.put( "geo:uid", SearchConstants.UID_PARAMETER );
        parameterMatchMap.put( "geo:box", SearchConstants.BOX_PARAMETER );
        parameterMatchMap.put( "geo:lat", SearchConstants.LATITUDE_PARAMETER );
        parameterMatchMap.put( "geo:lon", SearchConstants.LONGITUDE_PARAMETER );
        parameterMatchMap.put( "geo:radius", SearchConstants.RADIUS_PARAMETER );
        parameterMatchMap.put( "geo:geometry", SearchConstants.GEOMETRY_PARAMETER );
        parameterMatchMap.put( "geo:polygon", SearchConstants.POLYGON_PARAMETER );
        parameterMatchMap.put( "geo:spatialOp", SearchConstants.GEO_RELATION_PARAMETER );
        parameterMatchMap.put( "sru:sortKeys", SearchConstants.SORTKEYS_PARAMETER );
    }

    private AtomSearchResponseTransformerConfig atomTransformerConfig = null;
    private CacheManager<Metacard> cacheManager = null;
    private Cache<Metacard> metacardCache = null;
    private String cacheId = null;

    private long receiveTimeout = 0;
    private long connectionTimeout = 30000;
    private long availableCheckCacheTime = 120000;
    private int maxResultsCount = 0;

    private boolean disableCNCheck = false;
    private boolean sendSecurityCookie = false;
    private PingMethod pingMethod = PingMethod.HEAD;

    private String responseTransformer = null;

    private Map<String, String> hardcodedParamMap = new HashMap<String, String>();
    private Map<String, String> parameterMap = new HashMap<>();
    private Map<String, String> sortMap = Collections.emptyMap();

    public CDRSourceConfiguration( CacheManager<Metacard> manager ) {
        super();
        hardcodedParamMap.put( SearchConstants.FORMAT_PARAMETER, "atom-ddms" );
        hardcodedParamMap.put( SearchConstants.QUERYLANGUAGE_PARAMETER, SearchConstants.CDR_CQL_QUERY_LANGUAGE );
        cacheManager = manager;
        atomTransformerConfig = new AtomSearchResponseTransformerConfig();
    }

    protected abstract WebClient getRestClient();

    protected abstract void setRestClient( WebClient webClient );

    protected abstract WebClient getPingClient();

    protected abstract void setPingClient( WebClient webClient );

    public void setId( String sourceId ) {
        LOGGER.debug( "ConfigUpdate: Updating the id value from [{}] to [{}]", getId(), sourceId );
        super.setId( sourceId );
    }

    public synchronized void setUrl( String endpointUrl ) {
        String existingUrl = getRestClient() == null ? null : getRestClient().getCurrentURI().toString();
        if ( StringUtils.isNotBlank( endpointUrl ) && !endpointUrl.equals( existingUrl ) ) {
            LOGGER.debug( "ConfigUpdate: Updating the source endpoint url value from [{}] to [{}] for sourceId [{}]", existingUrl, endpointUrl, getId() );
            setRestClient( WebClient.create( endpointUrl, true ) );

            HTTPConduit conduit = WebClient.getConfig( getRestClient() ).getHttpConduit();
            conduit.getClient().setReceiveTimeout( receiveTimeout );
            conduit.getClient().setConnectionTimeout( connectionTimeout );
            conduit.setTlsClientParameters( getTlsClientParameters() );
        } else {
            LOGGER.warn( "OpenSearch Source Endpoint URL is not a valid value (either blank or same as previous value), so cannot update [{}]", endpointUrl );
        }
    }

    public void setReceiveTimeoutSeconds( Integer seconds ) {
        seconds = seconds == null ? 0 : seconds;
        long millis = seconds * 1000L;
        if ( millis != receiveTimeout ) {
            LOGGER.debug( "ConfigUpdate: Updating the source endpoint receive timeout value from [{}] to [{}] milliseconds", receiveTimeout, millis );
            receiveTimeout = millis;
            WebClient.getConfig( getRestClient() ).getHttpConduit().getClient().setReceiveTimeout( receiveTimeout );
        }
    }

    public void setConnectionTimeoutSeconds( Integer seconds ) {
        seconds = seconds == null ? 0 : seconds;
        long millis = seconds * 1000L;
        if ( millis != connectionTimeout ) {
            LOGGER.debug( "ConfigUpdate: Updating the source endpoint connection timeout value from [{}] to [{}] milliseconds", connectionTimeout, millis );
            connectionTimeout = millis;
            WebClient.getConfig( getRestClient() ).getHttpConduit().getClient().setConnectionTimeout( connectionTimeout );
        }
    }

    public synchronized void setPingUrl( String url ) {
        if ( StringUtils.isNotBlank( url ) ) {
            LOGGER.debug( "ConfigUpdate: Updating the ping (site availability check) endpoint url value from [{}] to [{}]", getPingClient() == null ? null : getPingClient().getCurrentURI()
                    .toString(), url );

            setPingClient( WebClient.create( url, true ) );

            HTTPConduit conduit = WebClient.getConfig( getPingClient() ).getHttpConduit();
            conduit.getClient().setReceiveTimeout( receiveTimeout );
            conduit.getClient().setConnectionTimeout( connectionTimeout );
            conduit.setTlsClientParameters( getTlsClientParameters() );
        } else {
            LOGGER.debug( "ConfigUpdate: Updating the ping (site availability check) endpoint url to [null], will not be performing ping checks" );
        }
    }

    public void setPingMethodString( String method ) {
        try {
            LOGGER.debug( "ConfigUpdate: Updating the httpPing method value from [{}] to [{}]", pingMethod, method );
            if ( method != null ) {
                pingMethod = PingMethod.valueOf( method );
            }
        } catch ( IllegalArgumentException e ) {
            LOGGER.warn( "Could not update the http ping method due to invalid valus [{}], so leaving at [{}]", method, pingMethod );
        }
    }

    /**
     * Sets the time (in seconds) that availability should be cached (that is, the minimum amount of time between 2
     * perform availability checks). For example if set to 60 seconds, then if an availability check is called 30
     * seconds after a previous availability check was called, the second call will just return a cache value and not do
     * another check.
     * <p/>
     * This settings allow admins to ensure that a site is not overloaded with availability checks
     *
     * @param newCacheTime
     *            New time period, in seconds, to check the availability of the federated source.
     */
    public void setAvailableCheckCacheTime( long newCacheTime ) {
        if ( newCacheTime < 1 ) {
            newCacheTime = 1;
        }
        LOGGER.debug( "ConfigUpdate: Updating the Available Check Cache Time value from [{}] to [{}] seconds", availableCheckCacheTime / 1000, newCacheTime );
        this.availableCheckCacheTime = newCacheTime * 1000;
    }

    public void setResponseTransformer( String transformer ) {
        LOGGER.debug( "ConfigUpdate: Updating the ResponseTransformer value from [{}] to [{}]", responseTransformer, transformer );
        this.responseTransformer = transformer;
    }

    public void setWrapContentWithXmlOption( String option ) {
        LOGGER.debug( "ConfigUpdate: Updating the WrapContentWithXmlOption value from [{}] to [{}]", atomTransformerConfig.getAtomContentXmlWrapOption(), option );
        atomTransformerConfig.setAtomContentXmlWrapOption( AtomContentXmlWrapOption.valueOf( option ) );
    }

    public void setThumbnailLinkRelation( String rel ) {
        LOGGER.debug( "ConfigUpdate: Updating the Thumbnail Link Relation value from [{}] to [{}]", atomTransformerConfig.getThumbnailLinkRelation(), rel );
        atomTransformerConfig.setThumbnailLinkRelation( rel );
    }

    public void setMetadataLinkRelation( String rel ) {
        LOGGER.debug( "ConfigUpdate: Updating the Metadata Link Relation value from [{}] to [{}]", atomTransformerConfig.getMetadataLinkRelation(), rel );
        atomTransformerConfig.setMetadataLinkRelation( rel );
    }

    public void setProductLinkRelation( String rel ) {
        LOGGER.debug( "ConfigUpdate: Updating the Product Link Relation value from [{}] to [{}]", atomTransformerConfig.getProductLinkRelation(), rel );
        atomTransformerConfig.setProductLinkRelation( rel );
    }

    public void setProxyProductUrls( boolean proxy ) {
        LOGGER.debug( "ConfigUpdate: Updating the Proxy URLs through Local Instance value from [{}] to [{}]", atomTransformerConfig.isProxyProductUrl(), proxy );
        atomTransformerConfig.setProxyProductUrl( proxy );
    }

    public void setStartIndexStartNumber( String startNumber ) {
        try {
            // get the existing start index (0 or 1) to use in the log statement after setting the index
            String oldIndex = atomTransformerConfig.isZeroBasedStartIndex() ? "0" : "1";
            atomTransformerConfig.setZeroBasedStartIndex( Integer.parseInt( startNumber ) == 0 );
            LOGGER.debug( "ConfigUpdate: Updating the Start Index Numbering value from [{}] to [{}]", oldIndex, startNumber );
        } catch ( NumberFormatException e ) {
            LOGGER.warn( "ConfigUpdate Failed: Attempted to update the 'start index number method' due to non valid (must be 1 or 0) start index numbering passed in[" + startNumber + "]" );
        }
    }

    public void setHardCodedParameters( List<String> hardcodedString ) {
        LOGGER.debug( "ConfigUpdate: Updating the hard coded parameters to [{}]", hardcodedString );
        hardcodedParamMap = SearchUtils.convertToMap( hardcodedString );
    }

    public void setParameterMap( String parameterMapStr ) {
        Map<String, String> convertedMap = SearchUtils.convertToMap( parameterMapStr );
        Map<String, String> translateMap = new HashMap<>( convertedMap.size() );
        for ( Entry<String, String> entry : convertedMap.entrySet() ) {
            if ( parameterMatchMap.containsKey( entry.getKey() ) ) {
                translateMap.put( parameterMatchMap.get( entry.getKey() ), entry.getValue() );
            } else {
                translateMap.put( entry.getKey(), entry.getValue() );
            }
        }
        LOGGER.debug( "ConfigUpdate: Updating parameterMap with new entries: {}", convertedMap.toString() );
        parameterMap = translateMap;
    }

    public void setCacheExpirationMinutes( Long minutes ) {
        if ( minutes == null || minutes == 0 ) {
            LOGGER.debug( "ConfigUpdate: Clearing any existing cached Metacards, and no longer using the Cache for id lookups for source [{}]", getId() );
            if ( metacardCache != null ) {
                metacardCache.destroy();
            }
        } else {
            if ( metacardCache != null ) {
                metacardCache.destroy();
                cacheManager.removeCacheInstance( cacheId );
            }
            cacheId = getId() + "-" + UUID.randomUUID();
            LOGGER.debug( "ConfigUpdate: Creating a cache with id [{}] for Metacard id lookups for source [{}] with an cache expiration time of [{}] minutes", cacheId, getId(), minutes );

            Map<String, Object> cacheProps = new HashMap<String, Object>();
            cacheProps.put( CacheManager.CACHE_EXPIRE_AFTER_MINUTES, minutes );

            metacardCache = cacheManager.createCacheInstance( cacheId, cacheProps );
        }
    }

    public void setSortMap( List<String> sortMapStr ) {
        Map<String, String> convertedMap = SearchUtils.convertToMap( sortMapStr );
        LOGGER.debug( "ConfigUpdate: Updating sortMap with new entries: {}", convertedMap );
        sortMap = convertedMap;
    }

    public void setDisableCNCheck( boolean disableCheck ) {
        LOGGER.debug( "ConfigUpdate: Updating the Disable CN Check (for certificates) boolean value from [{}] to [{}]", disableCNCheck, disableCheck );
        this.disableCNCheck = disableCheck;
    }

    public void setSendSecurityCookie( boolean sendCookie ) {
        LOGGER.debug( "ConfigUpdate: Updating the Send Security Cookie boolean value from [{}] to [{}]", sendSecurityCookie, sendCookie );
        this.sendSecurityCookie = sendCookie;
    }

    public void setMaxResultCount( Integer count ) {
        count = count == null ? 0 : count;
        LOGGER.debug( "ConfigUpdate: Updating the max results count value from [{}] to [{}]", maxResultsCount, count );
        maxResultsCount = count;

    }

    protected Cache<Metacard> getMetacardCache() {
        return metacardCache;
    }

    protected Map<String, String> getParameterMap() {
        return parameterMap;
    }

    protected Map<String, String> getHardcodedQueryParameters() {
        return hardcodedParamMap;
    }

    protected AtomSearchResponseTransformerConfig getAtomResponseTransformerConfig() {
        return atomTransformerConfig;
    }

    protected PingMethod getPingMethod() {
        return pingMethod;
    }

    protected long getAvailableCheckCacheTime() {
        return availableCheckCacheTime;
    }

    protected String getResponseTransformerName() {
        return responseTransformer;
    }

    protected boolean isSendSecurityCookie() {
        return sendSecurityCookie;
    }

    protected long getMaxResultsCount() {
        return maxResultsCount;
    }

    protected String getSortOrderString( SortBy sortBy ) {
        String sortOrderString = null;
        if ( sortBy != null ) {
            SortOrder sortOrder = sortBy.getSortOrder();
            String sortField = sortMap.get( sortBy.getPropertyName().getPropertyName() );
            if ( sortField != null ) {
                sortOrderString = sortField + (SortOrder.DESCENDING.equals( sortOrder ) ? ",,false" : ",,true");
            }
        }
        return sortOrderString;
    }

    public void cleanUp() {
        LOGGER.debug( "Shutting down CDR Federated Source with id [{}]", getId() );
        if ( metacardCache != null ) {
            metacardCache.destroy();
        }
    }

    /*
     * This method is needed because of a CXF deficiency of not using the keystore values from the java system
     * properties. So this specifically pulls the values from the system properties then sets them to a KeyManager being
     * used
     */
    protected TLSClientParameters getTlsClientParameters() {
        TLSClientParameters tlsClientParameters = new TLSClientParameters();
        tlsClientParameters.setDisableCNCheck( disableCNCheck );
        String keystore = System.getProperty( SSL_KEYSTORE_JAVA_PROPERTY );
        String keystorePassword = System.getProperty( SSL_KEYSTORE_PASSWORD_JAVA_PROPERTY );

        KeyManager[] keyManagers = null;
        if ( StringUtils.isNotBlank( keystore ) && keystorePassword != null ) {
            try {
                KeyManager manager = KeyManagerUtils.createClientKeyManager( new File( keystore ), keystorePassword );
                keyManagers = new KeyManager[1];
                keyManagers[0] = manager;

            } catch ( IOException | GeneralSecurityException ex ) {
                LOGGER.debug( "Could not access keystore {}, using default java keystore.", keystore );
            }
        }

        LOGGER.debug( "Setting the CXF KeyManager and TrustManager based on the Platform Global Configuration values" );
        tlsClientParameters.setKeyManagers( keyManagers );
        return tlsClientParameters;

    }

}
