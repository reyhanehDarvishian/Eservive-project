package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryPaymentLogRequestHeaderVersion {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String versionSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
