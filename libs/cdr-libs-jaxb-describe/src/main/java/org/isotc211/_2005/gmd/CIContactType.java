//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package org.isotc211._2005.gmd;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
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
 * Information required enabling contact with the  responsible person and/or organisation
 * 
 * <p>Java class for CI_Contact_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Contact_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phone" type="{http://www.isotc211.org/2005/gmd}CI_Telephone_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.isotc211.org/2005/gmd}CI_Address_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="onlineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="hoursOfService" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="contactInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Contact_Type", propOrder = {
    "phone",
    "address",
    "onlineResource",
    "hoursOfService",
    "contactInstructions"
})
public class CIContactType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @Valid
    protected CITelephonePropertyType phone;
    @Valid
    protected CIAddressPropertyType address;
    @Valid
    protected CIOnlineResourcePropertyType onlineResource;
    @Valid
    protected CharacterStringPropertyType hoursOfService;
    @Valid
    protected CharacterStringPropertyType contactInstructions;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public CITelephonePropertyType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public void setPhone(CITelephonePropertyType value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public CIAddressPropertyType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public void setAddress(CIAddressPropertyType value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the onlineResource property.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Sets the value of the onlineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setOnlineResource(CIOnlineResourcePropertyType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Gets the value of the hoursOfService property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHoursOfService() {
        return hoursOfService;
    }

    /**
     * Sets the value of the hoursOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHoursOfService(CharacterStringPropertyType value) {
        this.hoursOfService = value;
    }

    public boolean isSetHoursOfService() {
        return (this.hoursOfService!= null);
    }

    /**
     * Gets the value of the contactInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getContactInstructions() {
        return contactInstructions;
    }

    /**
     * Sets the value of the contactInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setContactInstructions(CharacterStringPropertyType value) {
        this.contactInstructions = value;
    }

    public boolean isSetContactInstructions() {
        return (this.contactInstructions!= null);
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
            CITelephonePropertyType thePhone;
            thePhone = this.getPhone();
            strategy.appendField(locator, this, "phone", buffer, thePhone, this.isSetPhone());
        }
        {
            CIAddressPropertyType theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, this.isSetAddress());
        }
        {
            CIOnlineResourcePropertyType theOnlineResource;
            theOnlineResource = this.getOnlineResource();
            strategy.appendField(locator, this, "onlineResource", buffer, theOnlineResource, this.isSetOnlineResource());
        }
        {
            CharacterStringPropertyType theHoursOfService;
            theHoursOfService = this.getHoursOfService();
            strategy.appendField(locator, this, "hoursOfService", buffer, theHoursOfService, this.isSetHoursOfService());
        }
        {
            CharacterStringPropertyType theContactInstructions;
            theContactInstructions = this.getContactInstructions();
            strategy.appendField(locator, this, "contactInstructions", buffer, theContactInstructions, this.isSetContactInstructions());
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
        final CIContactType that = ((CIContactType) object);
        {
            CITelephonePropertyType lhsPhone;
            lhsPhone = this.getPhone();
            CITelephonePropertyType rhsPhone;
            rhsPhone = that.getPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone", lhsPhone), LocatorUtils.property(thatLocator, "phone", rhsPhone), lhsPhone, rhsPhone, this.isSetPhone(), that.isSetPhone())) {
                return false;
            }
        }
        {
            CIAddressPropertyType lhsAddress;
            lhsAddress = this.getAddress();
            CIAddressPropertyType rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, this.isSetAddress(), that.isSetAddress())) {
                return false;
            }
        }
        {
            CIOnlineResourcePropertyType lhsOnlineResource;
            lhsOnlineResource = this.getOnlineResource();
            CIOnlineResourcePropertyType rhsOnlineResource;
            rhsOnlineResource = that.getOnlineResource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onlineResource", lhsOnlineResource), LocatorUtils.property(thatLocator, "onlineResource", rhsOnlineResource), lhsOnlineResource, rhsOnlineResource, this.isSetOnlineResource(), that.isSetOnlineResource())) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsHoursOfService;
            lhsHoursOfService = this.getHoursOfService();
            CharacterStringPropertyType rhsHoursOfService;
            rhsHoursOfService = that.getHoursOfService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hoursOfService", lhsHoursOfService), LocatorUtils.property(thatLocator, "hoursOfService", rhsHoursOfService), lhsHoursOfService, rhsHoursOfService, this.isSetHoursOfService(), that.isSetHoursOfService())) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsContactInstructions;
            lhsContactInstructions = this.getContactInstructions();
            CharacterStringPropertyType rhsContactInstructions;
            rhsContactInstructions = that.getContactInstructions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactInstructions", lhsContactInstructions), LocatorUtils.property(thatLocator, "contactInstructions", rhsContactInstructions), lhsContactInstructions, rhsContactInstructions, this.isSetContactInstructions(), that.isSetContactInstructions())) {
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
            CITelephonePropertyType thePhone;
            thePhone = this.getPhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phone", thePhone), currentHashCode, thePhone, this.isSetPhone());
        }
        {
            CIAddressPropertyType theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress, this.isSetAddress());
        }
        {
            CIOnlineResourcePropertyType theOnlineResource;
            theOnlineResource = this.getOnlineResource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onlineResource", theOnlineResource), currentHashCode, theOnlineResource, this.isSetOnlineResource());
        }
        {
            CharacterStringPropertyType theHoursOfService;
            theHoursOfService = this.getHoursOfService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hoursOfService", theHoursOfService), currentHashCode, theHoursOfService, this.isSetHoursOfService());
        }
        {
            CharacterStringPropertyType theContactInstructions;
            theContactInstructions = this.getContactInstructions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactInstructions", theContactInstructions), currentHashCode, theContactInstructions, this.isSetContactInstructions());
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
        if (draftCopy instanceof CIContactType) {
            final CIContactType copy = ((CIContactType) draftCopy);
            {
                Boolean phoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPhone());
                if (phoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    CITelephonePropertyType sourcePhone;
                    sourcePhone = this.getPhone();
                    CITelephonePropertyType copyPhone = ((CITelephonePropertyType) strategy.copy(LocatorUtils.property(locator, "phone", sourcePhone), sourcePhone, this.isSetPhone()));
                    copy.setPhone(copyPhone);
                } else {
                    if (phoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phone = null;
                    }
                }
            }
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAddress());
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    CIAddressPropertyType sourceAddress;
                    sourceAddress = this.getAddress();
                    CIAddressPropertyType copyAddress = ((CIAddressPropertyType) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, this.isSetAddress()));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean onlineResourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOnlineResource());
                if (onlineResourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    CIOnlineResourcePropertyType sourceOnlineResource;
                    sourceOnlineResource = this.getOnlineResource();
                    CIOnlineResourcePropertyType copyOnlineResource = ((CIOnlineResourcePropertyType) strategy.copy(LocatorUtils.property(locator, "onlineResource", sourceOnlineResource), sourceOnlineResource, this.isSetOnlineResource()));
                    copy.setOnlineResource(copyOnlineResource);
                } else {
                    if (onlineResourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.onlineResource = null;
                    }
                }
            }
            {
                Boolean hoursOfServiceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHoursOfService());
                if (hoursOfServiceShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceHoursOfService;
                    sourceHoursOfService = this.getHoursOfService();
                    CharacterStringPropertyType copyHoursOfService = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "hoursOfService", sourceHoursOfService), sourceHoursOfService, this.isSetHoursOfService()));
                    copy.setHoursOfService(copyHoursOfService);
                } else {
                    if (hoursOfServiceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hoursOfService = null;
                    }
                }
            }
            {
                Boolean contactInstructionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetContactInstructions());
                if (contactInstructionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceContactInstructions;
                    sourceContactInstructions = this.getContactInstructions();
                    CharacterStringPropertyType copyContactInstructions = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "contactInstructions", sourceContactInstructions), sourceContactInstructions, this.isSetContactInstructions()));
                    copy.setContactInstructions(copyContactInstructions);
                } else {
                    if (contactInstructionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactInstructions = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CIContactType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CIContactType) {
            final CIContactType target = this;
            final CIContactType leftObject = ((CIContactType) left);
            final CIContactType rightObject = ((CIContactType) right);
            {
                Boolean phoneShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPhone(), rightObject.isSetPhone());
                if (phoneShouldBeMergedAndSet == Boolean.TRUE) {
                    CITelephonePropertyType lhsPhone;
                    lhsPhone = leftObject.getPhone();
                    CITelephonePropertyType rhsPhone;
                    rhsPhone = rightObject.getPhone();
                    CITelephonePropertyType mergedPhone = ((CITelephonePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "phone", lhsPhone), LocatorUtils.property(rightLocator, "phone", rhsPhone), lhsPhone, rhsPhone, leftObject.isSetPhone(), rightObject.isSetPhone()));
                    target.setPhone(mergedPhone);
                } else {
                    if (phoneShouldBeMergedAndSet == Boolean.FALSE) {
                        target.phone = null;
                    }
                }
            }
            {
                Boolean addressShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetAddress(), rightObject.isSetAddress());
                if (addressShouldBeMergedAndSet == Boolean.TRUE) {
                    CIAddressPropertyType lhsAddress;
                    lhsAddress = leftObject.getAddress();
                    CIAddressPropertyType rhsAddress;
                    rhsAddress = rightObject.getAddress();
                    CIAddressPropertyType mergedAddress = ((CIAddressPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "address", lhsAddress), LocatorUtils.property(rightLocator, "address", rhsAddress), lhsAddress, rhsAddress, leftObject.isSetAddress(), rightObject.isSetAddress()));
                    target.setAddress(mergedAddress);
                } else {
                    if (addressShouldBeMergedAndSet == Boolean.FALSE) {
                        target.address = null;
                    }
                }
            }
            {
                Boolean onlineResourceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetOnlineResource(), rightObject.isSetOnlineResource());
                if (onlineResourceShouldBeMergedAndSet == Boolean.TRUE) {
                    CIOnlineResourcePropertyType lhsOnlineResource;
                    lhsOnlineResource = leftObject.getOnlineResource();
                    CIOnlineResourcePropertyType rhsOnlineResource;
                    rhsOnlineResource = rightObject.getOnlineResource();
                    CIOnlineResourcePropertyType mergedOnlineResource = ((CIOnlineResourcePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "onlineResource", lhsOnlineResource), LocatorUtils.property(rightLocator, "onlineResource", rhsOnlineResource), lhsOnlineResource, rhsOnlineResource, leftObject.isSetOnlineResource(), rightObject.isSetOnlineResource()));
                    target.setOnlineResource(mergedOnlineResource);
                } else {
                    if (onlineResourceShouldBeMergedAndSet == Boolean.FALSE) {
                        target.onlineResource = null;
                    }
                }
            }
            {
                Boolean hoursOfServiceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetHoursOfService(), rightObject.isSetHoursOfService());
                if (hoursOfServiceShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsHoursOfService;
                    lhsHoursOfService = leftObject.getHoursOfService();
                    CharacterStringPropertyType rhsHoursOfService;
                    rhsHoursOfService = rightObject.getHoursOfService();
                    CharacterStringPropertyType mergedHoursOfService = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "hoursOfService", lhsHoursOfService), LocatorUtils.property(rightLocator, "hoursOfService", rhsHoursOfService), lhsHoursOfService, rhsHoursOfService, leftObject.isSetHoursOfService(), rightObject.isSetHoursOfService()));
                    target.setHoursOfService(mergedHoursOfService);
                } else {
                    if (hoursOfServiceShouldBeMergedAndSet == Boolean.FALSE) {
                        target.hoursOfService = null;
                    }
                }
            }
            {
                Boolean contactInstructionsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetContactInstructions(), rightObject.isSetContactInstructions());
                if (contactInstructionsShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsContactInstructions;
                    lhsContactInstructions = leftObject.getContactInstructions();
                    CharacterStringPropertyType rhsContactInstructions;
                    rhsContactInstructions = rightObject.getContactInstructions();
                    CharacterStringPropertyType mergedContactInstructions = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "contactInstructions", lhsContactInstructions), LocatorUtils.property(rightLocator, "contactInstructions", rhsContactInstructions), lhsContactInstructions, rhsContactInstructions, leftObject.isSetContactInstructions(), rightObject.isSetContactInstructions()));
                    target.setContactInstructions(mergedContactInstructions);
                } else {
                    if (contactInstructionsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.contactInstructions = null;
                    }
                }
            }
        }
    }

}
