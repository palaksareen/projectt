package uk.co.o2.onlinehelp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;

@Controller
@Service
@RequestMapping("/healthcheck")
public class HealthCheckController {

    @Autowired
    private OnlineHelpLogger logger;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {

        logger.accessLog("HealthCheck successfully done.");
        ModelAndView mv = new ModelAndView("healthCheck");
        mv.addObject("status", "up");
        return mv;
    }

}
