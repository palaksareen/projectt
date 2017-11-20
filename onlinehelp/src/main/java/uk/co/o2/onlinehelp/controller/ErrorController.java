package uk.co.o2.onlinehelp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.model.UserDetails;
import uk.co.o2.onlinehelp.soapclient.helper.DataProcessor;
import uk.co.o2.onlinehelp.util.JourneyViews;

import javax.servlet.http.HttpServletRequest;
import java.util.Stack;

@Controller
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ModelAndView handleHttpError(HttpServletRequest request) {
        int httpErrorCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Stack<ModelAndView> currentJourney = new Stack<>();
        request.getSession().setAttribute("currentJourney", currentJourney);
        UserDetails userDetails = (UserDetails) request.getSession().getAttribute("userDetails");
        if (null == userDetails) {
            // This happens when session expires.
            userDetails = new UserDetails();
            userDetails.setJourney(request.getParameter("journey"));
        }
        ModelAndView mav = new ModelAndView();
        if (httpErrorCode == 500) {
            mav.setViewName("errorPage500");
        } else {
            mav.setViewName("errorPage404");
        }

        ModelAndView stackMav = new ModelAndView(JourneyViews.LANDING_PAGE);
        stackMav.addObject("htmlDecoder", new DataProcessor());
        stackMav.addObject("journey", userDetails.getJourney());
        currentJourney.push(stackMav);

        mav.addObject("journey", userDetails.getJourney());
        return mav;
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }

}
