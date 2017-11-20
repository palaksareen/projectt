
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for portalOrIdentitySwitchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="portalOrIdentitySwitchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PORTAL"/>
 *     &lt;enumeration value="IDENTITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "portalOrIdentitySwitchType")
@XmlEnum
public enum PortalOrIdentitySwitchType {

    PORTAL,
    IDENTITY;

    public String value() {
        return name();
    }

    public static PortalOrIdentitySwitchType fromValue(String v) {
        return valueOf(v);
    }

}
