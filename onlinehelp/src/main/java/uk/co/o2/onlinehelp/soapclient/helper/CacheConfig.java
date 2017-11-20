package uk.co.o2.onlinehelp.soapclient.helper;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import uk.co.o2.onlinehelp.model.SubscriberProfileDetails;

@Component
public class CacheConfig implements InitializingBean {

    @Autowired
    private OnlineHelpLogger logger;

    private Ehcache cache;

    private void setCacheProperties() throws Exception {
        try {
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setCacheProperties();
        CacheManager cm = CacheManager.getInstance();
        cache = cm.getEhcache("onlineHelpCache");
        assert cache != null;
    }

    public void put(String mpn, SubscriberProfileDetails subscriber) {
        cache.put(new Element(mpn, subscriber));
    }

    public SubscriberProfileDetails get(String mpn) {
        Element element = cache.get(mpn);
        SubscriberProfileDetails subscriber = null;
        if (element != null) {
            logger.accessLog("Cache entry found for " + mpn + " reading from cache");
            subscriber = (SubscriberProfileDetails) element.getObjectValue();
        }
        return subscriber;
    }

}
