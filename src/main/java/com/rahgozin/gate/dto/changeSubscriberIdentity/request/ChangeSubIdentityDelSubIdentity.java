package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeSubIdentityDelSubIdentity {
    @JsonProperty("cms:subIdentity")
    private String subIdentity;
    @JsonProperty("cms:subIdentityType")
    private String subIdentityType;

    public void setSubIdentity(String subIdentity) {
        this.subIdentity = subIdentity;
    }

    @XmlAttribute(name = "cms:subIdentity")
    public String getSubIdentity() {
        return subIdentity;
    }

    public void setSubIdentityType(String subIdentityType) {
        this.subIdentityType = subIdentityType;
    }

    @XmlAttribute(name = "cms:subIdentityType")
    public String getSubIdentityType() {
        return subIdentityType;
    }

    public ChangeSubIdentityDelSubIdentity(String subIdentityType, String subIdentity) {
        this.subIdentity = subIdentity;
        this.subIdentityType = subIdentityType;
    }
}