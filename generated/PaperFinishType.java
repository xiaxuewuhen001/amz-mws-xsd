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
 * <p>Java class for PaperFinishType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaperFinishType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="coated"/>
 *     &lt;enumeration value="embossed"/>
 *     &lt;enumeration value="glossy"/>
 *     &lt;enumeration value="high_gloss"/>
 *     &lt;enumeration value="matte"/>
 *     &lt;enumeration value="metallic"/>
 *     &lt;enumeration value="satin"/>
 *     &lt;enumeration value="semi-gloss"/>
 *     &lt;enumeration value="smooth"/>
 *     &lt;enumeration value="soft_gloss"/>
 *     &lt;enumeration value="specially_coated"/>
 *     &lt;enumeration value="texture_laid"/>
 *     &lt;enumeration value="tracing"/>
 *     &lt;enumeration value="translucent"/>
 *     &lt;enumeration value="ultra_smooth"/>
 *     &lt;enumeration value="uncoated"/>
 *     &lt;enumeration value="watercolor"/>
 *     &lt;enumeration value="wove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaperFinishType")
@XmlEnum
public enum PaperFinishType {

    @XmlEnumValue("coated")
    COATED("coated"),
    @XmlEnumValue("embossed")
    EMBOSSED("embossed"),
    @XmlEnumValue("glossy")
    GLOSSY("glossy"),
    @XmlEnumValue("high_gloss")
    HIGH_GLOSS("high_gloss"),
    @XmlEnumValue("matte")
    MATTE("matte"),
    @XmlEnumValue("metallic")
    METALLIC("metallic"),
    @XmlEnumValue("satin")
    SATIN("satin"),
    @XmlEnumValue("semi-gloss")
    SEMI_GLOSS("semi-gloss"),
    @XmlEnumValue("smooth")
    SMOOTH("smooth"),
    @XmlEnumValue("soft_gloss")
    SOFT_GLOSS("soft_gloss"),
    @XmlEnumValue("specially_coated")
    SPECIALLY_COATED("specially_coated"),
    @XmlEnumValue("texture_laid")
    TEXTURE_LAID("texture_laid"),
    @XmlEnumValue("tracing")
    TRACING("tracing"),
    @XmlEnumValue("translucent")
    TRANSLUCENT("translucent"),
    @XmlEnumValue("ultra_smooth")
    ULTRA_SMOOTH("ultra_smooth"),
    @XmlEnumValue("uncoated")
    UNCOATED("uncoated"),
    @XmlEnumValue("watercolor")
    WATERCOLOR("watercolor"),
    @XmlEnumValue("wove")
    WOVE("wove");
    private final String value;

    PaperFinishType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaperFinishType fromValue(String v) {
        for (PaperFinishType c: PaperFinishType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
