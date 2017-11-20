
package uk.co.o2.onlinehelp.soapclient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import uk.co.o2.onlinehelp.constant.Operator;
import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import uk.co.o2.onlinehelp.model.SubscriberProfileDetails;
import uk.co.o2.onlinehelp.model.builder.SubscriberProfileBuilder;
import uk.co.o2.onlinehelp.soapclient.helper.CacheConfig;
import uk.co.o2.onlinehelp.soapclient.helper.SoaServiceFactoryClient;
import uk.co.o2.onlinehelp.soapclient.soap.SubscriberServiceImpl;
import uk.co.o2.onlinehelp.util.DynamicProperties;
import uk.co.o2.soa.coredata_1.PaymentCategoryType;
import uk.co.o2.soa.subscriberdata_2.SubscriberProfileType;
import uk.co.o2.soa.subscriberservice_2.GetSubscriberProfileFault;
import uk.co.o2.soa.subscriberservice_2.SubscriberPort;

import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({PaymentCategoryType.class, DynamicProperties.class})
public class SubscriberServiceImplTest {

    @Mock
    SubscriberProfileDetails mockSubscriberProfileDetails;
    @Mock
    SubscriberPort mockPort;
    @Mock
    SubscriberProfileType mockSubscriberProfile;
    @Mock
    SubscriberProfileBuilder mockSubscriberProfileBuilder;
    @Mock
    CacheConfig mockCache;
    @Mock
    OnlineHelpLogger mocklogger;
    @Mock
    private SoaServiceFactoryClient mockSoaServiceFactoryClient;

    @InjectMocks
    private SubscriberServiceImpl subscriberServiceImpl;

    @Before
    public void setup() throws Exception {

        subscriberServiceImpl = new SubscriberServiceImpl();

        MockitoAnnotations.initMocks(this);
    }

    @Test()
    public void getSubscriberDetailsOutsideCache() {
        String mpn = "447704610259";
        PaymentCategoryType mockpayment = PowerMockito.mock(PaymentCategoryType.class);
        PowerMockito.mockStatic(DynamicProperties.class);

        try {
            when(mockSubscriberProfileDetails.getOperator()).thenReturn(Operator.O2);
            when(mockCache.get(mpn)).thenReturn(null);
            when(mockSoaServiceFactoryClient.getSubscriberPort()).thenReturn(mockPort);
            when(mockPort.getSubscriberProfile(mpn)).thenReturn(mockSubscriberProfile);

            when(mockSubscriberProfile.getChannel()).thenReturn("Offline");
            when(mockSubscriberProfile.getOperator()).thenReturn("O2");
            when(mockSubscriberProfile.getSubscriberID()).thenReturn(mpn);
            when(mockSubscriberProfile.getPaymentCategory()).thenReturn(mockpayment);
            when(mockpayment.toString()).thenReturn("PREPAY");

            PowerMockito.whenNew(SubscriberProfileBuilder.class).withArguments(mockSubscriberProfile).thenReturn(mockSubscriberProfileBuilder);
            when(mockSubscriberProfileBuilder.build()).thenReturn(mockSubscriberProfileDetails);

            mockSubscriberProfileDetails = subscriberServiceImpl.getSubscriberDetails(mpn);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        verify(mockCache).get(mpn);
        verify(mockCache).put(mpn, mockSubscriberProfileDetails);
        verify(mocklogger).accessLog("Cache missed for " + mpn + " reading from soa call");
        verifyNoMoreInteractions(mockCache);
    }

    @Test
    public void getSubscriberDetailsNotO2Customer() throws SOAFaultException, GetSubscriberProfileFault {
        String mpn = "447704610200";
        PaymentCategoryType mockpayment = PowerMockito.mock(PaymentCategoryType.class);
        PowerMockito.mockStatic(DynamicProperties.class);

        when(mockSubscriberProfileDetails.getOperator()).thenReturn(Operator.O2);
        when(mockCache.get(mpn)).thenReturn(null);
        when(mockSoaServiceFactoryClient.getSubscriberPort()).thenReturn(mockPort);
        when(mockPort.getSubscriberProfile(mpn)).thenReturn(mockSubscriberProfile);

        when(mockSubscriberProfile.getChannel()).thenReturn("Offline");
        when(mockSubscriberProfile.getOperator()).thenReturn("NONO2");
        when(mockSubscriberProfile.getSubscriberID()).thenReturn(mpn);
        when(mockSubscriberProfile.getPaymentCategory()).thenReturn(mockpayment);
        when(mockpayment.toString()).thenReturn("PREPAY");
        try {
            PowerMockito.whenNew(SubscriberProfileBuilder.class).withArguments(mockSubscriberProfile).thenReturn(mockSubscriberProfileBuilder);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        when(mockSubscriberProfileBuilder.build()).thenReturn(mockSubscriberProfileDetails);

        mockSubscriberProfileDetails = subscriberServiceImpl.getSubscriberDetails(mpn);

    }


    @Test()
    public void getSubscriberDetailsInsideCache() {
        String mpn = "447704610259";
        try {
            when(mockCache.get(mpn)).thenReturn(mockSubscriberProfileDetails);

            mockSubscriberProfileDetails = subscriberServiceImpl.getSubscriberDetails(mpn);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        verify(mockCache).get(mpn);
        verify(mockCache).get(mpn);
        verifyNoMoreInteractions(mockCache);
    }
}
