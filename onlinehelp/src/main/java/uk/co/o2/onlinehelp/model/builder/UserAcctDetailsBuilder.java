package uk.co.o2.onlinehelp.model.builder;

import uk.co.o2.onlinehelp.model.UserAcctDetails;
import uk.co.o2.soa.useraccountsdata_1.LegacyAandRCustomerDataType;
import uk.co.o2.soa.useraccountsdata_1.SearchOnlineAccounts1Response;
import uk.co.o2.soa.useraccountsdata_1.UserDetailRecordType;

import java.util.List;

public class UserAcctDetailsBuilder {

    private SearchOnlineAccounts1Response onlineAccounts1Response;

    public UserAcctDetailsBuilder(SearchOnlineAccounts1Response onlineAccounts1Response) {
        this.onlineAccounts1Response = onlineAccounts1Response;
    }

    public UserAcctDetails build() {

        UserAcctDetails userAcctDetails = new UserAcctDetails();
        if (onlineAccounts1Response.getCount().longValue() > 0) {
            List<UserDetailRecordType> userDetailRecords = onlineAccounts1Response
                    .getUserDetailRecord();
            UserDetailRecordType userDetailRecordType = userDetailRecords.get(0);
            List<LegacyAandRCustomerDataType> legacyAandRCustDataTypeList = userDetailRecordType.getLegacyAandRCustomerData();
            if (null != legacyAandRCustDataTypeList && legacyAandRCustDataTypeList.size() > 0) {
                LegacyAandRCustomerDataType legacyAandRCustomerDataType = legacyAandRCustDataTypeList.get(0);
                userAcctDetails.setCustomerType(legacyAandRCustomerDataType.getCustomerType());
                userAcctDetails.setOwningBusinessDivision(legacyAandRCustomerDataType.getOwningBusinessDivision());
                userAcctDetails.setSegmentationValue(legacyAandRCustomerDataType.getSegmentation());
                userAcctDetails.setStatus(legacyAandRCustomerDataType.getStatus());
            } else {
                //TODO: Add logic to handle empty LegacyAandRCustomerDataType List.
            }
        }

        return userAcctDetails;
    }

}
