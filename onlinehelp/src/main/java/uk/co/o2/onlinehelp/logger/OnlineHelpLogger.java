package uk.co.o2.onlinehelp.logger;

public class OnlineHelpLogger {

    private AccessLogger accessLogger;
    private ErrorLogger errorLogger;
    private OpsLogger opsLogger;

    public void opsLog(String... message) {
        opsLogger.log(message);
    }

    public void accessLog(String... message) {
        accessLogger.log(message);
    }

    public void errorLog(Throwable t, String... msg) {
        errorLogger.log(t, msg);
        accessLogger.log(msg);
    }

    public void setAccessLogger(AccessLogger accessLogger) {
        this.accessLogger = accessLogger;
    }

    public void setErrorLogger(ErrorLogger errorLogger) {
        this.errorLogger = errorLogger;
    }

    public void setOpsLogger(OpsLogger opsLogger) {
        this.opsLogger = opsLogger;
    }
}
