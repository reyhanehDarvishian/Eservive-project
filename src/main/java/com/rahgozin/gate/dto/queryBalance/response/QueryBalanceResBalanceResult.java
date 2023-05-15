package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "balanceType",
        "balanceTypeName",
        "totalAmount",
        "depositFlag",
        "refundFlag",
        "currencyID",
        "balanceDetail"
})
@Generated("jsonschema2pojo")
public class QueryBalanceResBalanceResult {
    private String balanceType;
    private String balanceTypeName;
    private String totalAmount;
    private String depositFlag;
    private String refundFlag;
    private String currencyID;
    private BalanceDetail balanceDetail;

    @JsonProperty("BalanceType")
    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    @JsonProperty("balanceType")
    public String getBalanceType() {
        return balanceType;
    }

    @JsonProperty("BalanceTypeName")
    public void setBalanceTypeName(String balanceTypeName) {
        this.balanceTypeName = balanceTypeName;
    }

    @JsonProperty("balanceTypeName")
    public String getBalanceTypeName() {
        return balanceTypeName;
    }

    @JsonProperty("CurrencyID")
    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    @JsonProperty("currencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    @JsonProperty("DepositFlag")
    public void setDepositFlag(String depositFlag) {
        this.depositFlag = depositFlag;
    }

    @JsonProperty("depositFlag")
    public String getDepositFlag() {
        return depositFlag;
    }

    @JsonProperty("RefundFlag")
    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }

    @JsonProperty("refundFlag")
    public String getRefundFlag() {
        return refundFlag;
    }

    @JsonProperty("TotalAmount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("totalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("balanceDetail")
    public BalanceDetail getBalanceDetail() {
        return balanceDetail;
    }

    @JsonProperty("BalanceDetail")
    public void setBalanceDetail(BalanceDetail balanceDetail) {
        this.balanceDetail = balanceDetail;
    }
}