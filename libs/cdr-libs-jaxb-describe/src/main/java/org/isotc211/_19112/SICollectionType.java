//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package org.isotc211._19112;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
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
 * A collection-type intended for use as a generic container of location instances.
 * 
 * <p>Java class for SI_CollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SI_CollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="featureMember"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SI_CollectionType", propOrder = {
    "featureMember"
})
public class SICollectionType
    extends AbstractFeatureType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected List<SICollectionType.FeatureMember> featureMember;

    /**
     * Gets the value of the featureMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SICollectionType.FeatureMember }
     * 
     * 
     */
    public List<SICollectionType.FeatureMember> getFeatureMember() {
        if (featureMember == null) {
            featureMember = new ArrayList<SICollectionType.FeatureMember>();
        }
        return this.featureMember;
    }

    public boolean isSetFeatureMember() {
        return ((this.featureMember!= null)&&(!this.featureMember.isEmpty()));
    }

    public void unsetFeatureMember() {
        this.featureMember = null;
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
            List<SICollectionType.FeatureMember> theFeatureMember;
            theFeatureMember = (this.isSetFeatureMember()?this.getFeatureMember():null);
            strategy.appendField(locator, this, "featureMember", buffer, theFeatureMember, this.isSetFeatureMember());
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
        final SICollectionType that = ((SICollectionType) object);
        {
            List<SICollectionType.FeatureMember> lhsFeatureMember;
            lhsFeatureMember = (this.isSetFeatureMember()?this.getFeatureMember():null);
            List<SICollectionType.FeatureMember> rhsFeatureMember;
            rhsFeatureMember = (that.isSetFeatureMember()?that.getFeatureMember():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureMember", lhsFeatureMember), LocatorUtils.property(thatLocator, "featureMember", rhsFeatureMember), lhsFeatureMember, rhsFeatureMember, this.isSetFeatureMember(), that.isSetFeatureMember())) {
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
            List<SICollectionType.FeatureMember> theFeatureMember;
            theFeatureMember = (this.isSetFeatureMember()?this.getFeatureMember():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureMember", theFeatureMember), currentHashCode, theFeatureMember, this.isSetFeatureMember());
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
        if (draftCopy instanceof SICollectionType) {
            final SICollectionType copy = ((SICollectionType) draftCopy);
            {
                Boolean featureMemberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetFeatureMember());
                if (featureMemberShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SICollectionType.FeatureMember> sourceFeatureMember;
                    sourceFeatureMember = (this.isSetFeatureMember()?this.getFeatureMember():null);
                    @SuppressWarnings("unchecked")
                    List<SICollectionType.FeatureMember> copyFeatureMember = ((List<SICollectionType.FeatureMember> ) strategy.copy(LocatorUtils.property(locator, "featureMember", sourceFeatureMember), sourceFeatureMember, this.isSetFeatureMember()));
                    copy.unsetFeatureMember();
                    if (copyFeatureMember!= null) {
                        List<SICollectionType.FeatureMember> uniqueFeatureMemberl = copy.getFeatureMember();
                        uniqueFeatureMemberl.addAll(copyFeatureMember);
                    }
                } else {
                    if (featureMemberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetFeatureMember();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SICollectionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof SICollectionType) {
            final SICollectionType target = this;
            final SICollectionType leftObject = ((SICollectionType) left);
            final SICollectionType rightObject = ((SICollectionType) right);
            {
                Boolean featureMemberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetFeatureMember(), rightObject.isSetFeatureMember());
                if (featureMemberShouldBeMergedAndSet == Boolean.TRUE) {
                    List<SICollectionType.FeatureMember> lhsFeatureMember;
                    lhsFeatureMember = (leftObject.isSetFeatureMember()?leftObject.getFeatureMember():null);
                    List<SICollectionType.FeatureMember> rhsFeatureMember;
                    rhsFeatureMember = (rightObject.isSetFeatureMember()?rightObject.getFeatureMember():null);
                    List<SICollectionType.FeatureMember> mergedFeatureMember = ((List<SICollectionType.FeatureMember> ) strategy.merge(LocatorUtils.property(leftLocator, "featureMember", lhsFeatureMember), LocatorUtils.property(rightLocator, "featureMember", rhsFeatureMember), lhsFeatureMember, rhsFeatureMember, leftObject.isSetFeatureMember(), rightObject.isSetFeatureMember()));
                    target.unsetFeatureMember();
                    if (mergedFeatureMember!= null) {
                        List<SICollectionType.FeatureMember> uniqueFeatureMemberl = target.getFeatureMember();
                        uniqueFeatureMemberl.addAll(mergedFeatureMember);
                    }
                } else {
                    if (featureMemberShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetFeatureMember();
                    }
                }
            }
        }
    }

    public void setFeatureMember(List<SICollectionType.FeatureMember> value) {
        this.featureMember = null;
        if (value!= null) {
            List<SICollectionType.FeatureMember> draftl = this.getFeatureMember();
            draftl.addAll(value);
        }
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractFeature"
    })
    public static class FeatureMember implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        private final static long serialVersionUID = 1L;
        @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractFeatureType> abstractFeature;

        /**
         * Gets the value of the abstractFeature property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SICollectionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SISpatialReferenceSystemUsingGeographicIdentifiersType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SIGazetteerType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SILocationInstanceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SILocationTypeType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
            return abstractFeature;
        }

        /**
         * Sets the value of the abstractFeature property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SICollectionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SISpatialReferenceSystemUsingGeographicIdentifiersType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SIGazetteerType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SILocationInstanceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SILocationTypeType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     
         */
        public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
            this.abstractFeature = value;
        }

        public boolean isSetAbstractFeature() {
            return (this.abstractFeature!= null);
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
                JAXBElement<? extends AbstractFeatureType> theAbstractFeature;
                theAbstractFeature = this.getAbstractFeature();
                strategy.appendField(locator, this, "abstractFeature", buffer, theAbstractFeature, this.isSetAbstractFeature());
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
            final SICollectionType.FeatureMember that = ((SICollectionType.FeatureMember) object);
            {
                JAXBElement<? extends AbstractFeatureType> lhsAbstractFeature;
                lhsAbstractFeature = this.getAbstractFeature();
                JAXBElement<? extends AbstractFeatureType> rhsAbstractFeature;
                rhsAbstractFeature = that.getAbstractFeature();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "abstractFeature", lhsAbstractFeature), LocatorUtils.property(thatLocator, "abstractFeature", rhsAbstractFeature), lhsAbstractFeature, rhsAbstractFeature, this.isSetAbstractFeature(), that.isSetAbstractFeature())) {
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
                JAXBElement<? extends AbstractFeatureType> theAbstractFeature;
                theAbstractFeature = this.getAbstractFeature();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstractFeature", theAbstractFeature), currentHashCode, theAbstractFeature, this.isSetAbstractFeature());
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
            if (draftCopy instanceof SICollectionType.FeatureMember) {
                final SICollectionType.FeatureMember copy = ((SICollectionType.FeatureMember) draftCopy);
                {
                    Boolean abstractFeatureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAbstractFeature());
                    if (abstractFeatureShouldBeCopiedAndSet == Boolean.TRUE) {
                        JAXBElement<? extends AbstractFeatureType> sourceAbstractFeature;
                        sourceAbstractFeature = this.getAbstractFeature();
                        @SuppressWarnings("unchecked")
                        JAXBElement<? extends AbstractFeatureType> copyAbstractFeature = ((JAXBElement<? extends AbstractFeatureType> ) strategy.copy(LocatorUtils.property(locator, "abstractFeature", sourceAbstractFeature), sourceAbstractFeature, this.isSetAbstractFeature()));
                        copy.setAbstractFeature(copyAbstractFeature);
                    } else {
                        if (abstractFeatureShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.abstractFeature = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new SICollectionType.FeatureMember();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof SICollectionType.FeatureMember) {
                final SICollectionType.FeatureMember target = this;
                final SICollectionType.FeatureMember leftObject = ((SICollectionType.FeatureMember) left);
                final SICollectionType.FeatureMember rightObject = ((SICollectionType.FeatureMember) right);
                {
                    Boolean abstractFeatureShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetAbstractFeature(), rightObject.isSetAbstractFeature());
                    if (abstractFeatureShouldBeMergedAndSet == Boolean.TRUE) {
                        JAXBElement<? extends AbstractFeatureType> lhsAbstractFeature;
                        lhsAbstractFeature = leftObject.getAbstractFeature();
                        JAXBElement<? extends AbstractFeatureType> rhsAbstractFeature;
                        rhsAbstractFeature = rightObject.getAbstractFeature();
                        JAXBElement<? extends AbstractFeatureType> mergedAbstractFeature = ((JAXBElement<? extends AbstractFeatureType> ) strategy.merge(LocatorUtils.property(leftLocator, "abstractFeature", lhsAbstractFeature), LocatorUtils.property(rightLocator, "abstractFeature", rhsAbstractFeature), lhsAbstractFeature, rhsAbstractFeature, leftObject.isSetAbstractFeature(), rightObject.isSetAbstractFeature()));
                        target.setAbstractFeature(mergedAbstractFeature);
                    } else {
                        if (abstractFeatureShouldBeMergedAndSet == Boolean.FALSE) {
                            target.abstractFeature = null;
                        }
                    }
                }
            }
        }

    }

}