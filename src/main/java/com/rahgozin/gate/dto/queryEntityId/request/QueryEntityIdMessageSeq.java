package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryEntityIdMessageSeq {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crm = "http://www.huawei.com/bes/crminterface/crmheader";
    @JacksonXmlText
    private String messageSeq;

    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }
}
