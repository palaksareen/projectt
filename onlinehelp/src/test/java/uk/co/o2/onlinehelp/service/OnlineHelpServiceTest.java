package uk.co.o2.onlinehelp.service;

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
import uk.co.o2.onlinehelp.constant.PaymentType;
import uk.co.o2.onlinehelp.model.SubscriberProfileDetails;
import uk.co.o2.onlinehelp.soapclient.soap.SubscriberService;
import uk.co.o2.onlinehelp.util.MsisdnConverter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MsisdnConverter.class)
public class OnlineHelpServiceTest {
    @Mock
    private SubscriberService mockSubscriberService;
    @Mock
    private HttpSession mockSession;
    @Mock
    private HttpServletRequest mockRequest;

    private SubscriberProfileDetails subscriberProfileDetails;
    private Map<String, Object> frhMap;

    @InjectMocks
    private OnlineHelpService onlineHelpService;

    @Before
    public void setUp() {
        onlineHelpService = new OnlineHelpService();
        frhMap = new HashMap<>();
        subscriberProfileDetails = new SubscriberProfileDetails();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void subscriberDetailsWithNullSession() throws Exception {
        String mpn = "07704610259";
        String convertedMpn = "447704610259";
        String spidType = "BTCPrepay";
        frhMap.put("FRH_usertype", spidType);

        PowerMockito.mockStatic(MsisdnConverter.class);
        subscriberProfileDetails.setOperator(Operator.O2);
        subscriberProfileDetails.setChannel("Offline");
        subscriberProfileDetails.setPaymentType(PaymentType.PREPAY);

        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("frhMap")).thenReturn(null).thenReturn(new HashMap<String, Object>());
        PowerMockito.when(MsisdnConverter.getMsisdnForSoaService(mpn)).thenReturn(convertedMpn);
        when(mockSubscriberService.getSubscriberDetails(convertedMpn)).thenReturn(subscriberProfileDetails);
        onlineHelpService.callSubscriberService(mpn, mockRequest);

        verify(mockRequest).getSession();
        verify(mockSession, times(2)).getAttribute("frhMap");
        verify(mockSession).setAttribute(matches("frhMap"), any(HashMap.class));
        verify(mockSubscriberService).getSubscriberDetails(convertedMpn);

        assertEquals(spidType, frhMap.put("FRH_usertype", spidType));
    }

    @Test
    public void subscriberDetailsWithO2Operator() throws Exception {
        String mpn = "07704610259";
        String convertedMpn = "447704610259";
        String spidType = "BTCPrepay";
        frhMap.put("FRH_usertype", spidType);

        PowerMockito.mockStatic(MsisdnConverter.class);
        subscriberProfileDetails.setOperator(Operator.O2);
        subscriberProfileDetails.setChannel("Offline");
        subscriberProfileDetails.setPaymentType(PaymentType.PREPAY);

        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("frhMap")).thenReturn(frhMap);
        PowerMockito.when(MsisdnConverter.getMsisdnForSoaService(mpn)).thenReturn(convertedMpn);
        when(mockSubscriberService.getSubscriberDetails(convertedMpn)).thenReturn(subscriberProfileDetails);
        onlineHelpService.callSubscriberService(mpn, mockRequest);

        verify(mockRequest).getSession();
        verify(mockSession, times(2)).getAttribute("frhMap");
        verify(mockSubscriberService).getSubscriberDetails(convertedMpn);

        assertEquals(spidType, frhMap.put("FRH_usertype", spidType));
    }

    @Test
    public void subscriberDetailsWithNonO2OperatorUMM() throws Exception {
        String mpn = "07704610222";
        String convertedMpn = "447704610222";
        String spidType = "Browser";

        PowerMockito.mockStatic(MsisdnConverter.class);
        subscriberProfileDetails.setOperator(Operator.NONO2);
        subscriberProfileDetails.setChannel("Offline");
        subscriberProfileDetails.setPaymentType(PaymentType.UNKNOWN);

        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn("handsetunlockingform");
        when(mockSession.getAttribute("frhMap")).thenReturn(frhMap);
        PowerMockito.when(MsisdnConverter.getMsisdnForSoaService(mpn)).thenReturn(convertedMpn);
        when(mockSubscriberService.getSubscriberDetails(convertedMpn)).thenReturn(subscriberProfileDetails);
        onlineHelpService.callSubscriberService(mpn, mockRequest);

        verify(mockRequest).getSession();
        verify(mockSession, times(2)).getAttribute("frhMap");
        verify(mockSubscriberService).getSubscriberDetails(convertedMpn);

        assertEquals(spidType, frhMap.get("FRH_usertype"));
    }

    @Test
    public void subscriberDetailsWithNonO2OperatorKMEN() throws Exception {
        String mpn = "07704610222";
        String convertedMpn = "447704610222";
        String spidType = "Browser";

        PowerMockito.mockStatic(MsisdnConverter.class);
        subscriberProfileDetails.setOperator(Operator.NONO2);
        subscriberProfileDetails.setChannel("Offline");
        subscriberProfileDetails.setPaymentType(PaymentType.UNKNOWN);

        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn("migrateinform");
        when(mockSession.getAttribute("frhMap")).thenReturn(frhMap);
        PowerMockito.when(MsisdnConverter.getMsisdnForSoaService(mpn)).thenReturn(convertedMpn);
        when(mockSubscriberService.getSubscriberDetails(convertedMpn)).thenReturn(subscriberProfileDetails);
        onlineHelpService.callSubscriberService(mpn, mockRequest);

        verify(mockRequest).getSession();
        verify(mockSession, times(2)).getAttribute("frhMap");
        verify(mockSubscriberService).getSubscriberDetails(convertedMpn);

        assertEquals(spidType, frhMap.get("FRH_usertype"));
    }
}
