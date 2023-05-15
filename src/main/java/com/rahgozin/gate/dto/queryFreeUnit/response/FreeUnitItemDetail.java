package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FreeUnitInstanceID",
        "InitialAmount",
        "CurrentAmount",
        "UsedAmount",
        "EffectiveTime",
        "ExpireTime",
        "FreeUnitOrigin",
        "RollOverFlag",
        "LastRollOveredTime",
})
@Generated("jsonschema2pojo")
public class FreeUnitItemDetail {
    String freeUnitInstanceID;
    String initialAmount;
    String currentAmount;
    String usedAmount;
    String effectiveTime;
    String expireTime;
    private FreeUnitOrigin freeUnitOrigin;
    String rollOverFlag;
    String lastRollOveredTime;

    @JsonProperty("CurrentAmount")
    public void setCurrentAmount(String currentAmount) {
        this.currentAmount = currentAmount;
    }

    @JsonProperty("currentAmount")
    public String getCurrentAmount() {
        return currentAmount;
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

    @JsonProperty("FreeUnitInstanceID")
    public void setFreeUnitInstanceID(String freeUnitInstanceID) {
        this.freeUnitInstanceID = freeUnitInstanceID;
    }

    @JsonProperty("freeUnitInstanceID")
    public String getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }

    @JsonProperty("InitialAmount")
    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    @JsonProperty("initialAmount")
    public String getInitialAmount() {
        return initialAmount;
    }

    @JsonProperty("LastRollOveredTime")
    public void setLastRollOveredTime(String lastRollOveredTime) {
        this.lastRollOveredTime = lastRollOveredTime;
    }

    @JsonProperty("lastRollOveredTime")
    public String getLastRollOveredTime() {
        return lastRollOveredTime;
    }

    @JsonProperty("RollOverFlag")
    public void setRollOverFlag(String rollOverFlag) {
        this.rollOverFlag = rollOverFlag;
    }

    @JsonProperty("rollOverFlag")
    public String getRollOverFlag() {
        return rollOverFlag;
    }

    @JsonProperty("UsedAmount")
    public void setUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
    }

    @JsonProperty("usedAmount")
    public String getUsedAmount() {
        return usedAmount;
    }

    @JsonProperty("freeUnitOrigin")
    public FreeUnitOrigin getFreeUnitOrigin() {
        return freeUnitOrigin;
    }

    @JsonProperty("FreeUnitOrigin")
    public void setFreeUnitOrigin(FreeUnitOrigin freeUnitOrigin) {
        this.freeUnitOrigin = freeUnitOrigin;
    }
}