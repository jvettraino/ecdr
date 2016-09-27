//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package us.gov.ic.cvenum.ism.nonuscontrols;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVEnumISMNonUSControlsValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVEnumISMNonUSControlsValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ATOMAL"/&gt;
 *     &lt;enumeration value="BOHEMIA"/&gt;
 *     &lt;enumeration value="BALK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVEnumISMNonUSControlsValues", namespace = "urn:us:gov:ic:cvenum:ism:nonuscontrols")
@XmlEnum
public enum CVEnumISMNonUSControlsValues {


    /**
     * (U) NATO Atomal mark
     * 
     */
    ATOMAL,

    /**
     * (U) NATO Bohemia mark
     * 
     */
    BOHEMIA,

    /**
     * (U) NATO Balk mark
     * 
     */
    BALK;

    public String value() {
        return name();
    }

    public static CVEnumISMNonUSControlsValues fromValue(String v) {
        return valueOf(v);
    }

}