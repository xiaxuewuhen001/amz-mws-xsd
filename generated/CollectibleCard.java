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
 *         &lt;element name="Collection" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="EducationalObjective" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Genre" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Rarity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CardType" type="{}StringNotNull" minOccurs="0"/>
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
    "collection",
    "educationalObjective",
    "genre",
    "rarity",
    "cardNumber",
    "cardType"
})
@XmlRootElement(name = "CollectibleCard")
public class CollectibleCard {

    @XmlElement(name = "Collection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String collection;
    @XmlElement(name = "EducationalObjective")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String educationalObjective;
    @XmlElement(name = "Genre")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String genre;
    @XmlElement(name = "Rarity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rarity;
    @XmlElement(name = "CardNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cardNumber;
    @XmlElement(name = "CardType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cardType;

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollection(String value) {
        this.collection = value;
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
     * Gets the value of the rarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * Sets the value of the rarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRarity(String value) {
        this.rarity = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

}
