package com.rahgozin.gate.dto.customerClubInquiryScore.request;

public class CustomerClubInquiryScoreBody {
    CustomerClubInquiryScoreChannel channel;
    CustomerClubInquiryScoreMobileNumber mobileNumber;

    public CustomerClubInquiryScoreChannel getChannel() {
        if (channel == null) channel = new CustomerClubInquiryScoreChannel();
        return channel;
    }

    public void setChannel(CustomerClubInquiryScoreChannel channel) {
        this.channel = channel;
    }

    public CustomerClubInquiryScoreMobileNumber getMobileNumber() {
        if (mobileNumber == null) mobileNumber = new CustomerClubInquiryScoreMobileNumber();
        return mobileNumber;
    }

    public void setMobileNumber(CustomerClubInquiryScoreMobileNumber mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
