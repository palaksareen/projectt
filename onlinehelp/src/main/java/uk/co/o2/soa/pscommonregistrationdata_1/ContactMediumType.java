
package uk.co.o2.soa.pscommonregistrationdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactMediumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactMediumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Voice"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="SMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactMediumType")
@XmlEnum
public enum ContactMediumType {

    @XmlEnumValue("Voice")
    VOICE("Voice"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    SMS("SMS");
    private final String value;

    ContactMediumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactMediumType fromValue(String v) {
        for (ContactMediumType c: ContactMediumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
