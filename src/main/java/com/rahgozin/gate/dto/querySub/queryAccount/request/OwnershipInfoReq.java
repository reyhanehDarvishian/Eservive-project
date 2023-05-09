package com.rahgozin.gate.dto.querySub.queryAccount.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class OwnershipInfoReq {
    @JsonProperty("crm:beId")
    Integer beId;
    @JsonProperty("crm:regionId")
    Integer regionId;

    @XmlElement(name = "crm:beId")
    public Integer getBeId() {
        return beId;
    }

    public void setBeId(Integer beId) {
        this.beId = beId;
    }

    @XmlElement(name = "crm:regionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

}