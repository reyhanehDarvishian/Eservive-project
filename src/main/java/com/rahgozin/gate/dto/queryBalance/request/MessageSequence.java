package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class MessageSequence {
    @JacksonXmlText
    private String messageSeq;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String messageSeqSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }
}
