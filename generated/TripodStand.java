//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ForUseWith" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="still-cameras"/>
 *               &lt;enumeration value="camcorders"/>
 *               &lt;enumeration value="still-camera-and-camcorders"/>
 *               &lt;enumeration value="telescopes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StandType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="camera-stands"/>
 *               &lt;enumeration value="monopods"/>
 *               &lt;enumeration value="tripods"/>
 *               &lt;enumeration value="car-window-mounts"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SpecificUses" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tabletop"/>
 *               &lt;enumeration value="travel"/>
 *               &lt;enumeration value="hiking-and-outdoors"/>
 *               &lt;enumeration value="hunting-and-shooting"/>
 *               &lt;enumeration value="sports"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Material" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="aluminum"/>
 *               &lt;enumeration value="carbon-fiber"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HeadType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="geared-heads"/>
 *               &lt;enumeration value="ball-heads"/>
 *               &lt;enumeration value="camera-rotator-heads"/>
 *               &lt;enumeration value="pan-and-tilt-heads"/>
 *               &lt;enumeration value="video-heads"/>
 *               &lt;enumeration value="3-way-heads"/>
 *               &lt;enumeration value="panoramic-heads"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PackageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="head-only"/>
 *               &lt;enumeration value="legs-only"/>
 *               &lt;enumeration value="head-and-leg-units"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "forUseWith",
    "standType",
    "specificUses",
    "material",
    "headType",
    "packageType"
})
@XmlRootElement(name = "TripodStand")
public class TripodStand {

    @XmlElement(name = "ForUseWith")
    protected String forUseWith;
    @XmlElement(name = "StandType")
    protected String standType;
    @XmlElement(name = "SpecificUses")
    protected String specificUses;
    @XmlElement(name = "Material")
    protected String material;
    @XmlElement(name = "HeadType")
    protected String headType;
    @XmlElement(name = "PackageType")
    protected String packageType;

    /**
     * Gets the value of the forUseWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForUseWith() {
        return forUseWith;
    }

    /**
     * Sets the value of the forUseWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForUseWith(String value) {
        this.forUseWith = value;
    }

    /**
     * Gets the value of the standType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandType() {
        return standType;
    }

    /**
     * Sets the value of the standType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandType(String value) {
        this.standType = value;
    }

    /**
     * Gets the value of the specificUses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUses() {
        return specificUses;
    }

    /**
     * Sets the value of the specificUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUses(String value) {
        this.specificUses = value;
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
     * Gets the value of the headType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadType() {
        return headType;
    }

    /**
     * Sets the value of the headType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadType(String value) {
        this.headType = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

}
