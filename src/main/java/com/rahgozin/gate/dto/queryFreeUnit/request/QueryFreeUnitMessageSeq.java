package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryFreeUnitMessageSeq {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String cbscommon = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    @JacksonXmlText
    private String messageSeq;

    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }
}