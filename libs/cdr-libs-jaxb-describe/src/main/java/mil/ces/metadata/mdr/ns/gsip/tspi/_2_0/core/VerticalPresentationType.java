//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package mil.ces.metadata.mdr.ns.gsip.tspi._2_0.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Vertical Presentation Type: A type consisting of one or more occurances of one of a set of alternative presentations of a point vertical location that are generally intended for human-to-human communication rather than machine-to-machine communication.
 * 
 * <p>Java class for VerticalPresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalPresentationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="height" type="{http://www.opengis.net/gml/3.2}MeasureType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="altitude" type="{http://www.opengis.net/gml/3.2}MeasureType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="depth" type="{http://www.opengis.net/gml/3.2}MeasureType" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="srsName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalPresentationType", propOrder = {
    "height",
    "altitude",
    "depth"
})
public class VerticalPresentationType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @Size(min = 1)
    @Valid
    protected List<MeasureType> height;
    @Size(min = 1)
    @Valid
    protected List<MeasureType> altitude;
    @Size(min = 1)
    @Valid
    protected List<MeasureType> depth;
    @XmlAttribute(name = "srsName", required = true)
    @XmlSchemaType(name = "anyURI")
    @NotNull(message = "VerticalPresentationType.srsName {javax.validation.constraints.NotNull.message}")
    protected String srsName;

    /**
     * Gets the value of the height property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the height property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureType }
     * 
     * 
     */
    public List<MeasureType> getHeight() {
        if (height == null) {
            height = new ArrayList<MeasureType>();
        }
        return this.height;
    }

    public boolean isSetHeight() {
        return ((this.height!= null)&&(!this.height.isEmpty()));
    }

    public void unsetHeight() {
        this.height = null;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureType }
     * 
     * 
     */
    public List<MeasureType> getAltitude() {
        if (altitude == null) {
            altitude = new ArrayList<MeasureType>();
        }
        return this.altitude;
    }

    public boolean isSetAltitude() {
        return ((this.altitude!= null)&&(!this.altitude.isEmpty()));
    }

    public void unsetAltitude() {
        this.altitude = null;
    }

    /**
     * Gets the value of the depth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureType }
     * 
     * 
     */
    public List<MeasureType> getDepth() {
        if (depth == null) {
            depth = new ArrayList<MeasureType>();
        }
        return this.depth;
    }

    public boolean isSetDepth() {
        return ((this.depth!= null)&&(!this.depth.isEmpty()));
    }

    public void unsetDepth() {
        this.depth = null;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public boolean isSetSrsName() {
        return (this.srsName!= null);
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
            List<MeasureType> theHeight;
            theHeight = (this.isSetHeight()?this.getHeight():null);
            strategy.appendField(locator, this, "height", buffer, theHeight, this.isSetHeight());
        }
        {
            List<MeasureType> theAltitude;
            theAltitude = (this.isSetAltitude()?this.getAltitude():null);
            strategy.appendField(locator, this, "altitude", buffer, theAltitude, this.isSetAltitude());
        }
        {
            List<MeasureType> theDepth;
            theDepth = (this.isSetDepth()?this.getDepth():null);
            strategy.appendField(locator, this, "depth", buffer, theDepth, this.isSetDepth());
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theSrsName, this.isSetSrsName());
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
        final VerticalPresentationType that = ((VerticalPresentationType) object);
        {
            List<MeasureType> lhsHeight;
            lhsHeight = (this.isSetHeight()?this.getHeight():null);
            List<MeasureType> rhsHeight;
            rhsHeight = (that.isSetHeight()?that.getHeight():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "height", lhsHeight), LocatorUtils.property(thatLocator, "height", rhsHeight), lhsHeight, rhsHeight, this.isSetHeight(), that.isSetHeight())) {
                return false;
            }
        }
        {
            List<MeasureType> lhsAltitude;
            lhsAltitude = (this.isSetAltitude()?this.getAltitude():null);
            List<MeasureType> rhsAltitude;
            rhsAltitude = (that.isSetAltitude()?that.getAltitude():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altitude", lhsAltitude), LocatorUtils.property(thatLocator, "altitude", rhsAltitude), lhsAltitude, rhsAltitude, this.isSetAltitude(), that.isSetAltitude())) {
                return false;
            }
        }
        {
            List<MeasureType> lhsDepth;
            lhsDepth = (this.isSetDepth()?this.getDepth():null);
            List<MeasureType> rhsDepth;
            rhsDepth = (that.isSetDepth()?that.getDepth():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depth", lhsDepth), LocatorUtils.property(thatLocator, "depth", rhsDepth), lhsDepth, rhsDepth, this.isSetDepth(), that.isSetDepth())) {
                return false;
            }
        }
        {
            String lhsSrsName;
            lhsSrsName = this.getSrsName();
            String rhsSrsName;
            rhsSrsName = that.getSrsName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srsName", lhsSrsName), LocatorUtils.property(thatLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName, this.isSetSrsName(), that.isSetSrsName())) {
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
            List<MeasureType> theHeight;
            theHeight = (this.isSetHeight()?this.getHeight():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "height", theHeight), currentHashCode, theHeight, this.isSetHeight());
        }
        {
            List<MeasureType> theAltitude;
            theAltitude = (this.isSetAltitude()?this.getAltitude():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altitude", theAltitude), currentHashCode, theAltitude, this.isSetAltitude());
        }
        {
            List<MeasureType> theDepth;
            theDepth = (this.isSetDepth()?this.getDepth():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depth", theDepth), currentHashCode, theDepth, this.isSetDepth());
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srsName", theSrsName), currentHashCode, theSrsName, this.isSetSrsName());
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
        if (draftCopy instanceof VerticalPresentationType) {
            final VerticalPresentationType copy = ((VerticalPresentationType) draftCopy);
            {
                Boolean heightShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHeight());
                if (heightShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasureType> sourceHeight;
                    sourceHeight = (this.isSetHeight()?this.getHeight():null);
                    @SuppressWarnings("unchecked")
                    List<MeasureType> copyHeight = ((List<MeasureType> ) strategy.copy(LocatorUtils.property(locator, "height", sourceHeight), sourceHeight, this.isSetHeight()));
                    copy.unsetHeight();
                    if (copyHeight!= null) {
                        List<MeasureType> uniqueHeightl = copy.getHeight();
                        uniqueHeightl.addAll(copyHeight);
                    }
                } else {
                    if (heightShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetHeight();
                    }
                }
            }
            {
                Boolean altitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAltitude());
                if (altitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasureType> sourceAltitude;
                    sourceAltitude = (this.isSetAltitude()?this.getAltitude():null);
                    @SuppressWarnings("unchecked")
                    List<MeasureType> copyAltitude = ((List<MeasureType> ) strategy.copy(LocatorUtils.property(locator, "altitude", sourceAltitude), sourceAltitude, this.isSetAltitude()));
                    copy.unsetAltitude();
                    if (copyAltitude!= null) {
                        List<MeasureType> uniqueAltitudel = copy.getAltitude();
                        uniqueAltitudel.addAll(copyAltitude);
                    }
                } else {
                    if (altitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetAltitude();
                    }
                }
            }
            {
                Boolean depthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDepth());
                if (depthShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasureType> sourceDepth;
                    sourceDepth = (this.isSetDepth()?this.getDepth():null);
                    @SuppressWarnings("unchecked")
                    List<MeasureType> copyDepth = ((List<MeasureType> ) strategy.copy(LocatorUtils.property(locator, "depth", sourceDepth), sourceDepth, this.isSetDepth()));
                    copy.unsetDepth();
                    if (copyDepth!= null) {
                        List<MeasureType> uniqueDepthl = copy.getDepth();
                        uniqueDepthl.addAll(copyDepth);
                    }
                } else {
                    if (depthShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetDepth();
                    }
                }
            }
            {
                Boolean srsNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSrsName());
                if (srsNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSrsName;
                    sourceSrsName = this.getSrsName();
                    String copySrsName = ((String) strategy.copy(LocatorUtils.property(locator, "srsName", sourceSrsName), sourceSrsName, this.isSetSrsName()));
                    copy.setSrsName(copySrsName);
                } else {
                    if (srsNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.srsName = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VerticalPresentationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof VerticalPresentationType) {
            final VerticalPresentationType target = this;
            final VerticalPresentationType leftObject = ((VerticalPresentationType) left);
            final VerticalPresentationType rightObject = ((VerticalPresentationType) right);
            {
                Boolean heightShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetHeight(), rightObject.isSetHeight());
                if (heightShouldBeMergedAndSet == Boolean.TRUE) {
                    List<MeasureType> lhsHeight;
                    lhsHeight = (leftObject.isSetHeight()?leftObject.getHeight():null);
                    List<MeasureType> rhsHeight;
                    rhsHeight = (rightObject.isSetHeight()?rightObject.getHeight():null);
                    List<MeasureType> mergedHeight = ((List<MeasureType> ) strategy.merge(LocatorUtils.property(leftLocator, "height", lhsHeight), LocatorUtils.property(rightLocator, "height", rhsHeight), lhsHeight, rhsHeight, leftObject.isSetHeight(), rightObject.isSetHeight()));
                    target.unsetHeight();
                    if (mergedHeight!= null) {
                        List<MeasureType> uniqueHeightl = target.getHeight();
                        uniqueHeightl.addAll(mergedHeight);
                    }
                } else {
                    if (heightShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetHeight();
                    }
                }
            }
            {
                Boolean altitudeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetAltitude(), rightObject.isSetAltitude());
                if (altitudeShouldBeMergedAndSet == Boolean.TRUE) {
                    List<MeasureType> lhsAltitude;
                    lhsAltitude = (leftObject.isSetAltitude()?leftObject.getAltitude():null);
                    List<MeasureType> rhsAltitude;
                    rhsAltitude = (rightObject.isSetAltitude()?rightObject.getAltitude():null);
                    List<MeasureType> mergedAltitude = ((List<MeasureType> ) strategy.merge(LocatorUtils.property(leftLocator, "altitude", lhsAltitude), LocatorUtils.property(rightLocator, "altitude", rhsAltitude), lhsAltitude, rhsAltitude, leftObject.isSetAltitude(), rightObject.isSetAltitude()));
                    target.unsetAltitude();
                    if (mergedAltitude!= null) {
                        List<MeasureType> uniqueAltitudel = target.getAltitude();
                        uniqueAltitudel.addAll(mergedAltitude);
                    }
                } else {
                    if (altitudeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetAltitude();
                    }
                }
            }
            {
                Boolean depthShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetDepth(), rightObject.isSetDepth());
                if (depthShouldBeMergedAndSet == Boolean.TRUE) {
                    List<MeasureType> lhsDepth;
                    lhsDepth = (leftObject.isSetDepth()?leftObject.getDepth():null);
                    List<MeasureType> rhsDepth;
                    rhsDepth = (rightObject.isSetDepth()?rightObject.getDepth():null);
                    List<MeasureType> mergedDepth = ((List<MeasureType> ) strategy.merge(LocatorUtils.property(leftLocator, "depth", lhsDepth), LocatorUtils.property(rightLocator, "depth", rhsDepth), lhsDepth, rhsDepth, leftObject.isSetDepth(), rightObject.isSetDepth()));
                    target.unsetDepth();
                    if (mergedDepth!= null) {
                        List<MeasureType> uniqueDepthl = target.getDepth();
                        uniqueDepthl.addAll(mergedDepth);
                    }
                } else {
                    if (depthShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetDepth();
                    }
                }
            }
            {
                Boolean srsNameShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSrsName(), rightObject.isSetSrsName());
                if (srsNameShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsSrsName;
                    lhsSrsName = leftObject.getSrsName();
                    String rhsSrsName;
                    rhsSrsName = rightObject.getSrsName();
                    String mergedSrsName = ((String) strategy.merge(LocatorUtils.property(leftLocator, "srsName", lhsSrsName), LocatorUtils.property(rightLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName, leftObject.isSetSrsName(), rightObject.isSetSrsName()));
                    target.setSrsName(mergedSrsName);
                } else {
                    if (srsNameShouldBeMergedAndSet == Boolean.FALSE) {
                        target.srsName = null;
                    }
                }
            }
        }
    }

    public void setHeight(List<MeasureType> value) {
        this.height = null;
        if (value!= null) {
            List<MeasureType> draftl = this.getHeight();
            draftl.addAll(value);
        }
    }

    public void setAltitude(List<MeasureType> value) {
        this.altitude = null;
        if (value!= null) {
            List<MeasureType> draftl = this.getAltitude();
            draftl.addAll(value);
        }
    }

    public void setDepth(List<MeasureType> value) {
        this.depth = null;
        if (value!= null) {
            List<MeasureType> draftl = this.getDepth();
            draftl.addAll(value);
        }
    }

}