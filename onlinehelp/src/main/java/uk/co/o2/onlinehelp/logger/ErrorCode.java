package uk.co.o2.onlinehelp.logger;

public enum ErrorCode {

    UNKNOWN_ERROR("OH_ERR_000", "Unknown error occurred"),
    NOT_O2_CUSTOMER("OH_ERR_001", "The mobile number you entered isn't an O2 number.", "Provided MSISDN is a NonO2 number."),
    SOA_FAULT("OH_ERR_002", "Error response from SOA."),
    GENERIC_FAULT("OH_ERR_003", "Some internal service is down"),
    MSG_HANDLER_ERROR("OH_ERR_004", "Error occurred during SOAP message handler."),
    URL_REDIRECTION_FAILURE("OH_ERR_005", "Failed to redirect to specified URL."),
    VIEW_RESOLUTION_FAILURE("OH_ERR_006", "Failed to resolve view."),
    SOA_TIMEOUT("OH_ERR_007", "SOA TimeOut error."),
    SOA_CERT_ERROR("OH_ERR_008", "Certificate verification failed."),
    SOA_PASSWORD_DECRYPTION_FAILURE("OH_ERR_010", "Failed to decrypt SOA password."),
    KANA_MESSAGE_FAILURE("OH_ERR_011", "Error response from Kana System."),
    SOA_SYSTEM_FAILURE("OH_ERR_012", "Unable to connect to SOA service."),
    CSRF_TOKEN_FAILURE("OH_ERR_013", "Expected CSRF attack attempt for MSISDN ");
/*    SOAP_ERROR("CRM_SOA_ERR_001", "Call to SOAP service failed"),
    SERVICE_TIMEOUT_ERROR("CRM_SOA_ERR_002", "Call to SOAP service timed-out"),
    SOA_HANDLE_MESSAGE_ERROR("CRM_SOA_ERR_003", "Error in handling message");*/

    private String errorCode;
    private String uiErrorMessage;
    private String errorLogMessage;

    ErrorCode(String errorCode, String errorLogMessage) {
        this.errorCode = errorCode;
        this.errorLogMessage = errorLogMessage;
        this.uiErrorMessage = "Oops. Something went wrong.";
    }

    ErrorCode(String errorCode, String uiErrorMessage, String errorLogMessage) {
        this.errorCode = errorCode;
        this.errorLogMessage = errorLogMessage;
        this.uiErrorMessage = uiErrorMessage;
    }

    public String getMessage() {
        return this.uiErrorMessage;
    }

    public String getCodeNMessage() {
        return this.errorCode + " " + this.errorLogMessage;
    }

    public String getCode() {
        return this.errorCode;
    }

}
