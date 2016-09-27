//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package us.mil.ces.metadata.ddms._5;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom2;
import org.jvnet.jaxb2_commons.lang.MergeStrategy2;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for FacilityIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="beNumber" use="required" type="{urn:us:mil:ces:metadata:ddms:5}simpleTokenType" /&gt;
 *       &lt;attribute name="osuffix" type="{urn:us:mil:ces:metadata:ddms:5}simpleTokenType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityIdentifierType")
public class FacilityIdentifierType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "beNumber", namespace = "urn:us:mil:ces:metadata:ddms:5", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @NotNull(message = "FacilityIdentifierType.beNumber {javax.validation.constraints.NotNull.message}")
    @Size(min = 1)
    protected String beNumber;
    @XmlAttribute(name = "osuffix", namespace = "urn:us:mil:ces:metadata:ddms:5")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @Size(min = 1)
    protected String osuffix;

    /**
     * Gets the value of the beNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeNumber() {
        return beNumber;
    }

    /**
     * Sets the value of the beNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeNumber(String value) {
        this.beNumber = value;
    }

    public boolean isSetBeNumber() {
        return (this.beNumber!= null);
    }

    /**
     * Gets the value of the osuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsuffix() {
        return osuffix;
    }

    /**
     * Sets the value of the osuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsuffix(String value) {
        this.osuffix = value;
    }

    public boolean isSetOsuffix() {
        return (this.osuffix!= null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theBeNumber;
            theBeNumber = this.getBeNumber();
            strategy.appendField(locator, this, "beNumber", buffer, theBeNumber, this.isSetBeNumber());
        }
        {
            String theOsuffix;
            theOsuffix = this.getOsuffix();
            strategy.appendField(locator, this, "osuffix", buffer, theOsuffix, this.isSetOsuffix());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FacilityIdentifierType that = ((FacilityIdentifierType) object);
        {
            String lhsBeNumber;
            lhsBeNumber = this.getBeNumber();
            String rhsBeNumber;
            rhsBeNumber = that.getBeNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beNumber", lhsBeNumber), LocatorUtils.property(thatLocator, "beNumber", rhsBeNumber), lhsBeNumber, rhsBeNumber, this.isSetBeNumber(), that.isSetBeNumber())) {
                return false;
            }
        }
        {
            String lhsOsuffix;
            lhsOsuffix = this.getOsuffix();
            String rhsOsuffix;
            rhsOsuffix = that.getOsuffix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "osuffix", lhsOsuffix), LocatorUtils.property(thatLocator, "osuffix", rhsOsuffix), lhsOsuffix, rhsOsuffix, this.isSetOsuffix(), that.isSetOsuffix())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theBeNumber;
            theBeNumber = this.getBeNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beNumber", theBeNumber), currentHashCode, theBeNumber, this.isSetBeNumber());
        }
        {
            String theOsuffix;
            theOsuffix = this.getOsuffix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "osuffix", theOsuffix), currentHashCode, theOsuffix, this.isSetOsuffix());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof FacilityIdentifierType) {
            final FacilityIdentifierType copy = ((FacilityIdentifierType) draftCopy);
            {
                Boolean beNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetBeNumber());
                if (beNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBeNumber;
                    sourceBeNumber = this.getBeNumber();
                    String copyBeNumber = ((String) strategy.copy(LocatorUtils.property(locator, "beNumber", sourceBeNumber), sourceBeNumber, this.isSetBeNumber()));
                    copy.setBeNumber(copyBeNumber);
                } else {
                    if (beNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beNumber = null;
                    }
                }
            }
            {
                Boolean osuffixShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOsuffix());
                if (osuffixShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOsuffix;
                    sourceOsuffix = this.getOsuffix();
                    String copyOsuffix = ((String) strategy.copy(LocatorUtils.property(locator, "osuffix", sourceOsuffix), sourceOsuffix, this.isSetOsuffix()));
                    copy.setOsuffix(copyOsuffix);
                } else {
                    if (osuffixShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.osuffix = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FacilityIdentifierType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof FacilityIdentifierType) {
            final FacilityIdentifierType target = this;
            final FacilityIdentifierType leftObject = ((FacilityIdentifierType) left);
            final FacilityIdentifierType rightObject = ((FacilityIdentifierType) right);
            {
                Boolean beNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetBeNumber(), rightObject.isSetBeNumber());
                if (beNumberShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsBeNumber;
                    lhsBeNumber = leftObject.getBeNumber();
                    String rhsBeNumber;
                    rhsBeNumber = rightObject.getBeNumber();
                    String mergedBeNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "beNumber", lhsBeNumber), LocatorUtils.property(rightLocator, "beNumber", rhsBeNumber), lhsBeNumber, rhsBeNumber, leftObject.isSetBeNumber(), rightObject.isSetBeNumber()));
                    target.setBeNumber(mergedBeNumber);
                } else {
                    if (beNumberShouldBeMergedAndSet == Boolean.FALSE) {
                        target.beNumber = null;
                    }
                }
            }
            {
                Boolean osuffixShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetOsuffix(), rightObject.isSetOsuffix());
                if (osuffixShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsOsuffix;
                    lhsOsuffix = leftObject.getOsuffix();
                    String rhsOsuffix;
                    rhsOsuffix = rightObject.getOsuffix();
                    String mergedOsuffix = ((String) strategy.merge(LocatorUtils.property(leftLocator, "osuffix", lhsOsuffix), LocatorUtils.property(rightLocator, "osuffix", rhsOsuffix), lhsOsuffix, rhsOsuffix, leftObject.isSetOsuffix(), rightObject.isSetOsuffix()));
                    target.setOsuffix(mergedOsuffix);
                } else {
                    if (osuffixShouldBeMergedAndSet == Boolean.FALSE) {
                        target.osuffix = null;
                    }
                }
            }
        }
    }

}