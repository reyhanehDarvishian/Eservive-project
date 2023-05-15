package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class ImsiChannelType {

    @JacksonXmlText
    private Integer channelType;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String channelTypeSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }
}
