package uk.co.o2.onlinehelp.soapclient.soap;

import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.model.UserAcctDetails;

public interface UserAcctService {
    UserAcctDetails getUserAcctDetails(String mpn) throws SOAFaultException;
}
