package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryPaymentLogRequestHeaderOwnershipInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String ownershipInfoSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("BEID")
    private String beId;

    @XmlAttribute(name = "beId")
    public String getBeId() {
        return beId;
    }

    public void setBeId(String beId) {
        this.beId = beId;
    }
}
