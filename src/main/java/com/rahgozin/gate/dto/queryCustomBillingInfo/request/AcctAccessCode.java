package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class AcctAccessCode {

    @JsonProperty("arc1:PrimaryIdentity")
    String primaryIdentity = "";

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @XmlAttribute(name = "arc1:PrimaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

}