package uk.co.o2.onlinehelp.exception;

/**
 * Created by cts1 on 4/7/17.
 */
public class KanaException extends Exception {
    private static final long serialVersionUID = 1;

    public KanaException(String message) {
        super(message);
    }

    public KanaException(String message, Throwable cause) {
        super(message, cause);
    }

    public KanaException(Throwable cause) {
        super(cause);
    }
}