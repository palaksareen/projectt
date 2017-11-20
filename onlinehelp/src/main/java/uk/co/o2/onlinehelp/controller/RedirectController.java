package uk.co.o2.onlinehelp.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uk.co.o2.onlinehelp.util.DynamicProperties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping(value = "/")
public class RedirectController {

    @RequestMapping(value = "/")
    public String redirect(@RequestParam(value = "route", required = false) String route) throws IOException, ServletException {
        String redirectUrl;

        if (StringUtils.equals(route, "unlocking")) {
            redirectUrl = DynamicProperties.getProperty("redirect.unlock.url");
        } else if (StringUtils.equals(route, "port_migrate")) {
            redirectUrl = DynamicProperties.getProperty("redirect.portmigrate.url");
        } else {
            redirectUrl = DynamicProperties.getProperty("redirect.default.url");
        }
        return "redirect:" + redirectUrl;
    }

}
