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
 *         &lt;element name="FlashType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="handle-mount"/>
 *               &lt;enumeration value="macro"/>
 *               &lt;enumeration value="ring-light"/>
 *               &lt;enumeration value="shoe-mount"/>
 *               &lt;enumeration value="other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SlaveFlashes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="slave-flashed-general"/>
 *               &lt;enumeration value="slave-transmitters-and-receivers"/>
 *               &lt;enumeration value="optical-slaves"/>
 *               &lt;enumeration value="slave-accessories"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Dedication" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="dedicated"/>
 *               &lt;enumeration value="non-dedicated"/>
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
    "flashType",
    "slaveFlashes",
    "dedication"
})
@XmlRootElement(name = "Flash")
public class Flash {

    @XmlElement(name = "FlashType")
    protected String flashType;
    @XmlElement(name = "SlaveFlashes")
    protected String slaveFlashes;
    @XmlElement(name = "Dedication")
    protected String dedication;

    /**
     * Gets the value of the flashType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashType() {
        return flashType;
    }

    /**
     * Sets the value of the flashType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashType(String value) {
        this.flashType = value;
    }

    /**
     * Gets the value of the slaveFlashes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlaveFlashes() {
        return slaveFlashes;
    }

    /**
     * Sets the value of the slaveFlashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlaveFlashes(String value) {
        this.slaveFlashes = value;
    }

    /**
     * Gets the value of the dedication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedication() {
        return dedication;
    }

    /**
     * Sets the value of the dedication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedication(String value) {
        this.dedication = value;
    }

}