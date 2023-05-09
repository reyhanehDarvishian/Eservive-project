package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Version {
    @JacksonXmlText
    private Integer version;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String versionSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
