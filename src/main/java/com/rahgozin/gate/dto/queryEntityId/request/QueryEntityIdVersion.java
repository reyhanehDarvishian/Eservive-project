package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryEntityIdVersion {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crmheader = "http://www.huawei.com/bes/crminterface/crmheader";
    @JacksonXmlText
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}