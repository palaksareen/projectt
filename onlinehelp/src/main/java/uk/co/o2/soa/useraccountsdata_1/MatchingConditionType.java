
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchingConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="matchingConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXACT"/>
 *     &lt;enumeration value="STARTING_WITH"/>
 *     &lt;enumeration value="ENDING_WITH"/>
 *     &lt;enumeration value="SUBSTRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "matchingConditionType")
@XmlEnum
public enum MatchingConditionType {

    EXACT,
    STARTING_WITH,
    ENDING_WITH,
    SUBSTRING;

    public String value() {
        return name();
    }

    public static MatchingConditionType fromValue(String v) {
        return valueOf(v);
    }

}
