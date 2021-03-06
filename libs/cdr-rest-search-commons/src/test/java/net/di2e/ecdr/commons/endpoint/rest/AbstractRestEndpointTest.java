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
package net.di2e.ecdr.commons.endpoint.rest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import javax.ws.rs.core.MultivaluedMap;

import net.di2e.ecdr.commons.constants.SearchConstants;

import org.apache.cxf.jaxrs.impl.MetadataMap;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit tests for BasicQueryParser class
 */
public class AbstractRestEndpointTest {

    @Test
    public void testGetGeoRSSFormat() {

        AbstractRestSearchEndpoint endpoint = Mockito.mock( AbstractRestSearchEndpoint.class, Mockito.CALLS_REAL_METHODS );

        MultivaluedMap<String, String> props = new MetadataMap<String, String>();
        Assert.assertNull( endpoint.getGeoRSSFormat( props ) );
        
        props.putSingle( SearchConstants.GEORSS_RESULT_FORMAT_PARAMETER, null );
        Assert.assertNull( endpoint.getGeoRSSFormat( props ) );

        props.clear();
        props.putSingle( SearchConstants.GEORSS_RESULT_FORMAT_PARAMETER, "" );

        props.clear();
        props.putSingle( SearchConstants.GEORSS_RESULT_FORMAT_PARAMETER, "value" );
        assertEquals( "value", endpoint.getGeoRSSFormat( props ) );
        
        props.clear();
        props.put( SearchConstants.GEORSS_RESULT_FORMAT_PARAMETER, Arrays.asList( "value1", "value2" ) );
        assertEquals( "value1", endpoint.getGeoRSSFormat( props ) );
    }
}
