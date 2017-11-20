
package uk.co.o2.soa.pscommonregistrationdata_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billingMsisdnStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="billingMsisdnStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "billingMsisdnStatusType")
@XmlEnum
public enum BillingMsisdnStatusType {

    ACTIVE,
    INACTIVE;

    public String value() {
        return name();
    }

    public static BillingMsisdnStatusType fromValue(String v) {
        return valueOf(v);
    }

}
