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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ConditionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ConditionType"/>
 *         &lt;element name="ConditionNote" type="{}TwoThousandString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionInfo", propOrder = {
    "conditionType",
    "conditionNote"
})
public class ConditionInfo {

    @XmlElement(name = "ConditionType", required = true)
    protected String conditionType;
    @XmlElement(name = "ConditionNote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String conditionNote;

    /**
     * Gets the value of the conditionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * Sets the value of the conditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionType(String value) {
        this.conditionType = value;
    }

    /**
     * Gets the value of the conditionNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionNote() {
        return conditionNote;
    }

    /**
     * Sets the value of the conditionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionNote(String value) {
        this.conditionNote = value;
    }

}