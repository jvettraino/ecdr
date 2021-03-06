//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package org.isotc211._2005.gmd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
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
 * <p>Java class for DQ_Scope_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DQ_Scope_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="level" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType"/&gt;
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="levelDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Scope_Type", propOrder = {
    "level",
    "extent",
    "levelDescription"
})
public class DQScopeType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "DQScopeType.level {javax.validation.constraints.NotNull.message}")
    @Valid
    protected MDScopeCodePropertyType level;
    @Valid
    protected EXExtentPropertyType extent;
    @Valid
    protected List<MDScopeDescriptionPropertyType> levelDescription;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public MDScopeCodePropertyType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public void setLevel(MDScopeCodePropertyType value) {
        this.level = value;
    }

    public boolean isSetLevel() {
        return (this.level!= null);
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public EXExtentPropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public void setExtent(EXExtentPropertyType value) {
        this.extent = value;
    }

    public boolean isSetExtent() {
        return (this.extent!= null);
    }

    /**
     * Gets the value of the levelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getLevelDescription() {
        if (levelDescription == null) {
            levelDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.levelDescription;
    }

    public boolean isSetLevelDescription() {
        return ((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()));
    }

    public void unsetLevelDescription() {
        this.levelDescription = null;
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
            MDScopeCodePropertyType theLevel;
            theLevel = this.getLevel();
            strategy.appendField(locator, this, "level", buffer, theLevel, this.isSetLevel());
        }
        {
            EXExtentPropertyType theExtent;
            theExtent = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theExtent, this.isSetExtent());
        }
        {
            List<MDScopeDescriptionPropertyType> theLevelDescription;
            theLevelDescription = (this.isSetLevelDescription()?this.getLevelDescription():null);
            strategy.appendField(locator, this, "levelDescription", buffer, theLevelDescription, this.isSetLevelDescription());
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
        final DQScopeType that = ((DQScopeType) object);
        {
            MDScopeCodePropertyType lhsLevel;
            lhsLevel = this.getLevel();
            MDScopeCodePropertyType rhsLevel;
            rhsLevel = that.getLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "level", lhsLevel), LocatorUtils.property(thatLocator, "level", rhsLevel), lhsLevel, rhsLevel, this.isSetLevel(), that.isSetLevel())) {
                return false;
            }
        }
        {
            EXExtentPropertyType lhsExtent;
            lhsExtent = this.getExtent();
            EXExtentPropertyType rhsExtent;
            rhsExtent = that.getExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extent", lhsExtent), LocatorUtils.property(thatLocator, "extent", rhsExtent), lhsExtent, rhsExtent, this.isSetExtent(), that.isSetExtent())) {
                return false;
            }
        }
        {
            List<MDScopeDescriptionPropertyType> lhsLevelDescription;
            lhsLevelDescription = (this.isSetLevelDescription()?this.getLevelDescription():null);
            List<MDScopeDescriptionPropertyType> rhsLevelDescription;
            rhsLevelDescription = (that.isSetLevelDescription()?that.getLevelDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "levelDescription", lhsLevelDescription), LocatorUtils.property(thatLocator, "levelDescription", rhsLevelDescription), lhsLevelDescription, rhsLevelDescription, this.isSetLevelDescription(), that.isSetLevelDescription())) {
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
            MDScopeCodePropertyType theLevel;
            theLevel = this.getLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "level", theLevel), currentHashCode, theLevel, this.isSetLevel());
        }
        {
            EXExtentPropertyType theExtent;
            theExtent = this.getExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extent", theExtent), currentHashCode, theExtent, this.isSetExtent());
        }
        {
            List<MDScopeDescriptionPropertyType> theLevelDescription;
            theLevelDescription = (this.isSetLevelDescription()?this.getLevelDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "levelDescription", theLevelDescription), currentHashCode, theLevelDescription, this.isSetLevelDescription());
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
        if (draftCopy instanceof DQScopeType) {
            final DQScopeType copy = ((DQScopeType) draftCopy);
            {
                Boolean levelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLevel());
                if (levelShouldBeCopiedAndSet == Boolean.TRUE) {
                    MDScopeCodePropertyType sourceLevel;
                    sourceLevel = this.getLevel();
                    MDScopeCodePropertyType copyLevel = ((MDScopeCodePropertyType) strategy.copy(LocatorUtils.property(locator, "level", sourceLevel), sourceLevel, this.isSetLevel()));
                    copy.setLevel(copyLevel);
                } else {
                    if (levelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.level = null;
                    }
                }
            }
            {
                Boolean extentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetExtent());
                if (extentShouldBeCopiedAndSet == Boolean.TRUE) {
                    EXExtentPropertyType sourceExtent;
                    sourceExtent = this.getExtent();
                    EXExtentPropertyType copyExtent = ((EXExtentPropertyType) strategy.copy(LocatorUtils.property(locator, "extent", sourceExtent), sourceExtent, this.isSetExtent()));
                    copy.setExtent(copyExtent);
                } else {
                    if (extentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.extent = null;
                    }
                }
            }
            {
                Boolean levelDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLevelDescription());
                if (levelDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MDScopeDescriptionPropertyType> sourceLevelDescription;
                    sourceLevelDescription = (this.isSetLevelDescription()?this.getLevelDescription():null);
                    @SuppressWarnings("unchecked")
                    List<MDScopeDescriptionPropertyType> copyLevelDescription = ((List<MDScopeDescriptionPropertyType> ) strategy.copy(LocatorUtils.property(locator, "levelDescription", sourceLevelDescription), sourceLevelDescription, this.isSetLevelDescription()));
                    copy.unsetLevelDescription();
                    if (copyLevelDescription!= null) {
                        List<MDScopeDescriptionPropertyType> uniqueLevelDescriptionl = copy.getLevelDescription();
                        uniqueLevelDescriptionl.addAll(copyLevelDescription);
                    }
                } else {
                    if (levelDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetLevelDescription();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DQScopeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DQScopeType) {
            final DQScopeType target = this;
            final DQScopeType leftObject = ((DQScopeType) left);
            final DQScopeType rightObject = ((DQScopeType) right);
            {
                Boolean levelShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetLevel(), rightObject.isSetLevel());
                if (levelShouldBeMergedAndSet == Boolean.TRUE) {
                    MDScopeCodePropertyType lhsLevel;
                    lhsLevel = leftObject.getLevel();
                    MDScopeCodePropertyType rhsLevel;
                    rhsLevel = rightObject.getLevel();
                    MDScopeCodePropertyType mergedLevel = ((MDScopeCodePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "level", lhsLevel), LocatorUtils.property(rightLocator, "level", rhsLevel), lhsLevel, rhsLevel, leftObject.isSetLevel(), rightObject.isSetLevel()));
                    target.setLevel(mergedLevel);
                } else {
                    if (levelShouldBeMergedAndSet == Boolean.FALSE) {
                        target.level = null;
                    }
                }
            }
            {
                Boolean extentShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetExtent(), rightObject.isSetExtent());
                if (extentShouldBeMergedAndSet == Boolean.TRUE) {
                    EXExtentPropertyType lhsExtent;
                    lhsExtent = leftObject.getExtent();
                    EXExtentPropertyType rhsExtent;
                    rhsExtent = rightObject.getExtent();
                    EXExtentPropertyType mergedExtent = ((EXExtentPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "extent", lhsExtent), LocatorUtils.property(rightLocator, "extent", rhsExtent), lhsExtent, rhsExtent, leftObject.isSetExtent(), rightObject.isSetExtent()));
                    target.setExtent(mergedExtent);
                } else {
                    if (extentShouldBeMergedAndSet == Boolean.FALSE) {
                        target.extent = null;
                    }
                }
            }
            {
                Boolean levelDescriptionShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetLevelDescription(), rightObject.isSetLevelDescription());
                if (levelDescriptionShouldBeMergedAndSet == Boolean.TRUE) {
                    List<MDScopeDescriptionPropertyType> lhsLevelDescription;
                    lhsLevelDescription = (leftObject.isSetLevelDescription()?leftObject.getLevelDescription():null);
                    List<MDScopeDescriptionPropertyType> rhsLevelDescription;
                    rhsLevelDescription = (rightObject.isSetLevelDescription()?rightObject.getLevelDescription():null);
                    List<MDScopeDescriptionPropertyType> mergedLevelDescription = ((List<MDScopeDescriptionPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "levelDescription", lhsLevelDescription), LocatorUtils.property(rightLocator, "levelDescription", rhsLevelDescription), lhsLevelDescription, rhsLevelDescription, leftObject.isSetLevelDescription(), rightObject.isSetLevelDescription()));
                    target.unsetLevelDescription();
                    if (mergedLevelDescription!= null) {
                        List<MDScopeDescriptionPropertyType> uniqueLevelDescriptionl = target.getLevelDescription();
                        uniqueLevelDescriptionl.addAll(mergedLevelDescription);
                    }
                } else {
                    if (levelDescriptionShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetLevelDescription();
                    }
                }
            }
        }
    }

    public void setLevelDescription(List<MDScopeDescriptionPropertyType> value) {
        this.levelDescription = null;
        if (value!= null) {
            List<MDScopeDescriptionPropertyType> draftl = this.getLevelDescription();
            draftl.addAll(value);
        }
    }

}
