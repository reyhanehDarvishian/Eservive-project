package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeImsiReportOperatorInfo {
    @JsonProperty("crm:operatorId")
    private String operatorId;

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @XmlAttribute(name = "crm:operatorId")
    public String getOperatorId() {
        return operatorId;
    }
}