package com.rahgozin.gate.dto.querySub.queryAccount.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class OperatorInfoReq {
    @JsonProperty("OperatorId")
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

    @XmlElement(name = "OperatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

}