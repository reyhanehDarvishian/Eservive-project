package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryPaymentLogRequestHeaderOperatorInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String operatorInfoSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("OperatorID")
    private String operatorId;
    @JsonProperty("ChannelID")
    private String channelId;

    @XmlAttribute(name = "OperatorID")
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @XmlAttribute(name = "ChannelID")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
