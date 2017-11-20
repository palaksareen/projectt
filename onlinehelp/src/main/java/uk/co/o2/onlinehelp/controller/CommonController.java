package uk.co.o2.onlinehelp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.exception.SessionExpiredException;
import uk.co.o2.onlinehelp.exception.ViewResolverException;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import uk.co.o2.onlinehelp.model.AdditionalInfo;
import uk.co.o2.onlinehelp.model.SecurityDetails;
import uk.co.o2.onlinehelp.model.UserDetails;
import uk.co.o2.onlinehelp.util.DynamicProperties;
import uk.co.o2.onlinehelp.util.JourneyViews;
import uk.co.o2.onlinehelp.util.OHViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping(value = "/")
public class CommonController extends AbstractController {

    @Autowired
    private OHViewResolver viewResolver;

    @Autowired
    private OnlineHelpLogger logger;

    @RequestMapping(value = "/handsetunlockingformhome", method = RequestMethod.GET)
    public ModelAndView unlockhome(@ModelAttribute("userDetails") UserDetails userDetails,
                                   @ModelAttribute("securityDetails") SecurityDetails securityDetails,
                                   HttpServletRequest request, SessionStatus sessionStatus)
            throws SOAFaultException, ViewResolverException {

        userDetails.setSecurityDetails(securityDetails);
        userDetails = handleJourneySwitch(request, "handsetunlockingform", userDetails, sessionStatus);
        handleReferer(request, userDetails);
        userDetails.setCaseTitle("Handset Unlocking Form");
        logger.accessLog("REQUEST: " + userDetails);
        ModelAndView mav = viewResolver.resolveRefreshView(request, userDetails);
        addCommonObjects(mav, request, "handsetunlockingform");
        return mav;
    }

    @RequestMapping(value = "/migrateinformhome", method = RequestMethod.GET)
    public ModelAndView kmenhome(@ModelAttribute("userDetails") UserDetails userDetails,
                                 @ModelAttribute("securityDetails") SecurityDetails securityDetails,
                                 HttpServletRequest request, SessionStatus sessionStatus)
            throws SOAFaultException, ViewResolverException {

        userDetails.setSecurityDetails(securityDetails);
        userDetails = handleJourneySwitch(request, "migrateinform", userDetails, sessionStatus);
        handleReferer(request, userDetails);
        userDetails.setCaseTitle("Port/Migrate In Form");
        logger.accessLog("REQUEST: " + userDetails);
        ModelAndView mav = viewResolver.resolveRefreshView(request, userDetails);
        addCommonObjects(mav, request, "migrateinform");
        return mav;
    }

    @RequestMapping(value = "/handsetunlockingform", method = RequestMethod.POST)
    public ModelAndView unlock(@ModelAttribute("userDetails") UserDetails userDetails,
                               @ModelAttribute("securityDetails") SecurityDetails securityDetails,
                               HttpServletRequest request, SessionStatus sessionStatus)
            throws SOAFaultException, ViewResolverException {

        userDetails.setSecurityDetails(securityDetails);
        userDetails = handleJourneySwitch(request, "handsetunlockingform", userDetails, sessionStatus);
        handleReferer(request, userDetails);
        userDetails.setCaseTitle("Handset Unlocking Form");
        logger.accessLog("REQUEST: " + userDetails);
        ModelAndView mav = viewResolver.resolveNextView(request, userDetails);
        addCommonObjects(mav, request, "handsetunlockingform");
        return mav;
    }

    @RequestMapping(value = "/migrateinform", method = RequestMethod.POST)
    public ModelAndView kmen(@ModelAttribute("userDetails") UserDetails userDetails,
                             @ModelAttribute("securityDetails") SecurityDetails securityDetails,
                             HttpServletRequest request, SessionStatus sessionStatus)
            throws SOAFaultException, ViewResolverException {


        userDetails.setSecurityDetails(securityDetails);
        userDetails = handleJourneySwitch(request, "migrateinform", userDetails, sessionStatus);
        handleReferer(request, userDetails);
        userDetails.setCaseTitle("Port/Migrate In Form");
        logger.accessLog("REQUEST: " + userDetails);
        ModelAndView mav = viewResolver.resolveNextView(request, userDetails);
        addCommonObjects(mav, request, "migrateinform");
        return mav;
    }

    @RequestMapping(value = "/submit")
    public ModelAndView submit(@ModelAttribute("userDetails") UserDetails userDetails,
                               @ModelAttribute("additionalInfo") AdditionalInfo additionalInfo,
                               HttpServletRequest request, SessionStatus sessionStatus) throws
            Exception {

        userDetails.setAdditionalInfo(additionalInfo);
        logger.accessLog("SUBMIT REQUEST: " + userDetails);
        final String journey = (String) request.getSession().getAttribute("journey");
        ModelAndView successView = viewResolver.resolveSuccessView(request, userDetails);
        killSession(request, sessionStatus);
        successView.addObject("journey", journey);
        return successView;
    }

    @RequestMapping(value = "/cancel")
    public ModelAndView handleCancel(@ModelAttribute("userDetails") UserDetails userDetails,
                                     HttpServletRequest request, SessionStatus sessionStatus) throws IOException {
        String referer = userDetails.getReferer();
        final String journey = (String) request.getSession().getAttribute("journey");
        killSession(request, sessionStatus);

        if (null == referer) {
            if ("migrateinform".equals(journey)) {
                referer = DynamicProperties.getProperty("redirect.portmigrate.url");
            } else {
                referer = DynamicProperties.getProperty("redirect.unlock.url");
            }
        }
        ModelAndView mav = new ModelAndView(JourneyViews.CANCEL_PAGE, "referer", referer);
        return mav;
    }


    @RequestMapping(value = "/previous")
    public ModelAndView handlePrevious(@ModelAttribute("userDetails") UserDetails userDetails,
                                       @RequestParam(value = "reload", required = false) boolean reload,
                                       HttpServletRequest request) throws SessionExpiredException {
        ModelAndView previousView = viewResolver.resolvePreviousView(request, reload);
        previousView.addObject("userDetails", userDetails);
        Object csrfToken = request.getSession().getAttribute("UniqueTransactionId");
        previousView.addObject("csrfToken", csrfToken);
        return previousView;

    }

    protected void handleReferer(HttpServletRequest request, UserDetails userDetails) {
        String referer = request.getHeader("REFERER");
        if (referer != null && (userDetails.getReferer() == null)) {
            userDetails.setReferer(referer);
        }
    }

    private void addCommonObjects(ModelAndView mav, HttpServletRequest request, String journey) {
        Object csrfToken = request.getSession().getAttribute("UniqueTransactionId");
        mav.addObject("journey", journey);
        mav.addObject("csrfToken", csrfToken);
    }

    private UserDetails handleJourneySwitch(HttpServletRequest request, String journey,
                                            UserDetails userDetails, SessionStatus sessionStatus) {
        HttpSession session = request.getSession();
        if (null != session.getAttribute("journey") &&
                !session.getAttribute("journey").equals(journey)) {
            userDetails = createUserDetails();
            sessionStatus.setComplete();
            session.invalidate();
            session = request.getSession(true);
        }
        session.setAttribute("journey", journey);
        return userDetails;
    }

    protected void killSession(HttpServletRequest request, SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        HttpSession session = request.getSession();
        session.removeAttribute("UniqueTransactionId");
        session.removeAttribute("currentJourney");
        session.removeAttribute("journey");
        session.removeAttribute("sessionUserDetails");
        session.removeAttribute("frhMap");
    }

}
