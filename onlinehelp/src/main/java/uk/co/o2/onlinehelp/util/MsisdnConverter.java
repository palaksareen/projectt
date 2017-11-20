package uk.co.o2.onlinehelp.util;

public class MsisdnConverter {

    public static String getMsisdnForSoaService(String msisdn) {
        msisdn = msisdn.replaceAll("[ +()-]", "");
        msisdn = msisdn.trim();
        msisdn = msisdn.replaceAll("^0", "44");
        return msisdn;
    }

    public static String getMsisdnForKanna(String msisdn) {
        msisdn = msisdn.replaceAll("[ +()-]", "");
        msisdn = msisdn.trim();
        msisdn = msisdn.replaceAll("^44", "0");
        return msisdn;
    }
}
