
package uk.co.o2.soa.useraccountsdata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.pscommonregistrationdata_2.IdentityReferenceType;


/**
 * Lists the secondary portal accounts associated
 * 				with a Broadband primary account.
 * 
 * <p>Java class for broadbandSecondaryAccountList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="broadbandSecondaryAccountList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userInfo" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}identityReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "broadbandSecondaryAccountList", propOrder = {
    "userInfo"
})
public class BroadbandSecondaryAccountList {

    @XmlElement(required = true)
    protected List<IdentityReferenceType> userInfo;

    /**
     * Gets the value of the userInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityReferenceType }
     * 
     * 
     */
    public List<IdentityReferenceType> getUserInfo() {
        if (userInfo == null) {
            userInfo = new ArrayList<IdentityReferenceType>();
        }
        return this.userInfo;
    }

}
