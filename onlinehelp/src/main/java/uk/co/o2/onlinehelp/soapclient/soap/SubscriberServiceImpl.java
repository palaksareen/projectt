package uk.co.o2.onlinehelp.soapclient.soap;

import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import uk.co.o2.onlinehelp.model.SubscriberProfileDetails;
import uk.co.o2.onlinehelp.model.builder.ExceptionMessageBuilder;
import uk.co.o2.onlinehelp.model.builder.SubscriberProfileBuilder;
import uk.co.o2.onlinehelp.soapclient.helper.CacheConfig;
import uk.co.o2.onlinehelp.soapclient.helper.SoaServiceFactoryClient;
import uk.co.o2.soa.subscriberdata_2.SubscriberProfileType;
import uk.co.o2.soa.subscriberservice_2.GetSubscriberProfileFault;
import uk.co.o2.soa.subscriberservice_2.SubscriberPort;

@Component
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private OnlineHelpLogger logger;

    @Autowired
    private CacheConfig cache;

    @Autowired
    private SoaServiceFactoryClient soaServiceFactoryClient;

    @Timed
    public SubscriberProfileDetails getSubscriberProfile(String mpn) throws SOAFaultException {
        SubscriberProfileDetails subscriberProfileDetails;

        try {
            SubscriberPort port = soaServiceFactoryClient.getSubscriberPort();
            SubscriberProfileType subscriberProfile = port.getSubscriberProfile(mpn);
            subscriberProfileDetails = new SubscriberProfileBuilder(subscriberProfile).build();
        } catch (GetSubscriberProfileFault e) {
            if (null != e.getFaultInfo()) {
                throw new SOAFaultException(new ExceptionMessageBuilder().forException(e).build(), e);
            }
            throw new SOAFaultException(e);
        }

        return subscriberProfileDetails;
    }

    @Timed
    @Override
    public SubscriberProfileDetails getSubscriberDetails(String mpn) throws SOAFaultException {
        SubscriberProfileDetails subscriberProfileDetails = cache.get(mpn);
        if (subscriberProfileDetails == null) {
            logger.accessLog("Cache missed for " + mpn + " reading from soa call");
            subscriberProfileDetails = getSubscriberProfile(mpn);
            cache.put(mpn, subscriberProfileDetails);
        }
        return subscriberProfileDetails;
    }

}
