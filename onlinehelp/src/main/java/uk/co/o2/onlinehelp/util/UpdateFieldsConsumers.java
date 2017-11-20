package uk.co.o2.onlinehelp.util;

import uk.co.o2.onlinehelp.model.AdditionalInfo;
import uk.co.o2.onlinehelp.model.SecurityDetails;
import uk.co.o2.onlinehelp.model.UserDetails;
import uk.co.o2.onlinehelp.soapclient.helper.DataProcessor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UpdateFieldsConsumers {

    public static UserDetails updatePayMSecurityFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;

        SecurityDetails securityDetails = new SecurityDetails();
        SecurityDetails currentSecurityDetails = userDetails.getSecurityDetails();

        securityDetails.setChar2(currentSecurityDetails.getChar2());
        securityDetails.setChar3(currentSecurityDetails.getChar3());

        sessionUserDetails.setSecurityDetails(securityDetails);
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    public static UserDetails updatePayGSecurityFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;

        SecurityDetails securityDetails = new SecurityDetails();
        SecurityDetails currentSecurityDetails = userDetails.getSecurityDetails();

        securityDetails.setChar2(currentSecurityDetails.getChar2());
        securityDetails.setChar3(currentSecurityDetails.getChar3());
        securityDetails.setAirtimeBalance(currentSecurityDetails.getAirtimeBalance());
        securityDetails.setFirstFrequentNo(currentSecurityDetails.getFirstFrequentNo());
        securityDetails.setSecondFrequentNo(currentSecurityDetails.getSecondFrequentNo());

        sessionUserDetails.setSecurityDetails(securityDetails);
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    public static UserDetails updateKMENPayGSecurityFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;
        sessionUserDetails.setSecurityDetails(new SecurityDetails());
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    public static UserDetails updateBizSecurityFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;

        SecurityDetails securityDetails = new SecurityDetails();
        SecurityDetails currentSecurityDetails = userDetails.getSecurityDetails();

        securityDetails.setCompanyName(currentSecurityDetails.getCompanyName());
        securityDetails.setAddress(currentSecurityDetails.getAddress());
        securityDetails.setPostcode(currentSecurityDetails.getPostcode());
        securityDetails.setSecuritypass(currentSecurityDetails.getSecuritypass());

        sessionUserDetails.setSecurityDetails(securityDetails);
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    public static UserDetails updatePayMForgetPassFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;

        SecurityDetails securityDetails = new SecurityDetails();
        SecurityDetails currentSecurityDetails = userDetails.getSecurityDetails();

        securityDetails.setBillAmount(currentSecurityDetails.getBillAmount());
        securityDetails.setBillDate(dateFormatConversion(currentSecurityDetails.getBillDate()));
        securityDetails.setTariffName(currentSecurityDetails.getTariffName());

        sessionUserDetails.setSecurityDetails(securityDetails);
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    public static UserDetails updateBizForgetPassFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;

        SecurityDetails securityDetails = new SecurityDetails();
        SecurityDetails currentSecurityDetails = userDetails.getSecurityDetails();

        securityDetails.setCompanyName(currentSecurityDetails.getCompanyName());
        securityDetails.setAddress(currentSecurityDetails.getAddress());
        securityDetails.setPostcode(currentSecurityDetails.getPostcode());
        securityDetails.setBillDate(dateFormatConversion(currentSecurityDetails.getBillDate()));
        securityDetails.setBillAmount(currentSecurityDetails.getBillAmount());

        sessionUserDetails.setSecurityDetails(securityDetails);
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    public static UserDetails updateKMENAdditionalDetailsFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;

        AdditionalInfo additionalInfo = new AdditionalInfo();
        AdditionalInfo currentAdditionalInfo = userDetails.getAdditionalInfo();

        additionalInfo.setKeepMpn(currentAdditionalInfo.getKeepMpn());
        additionalInfo.setO2mpn(currentAdditionalInfo.getO2mpn());
        additionalInfo.setO2simNo(currentAdditionalInfo.getO2simNo());
        additionalInfo.setPacNo(currentAdditionalInfo.getPacNo());
        additionalInfo.setAddInfo(currentAdditionalInfo.getAddInfo());

        sessionUserDetails.setAdditionalInfo(additionalInfo);
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    public static UserDetails updateUnlockAdditionalDetailsFields(HttpServletRequest request, UserDetails userDetails) {
        UserDetails sessionUserDetails = userDetails;

        AdditionalInfo additionalInfo = new AdditionalInfo();
        AdditionalInfo currentAdditionalInfo = userDetails.getAdditionalInfo();

        additionalInfo.setModel(currentAdditionalInfo.getModel());
        additionalInfo.setImei(currentAdditionalInfo.getImei());

        sessionUserDetails.setAdditionalInfo(additionalInfo);
        setUserDetailsInSession(request, sessionUserDetails);
        return sessionUserDetails;
    }

    private static void setUserDetailsInSession(HttpServletRequest request, UserDetails userDetails) {
        HttpSession session = request.getSession();
        session.setAttribute("sessionUserDetails", userDetails);
    }

    private static String dateFormatConversion(String billDate) {
        String decodedBillDate = DataProcessor.decodeHTML(billDate);
        String[] date = decodedBillDate.split("/");
        String newBillDate = date[1] + "-" + date[0] + "-" + date[2];
        return newBillDate;
    }
}
