package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryCustomerInfoVersion {
    @JacksonXmlText
    private String version;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns3")
    private String versionSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
