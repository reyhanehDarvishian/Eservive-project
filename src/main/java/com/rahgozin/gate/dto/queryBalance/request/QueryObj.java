package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryObj {
    @JsonProperty("ars:SubAccessCode")
    SubAccessCode subAccessCode;

    @XmlElement(name = "ars:SubAccessCode")
    public SubAccessCode getSubAccessCode() {
        if (subAccessCode == null) subAccessCode = new SubAccessCode();
        return subAccessCode;
    }

    public void setSubAccessCode(SubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }
}