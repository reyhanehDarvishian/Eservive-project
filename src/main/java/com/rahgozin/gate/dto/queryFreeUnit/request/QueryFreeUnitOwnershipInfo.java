package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryFreeUnitOwnershipInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String schemaLocation = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    @JsonProperty("BEID")
    private String bEID;

    public void setBEID(String bEID) {
        this.bEID = bEID;
    }

    @XmlAttribute(name = "BEID")
    public String getBEID() {
        return bEID;
    }

}