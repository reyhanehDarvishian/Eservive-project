package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeSubIdentityOperatorInfoReq {
    @JsonProperty("crm:operatorId")
    private String operatorId;
    @JsonProperty("crm:orgId")
    private String orgId;

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @XmlAttribute(name = "crm:operatorId")
    public String getOperatorId() {
        return operatorId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @XmlAttribute(name = "crm:orgId")
    public String getOrgId() {
        return orgId;
    }
}