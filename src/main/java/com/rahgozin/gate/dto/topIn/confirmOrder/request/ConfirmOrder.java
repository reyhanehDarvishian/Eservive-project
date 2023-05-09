package com.rahgozin.gate.dto.topIn.confirmOrder.request;

public class ConfirmOrder {
    private String orderId;
    private String bankCode;
    private String cardNo;
    private String cardType;
    private String RRN;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getRRN() {
        return RRN;
    }

    public void setRRN(String RRN) {
        this.RRN = RRN;
    }

    @Override
    public String toString() {
        return "ConfirmOrder{" +
                "orderId='" + orderId + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cardType='" + cardType + '\'' +
                ", RRN='" + RRN + '\'' +
                '}';
    }
}
