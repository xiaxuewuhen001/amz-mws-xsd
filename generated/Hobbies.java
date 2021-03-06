//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="ActiveSurfaceArea" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WingArea" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CollectionName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Genre" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="InitialPrintRunRarity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpecificUsesForProduct" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BrakeStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ControlType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="DriveSystem" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="EducationalObjective" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FrameMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FuelCapacity" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="FuelType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IsElectric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumRange" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumSpeed" type="{}SpeedDimension" minOccurs="0"/>
 *         &lt;element name="MotorType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="AnimalType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Publisher" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RadioBandsSupported" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RailType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Scale" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SkillLevel" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SuspensionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProductTheme" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TireType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ToyAwardName" type="{}ToyAwardType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="WheelDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="WheelType" type="{}StringNotNull" minOccurs="0"/>
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
    "activeSurfaceArea",
    "wingArea",
    "collectionName",
    "genre",
    "initialPrintRunRarity",
    "specificUsesForProduct",
    "brakeStyle",
    "controlType",
    "countryOfOrigin",
    "driveSystem",
    "educationalObjective",
    "frameMaterialType",
    "fuelCapacity",
    "fuelType",
    "isElectric",
    "materialType",
    "maximumRange",
    "maximumSpeed",
    "motorType",
    "animalType",
    "publisher",
    "radioBandsSupported",
    "railType",
    "scale",
    "skillLevel",
    "suspensionType",
    "productTheme",
    "tireType",
    "toyAwardName",
    "wheelDiameter",
    "wheelType"
})
@XmlRootElement(name = "Hobbies")
public class Hobbies {

    @XmlElement(name = "ActiveSurfaceArea")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String activeSurfaceArea;
    @XmlElement(name = "WingArea")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String wingArea;
    @XmlElement(name = "CollectionName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String collectionName;
    @XmlElement(name = "Genre")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String genre;
    @XmlElement(name = "InitialPrintRunRarity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String initialPrintRunRarity;
    @XmlElement(name = "SpecificUsesForProduct")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String specificUsesForProduct;
    @XmlElement(name = "BrakeStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String brakeStyle;
    @XmlElement(name = "ControlType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String controlType;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "DriveSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String driveSystem;
    @XmlElement(name = "EducationalObjective")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String educationalObjective;
    @XmlElement(name = "FrameMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String frameMaterialType;
    @XmlElement(name = "FuelCapacity")
    protected VolumeDimension fuelCapacity;
    @XmlElement(name = "FuelType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fuelType;
    @XmlElement(name = "IsElectric")
    protected Boolean isElectric;
    @XmlElement(name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String materialType;
    @XmlElement(name = "MaximumRange")
    protected LengthDimension maximumRange;
    @XmlElement(name = "MaximumSpeed")
    protected SpeedDimension maximumSpeed;
    @XmlElement(name = "MotorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String motorType;
    @XmlElement(name = "AnimalType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String animalType;
    @XmlElement(name = "Publisher")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String publisher;
    @XmlElement(name = "RadioBandsSupported")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String radioBandsSupported;
    @XmlElement(name = "RailType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String railType;
    @XmlElement(name = "Scale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scale;
    @XmlElement(name = "SkillLevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String skillLevel;
    @XmlElement(name = "SuspensionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String suspensionType;
    @XmlElement(name = "ProductTheme")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String productTheme;
    @XmlElement(name = "TireType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tireType;
    @XmlElement(name = "ToyAwardName")
    protected List<ToyAwardType> toyAwardName;
    @XmlElement(name = "WheelDiameter")
    protected LengthDimension wheelDiameter;
    @XmlElement(name = "WheelType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String wheelType;

    /**
     * Gets the value of the activeSurfaceArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveSurfaceArea() {
        return activeSurfaceArea;
    }

    /**
     * Sets the value of the activeSurfaceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveSurfaceArea(String value) {
        this.activeSurfaceArea = value;
    }

    /**
     * Gets the value of the wingArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWingArea() {
        return wingArea;
    }

    /**
     * Sets the value of the wingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWingArea(String value) {
        this.wingArea = value;
    }

    /**
     * Gets the value of the collectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * Sets the value of the collectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the initialPrintRunRarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialPrintRunRarity() {
        return initialPrintRunRarity;
    }

    /**
     * Sets the value of the initialPrintRunRarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialPrintRunRarity(String value) {
        this.initialPrintRunRarity = value;
    }

    /**
     * Gets the value of the specificUsesForProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUsesForProduct() {
        return specificUsesForProduct;
    }

    /**
     * Sets the value of the specificUsesForProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUsesForProduct(String value) {
        this.specificUsesForProduct = value;
    }

    /**
     * Gets the value of the brakeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrakeStyle() {
        return brakeStyle;
    }

    /**
     * Sets the value of the brakeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrakeStyle(String value) {
        this.brakeStyle = value;
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlType(String value) {
        this.controlType = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the driveSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveSystem() {
        return driveSystem;
    }

    /**
     * Sets the value of the driveSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveSystem(String value) {
        this.driveSystem = value;
    }

    /**
     * Gets the value of the educationalObjective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalObjective() {
        return educationalObjective;
    }

    /**
     * Sets the value of the educationalObjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalObjective(String value) {
        this.educationalObjective = value;
    }

    /**
     * Gets the value of the frameMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameMaterialType() {
        return frameMaterialType;
    }

    /**
     * Sets the value of the frameMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameMaterialType(String value) {
        this.frameMaterialType = value;
    }

    /**
     * Gets the value of the fuelCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * Sets the value of the fuelCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setFuelCapacity(VolumeDimension value) {
        this.fuelCapacity = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the isElectric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsElectric() {
        return isElectric;
    }

    /**
     * Sets the value of the isElectric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsElectric(Boolean value) {
        this.isElectric = value;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * Gets the value of the maximumRange property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumRange() {
        return maximumRange;
    }

    /**
     * Sets the value of the maximumRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumRange(LengthDimension value) {
        this.maximumRange = value;
    }

    /**
     * Gets the value of the maximumSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedDimension }
     *     
     */
    public SpeedDimension getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Sets the value of the maximumSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedDimension }
     *     
     */
    public void setMaximumSpeed(SpeedDimension value) {
        this.maximumSpeed = value;
    }

    /**
     * Gets the value of the motorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorType() {
        return motorType;
    }

    /**
     * Sets the value of the motorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorType(String value) {
        this.motorType = value;
    }

    /**
     * Gets the value of the animalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * Sets the value of the animalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalType(String value) {
        this.animalType = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the radioBandsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioBandsSupported() {
        return radioBandsSupported;
    }

    /**
     * Sets the value of the radioBandsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioBandsSupported(String value) {
        this.radioBandsSupported = value;
    }

    /**
     * Gets the value of the railType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailType() {
        return railType;
    }

    /**
     * Sets the value of the railType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailType(String value) {
        this.railType = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Gets the value of the skillLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillLevel() {
        return skillLevel;
    }

    /**
     * Sets the value of the skillLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillLevel(String value) {
        this.skillLevel = value;
    }

    /**
     * Gets the value of the suspensionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspensionType() {
        return suspensionType;
    }

    /**
     * Sets the value of the suspensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspensionType(String value) {
        this.suspensionType = value;
    }

    /**
     * Gets the value of the productTheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTheme() {
        return productTheme;
    }

    /**
     * Sets the value of the productTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTheme(String value) {
        this.productTheme = value;
    }

    /**
     * Gets the value of the tireType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTireType() {
        return tireType;
    }

    /**
     * Sets the value of the tireType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTireType(String value) {
        this.tireType = value;
    }

    /**
     * Gets the value of the toyAwardName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toyAwardName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToyAwardName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToyAwardType }
     * 
     * 
     */
    public List<ToyAwardType> getToyAwardName() {
        if (toyAwardName == null) {
            toyAwardName = new ArrayList<ToyAwardType>();
        }
        return this.toyAwardName;
    }

    /**
     * Gets the value of the wheelDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWheelDiameter() {
        return wheelDiameter;
    }

    /**
     * Sets the value of the wheelDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWheelDiameter(LengthDimension value) {
        this.wheelDiameter = value;
    }

    /**
     * Gets the value of the wheelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheelType() {
        return wheelType;
    }

    /**
     * Sets the value of the wheelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheelType(String value) {
        this.wheelType = value;
    }

}
