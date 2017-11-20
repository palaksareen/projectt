package uk.co.o2.onlinehelp.soapclient.helper;

import org.apache.commons.lang.StringUtils;
import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Encoder;
import uk.co.o2.onlinehelp.constant.Operator;
import uk.co.o2.onlinehelp.constant.PaymentType;
import uk.co.o2.onlinehelp.model.*;
import uk.co.o2.onlinehelp.util.DynamicProperties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Created by cts1 on 4/7/17.
 */
public class DataProcessor {

    private static final Encoder htmlEncoder = ESAPI.encoder();

    public static void processUserEnteredValues(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (null == session.getAttribute("frhMap")) {
            session.setAttribute("frhMap", new HashMap<String, String>());
        }

        UserDetails userDetails = (UserDetails) session.getAttribute("sessionUserDetails");
        Map<String, String> frhMap = (Map<String, String>) session.getAttribute("frhMap");

        Map<String, String> userDetailsMap = new HashMap<>();
        userDetailsMap.put("SX_FROM_ADDRESS", userDetails.getEmailAddress());
//        userDetailsMap.put("FRH_msg_account_type", userDetails.getAccountType());
        userDetailsMap.put("FRH_msg_handset", userDetails.getPhoneType());
        userDetailsMap.put("FRH_msg_mobile_number", userDetails.getMpn());
        userDetailsMap.put("FRH_msg_alt_contact_number", userDetails.getAlternateMPN());
        userDetailsMap.put("FRH_msg_firstname", userDetails.getFirstName());
        userDetailsMap.put("FRH_msg_lastname", userDetails.getLastName());

        SecurityDetails securityDetails = userDetails.getSecurityDetails();
        userDetailsMap.put("FRH_msg_address_1", securityDetails.getAddress());
        userDetailsMap.put("FRH_msg_last_bill_amount", securityDetails.getBillAmount());
        userDetailsMap.put("FRH_msg_last_bill_date", securityDetails.getBillDate());
        userDetailsMap.put("FRH_msg_security_password_2nd", securityDetails.getChar2());
        userDetailsMap.put("FRH_msg_security_password_3rd", securityDetails.getChar3());
        userDetailsMap.put("FRH_msg_company_name", securityDetails.getCompanyName());
        userDetailsMap.put("FRH_msg_frequently_dialled_1", securityDetails.getFirstFrequentNo());
        userDetailsMap.put("FRH_msg_frequently_dialled_2", securityDetails.getSecondFrequentNo());
        userDetailsMap.put("FRH_msg_postcode", securityDetails.getPostcode());
        userDetailsMap.put("FRH_msg_security_password", securityDetails.getSecuritypass());
        userDetailsMap.put("FRH_msg_current_tariff", securityDetails.getTariffName());
        userDetailsMap.put("FRH_msg_balance", securityDetails.getAirtimeBalance());

        AdditionalInfo additionalInfo = userDetails.getAdditionalInfo();
        userDetailsMap.put("FRH_msg_imei_number", additionalInfo.getImei());
        userDetailsMap.put("FRH_msg_handset_model", additionalInfo.getModel());
        userDetailsMap.put("FRH_msg_sim_number", additionalInfo.getO2simNo());
        userDetailsMap.put("FRH_msg_temp_number", additionalInfo.getO2mpn());
        userDetailsMap.put("FRH_msg_keep_number", additionalInfo.getKeepMpn());
        userDetailsMap.put("FRH_msg_pac_code", additionalInfo.getPacNo());
        userDetailsMap.put("Comments", additionalInfo.getAddInfo());

        userDetailsMap.put("SX_SUBJECT", userDetails.getCaseTitle());
        userDetailsMap.put("Problem", userDetails.getCaseTitle());

        Map<String, String> finalMap = userDetailsMap.entrySet().stream()
                .filter(map -> StringUtils.isNotBlank(map.getValue()))
                .collect(Collectors.toMap(p -> p.getKey(), p -> decodeHTML(p.getValue())));
        frhMap.putAll(finalMap);
        session.setAttribute("frhMap", frhMap);
    }

    public static void processUserAcctServiceResult(UserAcctDetails userAcctDetails, Map<String, String> frhMap) {

        if (null != userAcctDetails) {
            String spidType;
            if (userAcctDetails.getOwningBusinessDivision().equals("Online")) {
                if (userAcctDetails.getCustomerType().equals("CON")) {
                    spidType = "GeniePostPay";
                } else {
                    spidType = "O2OnlineSME";
                }
            } else {
                if (userAcctDetails.getCustomerType().equals("CON")) {
                    spidType = "O2OfflineGeneva";
                } else {
                    spidType = "O2OfflineGenevaSME";
                }
            }

            frhMap.put("FRH_usertype", spidType);
            frhMap.put("FRH_userseg", userAcctDetails.getSegmentationValue());
        }

        frhMap.put("frh.properties", getCareEmail(frhMap.get("FRH_usertype"), frhMap.get("FRH_userseg")));
        frhMap.put("SX_TO", DynamicProperties.getProperty("kana.staticfield.sx.to"));
        frhMap.put("SX_CC", DynamicProperties.getProperty("kana.staticfield.sx.cc"));
        frhMap.put("SX_IP_ADDRESS", DynamicProperties.getProperty("kana.staticfield.sx.ip.address"));
        frhMap.put("SX_SENDER_ADDRESS", DynamicProperties.getProperty("kana.staticfield.sx.sender.address"));
        frhMap.put("SX_SENDER_NAME", DynamicProperties.getProperty("kana.staticfield.sx.sender.name"));
        frhMap.put("IETYPE", DynamicProperties.getProperty("kana.staticfield.ie.type"));
        frhMap.put("COMPANY_ID", DynamicProperties.getProperty("kana.staticfield.company.id"));
        frhMap.put("CUSTOMER_ID", DynamicProperties.getProperty("kana.staticfield.customer.id"));

        frhMap.put("JOBTICKET", "");
        frhMap.put("SESSLOGURL", "");
        frhMap.put("TRACKINGID", "");
        frhMap.put("CATEGORY", "");
    }


    public static String processSubscriberServiceResult(SubscriberProfileDetails subscriberProfileDetails) {
        Operator operatorId = subscriberProfileDetails.getOperator();
        PaymentType paymentType = subscriberProfileDetails.getPaymentType();
        String category = subscriberProfileDetails.getChannel();

        if (null != operatorId && Operator.NONO2.equals(subscriberProfileDetails.getOperator())) {
            return "Browser";
        }

        if (paymentType.equals(PaymentType.PREPAY) && category.matches("(.*)Online")) {
            return "GeniePrePay";
        }
        if (paymentType.equals(PaymentType.POSTPAY) && category.matches("(.*)Online")) {
            return "GeniePostPay";
        }
        if (paymentType.equals(PaymentType.PREPAY) && !category.matches("(.*)Online")) {
            return "BTCPrepay";
        }

        //Otherwise, extract the last word from the category field and return that
        StringTokenizer st = new StringTokenizer(category, " ");
        String finalToken = null;
        while (st.hasMoreTokens()) {
            finalToken = st.nextToken();
        }
        return finalToken;
    }

    private static String getCareEmail(String spidType, String segmentValue) {

        if ((segmentValue != null) && (segmentValue.equals("Select"))) {
            return DynamicProperties.getProperty("kana.caremail.queue.h");
        }
        if ((segmentValue != null) && (segmentValue.equals("Sel_Few"))) {
            return DynamicProperties.getProperty("kana.caremail.queue.i");
        }
        if ((segmentValue != null) && (segmentValue.equals("Sel_Inv"))) {
            return DynamicProperties.getProperty("kana.caremail.queue.j");
        }

        if (spidType.equals("O2OnlineSME")) {
            return DynamicProperties.getProperty("kana.caremail.queue.c");
        }
        if (spidType.equals("BTCPrepay") || spidType.equals("GeniePrePay")) {
            return DynamicProperties.getProperty("kana.caremail.queue.d");
        }
        if (spidType.equals("O2OfflineGenevaSME")) {
            return DynamicProperties.getProperty("kana.caremail.queue.f");
        }
        return DynamicProperties.getProperty("kana.caremail.queue.b");
    }

    public static String decodeHTML(String value) {
        return htmlEncoder.decodeForHTML(value);
    }
}
