package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdOwnershipInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String crmheader = "http://www.huawei.com/bes/crminterface/crmheader";
    @JsonProperty("beId")
    String beId;
    @JsonProperty("regionId")
    String regionId;

    public void setBeId(String beId) {
        this.beId = beId;
    }

    @XmlElement(name = "beId")
    public String getBeId() {
        return beId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @XmlElement(name = "regionId")
    public String getRegionId() {
        return regionId;
    }

}