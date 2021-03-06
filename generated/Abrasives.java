//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import java.math.BigDecimal;
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
 *         &lt;element name="ArborHoleDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BackingType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BackingWeight" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CutType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FasteningType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GritMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GritType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HeadHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemShape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ManufacturerGrade" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumRotationalSpeed" type="{}SpeedDimension" minOccurs="0"/>
 *         &lt;element name="NominalInsideDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="PatternName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ShankDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ShankType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SizeName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WheelRecessDimensions" type="{}LengthDimension" minOccurs="0"/>
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
    "arborHoleDiameter",
    "backingType",
    "backingWeight",
    "color",
    "cutType",
    "fasteningType",
    "gritMaterialType",
    "gritType",
    "headHeight",
    "itemShape",
    "manufacturerGrade",
    "maximumRotationalSpeed",
    "nominalInsideDiameter",
    "patternName",
    "shankDiameter",
    "shankType",
    "sizeName",
    "specialFeatures",
    "wheelRecessDimensions"
})
@XmlRootElement(name = "Abrasives")
public class Abrasives {

    @XmlElement(name = "ArborHoleDiameter")
    protected LengthDimension arborHoleDiameter;
    @XmlElement(name = "BackingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String backingType;
    @XmlElement(name = "BackingWeight")
    protected BigDecimal backingWeight;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String color;
    @XmlElement(name = "CutType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cutType;
    @XmlElement(name = "FasteningType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fasteningType;
    @XmlElement(name = "GritMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gritMaterialType;
    @XmlElement(name = "GritType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gritType;
    @XmlElement(name = "HeadHeight")
    protected LengthDimension headHeight;
    @XmlElement(name = "ItemShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemShape;
    @XmlElement(name = "ManufacturerGrade")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerGrade;
    @XmlElement(name = "MaximumRotationalSpeed")
    protected SpeedDimension maximumRotationalSpeed;
    @XmlElement(name = "NominalInsideDiameter")
    protected LengthDimension nominalInsideDiameter;
    @XmlElement(name = "PatternName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String patternName;
    @XmlElement(name = "ShankDiameter")
    protected LengthDimension shankDiameter;
    @XmlElement(name = "ShankType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shankType;
    @XmlElement(name = "SizeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sizeName;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String specialFeatures;
    @XmlElement(name = "WheelRecessDimensions")
    protected LengthDimension wheelRecessDimensions;

    /**
     * Gets the value of the arborHoleDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getArborHoleDiameter() {
        return arborHoleDiameter;
    }

    /**
     * Sets the value of the arborHoleDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setArborHoleDiameter(LengthDimension value) {
        this.arborHoleDiameter = value;
    }

    /**
     * Gets the value of the backingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingType() {
        return backingType;
    }

    /**
     * Sets the value of the backingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingType(String value) {
        this.backingType = value;
    }

    /**
     * Gets the value of the backingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBackingWeight() {
        return backingWeight;
    }

    /**
     * Sets the value of the backingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBackingWeight(BigDecimal value) {
        this.backingWeight = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the cutType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutType() {
        return cutType;
    }

    /**
     * Sets the value of the cutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutType(String value) {
        this.cutType = value;
    }

    /**
     * Gets the value of the fasteningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFasteningType() {
        return fasteningType;
    }

    /**
     * Sets the value of the fasteningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFasteningType(String value) {
        this.fasteningType = value;
    }

    /**
     * Gets the value of the gritMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGritMaterialType() {
        return gritMaterialType;
    }

    /**
     * Sets the value of the gritMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGritMaterialType(String value) {
        this.gritMaterialType = value;
    }

    /**
     * Gets the value of the gritType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGritType() {
        return gritType;
    }

    /**
     * Sets the value of the gritType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGritType(String value) {
        this.gritType = value;
    }

    /**
     * Gets the value of the headHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHeadHeight() {
        return headHeight;
    }

    /**
     * Sets the value of the headHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHeadHeight(LengthDimension value) {
        this.headHeight = value;
    }

    /**
     * Gets the value of the itemShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemShape() {
        return itemShape;
    }

    /**
     * Sets the value of the itemShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemShape(String value) {
        this.itemShape = value;
    }

    /**
     * Gets the value of the manufacturerGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerGrade() {
        return manufacturerGrade;
    }

    /**
     * Sets the value of the manufacturerGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerGrade(String value) {
        this.manufacturerGrade = value;
    }

    /**
     * Gets the value of the maximumRotationalSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedDimension }
     *     
     */
    public SpeedDimension getMaximumRotationalSpeed() {
        return maximumRotationalSpeed;
    }

    /**
     * Sets the value of the maximumRotationalSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedDimension }
     *     
     */
    public void setMaximumRotationalSpeed(SpeedDimension value) {
        this.maximumRotationalSpeed = value;
    }

    /**
     * Gets the value of the nominalInsideDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getNominalInsideDiameter() {
        return nominalInsideDiameter;
    }

    /**
     * Sets the value of the nominalInsideDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setNominalInsideDiameter(LengthDimension value) {
        this.nominalInsideDiameter = value;
    }

    /**
     * Gets the value of the patternName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternName() {
        return patternName;
    }

    /**
     * Sets the value of the patternName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternName(String value) {
        this.patternName = value;
    }

    /**
     * Gets the value of the shankDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getShankDiameter() {
        return shankDiameter;
    }

    /**
     * Sets the value of the shankDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setShankDiameter(LengthDimension value) {
        this.shankDiameter = value;
    }

    /**
     * Gets the value of the shankType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShankType() {
        return shankType;
    }

    /**
     * Sets the value of the shankType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShankType(String value) {
        this.shankType = value;
    }

    /**
     * Gets the value of the sizeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeName() {
        return sizeName;
    }

    /**
     * Sets the value of the sizeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeName(String value) {
        this.sizeName = value;
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
     * Gets the value of the wheelRecessDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWheelRecessDimensions() {
        return wheelRecessDimensions;
    }

    /**
     * Sets the value of the wheelRecessDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWheelRecessDimensions(LengthDimension value) {
        this.wheelRecessDimensions = value;
    }

}
