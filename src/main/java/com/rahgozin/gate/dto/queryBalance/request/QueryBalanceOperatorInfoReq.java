package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceOperatorInfoReq {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String schemaLocation = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("OperatorID")
    Integer operatorId;
    @JsonProperty("ChannelID")
    Integer channelId;

    @XmlElement(name = "ChannelID")
    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @XmlElement(name = "OperatorID")
    public Integer getOperatorId() {
        return operatorId;
    }

}
