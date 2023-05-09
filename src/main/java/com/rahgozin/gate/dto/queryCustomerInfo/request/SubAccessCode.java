package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class SubAccessCode {
    @JsonProperty("ns4:primaryIdentity")
    private String primaryIdentity;

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @XmlAttribute(name = "ns4:primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

}