package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class FreeUnitItemDetail {
    String freeUnitInstanceID;
    String initialAmount;
    String currentAmount;
    String usedAmount;
    String effectiveTime;
    String expireTime;
    @JsonProperty("FreeUnitOrigin")
    FreeUnitOrigin freeUnitOrigin;
    String rollOverFlag;
    String lastRollOveredTime;

    public void setCurrentAmount(String currentAmount) {
        this.currentAmount = currentAmount;
    }

    @XmlAttribute(name = "CurrentAmount")
    public String getCurrentAmount() {
        return currentAmount;
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

    public void setFreeUnitInstanceID(String freeUnitInstanceID) {
        this.freeUnitInstanceID = freeUnitInstanceID;
    }

    @XmlAttribute(name = "FreeUnitInstanceID")
    public String getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }

    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    @XmlAttribute(name = "InitialAmount")
    public String getInitialAmount() {
        return initialAmount;
    }

    public void setLastRollOveredTime(String lastRollOveredTime) {
        this.lastRollOveredTime = lastRollOveredTime;
    }

    @XmlAttribute(name = "bbs:LastRollOveredTime")
    public String getLastRollOveredTime() {
        return lastRollOveredTime;
    }

    public void setRollOverFlag(String rollOverFlag) {
        this.rollOverFlag = rollOverFlag;
    }

    @XmlAttribute(name = "bbs:RollOverFlag")
    public String getRollOverFlag() {
        return rollOverFlag;
    }

    public void setUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
    }

    @XmlAttribute(name = "bbs:UsedAmount")
    public String getUsedAmount() {
        return usedAmount;
    }

    @XmlElement(name = "bbs:FreeUnitOrigin")
    public FreeUnitOrigin getFreeUnitOrigin() {
        if (freeUnitOrigin == null) freeUnitOrigin = new FreeUnitOrigin();
        return freeUnitOrigin;
    }

    public void setFreeUnitOrigin(FreeUnitOrigin freeUnitOrigin) {
        this.freeUnitOrigin = freeUnitOrigin;
    }
}