package uk.co.o2.onlinehelp.model;

import java.io.Serializable;

public class SecurityDetails implements Serializable {

    //payG & payM security details
    private String char2 = "";
    private String char3 = "";

    //payG security details
    private String firstFrequentNo = "";
    private String secondFrequentNo = "";
    private String airtimeBalance = "";

    //business security details & forgot password details
    private String companyName = "";
    private String address = "";
    private String postcode = "";

    //business security details
    private String securitypass = "";

    // payM forgot password details
    private String tariffName = "";

    //payM & business forgot password details
    private String billDate = "";
    private String billAmount = "";

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2;
    }

    public String getChar3() {
        return char3;
    }

    public void setChar3(String char3) {
        this.char3 = char3;
    }

    public String getFirstFrequentNo() {
        return firstFrequentNo;
    }

    public void setFirstFrequentNo(String firstFrequentNo) {
        this.firstFrequentNo = firstFrequentNo;
    }

    public String getSecondFrequentNo() {
        return secondFrequentNo;
    }

    public void setSecondFrequentNo(String secondFrequentNo) {
        this.secondFrequentNo = secondFrequentNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSecuritypass() {
        return securitypass;
    }

    public void setSecuritypass(String securitypass) {
        this.securitypass = securitypass;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getAirtimeBalance() {
        return airtimeBalance;
    }

    public void setAirtimeBalance(String airtimeBalance) {
        this.airtimeBalance = airtimeBalance;
    }

    @Override
    public String toString() {
        return "SecurityDetails{" +
                "firstFrequentNo='" + firstFrequentNo + '\'' +
                ", secondFrequentNo='" + secondFrequentNo + '\'' +
                ", airtimeBalance='" + airtimeBalance + '\'' +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", tariffName='" + tariffName + '\'' +
                ", billDate='" + billDate + '\'' +
                ", billAmount='" + billAmount + '\'' +
                '}';
    }
}
