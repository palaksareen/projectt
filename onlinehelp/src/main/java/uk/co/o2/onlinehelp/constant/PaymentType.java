package uk.co.o2.onlinehelp.constant;

public enum PaymentType {

    PREPAY("Prepay"),
    POSTPAY("Postpay"),
    UNKNOWN("Unknown");

    private final String value;

    PaymentType(String v) {
        value = v;
    }

    @Override
    public String toString() {
        return value;
    }

    public String value() {
        return value;
    }

}