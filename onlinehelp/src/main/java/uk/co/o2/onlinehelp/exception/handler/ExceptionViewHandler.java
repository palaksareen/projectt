package uk.co.o2.onlinehelp.exception.handler;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.logger.ErrorCode;
import uk.co.o2.onlinehelp.model.UserDetails;
import uk.co.o2.onlinehelp.soapclient.helper.DataProcessor;
import uk.co.o2.onlinehelp.util.JourneyViews;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Stack;

/**
 * Created by cts1 on 12/5/17.
 */
public class ExceptionViewHandler {

    public static ModelAndView getModelAndViewForException(HttpServletRequest request, List<ErrorCode> errorCodeList) {

        ModelAndView mav = new ModelAndView(JourneyViews.LANDING_PAGE);
        UserDetails userDetails = (UserDetails) request.getSession().getAttribute("userDetails");
        Object csrfToken = request.getSession().getAttribute("UniqueTransactionId");
        Stack<ModelAndView> currentJourney = new Stack<>();
        request.getSession().setAttribute("currentJourney", currentJourney);
        if (null == userDetails) {
            // This happens when session expires.
            userDetails = new UserDetails();
            userDetails.setJourney(request.getParameter("journey"));
        } else if (null != errorCodeList) {
            mav.addObject("errors", errorCodeList);
        }

        ModelAndView stackMav = new ModelAndView(JourneyViews.LANDING_PAGE);
        stackMav.addObject("htmlDecoder", new DataProcessor());
        stackMav.addObject("journey", userDetails.getJourney());
        currentJourney.push(stackMav);

        mav.addObject("journey", userDetails.getJourney());
        mav.addObject("userDetails", userDetails);
        mav.addObject("htmlDecoder", new DataProcessor());
        mav.addObject("csrfToken", csrfToken);

        return mav;
    }

    public static ModelAndView getModelAndViewForKanaException(HttpServletRequest request, List<ErrorCode> errorCodeList) {
        UserDetails userDetails = (UserDetails) request.getSession().getAttribute("userDetails");
        Object csrfToken = request.getSession().getAttribute("UniqueTransactionId");
        String journey = userDetails.getJourney();
        String viewName;
        if (StringUtils.equals(journey, "handsetunlockingform")) {
            viewName = JourneyViews.ADDITIONAL_UNLOCK_INFO_PAGE;
        } else {
            viewName = JourneyViews.ADDITIONAL_KMEN_INFO_PAGE;
        }

        ModelAndView mav = new ModelAndView(viewName);
        mav.addObject("errors", errorCodeList);
        mav.addObject("journey", journey);
        mav.addObject("additionalInfo", userDetails.getAdditionalInfo());
        mav.addObject("userDetails", userDetails);
        mav.addObject("csrfToken", csrfToken);
        return mav;
    }

}
