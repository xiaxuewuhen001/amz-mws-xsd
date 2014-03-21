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
 *         &lt;element name="ProductType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}Food"/>
 *                   &lt;element ref="{}Beverages"/>
 *                   &lt;element ref="{}AlcoholicBeverages"/>
 *                 &lt;/choice>
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
@XmlType(name = "", propOrder = {
    "productType"
})
@XmlRootElement(name = "FoodAndBeverages")
public class FoodAndBeverages {

    @XmlElement(name = "ProductType", required = true)
    protected FoodAndBeverages.ProductType productType;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link FoodAndBeverages.ProductType }
     *     
     */
    public FoodAndBeverages.ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodAndBeverages.ProductType }
     *     
     */
    public void setProductType(FoodAndBeverages.ProductType value) {
        this.productType = value;
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
     *       &lt;choice>
     *         &lt;element ref="{}Food"/>
     *         &lt;element ref="{}Beverages"/>
     *         &lt;element ref="{}AlcoholicBeverages"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "food",
        "beverages",
        "alcoholicBeverages"
    })
    public static class ProductType {

        @XmlElement(name = "Food")
        protected Food food;
        @XmlElement(name = "Beverages")
        protected Beverages beverages;
        @XmlElement(name = "AlcoholicBeverages")
        protected AlcoholicBeverages alcoholicBeverages;

        /**
         * Gets the value of the food property.
         * 
         * @return
         *     possible object is
         *     {@link Food }
         *     
         */
        public Food getFood() {
            return food;
        }

        /**
         * Sets the value of the food property.
         * 
         * @param value
         *     allowed object is
         *     {@link Food }
         *     
         */
        public void setFood(Food value) {
            this.food = value;
        }

        /**
         * Gets the value of the beverages property.
         * 
         * @return
         *     possible object is
         *     {@link Beverages }
         *     
         */
        public Beverages getBeverages() {
            return beverages;
        }

        /**
         * Sets the value of the beverages property.
         * 
         * @param value
         *     allowed object is
         *     {@link Beverages }
         *     
         */
        public void setBeverages(Beverages value) {
            this.beverages = value;
        }

        /**
         * Gets the value of the alcoholicBeverages property.
         * 
         * @return
         *     possible object is
         *     {@link AlcoholicBeverages }
         *     
         */
        public AlcoholicBeverages getAlcoholicBeverages() {
            return alcoholicBeverages;
        }

        /**
         * Sets the value of the alcoholicBeverages property.
         * 
         * @param value
         *     allowed object is
         *     {@link AlcoholicBeverages }
         *     
         */
        public void setAlcoholicBeverages(AlcoholicBeverages value) {
            this.alcoholicBeverages = value;
        }

    }

}