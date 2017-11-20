package uk.co.o2.onlinehelp.interceptor;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XSSRequestWrapper extends HttpServletRequestWrapper {

    private final Encoder htmlEncoder = ESAPI.encoder();

    public XSSRequestWrapper(HttpServletRequest servletRequest) {
        super(servletRequest);
    }

    @Override
    public String[] getParameterValues(String parameter) {

        String[] values = super.getParameterValues(parameter);
        if (values == null) {
            return null;
        }
        int count = values.length;
        String[] encodedValues = new String[count];
        for (int i = 0; i < count; i++) {
            encodedValues[i] = encodeHTML(values[i]);
        }

        return encodedValues;
    }

    @Override
    public String getParameter(String parameter) {
        String value = super.getParameter(parameter);
        return encodeHTML(value);
    }

    private String encodeHTML(String value) {
        return htmlEncoder.encodeForHTMLAttribute(value);
    }

}
