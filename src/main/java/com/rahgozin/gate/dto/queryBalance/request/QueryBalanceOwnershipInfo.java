package com.rahgozin.gate.dto.queryBalance.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceOwnershipInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String schemaLocation = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("BEID")
    String beId;

    @XmlElement(name = "BEID")
    public String getBeId() {
        return beId;
    }

    public void setBeId(String beId) {
        this.beId = beId;
    }
}
