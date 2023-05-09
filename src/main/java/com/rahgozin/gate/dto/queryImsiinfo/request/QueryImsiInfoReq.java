package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryImsiInfoReq {
    @JsonProperty("ns2:mobileNumber")
    String mobileNumber;

    @XmlElement(name = "ns2:mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}