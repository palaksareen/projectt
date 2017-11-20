
package uk.co.o2.soa.pscommonregistrationdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingDetailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Limited"/>
 *     &lt;enumeration value="Ex-Directory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListingDetailType")
@XmlEnum
public enum ListingDetailType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Limited")
    LIMITED("Limited"),
    @XmlEnumValue("Ex-Directory")
    EX_DIRECTORY("Ex-Directory");
    private final String value;

    ListingDetailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingDetailType fromValue(String v) {
        for (ListingDetailType c: ListingDetailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
