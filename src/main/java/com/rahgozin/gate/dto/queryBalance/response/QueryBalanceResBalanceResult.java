package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryBalanceResBalanceResult {
    String balanceType;
    String balanceTypeName;
    String totalAmount;
    String depositFlag;
    String refundFlag;
    String currencyID;
    @JsonProperty("BalanceDetail")
    QueryBalanceResBalanceDetail queryBalanceResBalanceDetail;

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    @XmlAttribute(name = "BalanceType")
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceTypeName(String balanceTypeName) {
        this.balanceTypeName = balanceTypeName;
    }

    @XmlAttribute(name = "BalanceTypeName")
    public String getBalanceTypeName() {
        return balanceTypeName;
    }

    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    @XmlAttribute(name = "CurrencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    public void setDepositFlag(String depositFlag) {
        this.depositFlag = depositFlag;
    }

    @XmlAttribute(name = "DepositFlag")
    public String getDepositFlag() {
        return depositFlag;
    }

    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }

    @XmlAttribute(name = "RefundFlag")
    public String getRefundFlag() {
        return refundFlag;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @XmlAttribute(name = "TotalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }


    @XmlElement(name = "BalanceDetail")
    public QueryBalanceResBalanceDetail getQueryBalanceResBalanceDetail() {
        if (queryBalanceResBalanceDetail == null) queryBalanceResBalanceDetail = new QueryBalanceResBalanceDetail();
        return queryBalanceResBalanceDetail;
    }

    public void setQueryBalanceResBalanceDetail(QueryBalanceResBalanceDetail queryBalanceResBalanceDetail) {
        this.queryBalanceResBalanceDetail = queryBalanceResBalanceDetail;
    }
}