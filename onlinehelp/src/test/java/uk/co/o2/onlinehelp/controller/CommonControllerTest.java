package uk.co.o2.onlinehelp.controller;

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
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.exception.SessionExpiredException;
import uk.co.o2.onlinehelp.exception.ViewResolverException;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import uk.co.o2.onlinehelp.model.AdditionalInfo;
import uk.co.o2.onlinehelp.model.SecurityDetails;
import uk.co.o2.onlinehelp.model.UserDetails;
import uk.co.o2.onlinehelp.util.DynamicProperties;
import uk.co.o2.onlinehelp.util.OHViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({CommonController.class, DynamicProperties.class})
public class CommonControllerTest {

    private UserDetails userDetails;
    private SecurityDetails securityDetails;
    private AdditionalInfo additionalInfo;

    @Mock
    private HttpServletRequest mockRequest;
    @Mock
    private HttpServletResponse mockResponse;
    @Mock
    private SessionStatus mockStatus;
    @Mock
    private HttpSession mockSession;
    @Mock
    private OnlineHelpLogger mockLogger;
    @Mock
    private OHViewResolver mockViewResolver;
    @Mock
    private ModelAndView mockModel;

    @InjectMocks
    private CommonController commonController;

    @Before
    public void setUp() {
        userDetails = new UserDetails();
        securityDetails = new SecurityDetails();
        additionalInfo = new AdditionalInfo();
        commonController = new CommonController();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void unlockScreenWithHandleRefererNullTest() {
        userDetails.setReferer("/handsetunlockingform");
        String journey = "handsetunlockingform";
        Object csrfToken = "0000-00000-0000-00000";
        when(mockRequest.getHeader("REFERER")).thenReturn(null);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn("handsetunlockingform");
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn("0000-00000-0000-00000");

        try {
            when(mockViewResolver.resolveNextView(mockRequest, userDetails)).thenReturn(mockModel);
            commonController.unlock(userDetails, securityDetails, mockRequest,mockStatus);
        } catch (SOAFaultException | ViewResolverException e) {
            Assert.fail(e.getMessage());
        }
        verify(mockLogger, times(1)).accessLog("REQUEST: " + userDetails);
        verify(mockRequest, times(1)).getHeader("REFERER");
        verify(mockRequest, times(2)).getSession();
        verify(mockModel, times(1)).addObject("journey", journey);
        verify(mockSession, times(1)).setAttribute("journey", journey);
        verify(mockModel, times(1)).addObject("csrfToken", csrfToken);
        verify(mockSession, times(3)).getAttribute(anyString());
        verifyNoMoreInteractions(mockRequest);
        verifyNoMoreInteractions(mockModel);
        verifyNoMoreInteractions(mockLogger);

        assertNotNull("SecurityDetails should not be null", userDetails.getSecurityDetails());
        assertEquals("Case Title is not what expected.", "Handset Unlocking Form", userDetails.getCaseTitle());
        assertEquals("REFERER is not what expected.", "/handsetunlockingform", userDetails.getReferer());
    }

    @Test
    public void unlockScreenWithHandleRefererNotNullTest() {
        String referer = "/handsetunlockingform";
        String journey = "handsetunlockingform";
        Object csrfToken = "0000-00000-0000-00000";
        userDetails.setReferer(null);
        when(mockRequest.getHeader("REFERER")).thenReturn(referer);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn("handsetunlockingform");
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn("0000-00000-0000-00000");

        try {
            when(mockViewResolver.resolveNextView(mockRequest, userDetails)).thenReturn(mockModel);
            commonController.unlock(userDetails, securityDetails, mockRequest,mockStatus);
        } catch (SOAFaultException | ViewResolverException e) {
            Assert.fail(e.getMessage());
        }

        verify(mockLogger, times(1)).accessLog("REQUEST: " + userDetails);
        verify(mockRequest, times(2)).getSession();
        verify(mockRequest, times(1)).getHeader("REFERER");
        verify(mockSession, times(1)).setAttribute("journey", journey);
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockModel, times(1)).addObject("journey", journey);
        verify(mockModel, times(1)).addObject("csrfToken", csrfToken);
        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockRequest);
        verifyNoMoreInteractions(mockModel);
        verifyNoMoreInteractions(mockLogger);

        assertNotNull("SecurityDetails should not be null", userDetails.getSecurityDetails());
        assertEquals("Case Title is not what expected.", "Handset Unlocking Form", userDetails.getCaseTitle());
        assertEquals("REFERER is not what expected.", referer, userDetails.getReferer());
    }

    @Test
    public void kmenWithHandleRefererNullTest() {
        userDetails.setReferer("/migrateinform");
        String journey = "migrateinform";
        Object csrfToken = "0000-00000-0000-00000";
        when(mockRequest.getHeader("REFERER")).thenReturn(null);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn("migrateinform");
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn("0000-00000-0000-00000");
        try {
            when(mockViewResolver.resolveNextView(mockRequest, userDetails)).thenReturn(mockModel);
            commonController.kmen(userDetails, securityDetails, mockRequest,mockStatus);
        } catch (SOAFaultException | ViewResolverException e) {
            Assert.fail(e.getMessage());
        }
        verify(mockLogger, times(1)).accessLog("REQUEST: " + userDetails);
        verify(mockRequest, times(2)).getSession();
        verify(mockRequest, times(1)).getHeader("REFERER");
        verify(mockSession, times(1)).setAttribute("journey", journey);
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockModel, times(1)).addObject("journey", journey);
        verify(mockModel, times(1)).addObject("csrfToken", csrfToken);

        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockRequest);
        verifyNoMoreInteractions(mockModel);
        verifyNoMoreInteractions(mockLogger);

        assertNotNull("SecurityDetails should not be null", userDetails.getSecurityDetails());
    }

    @Test
    public void journeySwitchTest() {
        String journey = "migrateinform";
        Object csrfToken = "0000-00000-0000-00000";
        UserDetails expectedUserDetails = new UserDetails();
        expectedUserDetails.setSecurityDetails(securityDetails);
        expectedUserDetails.setAdditionalInfo(additionalInfo);
        expectedUserDetails.setCaseTitle("Port/Migrate In Form");

        when(mockRequest.getHeader("REFERER")).thenReturn(null);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockRequest.getSession(true)).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn("handsetunlockingform");
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn("0000-00000-0000-00000");
        try {
            when(mockViewResolver.resolveNextView(any(HttpServletRequest.class), any(UserDetails.class))).thenReturn(mockModel);
            commonController.kmen(userDetails, securityDetails, mockRequest,mockStatus);
        } catch (SOAFaultException | ViewResolverException e) {
            Assert.fail(e.getMessage());
        }
        verify(mockLogger, times(1)).accessLog("REQUEST: " + expectedUserDetails);
        verify(mockRequest, times(2)).getSession();
        verify(mockRequest, times(1)).getSession(true);
        verify(mockRequest, times(1)).getHeader("REFERER");
        verify(mockSession, times(1)).setAttribute("journey", journey);
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockStatus).setComplete();
        verify(mockSession, times(1)).invalidate();
        verify(mockSession, never()).removeAttribute(anyString());
        verify(mockModel, times(1)).addObject("journey", journey);
        verify(mockModel, times(1)).addObject("csrfToken", csrfToken);

        verifyNoMoreInteractions(mockStatus);
        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockRequest);
        verifyNoMoreInteractions(mockModel);
        verifyNoMoreInteractions(mockLogger);

    }

    @Test
    public void kmenWithHandleRefererNotNullTest() {
        String referer = "/migrateinform";
        String journey = "migrateinform";
        Object csrfToken = "0000-00000-0000-00000";
        userDetails.setReferer(null);
        when(mockRequest.getHeader("REFERER")).thenReturn(referer);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn("migrateinform");
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn("0000-00000-0000-00000");
        try {
            when(mockViewResolver.resolveNextView(mockRequest, userDetails)).thenReturn(mockModel);
            commonController.kmen(userDetails, securityDetails, mockRequest,mockStatus);
        } catch (SOAFaultException | ViewResolverException e) {
            Assert.fail(e.getMessage());
        }
        verify(mockLogger, times(1)).accessLog("REQUEST: " + userDetails);
        verify(mockRequest, times(2)).getSession();
        verify(mockRequest, times(1)).getHeader("REFERER");
        verify(mockSession, times(1)).setAttribute("journey", journey);
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockModel, times(1)).addObject("journey", journey);
        verify(mockModel, times(1)).addObject("csrfToken", csrfToken);

        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockRequest);
        verifyNoMoreInteractions(mockModel);
        verifyNoMoreInteractions(mockLogger);

        assertNotNull("SecurityDetails should not be null", userDetails.getSecurityDetails());
        assertEquals("Case Title is not what expected.", "Port/Migrate In Form", userDetails.getCaseTitle());
        assertEquals("REFERER is not what expected.", referer, userDetails.getReferer());
    }


    @Test
    public void handleCancleWithNullRefererTest() {
        String referer = null;
        String journey = "handsetunlockingform";
        userDetails.setReferer(referer);
        mockStatic(DynamicProperties.class);
        PowerMockito.when(DynamicProperties.getProperty(anyString())).thenReturn("");
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn(journey);
        try {
            commonController.handleCancel(userDetails, mockRequest, mockStatus);

            verify(mockRequest, times(2)).getSession();
            verify(mockSession).getAttribute("journey");
            verify(mockStatus).setComplete();
            verify(mockSession).removeAttribute("UniqueTransactionId");
            verify(mockSession).removeAttribute("currentJourney");
            verify(mockSession).removeAttribute("journey");
            verify(mockSession).removeAttribute("sessionUserDetails");
            verify(mockSession).removeAttribute("frhMap");

            verifyNoMoreInteractions(mockSession);
            verifyNoMoreInteractions(mockResponse);
            verifyNoMoreInteractions(mockRequest);
            verifyNoMoreInteractions(mockModel);
            verifyNoMoreInteractions(mockLogger);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

        assertEquals(referer, userDetails.getReferer());
    }

    @Test
    public void handleCancleWithNotNullRefererTest() {
        String referer = "/handsetunlockingform";
        String journey = "handsetunlockingform";
        userDetails.setReferer(referer);
        mockStatic(DynamicProperties.class);
        PowerMockito.when(DynamicProperties.getProperty(anyString())).thenReturn("");
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn(journey);

        try {
            commonController.handleCancel(userDetails, mockRequest, mockStatus);

            verify(mockRequest, times(2)).getSession();
            verify(mockSession).getAttribute("journey");
            verify(mockStatus).setComplete();
            verify(mockSession).removeAttribute("UniqueTransactionId");
            verify(mockSession).removeAttribute("currentJourney");
            verify(mockSession).removeAttribute("journey");
            verify(mockSession).removeAttribute("sessionUserDetails");
            verify(mockSession).removeAttribute("frhMap");

            verifyNoMoreInteractions(mockSession);
            verifyNoMoreInteractions(mockResponse);
            verifyNoMoreInteractions(mockRequest);
            verifyNoMoreInteractions(mockModel);
            verifyNoMoreInteractions(mockLogger);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

        assertEquals(referer, userDetails.getReferer());
    }

    @Test
    public void handlePreviousTest() {
        Object csrfToken = "0000-00000-0000-00000";
        try {
            when(mockRequest.getSession()).thenReturn(mockSession);
            when(mockSession.getAttribute("UniqueTransactionId")).thenReturn("0000-00000-0000-00000");
            when(mockViewResolver.resolvePreviousView(mockRequest, true)).thenReturn(mockModel);
            commonController.handlePrevious(userDetails, true, mockRequest);
        } catch (SessionExpiredException e) {
            Assert.fail(e.getMessage());
        }

        verify(mockModel, times(1)).addObject("csrfToken", csrfToken);
        verify(mockModel).addObject("userDetails", userDetails);
        assertNotNull("UserDetails should not be null", userDetails);

    }

    @Test
    public void submitTest() {
        try {
            String journey = "handsetunlockingform";
            when(mockViewResolver.resolveSuccessView(mockRequest, userDetails)).thenReturn(mockModel);
            when(mockRequest.getSession()).thenReturn(mockSession);
            when(mockSession.getAttribute("journey")).thenReturn(journey);

            commonController.submit(userDetails, additionalInfo, mockRequest, mockStatus);

            verify(mockRequest, times(2)).getSession();
            verify(mockSession).getAttribute("journey");
            verify(mockStatus).setComplete();
            verify(mockSession).removeAttribute("UniqueTransactionId");
            verify(mockSession).removeAttribute("currentJourney");
            verify(mockSession).removeAttribute("journey");
            verify(mockSession).removeAttribute("sessionUserDetails");
            verify(mockSession).removeAttribute("frhMap");
            verify(mockModel).addObject("journey", journey);
            verify(mockLogger).accessLog("SUBMIT REQUEST: " + userDetails);

            verifyNoMoreInteractions(mockSession);
            verifyNoMoreInteractions(mockRequest);
            verifyNoMoreInteractions(mockModel);
            verifyNoMoreInteractions(mockLogger);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        assertNotNull("AdditionalInfo should not be null", userDetails.getAdditionalInfo());
    }

    @Test
    public void killSessionTest() {
        when(mockRequest.getSession()).thenReturn(mockSession);

        commonController.killSession(mockRequest, mockStatus);

        verify(mockSession, times(1)).removeAttribute("UniqueTransactionId");
        verify(mockSession, times(1)).removeAttribute("currentJourney");
        verify(mockSession, times(1)).removeAttribute("journey");
        verify(mockSession, times(1)).removeAttribute("sessionUserDetails");
        verify(mockSession, times(1)).removeAttribute("frhMap");
        verify(mockStatus, times(1)).setComplete();

        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockStatus);
        verify(mockRequest, times(1)).getSession();
        verify(mockSession, times(5)).removeAttribute(anyString());

    }
}
