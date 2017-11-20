package uk.co.o2.onlinehelp.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import uk.co.o2.onlinehelp.model.AdditionalInfo;
import uk.co.o2.onlinehelp.model.SecurityDetails;
import uk.co.o2.onlinehelp.model.UserDetails;

@SessionAttributes(value = {"userDetails", "securityDetails", "additionalInfo"},
        types = {UserDetails.class, SecurityDetails.class, AdditionalInfo.class})
public class AbstractController {

    @ModelAttribute("userDetails")
    public UserDetails createUserDetails() {
        UserDetails userDetails = new UserDetails();
        userDetails.setSecurityDetails(createSecurityDetails());
        userDetails.setAdditionalInfo(createAdditionalInfo());
        return userDetails;
    }

    @ModelAttribute("securityDetails")
    public SecurityDetails createSecurityDetails() {
        return new SecurityDetails();
    }

    @ModelAttribute("additionalInfo")
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }
}
