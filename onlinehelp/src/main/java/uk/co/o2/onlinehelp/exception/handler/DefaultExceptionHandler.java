package uk.co.o2.onlinehelp.exception.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import uk.co.o2.onlinehelp.logger.ErrorCode;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;

import javax.servlet.ServletException;
import java.io.IOException;

@ControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE)
public class DefaultExceptionHandler {

    @Autowired
    private OnlineHelpLogger logger;

    @ExceptionHandler({Exception.class})
    public void handleAll(Exception ex) throws Exception {
        logger.errorLog(ex, ErrorCode.UNKNOWN_ERROR.getCodeNMessage());
        throw ex;
    }

    @ExceptionHandler({ServletException.class, IOException.class})
    public void handleRedirectionFailure(Exception ex) throws Exception {
        logger.errorLog(ex, ErrorCode.URL_REDIRECTION_FAILURE.getCodeNMessage());
        throw ex;
    }

}
