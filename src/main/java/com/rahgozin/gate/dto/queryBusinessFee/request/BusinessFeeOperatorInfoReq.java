package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class BusinessFeeOperatorInfoReq {
    @JsonProperty("crm:operatorId")
    Integer operatorId;
    @JsonProperty("crm:orgId")
    Integer orgId;

    @XmlElement(name = "crm:operatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @XmlElement(name = "crm:orgId")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}