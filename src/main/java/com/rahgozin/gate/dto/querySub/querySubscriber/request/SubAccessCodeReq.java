package com.rahgozin.gate.dto.querySub.querySubscriber.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class SubAccessCodeReq {
    @JsonProperty("cms:primaryIdentity")
    String primaryIdentity;

    @XmlElement(name = "cms:primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}