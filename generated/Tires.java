//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleServiceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConstructionType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="R"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LoadIndex" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SpeedRating" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A1"/>
 *               &lt;enumeration value="A2"/>
 *               &lt;enumeration value="A3"/>
 *               &lt;enumeration value="A4"/>
 *               &lt;enumeration value="A5"/>
 *               &lt;enumeration value="A6"/>
 *               &lt;enumeration value="A7"/>
 *               &lt;enumeration value="A8"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="J"/>
 *               &lt;enumeration value="K"/>
 *               &lt;enumeration value="L"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="Q"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="T"/>
 *               &lt;enumeration value="U"/>
 *               &lt;enumeration value="H"/>
 *               &lt;enumeration value="V"/>
 *               &lt;enumeration value="Z"/>
 *               &lt;enumeration value="W"/>
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="SR"/>
 *               &lt;enumeration value="HR"/>
 *               &lt;enumeration value="VR"/>
 *               &lt;enumeration value="ZR"/>
 *               &lt;enumeration value="Other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UTQGRating" type="{}String" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="run_flat"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModelName" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="RimDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SectionWidth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TireAspectRatio" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="TreadDepth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleServiceType",
    "constructionType",
    "loadIndex",
    "speedRating",
    "utqgRating",
    "specialFeatures",
    "modelName",
    "rimDiameter",
    "sectionWidth",
    "tireAspectRatio",
    "treadDepth",
    "itemPackageQuantity"
})
@XmlRootElement(name = "Tires")
public class Tires {

    @XmlElement(name = "VehicleServiceType")
    protected String vehicleServiceType;
    @XmlElement(name = "ConstructionType")
    protected String constructionType;
    @XmlElement(name = "LoadIndex")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger loadIndex;
    @XmlElement(name = "SpeedRating")
    protected String speedRating;
    @XmlElement(name = "UTQGRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String utqgRating;
    @XmlElement(name = "SpecialFeatures")
    protected String specialFeatures;
    @XmlElement(name = "ModelName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modelName;
    @XmlElement(name = "RimDiameter")
    protected LengthDimension rimDiameter;
    @XmlElement(name = "SectionWidth")
    protected String sectionWidth;
    @XmlElement(name = "TireAspectRatio")
    protected LengthDimension tireAspectRatio;
    @XmlElement(name = "TreadDepth")
    protected LengthDimension treadDepth;
    @XmlElement(name = "ItemPackageQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;

    /**
     * Gets the value of the vehicleServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleServiceType() {
        return vehicleServiceType;
    }

    /**
     * Sets the value of the vehicleServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleServiceType(String value) {
        this.vehicleServiceType = value;
    }

    /**
     * Gets the value of the constructionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionType() {
        return constructionType;
    }

    /**
     * Sets the value of the constructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionType(String value) {
        this.constructionType = value;
    }

    /**
     * Gets the value of the loadIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoadIndex() {
        return loadIndex;
    }

    /**
     * Sets the value of the loadIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoadIndex(BigInteger value) {
        this.loadIndex = value;
    }

    /**
     * Gets the value of the speedRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedRating() {
        return speedRating;
    }

    /**
     * Sets the value of the speedRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedRating(String value) {
        this.speedRating = value;
    }

    /**
     * Gets the value of the utqgRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTQGRating() {
        return utqgRating;
    }

    /**
     * Sets the value of the utqgRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTQGRating(String value) {
        this.utqgRating = value;
    }

    /**
     * Gets the value of the specialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * Sets the value of the specialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFeatures(String value) {
        this.specialFeatures = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the rimDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getRimDiameter() {
        return rimDiameter;
    }

    /**
     * Sets the value of the rimDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setRimDiameter(LengthDimension value) {
        this.rimDiameter = value;
    }

    /**
     * Gets the value of the sectionWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionWidth() {
        return sectionWidth;
    }

    /**
     * Sets the value of the sectionWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionWidth(String value) {
        this.sectionWidth = value;
    }

    /**
     * Gets the value of the tireAspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTireAspectRatio() {
        return tireAspectRatio;
    }

    /**
     * Sets the value of the tireAspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTireAspectRatio(LengthDimension value) {
        this.tireAspectRatio = value;
    }

    /**
     * Gets the value of the treadDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTreadDepth() {
        return treadDepth;
    }

    /**
     * Sets the value of the treadDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTreadDepth(LengthDimension value) {
        this.treadDepth = value;
    }

    /**
     * Gets the value of the itemPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemPackageQuantity() {
        return itemPackageQuantity;
    }

    /**
     * Sets the value of the itemPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemPackageQuantity(BigInteger value) {
        this.itemPackageQuantity = value;
    }

}
