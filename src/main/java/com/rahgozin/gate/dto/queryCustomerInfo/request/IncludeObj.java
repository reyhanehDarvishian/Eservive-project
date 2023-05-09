package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class IncludeObj {
    @JsonProperty("ns4:includeAddrFlag")
    private String includeAddrFlag;

    public void setIncludeAddrFlag(String includeAddrFlag) {
        this.includeAddrFlag = includeAddrFlag;
    }

    @XmlAttribute(name = "ns4:includeAddrFlag")
    public String getIncludeAddrFlag() {
        return includeAddrFlag;
    }

}