
package uk.co.o2.soa.pscommonregistrationdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="SOL"/>
 *     &lt;enumeration value="PAR"/>
 *     &lt;enumeration value="LTD"/>
 *     &lt;enumeration value="CHA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerCategoryType")
@XmlEnum
public enum CustomerCategoryType {

    CON,
    SOL,
    PAR,
    LTD,
    CHA;

    public String value() {
        return name();
    }

    public static CustomerCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
