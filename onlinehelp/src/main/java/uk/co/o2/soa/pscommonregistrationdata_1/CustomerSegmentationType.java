
package uk.co.o2.soa.pscommonregistrationdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSegmentationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerSegmentationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Platinum"/>
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Bronze"/>
 *     &lt;enumeration value="Select"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="Sel_Inv"/>
 *     &lt;enumeration value="Sel_Few"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerSegmentationType")
@XmlEnum
public enum CustomerSegmentationType {

    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),
    @XmlEnumValue("Gold")
    GOLD("Gold"),
    @XmlEnumValue("Silver")
    SILVER("Silver"),
    @XmlEnumValue("Bronze")
    BRONZE("Bronze"),
    @XmlEnumValue("Select")
    SELECT("Select"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("Sel_Inv")
    SEL_INV("Sel_Inv"),
    @XmlEnumValue("Sel_Few")
    SEL_FEW("Sel_Few");
    private final String value;

    CustomerSegmentationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerSegmentationType fromValue(String v) {
        for (CustomerSegmentationType c: CustomerSegmentationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
