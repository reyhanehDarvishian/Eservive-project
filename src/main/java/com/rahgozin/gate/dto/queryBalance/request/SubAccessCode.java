package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class SubAccessCode {
    @JsonProperty("arc:PrimaryIdentity")
    PrimaryIdentity primaryIdentity;

    @JsonIgnore
    @XmlElement(name = "arc:PrimaryIdentity")
    public PrimaryIdentity getPrimaryIdentity() {
        if (primaryIdentity == null) primaryIdentity = new PrimaryIdentity();
        return primaryIdentity;
    }

    public void setPrimaryIdentity(PrimaryIdentity primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}