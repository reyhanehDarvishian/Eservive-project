package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class BalanceResult {
    String balanceType;
    String balanceTypeName;
    String currencyID;
    String depositFlag;
    String refundFlag;
    String totalAmount;
    @JsonProperty("BalanceDetail")
    List<BalanceDetailBean> balanceDetailBeanList;

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

    public void setBalanceDetailBeanList(List<BalanceDetailBean> balanceDetailBeanList) {
        this.balanceDetailBeanList = balanceDetailBeanList;
    }

    @XmlElement(name = "BalanceDetail")
    public List<BalanceDetailBean> getBalanceDetailBeanList() {
        if (balanceDetailBeanList == null)
            balanceDetailBeanList = new ArrayList<BalanceDetailBean>();
        return balanceDetailBeanList;
    }
}