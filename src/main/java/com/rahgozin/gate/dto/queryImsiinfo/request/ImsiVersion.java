package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class ImsiVersion {
    @JacksonXmlText
    private Integer version;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String versionSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}