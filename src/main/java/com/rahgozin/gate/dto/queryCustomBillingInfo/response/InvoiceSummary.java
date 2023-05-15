
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TotalVoiceCallsDuration",
    "SubscriptionFee",
    "LocalVoiceCalls",
    "InternationVoiceCalls",
    "InternationalRoamingCharges",
    "SMS",
    "VMS",
    "MMS",
    "Internet",
    "VAS",
    "Packages",
    "SpecialServices",
    "CRMCosts",
    "TotalAmount",
    "Discount",
    "Tax",
    "ExemptionFee",
    "Charity",
    "GovernmentGeneralIncome",
    "Sum",
    "TotalOldDebts",
    "TotalOldCredit",
    "UnconfirmedPayment",
    "Rounding",
    "Payable",
    "BillId",
    "PaymentId",
    "AdvancePayment",
    "eGov",
    "onnetAmount",
    "offnetAmount",
    "onnetDuration",
    "offnetDuration",
    "totatRatingDiscount",
    "voiceRatingDiscount",
    "smsRatingDiscount",
    "gprsRatingDiscount",
    "postToPreBT"
})
@Generated("jsonschema2pojo")
public class InvoiceSummary {

    private String totalVoiceCallsDuration;
    private String subscriptionFee;
    private String localVoiceCalls;
    private String internationVoiceCalls;
    private String internationalRoamingCharges;
    private String sms;
    private String vms;
    private String mms;
    private String internet;
    private String vas;
    private String packages;
    private String specialServices;
    private String cRMCosts;
    private String totalAmount;
    private String discount;
    private String tax;
    private String exemptionFee;
    private String charity;
    private String governmentGeneralIncome;
    private String sum;
    private String totalOldDebts;
    private String totalOldCredit;
    private String unconfirmedPayment;
    private String rounding;
    private String payable;
    private String billId;
    private String paymentId;
    private String advancePayment;
    private String eGov;
    private String onnetAmount;
    private String offnetAmount;
    private String onnetDuration;
    private String offnetDuration;
    private String totatRatingDiscount;
    private String voiceRatingDiscount;
    private String smsRatingDiscount;
    private String gprsRatingDiscount;
    private String postToPreBT;

    @JsonProperty("totalVoiceCallsDuration")
    public String getTotalVoiceCallsDuration() {
        return totalVoiceCallsDuration;
    }

    @JsonProperty("TotalVoiceCallsDuration")
    public void setTotalVoiceCallsDuration(String totalVoiceCallsDuration) {
        this.totalVoiceCallsDuration = totalVoiceCallsDuration;
    }

    @JsonProperty("subscriptionFee")
    public String getSubscriptionFee() {
        return subscriptionFee;
    }

    @JsonProperty("SubscriptionFee")
    public void setSubscriptionFee(String subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    @JsonProperty("localVoiceCalls")
    public String getLocalVoiceCalls() {
        return localVoiceCalls;
    }

    @JsonProperty("LocalVoiceCalls")
    public void setLocalVoiceCalls(String localVoiceCalls) {
        this.localVoiceCalls = localVoiceCalls;
    }

    @JsonProperty("internationVoiceCalls")
    public String getInternationVoiceCalls() {
        return internationVoiceCalls;
    }

    @JsonProperty("InternationVoiceCalls")
    public void setInternationVoiceCalls(String internationVoiceCalls) {
        this.internationVoiceCalls = internationVoiceCalls;
    }

    @JsonProperty("internationalRoamingCharges")
    public String getInternationalRoamingCharges() {
        return internationalRoamingCharges;
    }

    @JsonProperty("InternationalRoamingCharges")
    public void setInternationalRoamingCharges(String internationalRoamingCharges) {
        this.internationalRoamingCharges = internationalRoamingCharges;
    }

    @JsonProperty("sms")
    public String getSms() {
        return sms;
    }

    @JsonProperty("SMS")
    public void setSms(String sms) {
        this.sms = sms;
    }

    @JsonProperty("vms")
    public String getVms() {
        return vms;
    }

    @JsonProperty("VMS")
    public void setVms(String vms) {
        this.vms = vms;
    }

    @JsonProperty("mms")
    public String getMms() {
        return mms;
    }

    @JsonProperty("MMS")
    public void setMms(String mms) {
        this.mms = mms;
    }

    @JsonProperty("internet")
    public String getInternet() {
        return internet;
    }

    @JsonProperty("Internet")
    public void setInternet(String internet) {
        this.internet = internet;
    }

    @JsonProperty("vas")
    public String getVas() {
        return vas;
    }

    @JsonProperty("VAS")
    public void setVas(String vas) {
        this.vas = vas;
    }

    @JsonProperty("packages")
    public String getPackages() {
        return packages;
    }

    @JsonProperty("Packages")
    public void setPackages(String packages) {
        this.packages = packages;
    }

    @JsonProperty("specialServices")
    public String getSpecialServices() {
        return specialServices;
    }

    @JsonProperty("SpecialServices")
    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    @JsonProperty("crmCosts")
    public String getCRMCosts() {
        return cRMCosts;
    }

    @JsonProperty("CRMCosts")
    public void setCRMCosts(String cRMCosts) {
        this.cRMCosts = cRMCosts;
    }

    @JsonProperty("totalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("TotalAmount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    @JsonProperty("Discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @JsonProperty("tax")
    public String getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(String tax) {
        this.tax = tax;
    }

    @JsonProperty("exemptionFee")
    public String getExemptionFee() {
        return exemptionFee;
    }

    @JsonProperty("ExemptionFee")
    public void setExemptionFee(String exemptionFee) {
        this.exemptionFee = exemptionFee;
    }

    @JsonProperty("charity")
    public String getCharity() {
        return charity;
    }

    @JsonProperty("Charity")
    public void setCharity(String charity) {
        this.charity = charity;
    }

    @JsonProperty("governmentGeneralIncome")
    public String getGovernmentGeneralIncome() {
        return governmentGeneralIncome;
    }

    @JsonProperty("GovernmentGeneralIncome")
    public void setGovernmentGeneralIncome(String governmentGeneralIncome) {
        this.governmentGeneralIncome = governmentGeneralIncome;
    }

    @JsonProperty("sum")
    public String getSum() {
        return sum;
    }

    @JsonProperty("Sum")
    public void setSum(String sum) {
        this.sum = sum;
    }

    @JsonProperty("totalOldDebts")
    public String getTotalOldDebts() {
        return totalOldDebts;
    }

    @JsonProperty("TotalOldDebts")
    public void setTotalOldDebts(String totalOldDebts) {
        this.totalOldDebts = totalOldDebts;
    }

    @JsonProperty("totalOldCredit")
    public String getTotalOldCredit() {
        return totalOldCredit;
    }

    @JsonProperty("TotalOldCredit")
    public void setTotalOldCredit(String totalOldCredit) {
        this.totalOldCredit = totalOldCredit;
    }

    @JsonProperty("unconfirmedPayment")
    public String getUnconfirmedPayment() {
        return unconfirmedPayment;
    }

    @JsonProperty("UnconfirmedPayment")
    public void setUnconfirmedPayment(String unconfirmedPayment) {
        this.unconfirmedPayment = unconfirmedPayment;
    }

    @JsonProperty("rounding")
    public String getRounding() {
        return rounding;
    }

    @JsonProperty("Rounding")
    public void setRounding(String rounding) {
        this.rounding = rounding;
    }

    @JsonProperty("payable")
    public String getPayable() {
        return payable;
    }

    @JsonProperty("Payable")
    public void setPayable(String payable) {
        this.payable = payable;
    }

    @JsonProperty("billId")
    public String getBillId() {
        return billId;
    }

    @JsonProperty("BillId")
    public void setBillId(String billId) {
        this.billId = billId;
    }

    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    @JsonProperty("PaymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @JsonProperty("advancePayment")
    public String getAdvancePayment() {
        return advancePayment;
    }

    @JsonProperty("AdvancePayment")
    public void setAdvancePayment(String advancePayment) {
        this.advancePayment = advancePayment;
    }

    @JsonProperty("eGov")
    public String geteGov() {
        return eGov;
    }

    @JsonProperty("eGov")
    public void seteGov(String eGov) {
        this.eGov = eGov;
    }

    @JsonProperty("onnetAmount")
    public String getOnnetAmount() {
        return onnetAmount;
    }

    @JsonProperty("onnetAmount")
    public void setOnnetAmount(String onnetAmount) {
        this.onnetAmount = onnetAmount;
    }

    @JsonProperty("offnetAmount")
    public String getOffnetAmount() {
        return offnetAmount;
    }

    @JsonProperty("offnetAmount")
    public void setOffnetAmount(String offnetAmount) {
        this.offnetAmount = offnetAmount;
    }

    @JsonProperty("onnetDuration")
    public String getOnnetDuration() {
        return onnetDuration;
    }

    @JsonProperty("onnetDuration")
    public void setOnnetDuration(String onnetDuration) {
        this.onnetDuration = onnetDuration;
    }

    @JsonProperty("offnetDuration")
    public String getOffnetDuration() {
        return offnetDuration;
    }

    @JsonProperty("offnetDuration")
    public void setOffnetDuration(String offnetDuration) {
        this.offnetDuration = offnetDuration;
    }

    @JsonProperty("totatRatingDiscount")
    public String getTotatRatingDiscount() {
        return totatRatingDiscount;
    }

    @JsonProperty("totatRatingDiscount")
    public void setTotatRatingDiscount(String totatRatingDiscount) {
        this.totatRatingDiscount = totatRatingDiscount;
    }

    @JsonProperty("voiceRatingDiscount")
    public String getVoiceRatingDiscount() {
        return voiceRatingDiscount;
    }

    @JsonProperty("voiceRatingDiscount")
    public void setVoiceRatingDiscount(String voiceRatingDiscount) {
        this.voiceRatingDiscount = voiceRatingDiscount;
    }

    @JsonProperty("smsRatingDiscount")
    public String getSmsRatingDiscount() {
        return smsRatingDiscount;
    }

    @JsonProperty("smsRatingDiscount")
    public void setSmsRatingDiscount(String smsRatingDiscount) {
        this.smsRatingDiscount = smsRatingDiscount;
    }

    @JsonProperty("gprsRatingDiscount")
    public String getGprsRatingDiscount() {
        return gprsRatingDiscount;
    }

    @JsonProperty("gprsRatingDiscount")
    public void setGprsRatingDiscount(String gprsRatingDiscount) {
        this.gprsRatingDiscount = gprsRatingDiscount;
    }

    @JsonProperty("postToPreBT")
    public String getPostToPreBT() {
        return postToPreBT;
    }

    @JsonProperty("postToPreBT")
    public void setPostToPreBT(String postToPreBT) {
        this.postToPreBT = postToPreBT;
    }

}
