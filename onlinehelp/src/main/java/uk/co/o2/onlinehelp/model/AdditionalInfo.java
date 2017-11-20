package uk.co.o2.onlinehelp.model;

import java.io.Serializable;

public class AdditionalInfo implements Serializable {

    private String model = "";
    private String imei = "";
    private String addInfo = "";
    private String keepMpn = "";
    private String o2mpn = "";
    private String o2simNo = "";
    private String pacNo = "";

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    public String getO2mpn() {
        return o2mpn;
    }

    public void setO2mpn(String o2mpn) {
        this.o2mpn = o2mpn;
    }

    public String getO2simNo() {
        return o2simNo;
    }

    public void setO2simNo(String o2simNo) {
        this.o2simNo = o2simNo;
    }

    public String getPacNo() {
        return pacNo;
    }

    public void setPacNo(String pacNo) {
        this.pacNo = pacNo;
    }

    public String getKeepMpn() {
        return keepMpn;
    }

    public void setKeepMpn(String keepMpn) {
        this.keepMpn = keepMpn;
    }


    @Override
    public String toString() {
        return "AdditionalInfo{" +
                "model='" + model + '\'' +
                ", imei='" + imei + '\'' +
                ", addInfo='" + addInfo + '\'' +
                ", keepMpn='" + keepMpn + '\'' +
                ", o2mpn='" + o2mpn + '\'' +
                ", o2simNo='" + o2simNo + '\'' +
                ", pacNo='" + pacNo + '\'' +
                '}';
    }

}
