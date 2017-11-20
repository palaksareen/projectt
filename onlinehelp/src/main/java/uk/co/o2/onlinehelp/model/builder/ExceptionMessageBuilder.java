package uk.co.o2.onlinehelp.model.builder;

import uk.co.o2.soa.coredata_1.SOAFaultType;
import uk.co.o2.soa.subscriberservice_2.GetSubscriberProfileFault;
import uk.co.o2.soa.useraccountsservice_1.SearchOnlineAccounts1Fault;

public class ExceptionMessageBuilder {

    private String message = "";

    public ExceptionMessageBuilder forException(GetSubscriberProfileFault fault) {

        final SOAFaultType faultInfo = fault.getFaultInfo();
        message = getSOAFaultMessage(faultInfo);
        return this;
    }

    public ExceptionMessageBuilder forException(SearchOnlineAccounts1Fault fault) {

        final SOAFaultType faultInfo = fault.getFaultInfo();
        message = getSOAFaultMessage(faultInfo);
        return this;
    }

    public String build() {
        return message;
    }

    private String getSOAFaultMessage(SOAFaultType faultInfo) {
        StringBuilder messageBuilder = new StringBuilder("");
        messageBuilder.append("SOATransactioID: ");
        messageBuilder.append(faultInfo.getSOATransactionID());
        messageBuilder.append(", SOAFaultCode: ");
        messageBuilder.append(faultInfo.getSOAFaultCode());
        messageBuilder.append(", FaultDescription: ");
        messageBuilder.append(faultInfo.getFaultDescription());
        return messageBuilder.toString();
    }

}
