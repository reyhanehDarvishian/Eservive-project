package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryCustomerInfoMessageSeq {

    private String messageSeq;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns3")
    private String messageSeqSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }
}
