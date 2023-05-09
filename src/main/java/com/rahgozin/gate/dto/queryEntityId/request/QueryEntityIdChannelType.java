package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryEntityIdChannelType {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crm = "http://www.huawei.com/bes/crminterface/crmheader";

    @JacksonXmlText
    private String channelType;

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
