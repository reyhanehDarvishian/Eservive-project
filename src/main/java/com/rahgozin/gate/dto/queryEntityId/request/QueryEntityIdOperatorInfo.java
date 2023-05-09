package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdOperatorInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String crm = "http://www.huawei.com/bes/crminterface/crmheader";
    @JsonProperty("operatorId")
    String operatorId;
    @JsonProperty("orgId")
    String orgId;

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @XmlElement(name = "operatorId")
    public String getOperatorId() {
        return operatorId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @XmlElement(name = "orgId")
    public String getOrgId() {
        return orgId;
    }

}