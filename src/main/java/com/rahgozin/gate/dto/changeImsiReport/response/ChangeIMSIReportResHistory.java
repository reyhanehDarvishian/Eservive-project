package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeIMSIReportResHistory {
    @JsonProperty("businessFee")
    String businessFee;
    @JsonProperty("channelId")
    String channelId;
    @JsonProperty("createProleId")
    String createProleId;
    @JsonProperty("createProleType")
    String createProleType;
    @JsonProperty("createTime")
    String createTime;
    @JsonProperty("newIMSI")
    String newIMSI;
    @JsonProperty("oldIMSI")
    String oldIMSI;
    @JsonProperty("orderId")
    String orderId;

    public void setBusinessFee(String businessFee) {
        this.businessFee = businessFee;
    }

    @XmlAttribute(name = "businessFee")
    public String getBusinessFee() {
        return businessFee;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @XmlAttribute(name = "channelId")
    public String getChannelId() {
        return channelId;
    }

    public void setCreateProleId(String createProleId) {
        this.createProleId = createProleId;
    }

    @XmlAttribute(name = "createProleId")
    public String getCreateProleId() {
        return createProleId;
    }

    public void setCreateProleType(String createProleType) {
        this.createProleType = createProleType;
    }

    @XmlAttribute(name = "createProleType")
    public String getCreateProleType() {
        return createProleType;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @XmlAttribute(name = "createTime")
    public String getCreateTime() {
        return createTime;
    }

    public void setNewIMSI(String newIMSI) {
        this.newIMSI = newIMSI;
    }

    @XmlAttribute(name = "newIMSI")
    public String getNewIMSI() {
        return newIMSI;
    }

    public void setOldIMSI(String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }

    @XmlAttribute(name = "oldIMSI")
    public String getOldIMSI() {
        return oldIMSI;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @XmlAttribute(name = "orderId")
    public String getOrderId() {
        return orderId;
    }
}