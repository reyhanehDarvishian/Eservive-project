package com.rahgozin.gate.dto.topIn.requestOrder.request;

public class RequestOrder {

    private String telNum;
    private String telGift;
    private String amount;
    private String productId;
    private String payloadId;
    private String channelId;

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getTelGift() {
        return telGift;
    }

    public void setTelGift(String telGift) {
        this.telGift = telGift;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "RequestOrder{" +
                "telNum='" + telNum + '\'' +
                ", telGift='" + telGift + '\'' +
                ", amount='" + amount + '\'' +
                ", productId='" + productId + '\'' +
                ", payloadId='" + payloadId + '\'' +
                ", channelId='" + channelId + '\'' +
                '}';
    }
}
