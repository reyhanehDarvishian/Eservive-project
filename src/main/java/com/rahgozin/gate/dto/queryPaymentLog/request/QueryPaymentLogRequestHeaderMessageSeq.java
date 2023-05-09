package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryPaymentLogRequestHeaderMessageSeq {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String messageSeqSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    private String messageSeq;

    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }
}
