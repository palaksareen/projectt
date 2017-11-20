package uk.co.o2.onlinehelp.exception;

public class SOAFaultException extends Exception {
    private static final long serialVersionUID = 1;

    public SOAFaultException(String message) {
        super(message);
    }

    public SOAFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public SOAFaultException(Throwable cause) {
        super(cause);
    }
}
