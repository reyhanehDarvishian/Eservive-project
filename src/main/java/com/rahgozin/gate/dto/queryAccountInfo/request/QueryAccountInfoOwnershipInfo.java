package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryAccountInfoOwnershipInfo {
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