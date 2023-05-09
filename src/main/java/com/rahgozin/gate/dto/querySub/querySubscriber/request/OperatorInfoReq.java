package com.rahgozin.gate.dto.querySub.querySubscriber.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class OperatorInfoReq {
    @JsonProperty("crm:operatorId")
    Integer operatorId;

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @XmlElement(name = "crm:operatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

}