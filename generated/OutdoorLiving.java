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
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element ref="{}ColorMap" minOccurs="0"/>
 *         &lt;element name="IsStainResistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VariationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VariationTheme" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Size"/>
 *                         &lt;enumeration value="Color"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="ItemDisplayLength-ItemDisplayWidth"/>
 *                         &lt;enumeration value="ItemDisplayLength-MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayLength-SizeName"/>
 *                         &lt;enumeration value="ItemDisplayLength-ColorName"/>
 *                         &lt;enumeration value="ItemDisplayLength-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemDisplayWidth-MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayWidth-SizeName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-ColorName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemPackageQuantity-MaterialType"/>
 *                         &lt;enumeration value="ItemPackageQuantity-SizeName"/>
 *                         &lt;enumeration value="ItemPackageQuantity-ColorName"/>
 *                         &lt;enumeration value="ItemPackageQuantity-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ItemPackageQuantity"/>
 *                         &lt;enumeration value="ItemDisplayWeight-MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayWeight-SizeName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ColorName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ItemDisplayHeight"/>
 *                         &lt;enumeration value="MaterialType-ItemDisplayLength"/>
 *                         &lt;enumeration value="MaterialType-ItemDisplayWidth"/>
 *                         &lt;enumeration value="MaterialType-SizeName"/>
 *                         &lt;enumeration value="MaterialType-ColorName"/>
 *                         &lt;enumeration value="MaterialType-ItemDisplayHeight"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayLength"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayWeight"/>
 *                         &lt;enumeration value="SizeName-MaterialType"/>
 *                         &lt;enumeration value="SizeName-ColorName"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayLength"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="ColorName-ItemPackageQuantity"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayWeight"/>
 *                         &lt;enumeration value="ColorName-MaterialType"/>
 *                         &lt;enumeration value="ColorName-SizeName"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemDisplayHeight"/>
 *                         &lt;enumeration value="MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayWeight"/>
 *                         &lt;enumeration value="ItemDisplayLength"/>
 *                         &lt;enumeration value="ItemPackageQuantity"/>
 *                         &lt;enumeration value="ItemDisplayLength-PatternName"/>
 *                         &lt;enumeration value="ItemDisplayLength-StyleName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-PatternName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-StyleName"/>
 *                         &lt;enumeration value="Occasion-PatternName"/>
 *                         &lt;enumeration value="Occasion-ItemPackageQuantity"/>
 *                         &lt;enumeration value="Occasion-MaterialType"/>
 *                         &lt;enumeration value="Occasion-StyleName"/>
 *                         &lt;enumeration value="Occasion-SizeName"/>
 *                         &lt;enumeration value="Occasion-ColorName"/>
 *                         &lt;enumeration value="Occasion-ItemDisplayHeight"/>
 *                         &lt;enumeration value="PatternName-ItemDisplayLength"/>
 *                         &lt;enumeration value="PatternName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="PatternName-Occasion"/>
 *                         &lt;enumeration value="PatternName-MaterialType"/>
 *                         &lt;enumeration value="PatternName-StyleName"/>
 *                         &lt;enumeration value="PatternName-SizeName"/>
 *                         &lt;enumeration value="PatternName-ColorName"/>
 *                         &lt;enumeration value="PatternName-ItemDisplayHeight"/>
 *                         &lt;enumeration value="MatteStyle-MaterialType"/>
 *                         &lt;enumeration value="MatteStyle-StyleName"/>
 *                         &lt;enumeration value="MatteStyle-SizeName"/>
 *                         &lt;enumeration value="MatteStyle-ColorName"/>
 *                         &lt;enumeration value="ItemPackageQuantity-Occasion"/>
 *                         &lt;enumeration value="ItemPackageQuantity-StyleName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-StyleName"/>
 *                         &lt;enumeration value="MaterialType-PatternName"/>
 *                         &lt;enumeration value="MaterialType-MatteStyle"/>
 *                         &lt;enumeration value="MaterialType-StyleName"/>
 *                         &lt;enumeration value="StyleName-ItemDisplayLength"/>
 *                         &lt;enumeration value="StyleName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="StyleName-Occasion"/>
 *                         &lt;enumeration value="StyleName-PatternName"/>
 *                         &lt;enumeration value="StyleName-ItemDisplayWeight"/>
 *                         &lt;enumeration value="StyleName-MaterialType"/>
 *                         &lt;enumeration value="StyleName-SizeName"/>
 *                         &lt;enumeration value="StyleName-ColorName"/>
 *                         &lt;enumeration value="SizeName-Occasion"/>
 *                         &lt;enumeration value="SizeName-PatternName"/>
 *                         &lt;enumeration value="SizeName-MatteStyle"/>
 *                         &lt;enumeration value="SizeName-StyleName"/>
 *                         &lt;enumeration value="ColorName-Occasion"/>
 *                         &lt;enumeration value="ColorName-PatternName"/>
 *                         &lt;enumeration value="ColorName-MatteStyle"/>
 *                         &lt;enumeration value="ColorName-StyleName"/>
 *                         &lt;enumeration value="MatteStyle"/>
 *                         &lt;enumeration value="PatternName"/>
 *                         &lt;enumeration value="Occasion"/>
 *                         &lt;enumeration value="StyleName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ItemDisplayLength-ColorName"/>
 *                         &lt;enumeration value="Occasion-SizeName-ColorName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ItemDisplayLength-MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ItemDisplayLength-StyleName"/>
 *                         &lt;enumeration value="PatternName-SizeName-Occasion"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Wattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
    "battery",
    "colorMap",
    "isStainResistant",
    "material",
    "variationData",
    "wattage"
})
@XmlRootElement(name = "OutdoorLiving")
public class OutdoorLiving {

    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "ColorMap")
    protected String colorMap;
    @XmlElement(name = "IsStainResistant")
    protected Boolean isStainResistant;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String material;
    @XmlElement(name = "VariationData")
    protected OutdoorLiving.VariationData variationData;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;

    /**
     * Gets the value of the battery property.
     * 
     * @return
     *     possible object is
     *     {@link Battery }
     *     
     */
    public Battery getBattery() {
        return battery;
    }

    /**
     * Sets the value of the battery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Battery }
     *     
     */
    public void setBattery(Battery value) {
        this.battery = value;
    }

    /**
     * Gets the value of the colorMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorMap() {
        return colorMap;
    }

    /**
     * Sets the value of the colorMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorMap(String value) {
        this.colorMap = value;
    }

    /**
     * Gets the value of the isStainResistant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStainResistant() {
        return isStainResistant;
    }

    /**
     * Sets the value of the isStainResistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStainResistant(Boolean value) {
        this.isStainResistant = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link OutdoorLiving.VariationData }
     *     
     */
    public OutdoorLiving.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutdoorLiving.VariationData }
     *     
     */
    public void setVariationData(OutdoorLiving.VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the wattage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWattage() {
        return wattage;
    }

    /**
     * Sets the value of the wattage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWattage(BigInteger value) {
        this.wattage = value;
    }


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
     *         &lt;element name="VariationTheme" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="ItemDisplayLength-ItemDisplayWidth"/>
     *               &lt;enumeration value="ItemDisplayLength-MaterialType"/>
     *               &lt;enumeration value="ItemDisplayLength-SizeName"/>
     *               &lt;enumeration value="ItemDisplayLength-ColorName"/>
     *               &lt;enumeration value="ItemDisplayLength-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemDisplayWidth-MaterialType"/>
     *               &lt;enumeration value="ItemDisplayWidth-SizeName"/>
     *               &lt;enumeration value="ItemDisplayWidth-ColorName"/>
     *               &lt;enumeration value="ItemDisplayWidth-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemPackageQuantity-MaterialType"/>
     *               &lt;enumeration value="ItemPackageQuantity-SizeName"/>
     *               &lt;enumeration value="ItemPackageQuantity-ColorName"/>
     *               &lt;enumeration value="ItemPackageQuantity-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemDisplayWeight-ItemPackageQuantity"/>
     *               &lt;enumeration value="ItemDisplayWeight-MaterialType"/>
     *               &lt;enumeration value="ItemDisplayWeight-SizeName"/>
     *               &lt;enumeration value="ItemDisplayWeight-ColorName"/>
     *               &lt;enumeration value="ItemDisplayWeight-ItemDisplayHeight"/>
     *               &lt;enumeration value="MaterialType-ItemDisplayLength"/>
     *               &lt;enumeration value="MaterialType-ItemDisplayWidth"/>
     *               &lt;enumeration value="MaterialType-SizeName"/>
     *               &lt;enumeration value="MaterialType-ColorName"/>
     *               &lt;enumeration value="MaterialType-ItemDisplayHeight"/>
     *               &lt;enumeration value="SizeName-ItemDisplayLength"/>
     *               &lt;enumeration value="SizeName-ItemDisplayWidth"/>
     *               &lt;enumeration value="SizeName-ItemDisplayWeight"/>
     *               &lt;enumeration value="SizeName-MaterialType"/>
     *               &lt;enumeration value="SizeName-ColorName"/>
     *               &lt;enumeration value="SizeName-ItemDisplayHeight"/>
     *               &lt;enumeration value="ColorName-ItemDisplayLength"/>
     *               &lt;enumeration value="ColorName-ItemDisplayWidth"/>
     *               &lt;enumeration value="ColorName-ItemPackageQuantity"/>
     *               &lt;enumeration value="ColorName-ItemDisplayWeight"/>
     *               &lt;enumeration value="ColorName-MaterialType"/>
     *               &lt;enumeration value="ColorName-SizeName"/>
     *               &lt;enumeration value="ColorName-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemDisplayHeight"/>
     *               &lt;enumeration value="MaterialType"/>
     *               &lt;enumeration value="ItemDisplayWeight"/>
     *               &lt;enumeration value="ItemDisplayLength"/>
     *               &lt;enumeration value="ItemPackageQuantity"/>
     *               &lt;enumeration value="ItemDisplayLength-PatternName"/>
     *               &lt;enumeration value="ItemDisplayLength-StyleName"/>
     *               &lt;enumeration value="ItemDisplayWidth-PatternName"/>
     *               &lt;enumeration value="ItemDisplayWidth-StyleName"/>
     *               &lt;enumeration value="Occasion-PatternName"/>
     *               &lt;enumeration value="Occasion-ItemPackageQuantity"/>
     *               &lt;enumeration value="Occasion-MaterialType"/>
     *               &lt;enumeration value="Occasion-StyleName"/>
     *               &lt;enumeration value="Occasion-SizeName"/>
     *               &lt;enumeration value="Occasion-ColorName"/>
     *               &lt;enumeration value="Occasion-ItemDisplayHeight"/>
     *               &lt;enumeration value="PatternName-ItemDisplayLength"/>
     *               &lt;enumeration value="PatternName-ItemDisplayWidth"/>
     *               &lt;enumeration value="PatternName-Occasion"/>
     *               &lt;enumeration value="PatternName-MaterialType"/>
     *               &lt;enumeration value="PatternName-StyleName"/>
     *               &lt;enumeration value="PatternName-SizeName"/>
     *               &lt;enumeration value="PatternName-ColorName"/>
     *               &lt;enumeration value="PatternName-ItemDisplayHeight"/>
     *               &lt;enumeration value="MatteStyle-MaterialType"/>
     *               &lt;enumeration value="MatteStyle-StyleName"/>
     *               &lt;enumeration value="MatteStyle-SizeName"/>
     *               &lt;enumeration value="MatteStyle-ColorName"/>
     *               &lt;enumeration value="ItemPackageQuantity-Occasion"/>
     *               &lt;enumeration value="ItemPackageQuantity-StyleName"/>
     *               &lt;enumeration value="ItemDisplayWeight-StyleName"/>
     *               &lt;enumeration value="MaterialType-PatternName"/>
     *               &lt;enumeration value="MaterialType-MatteStyle"/>
     *               &lt;enumeration value="MaterialType-StyleName"/>
     *               &lt;enumeration value="StyleName-ItemDisplayLength"/>
     *               &lt;enumeration value="StyleName-ItemDisplayWidth"/>
     *               &lt;enumeration value="StyleName-Occasion"/>
     *               &lt;enumeration value="StyleName-PatternName"/>
     *               &lt;enumeration value="StyleName-ItemDisplayWeight"/>
     *               &lt;enumeration value="StyleName-MaterialType"/>
     *               &lt;enumeration value="StyleName-SizeName"/>
     *               &lt;enumeration value="StyleName-ColorName"/>
     *               &lt;enumeration value="SizeName-Occasion"/>
     *               &lt;enumeration value="SizeName-PatternName"/>
     *               &lt;enumeration value="SizeName-MatteStyle"/>
     *               &lt;enumeration value="SizeName-StyleName"/>
     *               &lt;enumeration value="ColorName-Occasion"/>
     *               &lt;enumeration value="ColorName-PatternName"/>
     *               &lt;enumeration value="ColorName-MatteStyle"/>
     *               &lt;enumeration value="ColorName-StyleName"/>
     *               &lt;enumeration value="MatteStyle"/>
     *               &lt;enumeration value="PatternName"/>
     *               &lt;enumeration value="Occasion"/>
     *               &lt;enumeration value="StyleName"/>
     *               &lt;enumeration value="ItemDisplayWeight-ItemDisplayLength-ColorName"/>
     *               &lt;enumeration value="Occasion-SizeName-ColorName"/>
     *               &lt;enumeration value="ItemDisplayWeight-ItemDisplayLength-MaterialType"/>
     *               &lt;enumeration value="ItemDisplayWeight-ItemDisplayLength-StyleName"/>
     *               &lt;enumeration value="PatternName-SizeName-Occasion"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
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
        "variationTheme",
        "size",
        "color"
    })
    public static class VariationData {

        @XmlElement(name = "VariationTheme")
        protected String variationTheme;
        @XmlElement(name = "Size")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String size;
        @XmlElement(name = "Color")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String color;

        /**
         * Gets the value of the variationTheme property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariationTheme() {
            return variationTheme;
        }

        /**
         * Sets the value of the variationTheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariationTheme(String value) {
            this.variationTheme = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSize(String value) {
            this.size = value;
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

    }

}
