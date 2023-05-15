package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "balanceInstanceID",
        "amount",
        "initialAmount",
        "usedAmount",
        "effectiveTime",
        "expireTime"
})
@Generated("jsonschema2pojo")
public class BalanceDetail {
    private String balanceInstanceID;
    private String amount;
    private String initialAmount;
    private String usedAmount;
    private String effectiveTime;
    private String expireTime;

    @JsonProperty("Amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("BalanceInstanceID")
    public void setBalanceInstanceID(String balanceInstanceID) {
        this.balanceInstanceID = balanceInstanceID;
    }

    @JsonProperty("balanceInstanceID")
    public String getBalanceInstanceID() {
        return balanceInstanceID;
    }

    @JsonProperty("EffectiveTime")
    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    @JsonProperty("effectiveTime")
    public String getEffectiveTime() {
        return effectiveTime;
    }

    @JsonProperty("ExpireTime")
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @JsonProperty("expireTime")
    public String getExpireTime() {
        return expireTime;
    }

    @JsonProperty("InitialAmount")
    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    @JsonProperty("initialAmount")
    public String getInitialAmount() {
        return initialAmount;
    }

    @JsonProperty("UsedAmount")
    public void setUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
    }

    @JsonProperty("usedAmount")
    public String getUsedAmount() {
        return usedAmount;
    }
}