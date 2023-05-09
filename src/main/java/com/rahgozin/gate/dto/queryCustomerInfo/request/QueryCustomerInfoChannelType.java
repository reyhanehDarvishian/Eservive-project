package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryCustomerInfoChannelType {

    private String channelType;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns3")
    private String channelTypeSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}