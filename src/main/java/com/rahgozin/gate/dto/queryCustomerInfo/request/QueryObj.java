package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryObj {

    @JsonProperty("ns4:subAccessCode")
    SubAccessCode subAccessCode;

    @XmlElement(name = "ns4:subAccessCode")
    public SubAccessCode getSubAccessCode() {
        if (subAccessCode == null) subAccessCode = new SubAccessCode();
        return subAccessCode;
    }

    public void setSubAccessCode(SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }
}