
package uk.co.o2.soa.pscommonregistrationdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="L2M"/>
 *     &lt;enumeration value="RevenueShare"/>
 *     &lt;enumeration value="Consumer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountCategoryType")
@XmlEnum
public enum AccountCategoryType {

    @XmlEnumValue("L2M")
    L_2_M("L2M"),
    @XmlEnumValue("RevenueShare")
    REVENUE_SHARE("RevenueShare"),
    @XmlEnumValue("Consumer")
    CONSUMER("Consumer");
    private final String value;

    AccountCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountCategoryType fromValue(String v) {
        for (AccountCategoryType c: AccountCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
