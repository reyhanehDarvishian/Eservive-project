package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class ImsiMessageSeq {

    @JacksonXmlText
    private String messageSeq;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String messageSeqSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }
}
