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
 *         &lt;element ref="{}FulfillmentCenterID"/>
 *         &lt;element name="SupportsInStorePickup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OperatingHours">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Monday" type="{}OperatingHoursBase" minOccurs="0"/>
 *                   &lt;element name="Tuesday" type="{}OperatingHoursBase" minOccurs="0"/>
 *                   &lt;element name="Wednesday" type="{}OperatingHoursBase" minOccurs="0"/>
 *                   &lt;element name="Thursday" type="{}OperatingHoursBase" minOccurs="0"/>
 *                   &lt;element name="Friday" type="{}OperatingHoursBase" minOccurs="0"/>
 *                   &lt;element name="Saturday" type="{}OperatingHoursBase" minOccurs="0"/>
 *                   &lt;element name="Sunday" type="{}OperatingHoursBase" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "fulfillmentCenterID",
    "supportsInStorePickup",
    "operatingHours"
})
@XmlRootElement(name = "FulfillmentCenter")
public class FulfillmentCenter {

    @XmlElement(name = "FulfillmentCenterID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fulfillmentCenterID;
    @XmlElement(name = "SupportsInStorePickup")
    protected boolean supportsInStorePickup;
    @XmlElement(name = "OperatingHours", required = true)
    protected FulfillmentCenter.OperatingHours operatingHours;

    /**
     * Gets the value of the fulfillmentCenterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentCenterID() {
        return fulfillmentCenterID;
    }

    /**
     * Sets the value of the fulfillmentCenterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentCenterID(String value) {
        this.fulfillmentCenterID = value;
    }

    /**
     * Gets the value of the supportsInStorePickup property.
     * 
     */
    public boolean isSupportsInStorePickup() {
        return supportsInStorePickup;
    }

    /**
     * Sets the value of the supportsInStorePickup property.
     * 
     */
    public void setSupportsInStorePickup(boolean value) {
        this.supportsInStorePickup = value;
    }

    /**
     * Gets the value of the operatingHours property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentCenter.OperatingHours }
     *     
     */
    public FulfillmentCenter.OperatingHours getOperatingHours() {
        return operatingHours;
    }

    /**
     * Sets the value of the operatingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentCenter.OperatingHours }
     *     
     */
    public void setOperatingHours(FulfillmentCenter.OperatingHours value) {
        this.operatingHours = value;
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
     *         &lt;element name="Monday" type="{}OperatingHoursBase" minOccurs="0"/>
     *         &lt;element name="Tuesday" type="{}OperatingHoursBase" minOccurs="0"/>
     *         &lt;element name="Wednesday" type="{}OperatingHoursBase" minOccurs="0"/>
     *         &lt;element name="Thursday" type="{}OperatingHoursBase" minOccurs="0"/>
     *         &lt;element name="Friday" type="{}OperatingHoursBase" minOccurs="0"/>
     *         &lt;element name="Saturday" type="{}OperatingHoursBase" minOccurs="0"/>
     *         &lt;element name="Sunday" type="{}OperatingHoursBase" minOccurs="0"/>
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
        "monday",
        "tuesday",
        "wednesday",
        "thursday",
        "friday",
        "saturday",
        "sunday"
    })
    public static class OperatingHours {

        @XmlElement(name = "Monday")
        protected OperatingHoursBase monday;
        @XmlElement(name = "Tuesday")
        protected OperatingHoursBase tuesday;
        @XmlElement(name = "Wednesday")
        protected OperatingHoursBase wednesday;
        @XmlElement(name = "Thursday")
        protected OperatingHoursBase thursday;
        @XmlElement(name = "Friday")
        protected OperatingHoursBase friday;
        @XmlElement(name = "Saturday")
        protected OperatingHoursBase saturday;
        @XmlElement(name = "Sunday")
        protected OperatingHoursBase sunday;

        /**
         * Gets the value of the monday property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingHoursBase }
         *     
         */
        public OperatingHoursBase getMonday() {
            return monday;
        }

        /**
         * Sets the value of the monday property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingHoursBase }
         *     
         */
        public void setMonday(OperatingHoursBase value) {
            this.monday = value;
        }

        /**
         * Gets the value of the tuesday property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingHoursBase }
         *     
         */
        public OperatingHoursBase getTuesday() {
            return tuesday;
        }

        /**
         * Sets the value of the tuesday property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingHoursBase }
         *     
         */
        public void setTuesday(OperatingHoursBase value) {
            this.tuesday = value;
        }

        /**
         * Gets the value of the wednesday property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingHoursBase }
         *     
         */
        public OperatingHoursBase getWednesday() {
            return wednesday;
        }

        /**
         * Sets the value of the wednesday property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingHoursBase }
         *     
         */
        public void setWednesday(OperatingHoursBase value) {
            this.wednesday = value;
        }

        /**
         * Gets the value of the thursday property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingHoursBase }
         *     
         */
        public OperatingHoursBase getThursday() {
            return thursday;
        }

        /**
         * Sets the value of the thursday property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingHoursBase }
         *     
         */
        public void setThursday(OperatingHoursBase value) {
            this.thursday = value;
        }

        /**
         * Gets the value of the friday property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingHoursBase }
         *     
         */
        public OperatingHoursBase getFriday() {
            return friday;
        }

        /**
         * Sets the value of the friday property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingHoursBase }
         *     
         */
        public void setFriday(OperatingHoursBase value) {
            this.friday = value;
        }

        /**
         * Gets the value of the saturday property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingHoursBase }
         *     
         */
        public OperatingHoursBase getSaturday() {
            return saturday;
        }

        /**
         * Sets the value of the saturday property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingHoursBase }
         *     
         */
        public void setSaturday(OperatingHoursBase value) {
            this.saturday = value;
        }

        /**
         * Gets the value of the sunday property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingHoursBase }
         *     
         */
        public OperatingHoursBase getSunday() {
            return sunday;
        }

        /**
         * Sets the value of the sunday property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingHoursBase }
         *     
         */
        public void setSunday(OperatingHoursBase value) {
            this.sunday = value;
        }

    }

}
