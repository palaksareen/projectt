package uk.co.o2.onlinehelp.exception;

public class SOAException extends Exception {
    private static final long serialVersionUID = 1;

    public SOAException(String message) {
        super(message);
    }

    public SOAException(String message, Throwable cause) {
        super(message, cause);
    }

    public SOAException(Throwable cause) {
        super(cause);
    }
}
