package uk.co.o2.onlinehelp.model;

import uk.co.o2.onlinehelp.constant.Operator;
import uk.co.o2.onlinehelp.constant.PaymentType;

import java.io.Serializable;

public class SubscriberProfileDetails implements Serializable {

    private String mpn;
    private Operator operator;
    private PaymentType paymentType;
    private String channel;

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "SubscriberProfileDetails{" +
                "mpn='" + mpn + '\'' +
                ", operator='" + operator + '\'' +
                ", paymentType=" + paymentType +
                ", channel='" + channel + '\'' +
                '}';
    }
}
