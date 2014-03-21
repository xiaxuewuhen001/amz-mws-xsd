//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 02:19:07 PM PDT 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CBFC_Rating_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CBFC_Rating_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adults_only"/>
 *     &lt;enumeration value="parental_guidance"/>
 *     &lt;enumeration value="special_audience"/>
 *     &lt;enumeration value="Universal"/>
 *     &lt;enumeration value="not_rated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CBFC_Rating_Type")
@XmlEnum
public enum CBFCRatingType {

    @XmlEnumValue("adults_only")
    ADULTS_ONLY("adults_only"),
    @XmlEnumValue("parental_guidance")
    PARENTAL_GUIDANCE("parental_guidance"),
    @XmlEnumValue("special_audience")
    SPECIAL_AUDIENCE("special_audience"),
    @XmlEnumValue("Universal")
    UNIVERSAL("Universal"),
    @XmlEnumValue("not_rated")
    NOT_RATED("not_rated");
    private final String value;

    CBFCRatingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CBFCRatingType fromValue(String v) {
        for (CBFCRatingType c: CBFCRatingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}