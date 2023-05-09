package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.xml.bind.annotation.XmlElement;

public class PrimaryIdentity {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:arc")
    private String schemaLocation = "http://cbs.huawei.com/ar/wsservice/arcommon";

    @JacksonXmlText
    String primaryIdentity;

    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}
