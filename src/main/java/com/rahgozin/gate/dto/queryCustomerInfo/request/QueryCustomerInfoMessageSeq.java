package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryCustomerInfoMessageSeq {
    @JacksonXmlText
    private String messageSeq;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns3")
    private String messageSeqSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }
}
