package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdSubAccessCode {

    @JsonProperty("cms:primaryIdentity")
    private String primaryIdentity;

    @XmlElement(name = "cms:primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}