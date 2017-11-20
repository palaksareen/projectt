package uk.co.o2.onlinehelp.util;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.web.servlet.ModelAndView;
import uk.co.o2.onlinehelp.exception.SessionExpiredException;
import uk.co.o2.onlinehelp.model.OHModelAndView;
import uk.co.o2.onlinehelp.model.UserDetails;
import uk.co.o2.onlinehelp.service.OnlineHelpService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Stack;
import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
public class OHViewResolverTest {

    private UserDetails userDetails;

    @Mock
    private HttpServletRequest mockRequest;
    @Mock
    private HttpSession mockSession;
    @Mock
    private OnlineHelpService mockService;

    @Mock
    private JourneyViews mockViews;

    @Mock
    private Stack<ModelAndView> mockCurrentJourney;

    @Mock
    private OHModelAndView mockOhModelAndView;

    @InjectMocks
    private OHViewResolver viewResolver;

    @Before
    public void setUp() {
        viewResolver = new OHViewResolver();
        userDetails = new UserDetails();
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void resolveNextViewAsLandingPage() {

        ModelAndView nextView = new ModelAndView(JourneyViews.LANDING_PAGE);
        String journey = "HandsetUnlockingForm";

        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("currentJourney")).thenReturn(null).thenReturn(mockCurrentJourney);
        when(mockCurrentJourney.size()).thenReturn(0);

        when(mockSession.getAttribute("journey")).thenReturn(journey);
        when(mockViews.getView(journey, "" + JourneyViews.SEPARATOR + "")).thenReturn(mockOhModelAndView);
        when(mockOhModelAndView.getModelAndView()).thenReturn(nextView);

        try {
            nextView = viewResolver.resolveRefreshView(mockRequest, userDetails);
            verify(mockService, never()).callSubscriberService(anyString(), any(HttpServletRequest.class));
            verify(mockService, never()).callUserAcctService(anyString(), any(HttpServletRequest.class));
            verifyNoMoreInteractions(mockService);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        verify(mockSession, times(1)).setAttribute(eq("currentJourney"), any(Stack.class));
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockRequest, only()).getSession();
        verify(mockOhModelAndView, times(1)).getModelAndView();
        verify(mockOhModelAndView, never()).getUpdateFieldsConsumer();
        verify(mockCurrentJourney, times(1)).push(nextView);
        verify(mockCurrentJourney, never()).peek();
        verify(mockCurrentJourney, times(1)).size();

        assertEquals("UserDetails doesn't match.", nextView.getModel().get("userDetails"), userDetails);
        assertEquals("Incorrect view.", nextView.getViewName(), JourneyViews.LANDING_PAGE);

    }

    @Test
    public void resolveNextViewOnPageRefresh() {
        String journey = "MigrateInForm";
        ModelAndView nextView = new ModelAndView(JourneyViews.BUSINESS_SECURITY_PAGE);

        userDetails.setAccountType("biz");
        userDetails.setPageInfo("landing");
        userDetails.setMpn("447588628283");
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("currentJourney")).thenReturn(mockCurrentJourney);
        when(mockCurrentJourney.size()).thenReturn(2);
        when(mockCurrentJourney.peek()).thenReturn(new ModelAndView(JourneyViews.BUSINESS_SECURITY_PAGE));

        when(mockSession.getAttribute("journey")).thenReturn(journey);
        when(mockViews.getView(journey, userDetails.getPageInfo() + JourneyViews.SEPARATOR + userDetails.getAccountType()))
                .thenReturn(mockOhModelAndView);
        when(mockOhModelAndView.getUpdateFieldsConsumer()).thenReturn(null);
        when(mockOhModelAndView.getModelAndView()).thenReturn(nextView);

        try {
            nextView = viewResolver.resolveNextView(mockRequest, userDetails);
            verify(mockService, times(1)).callSubscriberService(userDetails.getMpn(), mockRequest);
            verify(mockService, never()).callUserAcctService(anyString(), any(HttpServletRequest.class));
            verify(mockService, only()).callSubscriberService(userDetails.getMpn(), mockRequest);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        verify(mockRequest, only()).getSession();
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockOhModelAndView, times(1)).getModelAndView();
        verify(mockOhModelAndView, times(1)).getUpdateFieldsConsumer();
        verify(mockCurrentJourney, never()).push(any(ModelAndView.class));
        verify(mockCurrentJourney, times(1)).peek();
        verify(mockCurrentJourney, times(1)).size();
        assertEquals("UserDetails doesn't match.", nextView.getModel().get("userDetails"), userDetails);
        assertEquals("Incorrect view.", nextView.getViewName(), JourneyViews.BUSINESS_SECURITY_PAGE);
    }

    @Test
    public void resolveNextViewAsPayGSecurityPageForUnlock() {
        commonWhenAndVerifyForSecurityPage(JourneyViews.PAY_AS_YOU_GO_SECURITY_PAGE, "HandsetUnlockingForm", "payg");
    }

    @Test
    public void resolveNextViewAsPayMSecurityPageForUnlock() {
        commonWhenAndVerifyForSecurityPage(JourneyViews.PAY_MONTHLY_SECURITY_PAGE, "HandsetUnlockingForm", "paym");
    }

    @Test
    public void resolveNextViewAsBizSecurityPageForUnlock() {
        commonWhenAndVerifyForSecurityPage(JourneyViews.BUSINESS_SECURITY_PAGE, "HandsetUnlockingForm", "biz");
    }

    @Test
    public void resolveNextViewAsPayMSecurityPageForKMEN() {
        commonWhenAndVerifyForSecurityPage(JourneyViews.PAY_MONTHLY_SECURITY_PAGE, "MigrateInForm", "paym");
    }

    @Test
    public void resolveNextViewAsBizSecurityPageForKMEN() {
        commonWhenAndVerifyForSecurityPage(JourneyViews.BUSINESS_SECURITY_PAGE, "MigrateInForm", "biz");
    }

    @Test
    public void resolveNextViewAsPayGSecurityPageForKMEN() {
        commonWhenAndVerifyForSecurityPage(JourneyViews.ADDITIONAL_KMEN_INFO_PAGE, "MigrateInForm", "payg");
    }


    /*
    * This is a common method for when's, verify's and actual call
    * for testing resolveNextView method when current page is landing
    * and accountType could be paym/payg/biz.
    * */
    private void commonWhenAndVerifyForSecurityPage(String viewName, String journey, String accountType) {
        ModelAndView nextView = new ModelAndView(viewName);
        userDetails.setAccountType(accountType);
        userDetails.setPageInfo("landing");
        userDetails.setMpn("447588628283");
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("currentJourney")).thenReturn(mockCurrentJourney);
        when(mockCurrentJourney.size()).thenReturn(1);
        when(mockCurrentJourney.peek()).thenReturn(new ModelAndView(JourneyViews.LANDING_PAGE));

        when(mockSession.getAttribute("journey")).thenReturn(journey);
        when(mockViews.getView(journey, userDetails.getPageInfo() + JourneyViews.SEPARATOR + userDetails.getAccountType()))
                .thenReturn(mockOhModelAndView);
        when(mockOhModelAndView.getUpdateFieldsConsumer()).thenReturn(null);
        when(mockOhModelAndView.getModelAndView()).thenReturn(nextView);

        try {
            nextView = viewResolver.resolveNextView(mockRequest, userDetails);
            verify(mockService, times(1)).callSubscriberService(userDetails.getMpn(), mockRequest);
            verify(mockService, never()).callUserAcctService(anyString(), any(HttpServletRequest.class));
            verify(mockService, only()).callSubscriberService(userDetails.getMpn(), mockRequest);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        verify(mockRequest, only()).getSession();
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockOhModelAndView, times(1)).getModelAndView();
        verify(mockOhModelAndView, times(1)).getUpdateFieldsConsumer();
        verify(mockCurrentJourney, times(1)).push(nextView);
        verify(mockCurrentJourney, times(1)).peek();
        verify(mockCurrentJourney, times(1)).size();
        assertEquals("UserDetails doesn't match.", nextView.getModel().get("userDetails"), userDetails);
        assertEquals("Incorrect view.", nextView.getViewName(), viewName);
    }

    @Test
    public void resolveNextViewForPayGForgotPasswordPageForUnlock() {
        commonWhenAndVerifyForForgetPasswordPage(JourneyViews.PAY_AS_YOU_GO_SECURITY_PAGE, JourneyViews.ADDITIONAL_UNLOCK_INFO_PAGE, "HandsetUnlockingForm", "payg");
    }

    @Test
    public void resolveNextViewForPayMForgotPasswordPageForUnlock() {
        commonWhenAndVerifyForForgetPasswordPage(JourneyViews.PAY_MONTHLY_SECURITY_PAGE, JourneyViews.ADDITIONAL_UNLOCK_INFO_PAGE, "HandsetUnlockingForm", "paym");
    }

    @Test
    public void resolveNextViewForBizForgotPasswordPageForUnlock() {
        commonWhenAndVerifyForForgetPasswordPage(JourneyViews.BUSINESS_SECURITY_PAGE, JourneyViews.ADDITIONAL_UNLOCK_INFO_PAGE, "HandsetUnlockingForm", "biz");
    }

    @Test
    public void resolveNextViewForPayMForgotPasswordPageForKMEN() {
        commonWhenAndVerifyForForgetPasswordPage(JourneyViews.PAY_MONTHLY_SECURITY_PAGE, JourneyViews.ADDITIONAL_KMEN_INFO_PAGE, "MigrateInForm", "paym");
    }

    @Test
    public void resolveNextViewForBizForgotPasswordPageForKMEN() {
        commonWhenAndVerifyForForgetPasswordPage(JourneyViews.BUSINESS_SECURITY_PAGE, JourneyViews.ADDITIONAL_KMEN_INFO_PAGE, "MigrateInForm", "biz");
    }


    /*
    * This is a common method for when's, verify's and actual call
    * for testing resolveNextView method when current page is security details
    * and accountType could be paym/payg/biz.
    * */
    private void commonWhenAndVerifyForForgetPasswordPage(String currentViewName, String nextViewName, String journey, String accountType) {
        BiFunction<HttpServletRequest, UserDetails, UserDetails> mockBiFunction = (request, userDetails) -> {
            return userDetails;

        };
        ModelAndView nextView = new ModelAndView(nextViewName);

        userDetails.setAccountType(accountType);
        userDetails.setPageInfo("security");
        userDetails.setMpn("447588628283");
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("currentJourney")).thenReturn(mockCurrentJourney);
        when(mockCurrentJourney.size()).thenReturn(2);
        when(mockCurrentJourney.peek()).thenReturn(new ModelAndView(currentViewName));

        when(mockSession.getAttribute("journey")).thenReturn(journey);
        when(mockViews.getView(journey, userDetails.getPageInfo() + JourneyViews.SEPARATOR + userDetails.getAccountType()))
                .thenReturn(mockOhModelAndView);
        when(mockOhModelAndView.getUpdateFieldsConsumer()).thenReturn(mockBiFunction);
        when(mockOhModelAndView.getModelAndView()).thenReturn(nextView);

        try {
            nextView = viewResolver.resolveNextView(mockRequest, userDetails);
            verify(mockService, never()).callSubscriberService(anyString(), any(HttpServletRequest.class));
            verify(mockService, never()).callUserAcctService(anyString(), any(HttpServletRequest.class));
            verifyNoMoreInteractions(mockService);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        verify(mockRequest, only()).getSession();
        verify(mockSession, times(3)).getAttribute(anyString());
        verify(mockOhModelAndView, times(1)).getModelAndView();
        verify(mockOhModelAndView, times(2)).getUpdateFieldsConsumer();
        verify(mockCurrentJourney, times(1)).push(nextView);
        verify(mockCurrentJourney, times(1)).peek();
        verify(mockCurrentJourney, times(1)).size();
        assertEquals("UserDetails doesn't match.", nextView.getModel().get("userDetails"), userDetails);
        assertEquals("Incorrect view.", nextView.getViewName(), nextViewName);
    }

    @Test
    public void resolvePreviousViewTest() {
        ModelAndView previousView = new ModelAndView(JourneyViews.LANDING_PAGE);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("currentJourney")).thenReturn(mockCurrentJourney);
        when(mockCurrentJourney.peek()).thenReturn(previousView);
        when(mockCurrentJourney.pop()).thenReturn(new ModelAndView());

        ModelAndView expectedPreviousView = null;
        try {
            expectedPreviousView = viewResolver.resolvePreviousView(mockRequest, false);
        } catch (SessionExpiredException e) {
            Assert.fail(e.getMessage());
        }

        verifyNoMoreInteractions(mockService);
        verify(mockRequest, only()).getSession();
        verify(mockSession, times(1)).getAttribute(anyString());
        verify(mockCurrentJourney, times(1)).pop();
        verify(mockCurrentJourney, times(1)).peek();
        assertEquals("Incorrect view.", expectedPreviousView.getViewName(), JourneyViews.LANDING_PAGE);
    }

    @Test
    public void resolvePreviousViewForRefreshAction() {
        ModelAndView currentView = new ModelAndView(JourneyViews.PAY_MONTHLY_SECURITY_PAGE);
        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("currentJourney")).thenReturn(mockCurrentJourney);
        when(mockCurrentJourney.peek()).thenReturn(currentView);

        ModelAndView expectedPreviousView = null;
        try {
            expectedPreviousView = viewResolver.resolvePreviousView(mockRequest, true);
        } catch (SessionExpiredException e) {
            Assert.fail(e.getMessage());
        }
        verifyNoMoreInteractions(mockService);
        verify(mockRequest, only()).getSession();
        verify(mockSession, times(1)).getAttribute(anyString());
        verify(mockCurrentJourney, never()).pop();
        verify(mockCurrentJourney, times(1)).peek();
        assertEquals("Incorrect view.", expectedPreviousView.getViewName(), JourneyViews.PAY_MONTHLY_SECURITY_PAGE);
    }

    @Test
    public void resolveSuccessViewPage() {
        BiFunction<HttpServletRequest, UserDetails, UserDetails> mockBiFunction = (request,
                                                                                   userDetails) -> {
            return userDetails;

        };
        ModelAndView nextView = new ModelAndView(JourneyViews.UNLOCK_SUCCESS_PAGE);
        String journey = "HandsetUnlockingForm";
        userDetails.setAccountType("paym");
        userDetails.setPageInfo("submit");

        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn(journey);
        when(mockViews.getView(journey, userDetails.getPageInfo())).thenReturn(mockOhModelAndView);
        when(mockOhModelAndView.getModelAndView()).thenReturn(nextView);
        when(mockOhModelAndView.getUpdateFieldsConsumer()).thenReturn(mockBiFunction);

        try {
            nextView = viewResolver.resolveSuccessView(mockRequest, userDetails);
            verify(mockService, never()).callSubscriberService(anyString(), any(HttpServletRequest.class));
            verify(mockService, times(1)).callUserAcctService(anyString(), any(HttpServletRequest.class));
            verify(mockService, only()).callUserAcctService(anyString(), any(HttpServletRequest.class));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        verify(mockSession, times(1)).getAttribute(anyString());
        verify(mockRequest, only()).getSession();
        verify(mockSession, only()).getAttribute(anyString());
        verify(mockOhModelAndView, times(1)).getModelAndView();
        verify(mockOhModelAndView, times(2)).getUpdateFieldsConsumer();

        assertEquals("Incorrect view.", nextView.getViewName(), JourneyViews.UNLOCK_SUCCESS_PAGE);

    }

    @Test
    public void resolveSuccessViewPageOnRefresh() {
        ModelAndView nextView = new ModelAndView(JourneyViews.LANDING_PAGE);
        String journey = "HandsetUnlockingForm";
        userDetails.setAccountType("");
        userDetails.setPageInfo("");

        when(mockRequest.getSession()).thenReturn(mockSession);
        when(mockSession.getAttribute("journey")).thenReturn(journey);
        when(mockViews.getView(journey, JourneyViews.SEPARATOR)).thenReturn(mockOhModelAndView);
        when(mockOhModelAndView.getModelAndView()).thenReturn(nextView);

        try {
            nextView = viewResolver.resolveSuccessView(mockRequest, userDetails);
            verify(mockService, never()).callSubscriberService(anyString(), any(HttpServletRequest.class));
            verify(mockService, never()).callUserAcctService(anyString(), any(HttpServletRequest.class));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        verify(mockSession, times(1)).getAttribute(anyString());
        verify(mockRequest, only()).getSession();
        verifyNoMoreInteractions(mockService);
        verify(mockSession, only()).getAttribute(anyString());
        verify(mockOhModelAndView, times(1)).getModelAndView();
        verify(mockOhModelAndView, never()).getUpdateFieldsConsumer();

        assertEquals("Incorrect view.", nextView.getViewName(), JourneyViews.LANDING_PAGE);

    }

}
