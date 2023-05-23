package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AccessMode",
        "AcctKey",
        "SubKey",
        "PrimaryIdentity",
        "TransID",
        "TransType",
        "ExtTransID",
        "PaymentTime",
        "Amount",
        "CurrencyID",
        "OriAmount",
        "PaymentDetail",
        "PaymentMethod",
        "BankInfo",
        "PayChannelID",
        "Status",
        "OperID",
        "DeptID",
        "AdditionalProperty",
        "TotalPaymentAmount",
        "CurAmount"
})
@Generated("jsonschema2pojo")
public class PaymentInfo {
    String accessMode = "";
    String acctKey = "";
    String amount = "";
    String curAmount = "";
    String currencyID = "";
    String custKey = "";
    String deptID = "";
    String extTransID = "";
    String operID = "";
    String oriAmount = "";
    String payChannelID = "";
    String paymentMethod = "";
    String paymentTime = "";
    String primaryIdentity = "";
    String status = "";
    String subKey = "";
    String totalPaymentAmount = "";
    String transID = "";
    String transType = "";
    AdditionalProperty additionalProperty;
    private List<AdditionalProperty> additionalProperties = new ArrayList<>();
    BankInfo bankInfo;
    PaymentDetail paymentDetail;
    private List<PaymentDetail> paymentDetails = new ArrayList<>();

    public void addToFreeUnitItems(PaymentDetail paymentDetail) {
        paymentDetails.add(paymentDetail);
    }

    public void addToAdditionalProperties(AdditionalProperty additionalProperty) {
        additionalProperties.add(additionalProperty);
    }

    public List<AdditionalProperty> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(List<AdditionalProperty> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public List<PaymentDetail> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(List<PaymentDetail> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @JsonProperty("AccessMode")
    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    @JsonProperty("accessMode")
    public String getAccessMode() {
        return accessMode;
    }

    @JsonProperty("AcctKey")
    public void setAcctKey(String acctKey) {
        this.acctKey = acctKey;
    }

    @JsonProperty("acctKey")
    public String getAcctKey() {
        return acctKey;
    }

    @JsonProperty("Amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("CurAmount")
    public void setCurAmount(String curAmount) {
        this.curAmount = curAmount;
    }

    @JsonProperty("curAmount")
    public String getCurAmount() {
        return curAmount;
    }

    @JsonProperty("CurrencyID")
    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    @JsonProperty("currencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    @JsonProperty("CustKey")
    public void setCustKey(String custKey) {
        this.custKey = custKey;
    }

    @JsonProperty("custKey")
    public String getCustKey() {
        return custKey;
    }

    @JsonProperty("DeptID")
    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    @JsonProperty("deptID")
    public String getDeptID() {
        return deptID;
    }

    @JsonProperty("ExtTransID")
    public void setExtTransID(String extTransID) {
        this.extTransID = extTransID;
    }

    @JsonProperty("extTransID")
    public String getExtTransID() {
        return extTransID;
    }

    @JsonProperty("OperID")
    public void setOperID(String operID) {
        this.operID = operID;
    }

    @JsonProperty("operID")
    public String getOperID() {
        return operID;
    }

    @JsonProperty("OriAmount")
    public void setOriAmount(String oriAmount) {
        this.oriAmount = oriAmount;
    }

    @JsonProperty("oriAmount")
    public String getOriAmount() {
        return oriAmount;
    }

    @JsonProperty("PayChannelID")
    public void setPayChannelID(String payChannelID) {
        this.payChannelID = payChannelID;
    }

    @JsonProperty("payChannelID")
    public String getPayChannelID() {
        return payChannelID;
    }

    @JsonProperty("PaymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("PaymentTime")
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    @JsonProperty("paymentTime")
    public String getPaymentTime() {
        return paymentTime;
    }

    @JsonProperty("PrimaryIdentity")
    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @JsonProperty("primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("SubKey")
    public void setSubKey(String subKey) {
        this.subKey = subKey;
    }

    @JsonProperty("subKey")
    public String getSubKey() {
        return subKey;
    }

    @JsonProperty("TotalPaymentAmount")
    public void setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @JsonProperty("totalPaymentAmount")
    public String getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    @JsonProperty("TransID")
    public void setTransID(String transID) {
        this.transID = transID;
    }

    @JsonProperty("transID")
    public String getTransID() {
        return transID;
    }

    @JsonProperty("TransType")
    public void setTransType(String transType) {
        this.transType = transType;
    }

    @JsonProperty("transType")
    public String getTransType() {
        return transType;
    }

    @JsonProperty("additionalProperty")
    public AdditionalProperty getAdditionalProperty() {
        if (additionalProperty == null) additionalProperty = new AdditionalProperty();
        return additionalProperty;
    }

    @JsonProperty("AdditionalProperty")
    public void setAdditionalProperty(AdditionalProperty additionalProperty) {
        addToAdditionalProperties(additionalProperty);
        this.additionalProperty = additionalProperty;
    }

    @JsonProperty("bankInfo")
    public BankInfo getBankInfo() {
        if (bankInfo == null) bankInfo = new BankInfo();
        return bankInfo;
    }

    @JsonProperty("BankInfo")
    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    @JsonProperty("paymentDetail")
    public PaymentDetail getPaymentDetail() {
        if (paymentDetail == null) paymentDetail = new PaymentDetail();
        return paymentDetail;
    }

    @JsonProperty("PaymentDetail")
    public void setPaymentDetail(PaymentDetail paymentDetail) {
        addToFreeUnitItems(paymentDetail);
        this.paymentDetail = paymentDetail;
    }

}