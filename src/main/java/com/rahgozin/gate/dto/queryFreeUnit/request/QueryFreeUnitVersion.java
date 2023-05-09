package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryFreeUnitVersion {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String cbscommon = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JacksonXmlText
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
