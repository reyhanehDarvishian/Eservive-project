package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryEntityIdBusinessCode {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crm = "http://www.huawei.com/bes/crminterface/crmheader";

    @JacksonXmlText
    private String businessCode;

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }
}
