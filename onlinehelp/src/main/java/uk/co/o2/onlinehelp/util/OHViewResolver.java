package uk.co.o2.onlinehelp.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.exception.SessionExpiredException;
import uk.co.o2.onlinehelp.exception.ViewResolverException;
import uk.co.o2.onlinehelp.model.OHModelAndView;
import uk.co.o2.onlinehelp.model.UserDetails;
import uk.co.o2.onlinehelp.service.OnlineHelpService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Stack;

@Component
public class OHViewResolver {

    @Autowired
    private OnlineHelpService service;

    @Autowired
    private JourneyViews views;

    public ModelAndView resolveRefreshView(HttpServletRequest request, UserDetails userDetails) throws
            SOAFaultException, ViewResolverException {

        ModelAndView nextView = null;
        HttpSession session = request.getSession();

        if (null == session.getAttribute("currentJourney")) {
            session.setAttribute("currentJourney", new Stack<ModelAndView>());
        }

        Stack<ModelAndView> currentJourney = (Stack) session.getAttribute("currentJourney");
        final String journey = (String) session.getAttribute("journey");
        final String accountType = userDetails.getAccountType();
        final String currentPage = userDetails.getPageInfo() + JourneyViews.SEPARATOR + accountType;

        if (StringUtils.isBlank(accountType)) {
            nextView = views.getView(journey, JourneyViews.SEPARATOR).getModelAndView();
        } else {
            return currentJourney.peek();
        }

        nextView.addObject("userDetails", userDetails);
        if (currentJourney.size() > 0 && StringUtils.equals(currentJourney.peek().getViewName(),
                nextView.getViewName())) {
            return nextView;
        }
        currentJourney.push(nextView);
        return nextView;
    }

    public ModelAndView resolveNextView(HttpServletRequest request, UserDetails userDetails) throws
            SOAFaultException, ViewResolverException {

        final ModelAndView nextView;
        HttpSession session = request.getSession();

        if (null == session.getAttribute("currentJourney")) {
            session.setAttribute("currentJourney", new Stack<ModelAndView>());
        }
        Stack<ModelAndView> currentJourney = (Stack) session.getAttribute("currentJourney");
        final String journey = (String) session.getAttribute("journey");
        final String accountType = userDetails.getAccountType();
        final String currentPage = userDetails.getPageInfo() + JourneyViews.SEPARATOR + accountType;

        OHModelAndView ohModelAndView = views.getView(journey, currentPage);
        if (null == ohModelAndView) {
            throw new ViewResolverException("Journey: " + journey + " CurrentPage: " + currentPage);
        }

        if (ohModelAndView.getUpdateFieldsConsumer() != null) {
            ohModelAndView.getUpdateFieldsConsumer().apply(request, userDetails);
        }
        nextView = ohModelAndView.getModelAndView();
        if (userDetails.getPageInfo().equals("landing")) {
            service.callSubscriberService(userDetails.getMpn(), request);
        }

        nextView.addObject("userDetails", userDetails);
        if (currentJourney.size() > 0 && StringUtils.equals(currentJourney.peek().getViewName(),
                nextView.getViewName())) {
            return nextView;
        }

        currentJourney.push(nextView);
        return nextView;
    }

    public ModelAndView resolvePreviousView(HttpServletRequest request, boolean reload) throws SessionExpiredException {

        final ModelAndView previousView;
        HttpSession session = request.getSession();

        Stack<ModelAndView> currentJourney;
        if ((currentJourney = (Stack) session.getAttribute("currentJourney")) == null) {
            throw new SessionExpiredException("Session has been expired.");
        }

        if (!reload) {
            currentJourney.pop();
        }
        previousView = currentJourney.peek();

        return previousView;
    }

    public ModelAndView resolveSuccessView(HttpServletRequest request, UserDetails userDetails) throws
            Exception {

        HttpSession session = request.getSession();
        final String journey = (String) session.getAttribute("journey");

        if (StringUtils.isBlank(userDetails.getAccountType())) {
            return views.getView(journey, JourneyViews.SEPARATOR).getModelAndView();
        }
        service.callUserAcctService(userDetails.getMpn(), request);
        final String currentPage = userDetails.getPageInfo();
        OHModelAndView ohModelAndView = views.getView(journey, currentPage);
        if (null == ohModelAndView) {
            throw new ViewResolverException("Journey: " + journey + " CurrentPage: " + currentPage);
        }

        if (ohModelAndView.getUpdateFieldsConsumer() != null) {
            ohModelAndView.getUpdateFieldsConsumer().apply(request, userDetails);
        }
        return ohModelAndView.getModelAndView();
    }

}
