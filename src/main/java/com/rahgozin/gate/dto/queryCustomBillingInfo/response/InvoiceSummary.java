
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

public class InvoiceSummary {
    private String totalVoiceCallsDuration;
    private String subscriptionFeeName;
    private String subscriptionFee;
    private String localVoiceCallsName;
    private String localVoiceCalls;
    private String internationVoiceCallsName;
    private String internationVoiceCalls;
    private String internationalRoamingChargesName;
    private String internationalRoamingCharges;
    private String smsName;
    private String sms;
    private String vmsName;
    private String vms;
    private String mms;
    private String internetName;
    private String internet;
    private String vasName;
    private String vas;
    private String packagesName;
    private String packages;
    private String specialServicesName;
    private String specialServices;
    private String cRMCostsName;
    private String cRMCosts;
    private String totalAmountName;
    private String totalAmount;
    private String discountName;
    private String discount;
    private String taxName;
    private String tax;
    private String exemptionFeeName;
    private String exemptionFee;
    private String charityName;
    private String charity;
    private String governmentGeneralIncomeName;
    private String governmentGeneralIncome;
    private String sumName;
    private String sum;
    private String totalOldDebtsName;
    private String totalOldDebts;
    private String totalOldCreditName;
    private String totalOldCredit;
    private String unconfirmedPaymentName;
    private String unconfirmedPayment;
    private String roundingName;
    private String rounding;
    private String payableName;
    private String payable;
    private String billId;
    private String paymentId;
    private String advancePayment;
    private String eGovName;
    private String eGov;
    private String onnetAmount;
    private String offnetAmount;
    private String onnetDuration;
    private String offnetDuration;
    private String totatRatingDiscount;
    private String voiceRatingDiscount;
    private String smsRatingDiscount;
    private String gprsRatingDiscount;
    private String postToPreBTName;
    private String postToPreBT;

    @JsonProperty("payableTitle")
    public String getPayableName() {
        return payableName;
    }

    public void setPayableName(String payableName) {
        this.payableName = payableName;
    }

    @JsonProperty("roundingTitle")
    public String getRoundingName() {
        return roundingName;
    }

    public void setRoundingName(String roundingName) {
        this.roundingName = roundingName;
    }

    @JsonProperty("exemptionFeeTitle")
    public String getExemptionFeeName() {
        return exemptionFeeName;
    }

    public void setExemptionFeeName(String exemptionFeeName) {
        this.exemptionFeeName = exemptionFeeName;
    }

    @JsonProperty("unconfirmedPaymentTitle")
    public String getUnconfirmedPaymentName() {
        return unconfirmedPaymentName;
    }

    public void setUnconfirmedPaymentName(String unconfirmedPaymentName) {
        this.unconfirmedPaymentName = unconfirmedPaymentName;
    }

    @JsonProperty("totalOldCreditTitle")
    public String getTotalOldCreditName() {
        return totalOldCreditName;
    }

    public void setTotalOldCreditName(String totalOldCreditName) {
        this.totalOldCreditName = totalOldCreditName;
    }

    @JsonProperty("discountTitle")
    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    @JsonProperty("sumTitle")
    public String getSumName() {
        return sumName;
    }

    public void setSumName(String sumName) {
        this.sumName = sumName;
    }

    @JsonProperty("postToPreBTTitle")
    public String getPostToPreBTName() {
        return postToPreBTName;
    }

    public void setPostToPreBTName(String postToPreBTName) {
        this.postToPreBTName = postToPreBTName;
    }

    @JsonProperty("governmentGeneralIncomeTitle")
    public String getGovernmentGeneralIncomeName() {
        return governmentGeneralIncomeName;
    }

    public void setGovernmentGeneralIncomeName(String governmentGeneralIncomeName) {
        this.governmentGeneralIncomeName = governmentGeneralIncomeName;
    }

    @JsonProperty("charityTitle")
    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String charityName) {
        this.charityName = charityName;
    }

    @JsonProperty("totalOldDebtsTitle")
    public String getTotalOldDebtsName() {
        return totalOldDebtsName;
    }

    public void setTotalOldDebtsName(String totalOldDebtsName) {
        this.totalOldDebtsName = totalOldDebtsName;
    }

    @JsonProperty("taxTitle")
    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    @JsonProperty("totalAmountTitle")
    public String getTotalAmountName() {
        return totalAmountName;
    }

    public void setTotalAmountName(String totalAmountName) {
        this.totalAmountName = totalAmountName;
    }

    @JsonProperty("subscriptionFeeTitle")
    public String getSubscriptionFeeName() {
        return subscriptionFeeName;
    }

    public void setSubscriptionFeeName(String subscriptionFeeName) {
        this.subscriptionFeeName = subscriptionFeeName;
    }

    @JsonProperty("eGovTitle")
    public String geteGovName() {
        return eGovName;
    }

    public void seteGovName(String eGovName) {
        this.eGovName = eGovName;
    }

    @JsonProperty("specialServicesTitle")
    public String getSpecialServicesName() {
        return specialServicesName;
    }

    public void setSpecialServicesName(String specialServicesName) {
        this.specialServicesName = specialServicesName;
    }

    @JsonProperty("crmCostsTitle")
    public String getcRMCostsName() {
        return cRMCostsName;
    }

    public void setcRMCostsName(String cRMCostsName) {
        this.cRMCostsName = cRMCostsName;
    }

    @JsonProperty("crmCosts")
    public String getCRMCosts() {
        return cRMCosts;
    }

    @JsonProperty("CRMCosts")
    public void setCRMCosts(String cRMCosts) {
        this.cRMCosts = cRMCosts;
    }

    @JsonProperty("vasTitle")
    public String getVasName() {
        return vasName;
    }

    public void setVasName(String vasName) {
        this.vasName = vasName;
    }

    @JsonProperty("internetTitle")
    public String getInternetName() {
        return internetName;
    }

    public void setInternetName(String internetName) {
        this.internetName = internetName;
    }

    @JsonProperty("packagesTitle")
    public String getPackagesName() {
        return packagesName;
    }

    public void setPackagesName(String packagesName) {
        this.packagesName = packagesName;
    }

    @JsonProperty("vmsTitle")
    public String getVmsName() {
        return vmsName;
    }

    public void setVmsName(String vmsName) {
        this.vmsName = vmsName;
    }

    @JsonProperty("smsTitle")
    public String getSmsName() {
        return smsName;
    }

    public void setSmsName(String smsName) {
        this.smsName = smsName;
    }

    @JsonProperty("internationalRoamingChargesTitle")
    public String getInternationalRoamingChargesName() {
        return internationalRoamingChargesName;
    }

    public void setInternationalRoamingChargesName(String internationalRoamingChargesName) {
        this.internationalRoamingChargesName = internationalRoamingChargesName;
    }

    @JsonProperty("InternationVoiceCallsTitle")
    public String getInternationVoiceCallsName() {
        return internationVoiceCallsName;
    }

    @JsonProperty("localVoiceCallsTitle")
    public void setInternationVoiceCallsName(String internationVoiceCallsName) {
        this.internationVoiceCallsName = internationVoiceCallsName;
    }

    public String getLocalVoiceCallsName() {
        return localVoiceCallsName;
    }

    public void setLocalVoiceCallsName(String localVoiceCallsName) {
        this.localVoiceCallsName = localVoiceCallsName;
    }

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
