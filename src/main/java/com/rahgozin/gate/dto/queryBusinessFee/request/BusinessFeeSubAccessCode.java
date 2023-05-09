package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class BusinessFeeSubAccessCode {

    @JsonProperty("cus:primaryIdentity")
    String primaryIdentity;
    @JsonIgnore
    Number subscriberId;
    @JsonIgnore
    String imsi;
    @JsonIgnore
    String iccId;

    @JsonIgnore
    public Number getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Number subscriberId) {
        this.subscriberId = subscriberId;
    }

    @JsonIgnore
    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonIgnore
    public String getIccId() {
        return iccId;
    }

    public void setIccId(String iccId) {
        this.iccId = iccId;
    }

    @XmlElement(name = "cus:primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}