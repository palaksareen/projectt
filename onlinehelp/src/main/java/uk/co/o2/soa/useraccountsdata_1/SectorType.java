
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sectorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sectorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Advertising and Design"/>
 *     &lt;enumeration value="Agriculture"/>
 *     &lt;enumeration value="Architect Services"/>
 *     &lt;enumeration value="Construction"/>
 *     &lt;enumeration value="Education"/>
 *     &lt;enumeration value="Engineering"/>
 *     &lt;enumeration value="Financial Services"/>
 *     &lt;enumeration value="Government/Council Services"/>
 *     &lt;enumeration value="Health"/>
 *     &lt;enumeration value="Information Technology"/>
 *     &lt;enumeration value="Legal"/>
 *     &lt;enumeration value="Leisure"/>
 *     &lt;enumeration value="Consultant"/>
 *     &lt;enumeration value="Manufacturing"/>
 *     &lt;enumeration value="Office/General Supplies"/>
 *     &lt;enumeration value="Estate Management"/>
 *     &lt;enumeration value="Utilities"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sectorType")
@XmlEnum
public enum SectorType {

    @XmlEnumValue("Advertising and Design")
    ADVERTISING_AND_DESIGN("Advertising and Design"),
    @XmlEnumValue("Agriculture")
    AGRICULTURE("Agriculture"),
    @XmlEnumValue("Architect Services")
    ARCHITECT_SERVICES("Architect Services"),
    @XmlEnumValue("Construction")
    CONSTRUCTION("Construction"),
    @XmlEnumValue("Education")
    EDUCATION("Education"),
    @XmlEnumValue("Engineering")
    ENGINEERING("Engineering"),
    @XmlEnumValue("Financial Services")
    FINANCIAL_SERVICES("Financial Services"),
    @XmlEnumValue("Government/Council Services")
    GOVERNMENT_COUNCIL_SERVICES("Government/Council Services"),
    @XmlEnumValue("Health")
    HEALTH("Health"),
    @XmlEnumValue("Information Technology")
    INFORMATION_TECHNOLOGY("Information Technology"),
    @XmlEnumValue("Legal")
    LEGAL("Legal"),
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),
    @XmlEnumValue("Consultant")
    CONSULTANT("Consultant"),
    @XmlEnumValue("Manufacturing")
    MANUFACTURING("Manufacturing"),
    @XmlEnumValue("Office/General Supplies")
    OFFICE_GENERAL_SUPPLIES("Office/General Supplies"),
    @XmlEnumValue("Estate Management")
    ESTATE_MANAGEMENT("Estate Management"),
    @XmlEnumValue("Utilities")
    UTILITIES("Utilities"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SectorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SectorType fromValue(String v) {
        for (SectorType c: SectorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
