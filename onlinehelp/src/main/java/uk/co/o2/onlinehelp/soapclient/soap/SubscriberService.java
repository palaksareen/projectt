package uk.co.o2.onlinehelp.soapclient.soap;

import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.model.SubscriberProfileDetails;

public interface SubscriberService {
    SubscriberProfileDetails getSubscriberDetails(String mpn) throws SOAFaultException;

}
