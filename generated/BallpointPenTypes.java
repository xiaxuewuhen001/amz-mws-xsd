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
 * <p>Java class for BallpointPenTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BallpointPenTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Retractable"/>
 *     &lt;enumeration value="Stick"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BallpointPenTypes")
@XmlEnum
public enum BallpointPenTypes {

    @XmlEnumValue("Retractable")
    RETRACTABLE("Retractable"),
    @XmlEnumValue("Stick")
    STICK("Stick");
    private final String value;

    BallpointPenTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BallpointPenTypes fromValue(String v) {
        for (BallpointPenTypes c: BallpointPenTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}