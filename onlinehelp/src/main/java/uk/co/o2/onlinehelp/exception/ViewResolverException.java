package uk.co.o2.onlinehelp.exception;

public class ViewResolverException extends Exception {
    private static final long serialVersionUID = 1;

    private static final String DEFAULT_MESSAGE = "Failed to resolve view.";

    public ViewResolverException(String message) {
        super(message);
    }

    public ViewResolverException() {
        super(DEFAULT_MESSAGE);
    }
}