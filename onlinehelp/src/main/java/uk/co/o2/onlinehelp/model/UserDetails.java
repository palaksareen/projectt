package uk.co.o2.onlinehelp.model;

import java.io.Serializable;

public class UserDetails implements Serializable {

    private String accountType = "";
    private String phoneType = "";
    private String mpn = "";
    private String alternateMPN = "";
    private String firstName = "";
    private String lastName = "";
    private String emailAddress = "";
    private String confirmEmailAddress = "";

    private String journey = "";
    private String caseTitle = "";
    private String referer;

    private SecurityDetails securityDetails;
    private AdditionalInfo additionalInfo;

    private String pageInfo = "";

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getAlternateMPN() {
        return alternateMPN;
    }

    public void setAlternateMPN(String alternateMPN) {
        this.alternateMPN = alternateMPN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getConfirmEmailAddress() {
        return confirmEmailAddress;
    }

    public void setConfirmEmailAddress(String confirmEmailAddress) {
        this.confirmEmailAddress = confirmEmailAddress;
    }

    public SecurityDetails getSecurityDetails() {
        return securityDetails;
    }

    public void setSecurityDetails(SecurityDetails securityDetails) {
        this.securityDetails = securityDetails;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getJourney() {
        return journey;
    }

    public void setJourney(String journey) {
        this.journey = journey;
    }


    public String getCaseTitle() {
        return caseTitle;
    }

    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "accountType='" + accountType + '\'' +
                ", phoneType='" + phoneType + '\'' +
                ", mpn='" + mpn + '\'' +
                ", alternateMPN='" + alternateMPN + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", confirmEmailAddress='" + confirmEmailAddress + '\'' +
                ", journey='" + journey + '\'' +
                ", caseTitle='" + caseTitle + '\'' +
                ", referer='" + referer + '\'' +
                ", securityDetails=" + securityDetails +
                ", additionalInfo=" + additionalInfo +
                ", pageInfo='" + pageInfo + '\'' +
                '}';
    }
}
