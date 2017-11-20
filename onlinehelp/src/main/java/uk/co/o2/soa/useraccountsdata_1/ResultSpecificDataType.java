
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultSpecificDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resultSpecificDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="legacyAandRCustomerInfo"/>
 *     &lt;enumeration value="portalInfo"/>
 *     &lt;enumeration value="broadbandInfo"/>
 *     &lt;enumeration value="billingInfo"/>
 *     &lt;enumeration value="roleInfo"/>
 *     &lt;enumeration value="accountLinkageInfo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resultSpecificDataType")
@XmlEnum
public enum ResultSpecificDataType {

    @XmlEnumValue("legacyAandRCustomerInfo")
    LEGACY_AAND_R_CUSTOMER_INFO("legacyAandRCustomerInfo"),
    @XmlEnumValue("portalInfo")
    PORTAL_INFO("portalInfo"),
    @XmlEnumValue("broadbandInfo")
    BROADBAND_INFO("broadbandInfo"),
    @XmlEnumValue("billingInfo")
    BILLING_INFO("billingInfo"),
    @XmlEnumValue("roleInfo")
    ROLE_INFO("roleInfo"),
    @XmlEnumValue("accountLinkageInfo")
    ACCOUNT_LINKAGE_INFO("accountLinkageInfo");
    private final String value;

    ResultSpecificDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultSpecificDataType fromValue(String v) {
        for (ResultSpecificDataType c: ResultSpecificDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
