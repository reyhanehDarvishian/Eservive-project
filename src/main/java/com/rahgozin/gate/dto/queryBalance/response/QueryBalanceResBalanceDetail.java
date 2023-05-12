package com.rahgozin.gate.dto.queryBalance.response;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryBalanceResBalanceDetail {
    String balanceInstanceID;
    String amount;
    String initialAmount;
    String usedAmount;
    String effectiveTime;
    String expireTime;

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @XmlAttribute(name = "Amount")
    public String getAmount() {
        return amount;
    }

    public void setBalanceInstanceID(String balanceInstanceID) {
        this.balanceInstanceID = balanceInstanceID;
    }

    @XmlAttribute(name = "BalanceInstanceID")
    public String getBalanceInstanceID() {
        return balanceInstanceID;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    @XmlAttribute(name = "EffectiveTime")
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @XmlAttribute(name = "ExpireTime")
    public String getExpireTime() {
        return expireTime;
    }

    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    @XmlAttribute(name = "InitialAmount")
    public String getInitialAmount() {
        return initialAmount;
    }

    public void setUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
    }

    @XmlAttribute(name = "UsedAmount")
    public String getUsedAmount() {
        return usedAmount;
    }
}