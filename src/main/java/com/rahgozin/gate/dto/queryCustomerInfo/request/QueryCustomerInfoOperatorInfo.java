package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryCustomerInfoOperatorInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String operatorInfoSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    @JsonProperty("operatorId")
    private String operatorId;
    @JsonProperty("orgId")
    private String orgId;

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @XmlAttribute(name = "operatorId")
    public String getOperatorId() {
        return operatorId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @XmlAttribute(name = "orgId")
    public String getOrgId() {
        return orgId;
    }

}