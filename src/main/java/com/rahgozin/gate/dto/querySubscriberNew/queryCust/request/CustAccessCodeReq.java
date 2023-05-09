package com.rahgozin.gate.dto.querySubscriberNew.queryCust.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class CustAccessCodeReq {
    @JsonProperty("cms:customerId")
    String customerId;

    @XmlElement(name = "cms:customerId")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}