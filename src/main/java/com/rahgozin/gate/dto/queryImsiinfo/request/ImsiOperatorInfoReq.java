package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class ImsiOperatorInfoReq {
    @JsonProperty("operatorId")
    Integer operatorId;

    @JsonProperty("orgId")
    Integer orgId;

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String operatorInfo = "http://www.huawei.com/bes/crminterface/crmheader";


    @XmlElement(name = "operatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @XmlElement(name = "orgId")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}
