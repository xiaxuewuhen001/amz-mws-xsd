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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PromotionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PromotionClaimCode"/>
 *         &lt;element ref="{}MerchantPromotionID"/>
 *         &lt;element name="Component" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{}PromotionApplicationType"/>
 *                   &lt;element name="Amount" type="{}CurrencyAmount"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "PromotionDataType", propOrder = {
    "promotionClaimCode",
    "merchantPromotionID",
    "component"
})
public class PromotionDataType {

    @XmlElement(name = "PromotionClaimCode", required = true)
    protected String promotionClaimCode;
    @XmlElement(name = "MerchantPromotionID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String merchantPromotionID;
    @XmlElement(name = "Component", required = true)
    protected List<PromotionDataType.Component> component;

    /**
     * Gets the value of the promotionClaimCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionClaimCode() {
        return promotionClaimCode;
    }

    /**
     * Sets the value of the promotionClaimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionClaimCode(String value) {
        this.promotionClaimCode = value;
    }

    /**
     * Gets the value of the merchantPromotionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPromotionID() {
        return merchantPromotionID;
    }

    /**
     * Sets the value of the merchantPromotionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPromotionID(String value) {
        this.merchantPromotionID = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionDataType.Component }
     * 
     * 
     */
    public List<PromotionDataType.Component> getComponent() {
        if (component == null) {
            component = new ArrayList<PromotionDataType.Component>();
        }
        return this.component;
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
     *         &lt;element name="Type" type="{}PromotionApplicationType"/>
     *         &lt;element name="Amount" type="{}CurrencyAmount"/>
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
        "type",
        "amount"
    })
    public static class Component {

        @XmlElement(name = "Type", required = true)
        protected PromotionApplicationType type;
        @XmlElement(name = "Amount", required = true)
        protected CurrencyAmount amount;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link PromotionApplicationType }
         *     
         */
        public PromotionApplicationType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link PromotionApplicationType }
         *     
         */
        public void setType(PromotionApplicationType value) {
            this.type = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmount }
         *     
         */
        public CurrencyAmount getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmount }
         *     
         */
        public void setAmount(CurrencyAmount value) {
            this.amount = value;
        }

    }

}
