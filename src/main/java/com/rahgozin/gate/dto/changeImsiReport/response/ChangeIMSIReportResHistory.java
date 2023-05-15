package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangeIMSIReportResHistory {
    @JsonProperty("businessFee")
    private String businessFee;
    @JsonProperty("channelId")
    private String channelId;
    @JsonProperty("createProleId")
    private String createProleId;
    @JsonProperty("createProleType")
    private String createProleType;
    @JsonProperty("createTime")
    private String createTime;
    @JsonProperty("newIMSI")
    private String newIMSI;
    @JsonProperty("oldIMSI")
    private String oldIMSI;
    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("businessFee")
    public void setBusinessFee(String businessFee) {
        this.businessFee = businessFee;
    }

    @JsonProperty("businessFee")
    public String getBusinessFee() {
        return businessFee;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @JsonProperty("channelId")
    public String getChannelId() {
        return channelId;
    }

    @JsonProperty("createProleId")
    public void setCreateProleId(String createProleId) {
        this.createProleId = createProleId;
    }

    @JsonProperty("createProleId")
    public String getCreateProleId() {
        return createProleId;
    }

    @JsonProperty("createProleType")
    public void setCreateProleType(String createProleType) {
        this.createProleType = createProleType;
    }

    @JsonProperty("createProleType")
    public String getCreateProleType() {
        return createProleType;
    }

    @JsonProperty("createTime")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @JsonProperty("createTime")
    public String getCreateTime() {
        return createTime;
    }

    @JsonProperty("newIMSI")
    public void setNewIMSI(String newIMSI) {
        this.newIMSI = newIMSI;
    }

    @JsonProperty("newIMSI")
    public String getNewIMSI() {
        return newIMSI;
    }

    @JsonProperty("oldIMSI")
    public void setOldIMSI(String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }

    @JsonProperty("oldIMSI")
    public String getOldIMSI() {
        return oldIMSI;
    }

    @JsonProperty("orderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }
}