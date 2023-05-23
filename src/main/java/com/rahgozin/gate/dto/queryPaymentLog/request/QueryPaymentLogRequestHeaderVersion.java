package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryPaymentLogRequestHeaderVersion {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String versionSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JacksonXmlText
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
