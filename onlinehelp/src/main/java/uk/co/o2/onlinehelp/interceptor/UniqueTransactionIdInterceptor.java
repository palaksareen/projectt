package uk.co.o2.onlinehelp.interceptor;


import org.apache.commons.lang.StringUtils;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import uk.co.o2.onlinehelp.exception.CsrfTokenException;
import uk.co.o2.onlinehelp.logger.ErrorCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Component
public class UniqueTransactionIdInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws  Exception {

        HttpSession session = request.getSession();
        Object requestId = session.getAttribute("UniqueTransactionId");
        if (null == requestId) {
            requestId = UUID.randomUUID().toString();
            session.setAttribute("UniqueTransactionId", requestId);
        }
        else if(request.getMethod().equals("POST")){
            String csrfTokenParameter = request.getParameter("csrfToken");
            if(!StringUtils.equals((String)requestId,csrfTokenParameter))
            {
                throw new CsrfTokenException(ErrorCode.CSRF_TOKEN_FAILURE.getCodeNMessage());
            }
        }
        MDC.put("RequestId", requestId.toString());

        return true;
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception  {
        response.setHeader("Cache-Control", "no-cache");
        response.addHeader("X-Frame-Options", "SAMEORIGIN");
        response.addHeader("X-Content-Type-Options", "nosniff");
        response.addHeader("X-XSS-Protection", "1; mode=block");
        response.addHeader("Strict-Transport-Security", "max-age=63072000; includeSubDomains; preload");
    }
}
