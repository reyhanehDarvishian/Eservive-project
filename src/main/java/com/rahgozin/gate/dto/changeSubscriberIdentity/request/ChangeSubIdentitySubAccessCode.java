package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeSubIdentitySubAccessCode {
    @JsonProperty("cms:primaryIdentity")
    private String primaryIdentity;

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @XmlAttribute(name = "cms:primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }
}