package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeSubIdentityOwnershipInfoReq {
    @JsonProperty("crm:beId")
    private String beId;
    @JsonProperty("crm:regionId")
    private String regionId;

    public void setBeId(String beId) {
        this.beId = beId;
    }

    @XmlAttribute(name = "crm:beId")
    public String getBeId() {
        return beId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @XmlAttribute(name = "crm:regionId")
    public String getRegionId() {
        return regionId;
    }
}