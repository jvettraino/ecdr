//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package us.mil.ces.metadata.ddms._5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for DatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="acquiredOn" type="{urn:us:mil:ces:metadata:ddms:5}ApproximableDateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="created" type="{urn:us:mil:ces:metadata:ddms:5}CombinedDateType" /&gt;
 *       &lt;attribute name="posted" type="{urn:us:mil:ces:metadata:ddms:5}CombinedDateType" /&gt;
 *       &lt;attribute name="validTil" type="{urn:us:mil:ces:metadata:ddms:5}CombinedDateType" /&gt;
 *       &lt;attribute name="infoCutOff" type="{urn:us:mil:ces:metadata:ddms:5}CombinedDateType" /&gt;
 *       &lt;attribute name="approvedOn" type="{urn:us:mil:ces:metadata:ddms:5}CombinedDateType" /&gt;
 *       &lt;attribute name="receivedOn" type="{urn:us:mil:ces:metadata:ddms:5}CombinedDateType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatesType", propOrder = {
    "acquiredOn"
})
public class DatesType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @Valid
    protected List<ApproximableDateType> acquiredOn;
    @XmlAttribute(name = "created", namespace = "urn:us:mil:ces:metadata:ddms:5")
    protected String created;
    @XmlAttribute(name = "posted", namespace = "urn:us:mil:ces:metadata:ddms:5")
    protected String posted;
    @XmlAttribute(name = "validTil", namespace = "urn:us:mil:ces:metadata:ddms:5")
    protected String validTil;
    @XmlAttribute(name = "infoCutOff", namespace = "urn:us:mil:ces:metadata:ddms:5")
    protected String infoCutOff;
    @XmlAttribute(name = "approvedOn", namespace = "urn:us:mil:ces:metadata:ddms:5")
    protected String approvedOn;
    @XmlAttribute(name = "receivedOn", namespace = "urn:us:mil:ces:metadata:ddms:5")
    protected String receivedOn;

    /**
     * Gets the value of the acquiredOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquiredOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquiredOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproximableDateType }
     * 
     * 
     */
    public List<ApproximableDateType> getAcquiredOn() {
        if (acquiredOn == null) {
            acquiredOn = new ArrayList<ApproximableDateType>();
        }
        return this.acquiredOn;
    }

    public boolean isSetAcquiredOn() {
        return ((this.acquiredOn!= null)&&(!this.acquiredOn.isEmpty()));
    }

    public void unsetAcquiredOn() {
        this.acquiredOn = null;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    public boolean isSetCreated() {
        return (this.created!= null);
    }

    /**
     * Gets the value of the posted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosted() {
        return posted;
    }

    /**
     * Sets the value of the posted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosted(String value) {
        this.posted = value;
    }

    public boolean isSetPosted() {
        return (this.posted!= null);
    }

    /**
     * Gets the value of the validTil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTil() {
        return validTil;
    }

    /**
     * Sets the value of the validTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTil(String value) {
        this.validTil = value;
    }

    public boolean isSetValidTil() {
        return (this.validTil!= null);
    }

    /**
     * Gets the value of the infoCutOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoCutOff() {
        return infoCutOff;
    }

    /**
     * Sets the value of the infoCutOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoCutOff(String value) {
        this.infoCutOff = value;
    }

    public boolean isSetInfoCutOff() {
        return (this.infoCutOff!= null);
    }

    /**
     * Gets the value of the approvedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedOn() {
        return approvedOn;
    }

    /**
     * Sets the value of the approvedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedOn(String value) {
        this.approvedOn = value;
    }

    public boolean isSetApprovedOn() {
        return (this.approvedOn!= null);
    }

    /**
     * Gets the value of the receivedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedOn() {
        return receivedOn;
    }

    /**
     * Sets the value of the receivedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedOn(String value) {
        this.receivedOn = value;
    }

    public boolean isSetReceivedOn() {
        return (this.receivedOn!= null);
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
            List<ApproximableDateType> theAcquiredOn;
            theAcquiredOn = (this.isSetAcquiredOn()?this.getAcquiredOn():null);
            strategy.appendField(locator, this, "acquiredOn", buffer, theAcquiredOn, this.isSetAcquiredOn());
        }
        {
            String theCreated;
            theCreated = this.getCreated();
            strategy.appendField(locator, this, "created", buffer, theCreated, this.isSetCreated());
        }
        {
            String thePosted;
            thePosted = this.getPosted();
            strategy.appendField(locator, this, "posted", buffer, thePosted, this.isSetPosted());
        }
        {
            String theValidTil;
            theValidTil = this.getValidTil();
            strategy.appendField(locator, this, "validTil", buffer, theValidTil, this.isSetValidTil());
        }
        {
            String theInfoCutOff;
            theInfoCutOff = this.getInfoCutOff();
            strategy.appendField(locator, this, "infoCutOff", buffer, theInfoCutOff, this.isSetInfoCutOff());
        }
        {
            String theApprovedOn;
            theApprovedOn = this.getApprovedOn();
            strategy.appendField(locator, this, "approvedOn", buffer, theApprovedOn, this.isSetApprovedOn());
        }
        {
            String theReceivedOn;
            theReceivedOn = this.getReceivedOn();
            strategy.appendField(locator, this, "receivedOn", buffer, theReceivedOn, this.isSetReceivedOn());
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
        final DatesType that = ((DatesType) object);
        {
            List<ApproximableDateType> lhsAcquiredOn;
            lhsAcquiredOn = (this.isSetAcquiredOn()?this.getAcquiredOn():null);
            List<ApproximableDateType> rhsAcquiredOn;
            rhsAcquiredOn = (that.isSetAcquiredOn()?that.getAcquiredOn():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acquiredOn", lhsAcquiredOn), LocatorUtils.property(thatLocator, "acquiredOn", rhsAcquiredOn), lhsAcquiredOn, rhsAcquiredOn, this.isSetAcquiredOn(), that.isSetAcquiredOn())) {
                return false;
            }
        }
        {
            String lhsCreated;
            lhsCreated = this.getCreated();
            String rhsCreated;
            rhsCreated = that.getCreated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "created", lhsCreated), LocatorUtils.property(thatLocator, "created", rhsCreated), lhsCreated, rhsCreated, this.isSetCreated(), that.isSetCreated())) {
                return false;
            }
        }
        {
            String lhsPosted;
            lhsPosted = this.getPosted();
            String rhsPosted;
            rhsPosted = that.getPosted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posted", lhsPosted), LocatorUtils.property(thatLocator, "posted", rhsPosted), lhsPosted, rhsPosted, this.isSetPosted(), that.isSetPosted())) {
                return false;
            }
        }
        {
            String lhsValidTil;
            lhsValidTil = this.getValidTil();
            String rhsValidTil;
            rhsValidTil = that.getValidTil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validTil", lhsValidTil), LocatorUtils.property(thatLocator, "validTil", rhsValidTil), lhsValidTil, rhsValidTil, this.isSetValidTil(), that.isSetValidTil())) {
                return false;
            }
        }
        {
            String lhsInfoCutOff;
            lhsInfoCutOff = this.getInfoCutOff();
            String rhsInfoCutOff;
            rhsInfoCutOff = that.getInfoCutOff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infoCutOff", lhsInfoCutOff), LocatorUtils.property(thatLocator, "infoCutOff", rhsInfoCutOff), lhsInfoCutOff, rhsInfoCutOff, this.isSetInfoCutOff(), that.isSetInfoCutOff())) {
                return false;
            }
        }
        {
            String lhsApprovedOn;
            lhsApprovedOn = this.getApprovedOn();
            String rhsApprovedOn;
            rhsApprovedOn = that.getApprovedOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvedOn", lhsApprovedOn), LocatorUtils.property(thatLocator, "approvedOn", rhsApprovedOn), lhsApprovedOn, rhsApprovedOn, this.isSetApprovedOn(), that.isSetApprovedOn())) {
                return false;
            }
        }
        {
            String lhsReceivedOn;
            lhsReceivedOn = this.getReceivedOn();
            String rhsReceivedOn;
            rhsReceivedOn = that.getReceivedOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedOn", lhsReceivedOn), LocatorUtils.property(thatLocator, "receivedOn", rhsReceivedOn), lhsReceivedOn, rhsReceivedOn, this.isSetReceivedOn(), that.isSetReceivedOn())) {
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
            List<ApproximableDateType> theAcquiredOn;
            theAcquiredOn = (this.isSetAcquiredOn()?this.getAcquiredOn():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acquiredOn", theAcquiredOn), currentHashCode, theAcquiredOn, this.isSetAcquiredOn());
        }
        {
            String theCreated;
            theCreated = this.getCreated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "created", theCreated), currentHashCode, theCreated, this.isSetCreated());
        }
        {
            String thePosted;
            thePosted = this.getPosted();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posted", thePosted), currentHashCode, thePosted, this.isSetPosted());
        }
        {
            String theValidTil;
            theValidTil = this.getValidTil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validTil", theValidTil), currentHashCode, theValidTil, this.isSetValidTil());
        }
        {
            String theInfoCutOff;
            theInfoCutOff = this.getInfoCutOff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "infoCutOff", theInfoCutOff), currentHashCode, theInfoCutOff, this.isSetInfoCutOff());
        }
        {
            String theApprovedOn;
            theApprovedOn = this.getApprovedOn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvedOn", theApprovedOn), currentHashCode, theApprovedOn, this.isSetApprovedOn());
        }
        {
            String theReceivedOn;
            theReceivedOn = this.getReceivedOn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedOn", theReceivedOn), currentHashCode, theReceivedOn, this.isSetReceivedOn());
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
        if (draftCopy instanceof DatesType) {
            final DatesType copy = ((DatesType) draftCopy);
            {
                Boolean acquiredOnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAcquiredOn());
                if (acquiredOnShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ApproximableDateType> sourceAcquiredOn;
                    sourceAcquiredOn = (this.isSetAcquiredOn()?this.getAcquiredOn():null);
                    @SuppressWarnings("unchecked")
                    List<ApproximableDateType> copyAcquiredOn = ((List<ApproximableDateType> ) strategy.copy(LocatorUtils.property(locator, "acquiredOn", sourceAcquiredOn), sourceAcquiredOn, this.isSetAcquiredOn()));
                    copy.unsetAcquiredOn();
                    if (copyAcquiredOn!= null) {
                        List<ApproximableDateType> uniqueAcquiredOnl = copy.getAcquiredOn();
                        uniqueAcquiredOnl.addAll(copyAcquiredOn);
                    }
                } else {
                    if (acquiredOnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetAcquiredOn();
                    }
                }
            }
            {
                Boolean createdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCreated());
                if (createdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCreated;
                    sourceCreated = this.getCreated();
                    String copyCreated = ((String) strategy.copy(LocatorUtils.property(locator, "created", sourceCreated), sourceCreated, this.isSetCreated()));
                    copy.setCreated(copyCreated);
                } else {
                    if (createdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.created = null;
                    }
                }
            }
            {
                Boolean postedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPosted());
                if (postedShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePosted;
                    sourcePosted = this.getPosted();
                    String copyPosted = ((String) strategy.copy(LocatorUtils.property(locator, "posted", sourcePosted), sourcePosted, this.isSetPosted()));
                    copy.setPosted(copyPosted);
                } else {
                    if (postedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.posted = null;
                    }
                }
            }
            {
                Boolean validTilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetValidTil());
                if (validTilShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceValidTil;
                    sourceValidTil = this.getValidTil();
                    String copyValidTil = ((String) strategy.copy(LocatorUtils.property(locator, "validTil", sourceValidTil), sourceValidTil, this.isSetValidTil()));
                    copy.setValidTil(copyValidTil);
                } else {
                    if (validTilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.validTil = null;
                    }
                }
            }
            {
                Boolean infoCutOffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetInfoCutOff());
                if (infoCutOffShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInfoCutOff;
                    sourceInfoCutOff = this.getInfoCutOff();
                    String copyInfoCutOff = ((String) strategy.copy(LocatorUtils.property(locator, "infoCutOff", sourceInfoCutOff), sourceInfoCutOff, this.isSetInfoCutOff()));
                    copy.setInfoCutOff(copyInfoCutOff);
                } else {
                    if (infoCutOffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.infoCutOff = null;
                    }
                }
            }
            {
                Boolean approvedOnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetApprovedOn());
                if (approvedOnShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceApprovedOn;
                    sourceApprovedOn = this.getApprovedOn();
                    String copyApprovedOn = ((String) strategy.copy(LocatorUtils.property(locator, "approvedOn", sourceApprovedOn), sourceApprovedOn, this.isSetApprovedOn()));
                    copy.setApprovedOn(copyApprovedOn);
                } else {
                    if (approvedOnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.approvedOn = null;
                    }
                }
            }
            {
                Boolean receivedOnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetReceivedOn());
                if (receivedOnShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReceivedOn;
                    sourceReceivedOn = this.getReceivedOn();
                    String copyReceivedOn = ((String) strategy.copy(LocatorUtils.property(locator, "receivedOn", sourceReceivedOn), sourceReceivedOn, this.isSetReceivedOn()));
                    copy.setReceivedOn(copyReceivedOn);
                } else {
                    if (receivedOnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.receivedOn = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DatesType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof DatesType) {
            final DatesType target = this;
            final DatesType leftObject = ((DatesType) left);
            final DatesType rightObject = ((DatesType) right);
            {
                Boolean acquiredOnShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetAcquiredOn(), rightObject.isSetAcquiredOn());
                if (acquiredOnShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ApproximableDateType> lhsAcquiredOn;
                    lhsAcquiredOn = (leftObject.isSetAcquiredOn()?leftObject.getAcquiredOn():null);
                    List<ApproximableDateType> rhsAcquiredOn;
                    rhsAcquiredOn = (rightObject.isSetAcquiredOn()?rightObject.getAcquiredOn():null);
                    List<ApproximableDateType> mergedAcquiredOn = ((List<ApproximableDateType> ) strategy.merge(LocatorUtils.property(leftLocator, "acquiredOn", lhsAcquiredOn), LocatorUtils.property(rightLocator, "acquiredOn", rhsAcquiredOn), lhsAcquiredOn, rhsAcquiredOn, leftObject.isSetAcquiredOn(), rightObject.isSetAcquiredOn()));
                    target.unsetAcquiredOn();
                    if (mergedAcquiredOn!= null) {
                        List<ApproximableDateType> uniqueAcquiredOnl = target.getAcquiredOn();
                        uniqueAcquiredOnl.addAll(mergedAcquiredOn);
                    }
                } else {
                    if (acquiredOnShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetAcquiredOn();
                    }
                }
            }
            {
                Boolean createdShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetCreated(), rightObject.isSetCreated());
                if (createdShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsCreated;
                    lhsCreated = leftObject.getCreated();
                    String rhsCreated;
                    rhsCreated = rightObject.getCreated();
                    String mergedCreated = ((String) strategy.merge(LocatorUtils.property(leftLocator, "created", lhsCreated), LocatorUtils.property(rightLocator, "created", rhsCreated), lhsCreated, rhsCreated, leftObject.isSetCreated(), rightObject.isSetCreated()));
                    target.setCreated(mergedCreated);
                } else {
                    if (createdShouldBeMergedAndSet == Boolean.FALSE) {
                        target.created = null;
                    }
                }
            }
            {
                Boolean postedShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPosted(), rightObject.isSetPosted());
                if (postedShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsPosted;
                    lhsPosted = leftObject.getPosted();
                    String rhsPosted;
                    rhsPosted = rightObject.getPosted();
                    String mergedPosted = ((String) strategy.merge(LocatorUtils.property(leftLocator, "posted", lhsPosted), LocatorUtils.property(rightLocator, "posted", rhsPosted), lhsPosted, rhsPosted, leftObject.isSetPosted(), rightObject.isSetPosted()));
                    target.setPosted(mergedPosted);
                } else {
                    if (postedShouldBeMergedAndSet == Boolean.FALSE) {
                        target.posted = null;
                    }
                }
            }
            {
                Boolean validTilShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetValidTil(), rightObject.isSetValidTil());
                if (validTilShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsValidTil;
                    lhsValidTil = leftObject.getValidTil();
                    String rhsValidTil;
                    rhsValidTil = rightObject.getValidTil();
                    String mergedValidTil = ((String) strategy.merge(LocatorUtils.property(leftLocator, "validTil", lhsValidTil), LocatorUtils.property(rightLocator, "validTil", rhsValidTil), lhsValidTil, rhsValidTil, leftObject.isSetValidTil(), rightObject.isSetValidTil()));
                    target.setValidTil(mergedValidTil);
                } else {
                    if (validTilShouldBeMergedAndSet == Boolean.FALSE) {
                        target.validTil = null;
                    }
                }
            }
            {
                Boolean infoCutOffShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetInfoCutOff(), rightObject.isSetInfoCutOff());
                if (infoCutOffShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsInfoCutOff;
                    lhsInfoCutOff = leftObject.getInfoCutOff();
                    String rhsInfoCutOff;
                    rhsInfoCutOff = rightObject.getInfoCutOff();
                    String mergedInfoCutOff = ((String) strategy.merge(LocatorUtils.property(leftLocator, "infoCutOff", lhsInfoCutOff), LocatorUtils.property(rightLocator, "infoCutOff", rhsInfoCutOff), lhsInfoCutOff, rhsInfoCutOff, leftObject.isSetInfoCutOff(), rightObject.isSetInfoCutOff()));
                    target.setInfoCutOff(mergedInfoCutOff);
                } else {
                    if (infoCutOffShouldBeMergedAndSet == Boolean.FALSE) {
                        target.infoCutOff = null;
                    }
                }
            }
            {
                Boolean approvedOnShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetApprovedOn(), rightObject.isSetApprovedOn());
                if (approvedOnShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsApprovedOn;
                    lhsApprovedOn = leftObject.getApprovedOn();
                    String rhsApprovedOn;
                    rhsApprovedOn = rightObject.getApprovedOn();
                    String mergedApprovedOn = ((String) strategy.merge(LocatorUtils.property(leftLocator, "approvedOn", lhsApprovedOn), LocatorUtils.property(rightLocator, "approvedOn", rhsApprovedOn), lhsApprovedOn, rhsApprovedOn, leftObject.isSetApprovedOn(), rightObject.isSetApprovedOn()));
                    target.setApprovedOn(mergedApprovedOn);
                } else {
                    if (approvedOnShouldBeMergedAndSet == Boolean.FALSE) {
                        target.approvedOn = null;
                    }
                }
            }
            {
                Boolean receivedOnShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetReceivedOn(), rightObject.isSetReceivedOn());
                if (receivedOnShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsReceivedOn;
                    lhsReceivedOn = leftObject.getReceivedOn();
                    String rhsReceivedOn;
                    rhsReceivedOn = rightObject.getReceivedOn();
                    String mergedReceivedOn = ((String) strategy.merge(LocatorUtils.property(leftLocator, "receivedOn", lhsReceivedOn), LocatorUtils.property(rightLocator, "receivedOn", rhsReceivedOn), lhsReceivedOn, rhsReceivedOn, leftObject.isSetReceivedOn(), rightObject.isSetReceivedOn()));
                    target.setReceivedOn(mergedReceivedOn);
                } else {
                    if (receivedOnShouldBeMergedAndSet == Boolean.FALSE) {
                        target.receivedOn = null;
                    }
                }
            }
        }
    }

    public void setAcquiredOn(List<ApproximableDateType> value) {
        this.acquiredOn = null;
        if (value!= null) {
            List<ApproximableDateType> draftl = this.getAcquiredOn();
            draftl.addAll(value);
        }
    }

}
