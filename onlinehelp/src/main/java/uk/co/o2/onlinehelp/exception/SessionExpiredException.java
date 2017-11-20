package uk.co.o2.onlinehelp.exception;

/**
 * Created by cts1 on 12/7/17.
 */
public class SessionExpiredException extends Exception {
    private static final long serialVersionUID = 1;

    public SessionExpiredException(String message) {
        super(message);
    }

    public SessionExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public SessionExpiredException(Throwable cause) {
        super(cause);
    }
}