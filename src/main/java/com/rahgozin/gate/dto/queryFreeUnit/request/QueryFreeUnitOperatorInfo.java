package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryFreeUnitOperatorInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String schemaLocation = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("OperatorID")
    private String operatorID;
    @JsonProperty("ChannelID")
    private String channelID;

    public void setChannelID(String channelID) {
        this.channelID = channelID;
    }

    @XmlAttribute(name = "ChannelID")
    public String getChannelID() {
        return channelID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    @XmlAttribute(name = "OperatorID")
    public String getOperatorID() {
        return operatorID;
    }

}