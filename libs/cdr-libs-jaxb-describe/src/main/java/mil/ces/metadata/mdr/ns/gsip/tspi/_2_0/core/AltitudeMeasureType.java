//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package mil.ces.metadata.mdr.ns.gsip.tspi._2_0.core;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.MeasureType;
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
 * Altitude Measure Type: A datatype representing the distance of a point from a chosen reference surface measured upward either along the direction of gravity or along a line perpendicular to that reference surface with positive values being above the reference surface. [desc] When understood as an "altitude", conventionally measured from Mean Sea level (MSL) or a geoid (for example: Earth Gravity Model 1996 (EGM96)) along the direction of gravity. When understood as a "height", conventionally measured from an ellipsoid as "Height Above Ellipsoid" (HAE) along a line prependicular to the reference surface.
 * 
 * <p>Java class for AltitudeMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltitudeMeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opengis.net/gml/3.2&gt;MeasureType"&gt;
 *       &lt;attribute name="verticalDatum" use="required" type="{http://metadata.ces.mil/mdr/ns/GSIP/tspi/2.0/core}VerticalDatumType" /&gt;
 *       &lt;attribute name="verticalResolutionCategory" type="{http://metadata.ces.mil/mdr/ns/GSIP/tspi/2.0/core}VerticalResolutionEnumerationType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltitudeMeasureType")
public class AltitudeMeasureType
    extends MeasureType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "verticalDatum", required = true)
    @NotNull(message = "AltitudeMeasureType.verticalDatum {javax.validation.constraints.NotNull.message}")
    protected VerticalDatumType verticalDatum;
    @XmlAttribute(name = "verticalResolutionCategory")
    protected VerticalResolutionEnumerationType verticalResolutionCategory;

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDatumType }
     *     
     */
    public VerticalDatumType getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDatumType }
     *     
     */
    public void setVerticalDatum(VerticalDatumType value) {
        this.verticalDatum = value;
    }

    public boolean isSetVerticalDatum() {
        return (this.verticalDatum!= null);
    }

    /**
     * Gets the value of the verticalResolutionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalResolutionEnumerationType }
     *     
     */
    public VerticalResolutionEnumerationType getVerticalResolutionCategory() {
        return verticalResolutionCategory;
    }

    /**
     * Sets the value of the verticalResolutionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalResolutionEnumerationType }
     *     
     */
    public void setVerticalResolutionCategory(VerticalResolutionEnumerationType value) {
        this.verticalResolutionCategory = value;
    }

    public boolean isSetVerticalResolutionCategory() {
        return (this.verticalResolutionCategory!= null);
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
            VerticalDatumType theVerticalDatum;
            theVerticalDatum = this.getVerticalDatum();
            strategy.appendField(locator, this, "verticalDatum", buffer, theVerticalDatum, this.isSetVerticalDatum());
        }
        {
            VerticalResolutionEnumerationType theVerticalResolutionCategory;
            theVerticalResolutionCategory = this.getVerticalResolutionCategory();
            strategy.appendField(locator, this, "verticalResolutionCategory", buffer, theVerticalResolutionCategory, this.isSetVerticalResolutionCategory());
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
        final AltitudeMeasureType that = ((AltitudeMeasureType) object);
        {
            VerticalDatumType lhsVerticalDatum;
            lhsVerticalDatum = this.getVerticalDatum();
            VerticalDatumType rhsVerticalDatum;
            rhsVerticalDatum = that.getVerticalDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalDatum", lhsVerticalDatum), LocatorUtils.property(thatLocator, "verticalDatum", rhsVerticalDatum), lhsVerticalDatum, rhsVerticalDatum, this.isSetVerticalDatum(), that.isSetVerticalDatum())) {
                return false;
            }
        }
        {
            VerticalResolutionEnumerationType lhsVerticalResolutionCategory;
            lhsVerticalResolutionCategory = this.getVerticalResolutionCategory();
            VerticalResolutionEnumerationType rhsVerticalResolutionCategory;
            rhsVerticalResolutionCategory = that.getVerticalResolutionCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalResolutionCategory", lhsVerticalResolutionCategory), LocatorUtils.property(thatLocator, "verticalResolutionCategory", rhsVerticalResolutionCategory), lhsVerticalResolutionCategory, rhsVerticalResolutionCategory, this.isSetVerticalResolutionCategory(), that.isSetVerticalResolutionCategory())) {
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
            VerticalDatumType theVerticalDatum;
            theVerticalDatum = this.getVerticalDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalDatum", theVerticalDatum), currentHashCode, theVerticalDatum, this.isSetVerticalDatum());
        }
        {
            VerticalResolutionEnumerationType theVerticalResolutionCategory;
            theVerticalResolutionCategory = this.getVerticalResolutionCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalResolutionCategory", theVerticalResolutionCategory), currentHashCode, theVerticalResolutionCategory, this.isSetVerticalResolutionCategory());
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
        if (draftCopy instanceof AltitudeMeasureType) {
            final AltitudeMeasureType copy = ((AltitudeMeasureType) draftCopy);
            {
                Boolean verticalDatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetVerticalDatum());
                if (verticalDatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    VerticalDatumType sourceVerticalDatum;
                    sourceVerticalDatum = this.getVerticalDatum();
                    VerticalDatumType copyVerticalDatum = ((VerticalDatumType) strategy.copy(LocatorUtils.property(locator, "verticalDatum", sourceVerticalDatum), sourceVerticalDatum, this.isSetVerticalDatum()));
                    copy.setVerticalDatum(copyVerticalDatum);
                } else {
                    if (verticalDatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verticalDatum = null;
                    }
                }
            }
            {
                Boolean verticalResolutionCategoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetVerticalResolutionCategory());
                if (verticalResolutionCategoryShouldBeCopiedAndSet == Boolean.TRUE) {
                    VerticalResolutionEnumerationType sourceVerticalResolutionCategory;
                    sourceVerticalResolutionCategory = this.getVerticalResolutionCategory();
                    VerticalResolutionEnumerationType copyVerticalResolutionCategory = ((VerticalResolutionEnumerationType) strategy.copy(LocatorUtils.property(locator, "verticalResolutionCategory", sourceVerticalResolutionCategory), sourceVerticalResolutionCategory, this.isSetVerticalResolutionCategory()));
                    copy.setVerticalResolutionCategory(copyVerticalResolutionCategory);
                } else {
                    if (verticalResolutionCategoryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verticalResolutionCategory = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AltitudeMeasureType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof AltitudeMeasureType) {
            final AltitudeMeasureType target = this;
            final AltitudeMeasureType leftObject = ((AltitudeMeasureType) left);
            final AltitudeMeasureType rightObject = ((AltitudeMeasureType) right);
            {
                Boolean verticalDatumShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetVerticalDatum(), rightObject.isSetVerticalDatum());
                if (verticalDatumShouldBeMergedAndSet == Boolean.TRUE) {
                    VerticalDatumType lhsVerticalDatum;
                    lhsVerticalDatum = leftObject.getVerticalDatum();
                    VerticalDatumType rhsVerticalDatum;
                    rhsVerticalDatum = rightObject.getVerticalDatum();
                    VerticalDatumType mergedVerticalDatum = ((VerticalDatumType) strategy.merge(LocatorUtils.property(leftLocator, "verticalDatum", lhsVerticalDatum), LocatorUtils.property(rightLocator, "verticalDatum", rhsVerticalDatum), lhsVerticalDatum, rhsVerticalDatum, leftObject.isSetVerticalDatum(), rightObject.isSetVerticalDatum()));
                    target.setVerticalDatum(mergedVerticalDatum);
                } else {
                    if (verticalDatumShouldBeMergedAndSet == Boolean.FALSE) {
                        target.verticalDatum = null;
                    }
                }
            }
            {
                Boolean verticalResolutionCategoryShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetVerticalResolutionCategory(), rightObject.isSetVerticalResolutionCategory());
                if (verticalResolutionCategoryShouldBeMergedAndSet == Boolean.TRUE) {
                    VerticalResolutionEnumerationType lhsVerticalResolutionCategory;
                    lhsVerticalResolutionCategory = leftObject.getVerticalResolutionCategory();
                    VerticalResolutionEnumerationType rhsVerticalResolutionCategory;
                    rhsVerticalResolutionCategory = rightObject.getVerticalResolutionCategory();
                    VerticalResolutionEnumerationType mergedVerticalResolutionCategory = ((VerticalResolutionEnumerationType) strategy.merge(LocatorUtils.property(leftLocator, "verticalResolutionCategory", lhsVerticalResolutionCategory), LocatorUtils.property(rightLocator, "verticalResolutionCategory", rhsVerticalResolutionCategory), lhsVerticalResolutionCategory, rhsVerticalResolutionCategory, leftObject.isSetVerticalResolutionCategory(), rightObject.isSetVerticalResolutionCategory()));
                    target.setVerticalResolutionCategory(mergedVerticalResolutionCategory);
                } else {
                    if (verticalResolutionCategoryShouldBeMergedAndSet == Boolean.FALSE) {
                        target.verticalResolutionCategory = null;
                    }
                }
            }
        }
    }

}
