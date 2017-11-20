package uk.co.o2.onlinehelp.constant;

public enum Operator {

    O2("O2"),
    NONO2("nonO2");

    private final String value;

    Operator(String v) {
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
