package uk.co.o2.onlinehelp.model.builder;

import uk.co.o2.onlinehelp.constant.Operator;
import uk.co.o2.onlinehelp.constant.PaymentType;
import uk.co.o2.onlinehelp.model.SubscriberProfileDetails;
import uk.co.o2.soa.subscriberdata_2.SubscriberProfileType;

public class SubscriberProfileBuilder {

    private SubscriberProfileType subscriberProfile;
    private SubscriberProfileDetails subscriberProfileDetails;

    public SubscriberProfileBuilder(SubscriberProfileType subscriberProfile) {
        this.subscriberProfile = subscriberProfile;
    }

    public SubscriberProfileDetails build() {
        subscriberProfileDetails = new SubscriberProfileDetails();
        subscriberProfileDetails.setChannel(subscriberProfile.getChannel());
        subscriberProfileDetails.setMpn(subscriberProfile.getSubscriberID());
        subscriberProfileDetails.setOperator(Operator.valueOf(subscriberProfile.getOperator().toUpperCase()));
        subscriberProfileDetails.setPaymentType(PaymentType.valueOf(
                subscriberProfile.getPaymentCategory().toString()));
        return subscriberProfileDetails;
    }
}
