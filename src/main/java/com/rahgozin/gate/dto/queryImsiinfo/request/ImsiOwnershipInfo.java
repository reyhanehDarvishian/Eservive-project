package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class ImsiOwnershipInfo {
    @JsonProperty("beId")
    Integer beId;
    @JsonProperty("regionId")
    Integer regionId;

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String ownershipInfo  = "http://www.huawei.com/bes/crminterface/crmheader";

    @XmlElement(name = "beId")
    public Integer getBeId() {
        return beId;
    }

    public void setBeId(Integer beId) {
        this.beId = beId;
    }

    @XmlElement(name = "regionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}