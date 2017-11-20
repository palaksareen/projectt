package uk.co.o2.onlinehelp.exception.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.exception.*;
import uk.co.o2.onlinehelp.logger.ErrorCode;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import javax.net.ssl.SSLHandshakeException;
import javax.servlet.http.HttpServletRequest;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.EmptyStackException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class OnlineHelpExceptionHandler {

    @Autowired
    private OnlineHelpLogger logger;

    @ExceptionHandler(SOAFaultException.class)
    public ModelAndView handleSOAFaultException(HttpServletRequest request, SOAFaultException ex) {
        logger.errorLog(ex, ErrorCode.SOA_FAULT.getCodeNMessage());
        ModelAndView mav = ExceptionViewHandler.getModelAndViewForException(request, Arrays.asList(ErrorCode.SOA_FAULT));
        return mav;
    }

    @ExceptionHandler({SOAException.class})
    public void handleSOAException(SOAException ex) throws Exception {
        logger.errorLog(ex, ErrorCode.SOA_SYSTEM_FAILURE.getCodeNMessage());
        throw ex;
    }

    @ExceptionHandler(EmptyStackException.class)
    public ModelAndView handleEmptyStackException(HttpServletRequest request, EmptyStackException ex) {
        logger.errorLog(ex, ErrorCode.VIEW_RESOLUTION_FAILURE.getCodeNMessage());
        ModelAndView mav = ExceptionViewHandler.getModelAndViewForException(request, null);
        return mav;
    }

    @ExceptionHandler(SessionExpiredException.class)
    public ModelAndView handleSessionExpiredException(HttpServletRequest request, SessionExpiredException ex) {
        logger.errorLog(ex, ErrorCode.VIEW_RESOLUTION_FAILURE.getCodeNMessage());
        ModelAndView mav = ExceptionViewHandler.getModelAndViewForException(request, null);
        return mav;
    }


    @ExceptionHandler(ViewResolverException.class)
    public ModelAndView handleViewResolverException(HttpServletRequest request, ViewResolverException ex) {
        logger.errorLog(ex, ErrorCode.VIEW_RESOLUTION_FAILURE.getCodeNMessage());
        ModelAndView mav = ExceptionViewHandler.getModelAndViewForException(request, null);
        return mav;
    }

    @ExceptionHandler(SocketTimeoutException.class)
    public ModelAndView handleSOATimeoutException(HttpServletRequest request, Exception ex) {
        logger.errorLog(ex, ErrorCode.SOA_TIMEOUT.getCodeNMessage());
        ModelAndView mav = ExceptionViewHandler.getModelAndViewForException(request, Arrays.asList(ErrorCode.SOA_TIMEOUT));
        return mav;
    }

    @ExceptionHandler({SocketException.class, SSLHandshakeException.class})
    public void handleSocketException(Exception ex) throws Exception {
        logger.errorLog(ex, ErrorCode.SOA_CERT_ERROR.getCodeNMessage());
        throw ex;
    }

    @ExceptionHandler(KanaException.class)
    public ModelAndView handleKanaException(HttpServletRequest request, Exception ex) {
        logger.errorLog(ex, ErrorCode.KANA_MESSAGE_FAILURE.getCodeNMessage());
        ModelAndView mav = ExceptionViewHandler.getModelAndViewForKanaException(request, Arrays.asList(ErrorCode.KANA_MESSAGE_FAILURE));
        return mav;
    }

    @ExceptionHandler(CsrfTokenException.class)
    public ModelAndView handleCsrfTokenException(HttpServletRequest request, CsrfTokenException ex) {
        logger.accessLog(ErrorCode.CSRF_TOKEN_FAILURE.getCodeNMessage() +request.getParameter("mpn") );
        ModelAndView mav = new ModelAndView();
        mav.setViewName("errorPage500");
        return mav;
    }
}
