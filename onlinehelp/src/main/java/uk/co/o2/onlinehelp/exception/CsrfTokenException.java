package uk.co.o2.onlinehelp.exception;

/**
 * Created by cts1 on 9/6/2017.
 */
public class CsrfTokenException extends Exception{

    private static final long serialVersionUID = 1;

    public CsrfTokenException(String message) {
        super(message);
    }

    public CsrfTokenException(String message, Throwable cause) {
        super(message, cause);
    }

}
