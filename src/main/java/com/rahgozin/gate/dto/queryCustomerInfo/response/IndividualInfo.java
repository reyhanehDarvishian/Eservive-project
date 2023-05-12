package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class IndividualInfo {
    @JsonProperty("individualBaseInfo")
    IndividualBaseInfo individualBaseInfo;

    @XmlElement(name = "individualBaseInfo")
    public IndividualBaseInfo getIndividualBaseInfo() {
        if (individualBaseInfo == null) individualBaseInfo = new IndividualBaseInfo();
        return individualBaseInfo;
    }

    public void setIndividualBaseInfo(IndividualBaseInfo individualBaseInfo) {
        this.individualBaseInfo = individualBaseInfo;
    }

}