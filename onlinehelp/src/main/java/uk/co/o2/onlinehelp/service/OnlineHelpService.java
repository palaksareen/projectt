package uk.co.o2.onlinehelp.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.model.SubscriberProfileDetails;
import uk.co.o2.onlinehelp.model.UserAcctDetails;
import uk.co.o2.onlinehelp.soapclient.helper.DataProcessor;
import uk.co.o2.onlinehelp.soapclient.rest.KanaService;
import uk.co.o2.onlinehelp.soapclient.soap.SubscriberService;
import uk.co.o2.onlinehelp.soapclient.soap.UserAcctService;
import uk.co.o2.onlinehelp.util.MsisdnConverter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Service
public class OnlineHelpService {

    @Autowired
    private SubscriberService subscriberService;

    @Autowired
    private UserAcctService userAcctService;

    @Autowired
    private KanaService kanaService;

    public void callSubscriberService(String mpn, HttpServletRequest request) throws SOAFaultException {

        HttpSession session = request.getSession();
        mpn = MsisdnConverter.getMsisdnForSoaService(mpn);
        String journey = (String) session.getAttribute("journey");
        SubscriberProfileDetails subscriberProfileDetails = null;
        subscriberProfileDetails = subscriberService.getSubscriberDetails(mpn);
        String spidType = DataProcessor.processSubscriberServiceResult(subscriberProfileDetails);

        if (null == session.getAttribute("frhMap")) {
            session.setAttribute("frhMap", new HashMap<String, String>());
        }

        Map<String, String> frhMap = (Map<String, String>) session.getAttribute("frhMap");
        frhMap.put("FRH_usertype", spidType);
        frhMap.put("FRH_userseg", "none");
    }

    public void callUserAcctService(String mpn, HttpServletRequest request) throws Exception {

        HttpSession session = request.getSession();
        if (null == session.getAttribute("frhMap")) {
            session.setAttribute("frhMap", new HashMap<String, String>());
        }
        Map<String, String> frhMap = (Map<String, String>) session.getAttribute("frhMap");

        UserAcctDetails userAcctDetails = null;
        if (StringUtils.equals(frhMap.get("FRH_usertype"), "GeniePostPay")) {
            mpn = MsisdnConverter.getMsisdnForSoaService(mpn);
            userAcctDetails = userAcctService.getUserAcctDetails(mpn);
        }

        DataProcessor.processUserAcctServiceResult(userAcctDetails, frhMap);
        DataProcessor.processUserEnteredValues(request);
        kanaService.submitForm((Map<String, String>) (request.getSession().getAttribute("frhMap")));
    }

}
