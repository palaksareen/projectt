package uk.co.o2.onlinehelp.interceptor;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.MDC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UniqueTransactionIdInterceptor.class, MDC.class})
public class UniqueTransactionIdInterceptorTest {

    private UniqueTransactionIdInterceptor interceptor;

    @Mock
    HttpServletRequest mockRequest;
    @Mock
    HttpSession mockSession;

    @Before
    public void setUp() throws Exception {
        interceptor = new UniqueTransactionIdInterceptor();
    }

    @Test
    public void preHandleWhenUniqueTransactionIdIsNull() throws Exception {

        final UUID mock = mock(UUID.class);
        mockStatic(UUID.class);
        PowerMockito.when(UUID.randomUUID()).thenReturn(mock);

        PowerMockito.mockStatic(MDC.class);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn(null);

        boolean result = interceptor.preHandle(mockRequest, null, null);

        verify(mockRequest).getSession();
        verify(mockSession).getAttribute("UniqueTransactionId");
        verify(mockSession).setAttribute("UniqueTransactionId", mock.toString());
        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockRequest);

        PowerMockito.verifyStatic(times(1));
        MDC.put("RequestId", mock.toString());

        assertTrue("preHandle() should always return true", result);
    }

    @Test
    public void preHandleWhenUniqueTransactionIdIsNotNullWithPOSTRequest() throws Exception {

        String uuid = "0000-00000-0000-00000";
        PowerMockito.mockStatic(MDC.class);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockRequest.getMethod()).thenReturn("POST");
        when(mockRequest.getParameter("csrfToken")).thenReturn(uuid);
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn(uuid);

        boolean result = interceptor.preHandle(mockRequest, null, null);

        verify(mockRequest).getSession();
        verify(mockRequest).getMethod();
        verify(mockRequest).getParameter("csrfToken");
        verify(mockSession).getAttribute("UniqueTransactionId");
        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockRequest);

        PowerMockito.verifyStatic(times(1));
        MDC.put("RequestId", uuid);

        assertTrue("preHandle() should always return true", result);
    }

    @Test
    public void preHandleWhenUniqueTransactionIdIsNotNullWithGETRequest() throws Exception {

        String uuid = "0000-00000-0000-00000";
        PowerMockito.mockStatic(MDC.class);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockRequest.getMethod()).thenReturn("GET");
        when(mockSession.getAttribute("UniqueTransactionId")).thenReturn(uuid);

        boolean result = interceptor.preHandle(mockRequest, null, null);

        verify(mockRequest).getSession();
        verify(mockRequest).getMethod();
        verify(mockSession).getAttribute("UniqueTransactionId");
        verifyNoMoreInteractions(mockSession);
        verifyNoMoreInteractions(mockRequest);

        PowerMockito.verifyStatic(times(1));
        MDC.put("RequestId", uuid);

        assertTrue("preHandle() should always return true", result);
    }

    @After
    public void tearDown() throws Exception {
        interceptor = null;
        mockSession = null;
        mockRequest = null;
    }
}
