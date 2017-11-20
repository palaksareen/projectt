
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnPartialSearchResultsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="returnPartialSearchResultsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "returnPartialSearchResultsType")
@XmlEnum
public enum ReturnPartialSearchResultsType {

    Y;

    public String value() {
        return name();
    }

    public static ReturnPartialSearchResultsType fromValue(String v) {
        return valueOf(v);
    }

}
