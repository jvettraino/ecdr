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
 * <p>Java class for PT_Locale_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PT_Locale_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="languageCode" type="{http://www.isotc211.org/2005/gmd}LanguageCode_PropertyType"/&gt;
 *         &lt;element name="country" type="{http://www.isotc211.org/2005/gmd}Country_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="characterEncoding" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_Locale_Type", propOrder = {
    "languageCode",
    "country",
    "characterEncoding"
})
public class PTLocaleType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "PTLocaleType.languageCode {javax.validation.constraints.NotNull.message}")
    @Valid
    protected LanguageCodePropertyType languageCode;
    @Valid
    protected CountryPropertyType country;
    @XmlElement(required = true)
    @NotNull(message = "PTLocaleType.characterEncoding {javax.validation.constraints.NotNull.message}")
    @Valid
    protected MDCharacterSetCodePropertyType characterEncoding;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public LanguageCodePropertyType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public void setLanguageCode(LanguageCodePropertyType value) {
        this.languageCode = value;
    }

    public boolean isSetLanguageCode() {
        return (this.languageCode!= null);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPropertyType }
     *     
     */
    public CountryPropertyType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPropertyType }
     *     
     */
    public void setCountry(CountryPropertyType value) {
        this.country = value;
    }

    public boolean isSetCountry() {
        return (this.country!= null);
    }

    /**
     * Gets the value of the characterEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterEncoding() {
        return characterEncoding;
    }

    /**
     * Sets the value of the characterEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterEncoding(MDCharacterSetCodePropertyType value) {
        this.characterEncoding = value;
    }

    public boolean isSetCharacterEncoding() {
        return (this.characterEncoding!= null);
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
            LanguageCodePropertyType theLanguageCode;
            theLanguageCode = this.getLanguageCode();
            strategy.appendField(locator, this, "languageCode", buffer, theLanguageCode, this.isSetLanguageCode());
        }
        {
            CountryPropertyType theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, this.isSetCountry());
        }
        {
            MDCharacterSetCodePropertyType theCharacterEncoding;
            theCharacterEncoding = this.getCharacterEncoding();
            strategy.appendField(locator, this, "characterEncoding", buffer, theCharacterEncoding, this.isSetCharacterEncoding());
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
        final PTLocaleType that = ((PTLocaleType) object);
        {
            LanguageCodePropertyType lhsLanguageCode;
            lhsLanguageCode = this.getLanguageCode();
            LanguageCodePropertyType rhsLanguageCode;
            rhsLanguageCode = that.getLanguageCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "languageCode", lhsLanguageCode), LocatorUtils.property(thatLocator, "languageCode", rhsLanguageCode), lhsLanguageCode, rhsLanguageCode, this.isSetLanguageCode(), that.isSetLanguageCode())) {
                return false;
            }
        }
        {
            CountryPropertyType lhsCountry;
            lhsCountry = this.getCountry();
            CountryPropertyType rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, this.isSetCountry(), that.isSetCountry())) {
                return false;
            }
        }
        {
            MDCharacterSetCodePropertyType lhsCharacterEncoding;
            lhsCharacterEncoding = this.getCharacterEncoding();
            MDCharacterSetCodePropertyType rhsCharacterEncoding;
            rhsCharacterEncoding = that.getCharacterEncoding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characterEncoding", lhsCharacterEncoding), LocatorUtils.property(thatLocator, "characterEncoding", rhsCharacterEncoding), lhsCharacterEncoding, rhsCharacterEncoding, this.isSetCharacterEncoding(), that.isSetCharacterEncoding())) {
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
            LanguageCodePropertyType theLanguageCode;
            theLanguageCode = this.getLanguageCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "languageCode", theLanguageCode), currentHashCode, theLanguageCode, this.isSetLanguageCode());
        }
        {
            CountryPropertyType theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, this.isSetCountry());
        }
        {
            MDCharacterSetCodePropertyType theCharacterEncoding;
            theCharacterEncoding = this.getCharacterEncoding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "characterEncoding", theCharacterEncoding), currentHashCode, theCharacterEncoding, this.isSetCharacterEncoding());
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
        if (draftCopy instanceof PTLocaleType) {
            final PTLocaleType copy = ((PTLocaleType) draftCopy);
            {
                Boolean languageCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLanguageCode());
                if (languageCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    LanguageCodePropertyType sourceLanguageCode;
                    sourceLanguageCode = this.getLanguageCode();
                    LanguageCodePropertyType copyLanguageCode = ((LanguageCodePropertyType) strategy.copy(LocatorUtils.property(locator, "languageCode", sourceLanguageCode), sourceLanguageCode, this.isSetLanguageCode()));
                    copy.setLanguageCode(copyLanguageCode);
                } else {
                    if (languageCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.languageCode = null;
                    }
                }
            }
            {
                Boolean countryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCountry());
                if (countryShouldBeCopiedAndSet == Boolean.TRUE) {
                    CountryPropertyType sourceCountry;
                    sourceCountry = this.getCountry();
                    CountryPropertyType copyCountry = ((CountryPropertyType) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry, this.isSetCountry()));
                    copy.setCountry(copyCountry);
                } else {
                    if (countryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.country = null;
                    }
                }
            }
            {
                Boolean characterEncodingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetCharacterEncoding());
                if (characterEncodingShouldBeCopiedAndSet == Boolean.TRUE) {
                    MDCharacterSetCodePropertyType sourceCharacterEncoding;
                    sourceCharacterEncoding = this.getCharacterEncoding();
                    MDCharacterSetCodePropertyType copyCharacterEncoding = ((MDCharacterSetCodePropertyType) strategy.copy(LocatorUtils.property(locator, "characterEncoding", sourceCharacterEncoding), sourceCharacterEncoding, this.isSetCharacterEncoding()));
                    copy.setCharacterEncoding(copyCharacterEncoding);
                } else {
                    if (characterEncodingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.characterEncoding = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PTLocaleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof PTLocaleType) {
            final PTLocaleType target = this;
            final PTLocaleType leftObject = ((PTLocaleType) left);
            final PTLocaleType rightObject = ((PTLocaleType) right);
            {
                Boolean languageCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetLanguageCode(), rightObject.isSetLanguageCode());
                if (languageCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    LanguageCodePropertyType lhsLanguageCode;
                    lhsLanguageCode = leftObject.getLanguageCode();
                    LanguageCodePropertyType rhsLanguageCode;
                    rhsLanguageCode = rightObject.getLanguageCode();
                    LanguageCodePropertyType mergedLanguageCode = ((LanguageCodePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "languageCode", lhsLanguageCode), LocatorUtils.property(rightLocator, "languageCode", rhsLanguageCode), lhsLanguageCode, rhsLanguageCode, leftObject.isSetLanguageCode(), rightObject.isSetLanguageCode()));
                    target.setLanguageCode(mergedLanguageCode);
                } else {
                    if (languageCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.languageCode = null;
                    }
                }
            }
            {
                Boolean countryShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetCountry(), rightObject.isSetCountry());
                if (countryShouldBeMergedAndSet == Boolean.TRUE) {
                    CountryPropertyType lhsCountry;
                    lhsCountry = leftObject.getCountry();
                    CountryPropertyType rhsCountry;
                    rhsCountry = rightObject.getCountry();
                    CountryPropertyType mergedCountry = ((CountryPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "country", lhsCountry), LocatorUtils.property(rightLocator, "country", rhsCountry), lhsCountry, rhsCountry, leftObject.isSetCountry(), rightObject.isSetCountry()));
                    target.setCountry(mergedCountry);
                } else {
                    if (countryShouldBeMergedAndSet == Boolean.FALSE) {
                        target.country = null;
                    }
                }
            }
            {
                Boolean characterEncodingShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetCharacterEncoding(), rightObject.isSetCharacterEncoding());
                if (characterEncodingShouldBeMergedAndSet == Boolean.TRUE) {
                    MDCharacterSetCodePropertyType lhsCharacterEncoding;
                    lhsCharacterEncoding = leftObject.getCharacterEncoding();
                    MDCharacterSetCodePropertyType rhsCharacterEncoding;
                    rhsCharacterEncoding = rightObject.getCharacterEncoding();
                    MDCharacterSetCodePropertyType mergedCharacterEncoding = ((MDCharacterSetCodePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "characterEncoding", lhsCharacterEncoding), LocatorUtils.property(rightLocator, "characterEncoding", rhsCharacterEncoding), lhsCharacterEncoding, rhsCharacterEncoding, leftObject.isSetCharacterEncoding(), rightObject.isSetCharacterEncoding()));
                    target.setCharacterEncoding(mergedCharacterEncoding);
                } else {
                    if (characterEncodingShouldBeMergedAndSet == Boolean.FALSE) {
                        target.characterEncoding = null;
                    }
                }
            }
        }
    }

}