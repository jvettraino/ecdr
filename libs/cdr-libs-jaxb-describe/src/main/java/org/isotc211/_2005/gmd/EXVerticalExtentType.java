//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package org.isotc211._2005.gmd;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.RealPropertyType;
import org.isotc211._2005.gsr.SCCRSPropertyType;
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
 * Vertical domain of dataset
 * 
 * <p>Java class for EX_VerticalExtent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EX_VerticalExtent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minimumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/&gt;
 *         &lt;element name="maximumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/&gt;
 *         &lt;element name="verticalCRS" type="{http://www.isotc211.org/2005/gsr}SC_CRS_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_VerticalExtent_Type", propOrder = {
    "minimumValue",
    "maximumValue",
    "verticalCRS"
})
public class EXVerticalExtentType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "EXVerticalExtentType.minimumValue {javax.validation.constraints.NotNull.message}")
    @Valid
    protected RealPropertyType minimumValue;
    @XmlElement(required = true)
    @NotNull(message = "EXVerticalExtentType.maximumValue {javax.validation.constraints.NotNull.message}")
    @Valid
    protected RealPropertyType maximumValue;
    @XmlElement(required = true)
    @NotNull(message = "EXVerticalExtentType.verticalCRS {javax.validation.constraints.NotNull.message}")
    @Valid
    protected SCCRSPropertyType verticalCRS;

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinimumValue(RealPropertyType value) {
        this.minimumValue = value;
    }

    public boolean isSetMinimumValue() {
        return (this.minimumValue!= null);
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaximumValue(RealPropertyType value) {
        this.maximumValue = value;
    }

    public boolean isSetMaximumValue() {
        return (this.maximumValue!= null);
    }

    /**
     * Gets the value of the verticalCRS property.
     * 
     * @return
     *     possible object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public SCCRSPropertyType getVerticalCRS() {
        return verticalCRS;
    }

    /**
     * Sets the value of the verticalCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public void setVerticalCRS(SCCRSPropertyType value) {
        this.verticalCRS = value;
    }

    public boolean isSetVerticalCRS() {
        return (this.verticalCRS!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            RealPropertyType theMinimumValue;
            theMinimumValue = this.getMinimumValue();
            strategy.appendField(locator, this, "minimumValue", buffer, theMinimumValue, this.isSetMinimumValue());
        }
        {
            RealPropertyType theMaximumValue;
            theMaximumValue = this.getMaximumValue();
            strategy.appendField(locator, this, "maximumValue", buffer, theMaximumValue, this.isSetMaximumValue());
        }
        {
            SCCRSPropertyType theVerticalCRS;
            theVerticalCRS = this.getVerticalCRS();
            strategy.appendField(locator, this, "verticalCRS", buffer, theVerticalCRS, this.isSetVerticalCRS());
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EXVerticalExtentType that = ((EXVerticalExtentType) object);
        {
            RealPropertyType lhsMinimumValue;
            lhsMinimumValue = this.getMinimumValue();
            RealPropertyType rhsMinimumValue;
            rhsMinimumValue = that.getMinimumValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumValue", lhsMinimumValue), LocatorUtils.property(thatLocator, "minimumValue", rhsMinimumValue), lhsMinimumValue, rhsMinimumValue, this.isSetMinimumValue(), that.isSetMinimumValue())) {
                return false;
            }
        }
        {
            RealPropertyType lhsMaximumValue;
            lhsMaximumValue = this.getMaximumValue();
            RealPropertyType rhsMaximumValue;
            rhsMaximumValue = that.getMaximumValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumValue", lhsMaximumValue), LocatorUtils.property(thatLocator, "maximumValue", rhsMaximumValue), lhsMaximumValue, rhsMaximumValue, this.isSetMaximumValue(), that.isSetMaximumValue())) {
                return false;
            }
        }
        {
            SCCRSPropertyType lhsVerticalCRS;
            lhsVerticalCRS = this.getVerticalCRS();
            SCCRSPropertyType rhsVerticalCRS;
            rhsVerticalCRS = that.getVerticalCRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalCRS", lhsVerticalCRS), LocatorUtils.property(thatLocator, "verticalCRS", rhsVerticalCRS), lhsVerticalCRS, rhsVerticalCRS, this.isSetVerticalCRS(), that.isSetVerticalCRS())) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            RealPropertyType theMinimumValue;
            theMinimumValue = this.getMinimumValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumValue", theMinimumValue), currentHashCode, theMinimumValue, this.isSetMinimumValue());
        }
        {
            RealPropertyType theMaximumValue;
            theMaximumValue = this.getMaximumValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumValue", theMaximumValue), currentHashCode, theMaximumValue, this.isSetMaximumValue());
        }
        {
            SCCRSPropertyType theVerticalCRS;
            theVerticalCRS = this.getVerticalCRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalCRS", theVerticalCRS), currentHashCode, theVerticalCRS, this.isSetVerticalCRS());
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof EXVerticalExtentType) {
            final EXVerticalExtentType copy = ((EXVerticalExtentType) draftCopy);
            {
                Boolean minimumValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetMinimumValue());
                if (minimumValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealPropertyType sourceMinimumValue;
                    sourceMinimumValue = this.getMinimumValue();
                    RealPropertyType copyMinimumValue = ((RealPropertyType) strategy.copy(LocatorUtils.property(locator, "minimumValue", sourceMinimumValue), sourceMinimumValue, this.isSetMinimumValue()));
                    copy.setMinimumValue(copyMinimumValue);
                } else {
                    if (minimumValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimumValue = null;
                    }
                }
            }
            {
                Boolean maximumValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetMaximumValue());
                if (maximumValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealPropertyType sourceMaximumValue;
                    sourceMaximumValue = this.getMaximumValue();
                    RealPropertyType copyMaximumValue = ((RealPropertyType) strategy.copy(LocatorUtils.property(locator, "maximumValue", sourceMaximumValue), sourceMaximumValue, this.isSetMaximumValue()));
                    copy.setMaximumValue(copyMaximumValue);
                } else {
                    if (maximumValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maximumValue = null;
                    }
                }
            }
            {
                Boolean verticalCRSShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetVerticalCRS());
                if (verticalCRSShouldBeCopiedAndSet == Boolean.TRUE) {
                    SCCRSPropertyType sourceVerticalCRS;
                    sourceVerticalCRS = this.getVerticalCRS();
                    SCCRSPropertyType copyVerticalCRS = ((SCCRSPropertyType) strategy.copy(LocatorUtils.property(locator, "verticalCRS", sourceVerticalCRS), sourceVerticalCRS, this.isSetVerticalCRS()));
                    copy.setVerticalCRS(copyVerticalCRS);
                } else {
                    if (verticalCRSShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verticalCRS = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EXVerticalExtentType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof EXVerticalExtentType) {
            final EXVerticalExtentType target = this;
            final EXVerticalExtentType leftObject = ((EXVerticalExtentType) left);
            final EXVerticalExtentType rightObject = ((EXVerticalExtentType) right);
            {
                Boolean minimumValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetMinimumValue(), rightObject.isSetMinimumValue());
                if (minimumValueShouldBeMergedAndSet == Boolean.TRUE) {
                    RealPropertyType lhsMinimumValue;
                    lhsMinimumValue = leftObject.getMinimumValue();
                    RealPropertyType rhsMinimumValue;
                    rhsMinimumValue = rightObject.getMinimumValue();
                    RealPropertyType mergedMinimumValue = ((RealPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "minimumValue", lhsMinimumValue), LocatorUtils.property(rightLocator, "minimumValue", rhsMinimumValue), lhsMinimumValue, rhsMinimumValue, leftObject.isSetMinimumValue(), rightObject.isSetMinimumValue()));
                    target.setMinimumValue(mergedMinimumValue);
                } else {
                    if (minimumValueShouldBeMergedAndSet == Boolean.FALSE) {
                        target.minimumValue = null;
                    }
                }
            }
            {
                Boolean maximumValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetMaximumValue(), rightObject.isSetMaximumValue());
                if (maximumValueShouldBeMergedAndSet == Boolean.TRUE) {
                    RealPropertyType lhsMaximumValue;
                    lhsMaximumValue = leftObject.getMaximumValue();
                    RealPropertyType rhsMaximumValue;
                    rhsMaximumValue = rightObject.getMaximumValue();
                    RealPropertyType mergedMaximumValue = ((RealPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "maximumValue", lhsMaximumValue), LocatorUtils.property(rightLocator, "maximumValue", rhsMaximumValue), lhsMaximumValue, rhsMaximumValue, leftObject.isSetMaximumValue(), rightObject.isSetMaximumValue()));
                    target.setMaximumValue(mergedMaximumValue);
                } else {
                    if (maximumValueShouldBeMergedAndSet == Boolean.FALSE) {
                        target.maximumValue = null;
                    }
                }
            }
            {
                Boolean verticalCRSShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetVerticalCRS(), rightObject.isSetVerticalCRS());
                if (verticalCRSShouldBeMergedAndSet == Boolean.TRUE) {
                    SCCRSPropertyType lhsVerticalCRS;
                    lhsVerticalCRS = leftObject.getVerticalCRS();
                    SCCRSPropertyType rhsVerticalCRS;
                    rhsVerticalCRS = rightObject.getVerticalCRS();
                    SCCRSPropertyType mergedVerticalCRS = ((SCCRSPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "verticalCRS", lhsVerticalCRS), LocatorUtils.property(rightLocator, "verticalCRS", rhsVerticalCRS), lhsVerticalCRS, rhsVerticalCRS, leftObject.isSetVerticalCRS(), rightObject.isSetVerticalCRS()));
                    target.setVerticalCRS(mergedVerticalCRS);
                } else {
                    if (verticalCRSShouldBeMergedAndSet == Boolean.FALSE) {
                        target.verticalCRS = null;
                    }
                }
            }
        }
    }

}
