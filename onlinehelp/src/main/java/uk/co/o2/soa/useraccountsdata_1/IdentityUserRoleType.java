
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.pscommonregistrationdata_2.IdentityReferenceType;
import uk.co.o2.soa.pscommonregistrationdata_2.UserRoleType;


/**
 * User role type (with reference to the owning
 * 				Portal Account). This type also has additional identity related data.
 * 
 * <p>Java class for identityUserRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identityUserRoleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soa.o2.co.uk/pscommonregistrationdata_2}userRoleType">
 *       &lt;sequence>
 *         &lt;element name="identityReference" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}identityReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityUserRoleType", propOrder = {
    "identityReference"
})
public class IdentityUserRoleType
    extends UserRoleType
{

    @XmlElement(required = true)
    protected IdentityReferenceType identityReference;

    /**
     * Gets the value of the identityReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityReferenceType }
     *     
     */
    public IdentityReferenceType getIdentityReference() {
        return identityReference;
    }

    /**
     * Sets the value of the identityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityReferenceType }
     *     
     */
    public void setIdentityReference(IdentityReferenceType value) {
        this.identityReference = value;
    }

}
