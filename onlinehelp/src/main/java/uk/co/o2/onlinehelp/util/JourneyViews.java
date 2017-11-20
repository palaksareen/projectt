package uk.co.o2.onlinehelp.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.model.OHModelAndView;
import uk.co.o2.onlinehelp.soapclient.helper.DataProcessor;

import java.util.HashMap;
import java.util.Map;

@Component
public class JourneyViews implements InitializingBean {

    public static final String SEPARATOR = "_";

    public static final String LANDING_PAGE = "/landingPage";
    public static final String CANCEL_PAGE = "/cancel";
    public static final String PAY_MONTHLY_SECURITY_PAGE = "/payMonthlySecurity";
    public static final String ADDITIONAL_UNLOCK_INFO_PAGE = "/additionalUnlockInfo";
    public static final String ADDITIONAL_KMEN_INFO_PAGE = "/additionalKMENInfo";
    public static final String PAY_MONTHLY_FORGET_PASSWORD_PAGE = "/payMonthlyNoPassword";
    public static final String BUSINESS_FORGET_PASSWORD_PAGE = "/businessNoPassword";
    public static final String BUSINESS_SECURITY_PAGE = "/businessSecurity";
    public static final String PAY_AS_YOU_GO_SECURITY_PAGE = "/payAsYouGoSecurity";
    public static final String UNLOCK_SUCCESS_PAGE = "/unlockSuccessMessage";
    public static final String KMEN_SUCCESS_PAGE = "/kmenSuccessMessage";

    private Map<String, OHModelAndView> unlockJourneyViews;
    private Map<String, OHModelAndView> kmenJourneyViews;
    private Map<String, Map<String, OHModelAndView>> journeyMap;

    private Map<String, OHModelAndView> createUnlockJourneyViews() {
        unlockJourneyViews = new HashMap<>();
        unlockJourneyViews.put(SEPARATOR, new OHModelAndView(new ModelAndView(LANDING_PAGE, "htmlDecoder", new DataProcessor())));
        unlockJourneyViews.put("landing_paym", new OHModelAndView(new ModelAndView(PAY_MONTHLY_SECURITY_PAGE)));
        unlockJourneyViews.put("landing_payg", new OHModelAndView(new ModelAndView(PAY_AS_YOU_GO_SECURITY_PAGE)));
        unlockJourneyViews.put("landing_biz", new OHModelAndView(new ModelAndView(BUSINESS_SECURITY_PAGE)));
        unlockJourneyViews.put("security_paym", new OHModelAndView(new ModelAndView(ADDITIONAL_UNLOCK_INFO_PAGE, "htmlDecoder", new DataProcessor()), UpdateFieldsConsumers::updatePayMSecurityFields));
        unlockJourneyViews.put("security_payg", new OHModelAndView(new ModelAndView(ADDITIONAL_UNLOCK_INFO_PAGE, "htmlDecoder", new DataProcessor()), UpdateFieldsConsumers::updatePayGSecurityFields));
        unlockJourneyViews.put("security_biz", new OHModelAndView(new ModelAndView(ADDITIONAL_UNLOCK_INFO_PAGE, "htmlDecoder", new DataProcessor()), UpdateFieldsConsumers::updateBizSecurityFields));
        unlockJourneyViews.put("noPassword_paym", new OHModelAndView(new ModelAndView(PAY_MONTHLY_FORGET_PASSWORD_PAGE)));
        unlockJourneyViews.put("noPassword_biz", new OHModelAndView(new ModelAndView(BUSINESS_FORGET_PASSWORD_PAGE)));
        unlockJourneyViews.put("forgetPass_paym", new OHModelAndView(new ModelAndView(ADDITIONAL_UNLOCK_INFO_PAGE, "htmlDecoder", new DataProcessor()), UpdateFieldsConsumers::updatePayMForgetPassFields));
        unlockJourneyViews.put("forgetPass_biz", new OHModelAndView(new ModelAndView(ADDITIONAL_UNLOCK_INFO_PAGE, "htmlDecoder", new DataProcessor()), UpdateFieldsConsumers::updateBizForgetPassFields));
        unlockJourneyViews.put("submit", new OHModelAndView(new ModelAndView(UNLOCK_SUCCESS_PAGE), UpdateFieldsConsumers::updateUnlockAdditionalDetailsFields));
        return unlockJourneyViews;
    }

    private Map<String, OHModelAndView> createKMENJourneyViews() {
        kmenJourneyViews = new HashMap<>();
        kmenJourneyViews.put(SEPARATOR, new OHModelAndView(new ModelAndView(LANDING_PAGE, "htmlDecoder", new DataProcessor())));
        kmenJourneyViews.put("landing_paym", new OHModelAndView(new ModelAndView(PAY_MONTHLY_SECURITY_PAGE)));
        kmenJourneyViews.put("landing_payg", new OHModelAndView(new ModelAndView(ADDITIONAL_KMEN_INFO_PAGE), UpdateFieldsConsumers::updateKMENPayGSecurityFields));
        kmenJourneyViews.put("landing_biz", new OHModelAndView(new ModelAndView(BUSINESS_SECURITY_PAGE)));
        kmenJourneyViews.put("security_paym", new OHModelAndView(new ModelAndView(ADDITIONAL_KMEN_INFO_PAGE), UpdateFieldsConsumers::updatePayMSecurityFields));
        kmenJourneyViews.put("security_biz", new OHModelAndView(new ModelAndView(ADDITIONAL_KMEN_INFO_PAGE), UpdateFieldsConsumers::updateBizSecurityFields));
        kmenJourneyViews.put("noPassword_paym", new OHModelAndView(new ModelAndView(PAY_MONTHLY_FORGET_PASSWORD_PAGE)));
        kmenJourneyViews.put("noPassword_biz", new OHModelAndView(new ModelAndView(BUSINESS_FORGET_PASSWORD_PAGE)));
        kmenJourneyViews.put("forgetPass_paym", new OHModelAndView(new ModelAndView(ADDITIONAL_KMEN_INFO_PAGE), UpdateFieldsConsumers::updatePayMForgetPassFields));
        kmenJourneyViews.put("forgetPass_biz", new OHModelAndView(new ModelAndView(ADDITIONAL_KMEN_INFO_PAGE), UpdateFieldsConsumers::updateBizForgetPassFields));
        kmenJourneyViews.put("submit", new OHModelAndView(new ModelAndView(KMEN_SUCCESS_PAGE), UpdateFieldsConsumers::updateKMENAdditionalDetailsFields));

        return kmenJourneyViews;
    }

    public OHModelAndView getView(String journey, String pageName) {
        return journeyMap.get(journey).get(pageName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        unlockJourneyViews = createUnlockJourneyViews();
        kmenJourneyViews = createKMENJourneyViews();
        assert null != unlockJourneyViews;
        assert null != kmenJourneyViews;
        journeyMap = new HashMap<>();
        journeyMap.put("handsetunlockingform", unlockJourneyViews);
        journeyMap.put("migrateinform", kmenJourneyViews);
    }
}
