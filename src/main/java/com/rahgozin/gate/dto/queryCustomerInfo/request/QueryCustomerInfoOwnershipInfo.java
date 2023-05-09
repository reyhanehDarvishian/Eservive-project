package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryCustomerInfoOwnershipInfo {
    @JsonProperty("beId")
    private String beId;
    @JsonProperty("regionId")
    private String regionId;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String ownershipInfoSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public void setBeId(String beId) {
        this.beId = beId;
    }

    @XmlAttribute(name = "beId")
    public String getBeId() {
        return beId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @XmlAttribute(name = "regionId")
    public String getRegionId() {
        return regionId;
    }

}