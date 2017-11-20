
package uk.co.o2.soa.useraccountsdata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds information related to the A&R linked
 * 				account record that is not available from other sources.
 * 			
 * 
 * <p>Java class for accountLinkageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountLinkageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkedAccount" type="{http://soa.o2.co.uk/useraccountsdata_1}linkedAccountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountLinkageType", propOrder = {
    "linkedAccount"
})
public class AccountLinkageType {

    @XmlElement(required = true)
    protected List<LinkedAccountType> linkedAccount;

    /**
     * Gets the value of the linkedAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedAccountType }
     * 
     * 
     */
    public List<LinkedAccountType> getLinkedAccount() {
        if (linkedAccount == null) {
            linkedAccount = new ArrayList<LinkedAccountType>();
        }
        return this.linkedAccount;
    }

}
