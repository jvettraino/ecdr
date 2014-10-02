package cdr.ddf.search.util;

import org.junit.Assert;
import org.junit.Test;

import cdr.ddf.commons.query.util.GeospatialHelper;

public class GeospatialHelperTest {

    @Test
    public void testPolygonToWKT() {
        String wkt = GeospatialHelper.polygonToWKT( "45.256,-110.45,46.46,-109.48,43.84,-109.86,45.256,-110.45" );
        Assert.assertEquals( "WKT not expected value from polygon", "POLYGON((-110.45 45.256,-109.86 43.84,-109.48 46.46,-110.45 45.256))", wkt );
    }

}