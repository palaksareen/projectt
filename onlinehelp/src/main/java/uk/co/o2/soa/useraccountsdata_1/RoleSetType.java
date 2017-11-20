
package uk.co.o2.soa.useraccountsdata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Orange account registration role set (user, chooser, superchooser)
 * 			
 * 
 * <p>Java class for roleSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roleSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userRole" type="{http://soa.o2.co.uk/useraccountsdata_1}userRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chooserRole" type="{http://soa.o2.co.uk/useraccountsdata_1}chooserRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="superchooserRole" type="{http://soa.o2.co.uk/useraccountsdata_1}superChooserRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleSetType", propOrder = {
    "userRole",
    "chooserRole",
    "superchooserRole"
})
public class RoleSetType {

    protected List<UserRoleType> userRole;
    protected List<ChooserRoleType> chooserRole;
    protected List<SuperChooserRoleType> superchooserRole;

    /**
     * Gets the value of the userRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserRoleType }
     * 
     * 
     */
    public List<UserRoleType> getUserRole() {
        if (userRole == null) {
            userRole = new ArrayList<UserRoleType>();
        }
        return this.userRole;
    }

    /**
     * Gets the value of the chooserRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chooserRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChooserRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChooserRoleType }
     * 
     * 
     */
    public List<ChooserRoleType> getChooserRole() {
        if (chooserRole == null) {
            chooserRole = new ArrayList<ChooserRoleType>();
        }
        return this.chooserRole;
    }

    /**
     * Gets the value of the superchooserRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superchooserRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperchooserRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuperChooserRoleType }
     * 
     * 
     */
    public List<SuperChooserRoleType> getSuperchooserRole() {
        if (superchooserRole == null) {
            superchooserRole = new ArrayList<SuperChooserRoleType>();
        }
        return this.superchooserRole;
    }

}
