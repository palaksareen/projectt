
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listingLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listingLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Not Opted"/>
 *     &lt;enumeration value="FNFA"/>
 *     &lt;enumeration value="Online/Printed/Voice"/>
 *     &lt;enumeration value="Online/Printed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listingLevelType")
@XmlEnum
public enum ListingLevelType {

    @XmlEnumValue("Not Opted")
    NOT_OPTED("Not Opted"),
    FNFA("FNFA"),
    @XmlEnumValue("Online/Printed/Voice")
    ONLINE_PRINTED_VOICE("Online/Printed/Voice"),
    @XmlEnumValue("Online/Printed")
    ONLINE_PRINTED("Online/Printed");
    private final String value;

    ListingLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingLevelType fromValue(String v) {
        for (ListingLevelType c: ListingLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
