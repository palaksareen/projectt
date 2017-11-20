package uk.co.o2.onlinehelp.model;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.function.BiFunction;

public class OHModelAndView {

    private ModelAndView modelAndView;
    private BiFunction<HttpServletRequest, UserDetails, UserDetails> updateFieldsConsumer;

    public OHModelAndView(ModelAndView modelAndView) {
        this.modelAndView = modelAndView;
    }

    public OHModelAndView(ModelAndView modelAndView, BiFunction<HttpServletRequest, UserDetails, UserDetails> updateFieldsConsumer) {
        this.modelAndView = modelAndView;
        this.updateFieldsConsumer = updateFieldsConsumer;
    }

    public ModelAndView getModelAndView() {
        return modelAndView;
    }

    public BiFunction<HttpServletRequest, UserDetails, UserDetails> getUpdateFieldsConsumer() {
        return updateFieldsConsumer;
    }
}
