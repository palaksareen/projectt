
package uk.co.o2.soa.pscommonregistrationdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwningBusinessDivisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwningBusinessDivisionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="O2UK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwningBusinessDivisionType")
@XmlEnum
public enum OwningBusinessDivisionType {

    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("O2UK")
    O_2_UK("O2UK");
    private final String value;

    OwningBusinessDivisionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwningBusinessDivisionType fromValue(String v) {
        for (OwningBusinessDivisionType c: OwningBusinessDivisionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
