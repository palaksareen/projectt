package uk.co.o2.onlinehelp.model;

public class UserAcctDetails {

    private String customerType;
    private String owningBusinessDivision;
    private String segmentationValue;
    private String status;
    private String mpn;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getOwningBusinessDivision() {
        return owningBusinessDivision;
    }

    public void setOwningBusinessDivision(String owningBusinessDivision) {
        this.owningBusinessDivision = owningBusinessDivision;
    }

    public String getSegmentationValue() {
        return segmentationValue;
    }

    public void setSegmentationValue(String segmentationValue) {
        this.segmentationValue = segmentationValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    @Override
    public String toString() {
        return "UserAcctDetails{" +
                "customerType='" + customerType + '\'' +
                ", owningBusinessDivision='" + owningBusinessDivision + '\'' +
                ", segmentationValue='" + segmentationValue + '\'' +
                ", status='" + status + '\'' +
                ", mpn='" + mpn + '\'' +
                '}';
    }
}
