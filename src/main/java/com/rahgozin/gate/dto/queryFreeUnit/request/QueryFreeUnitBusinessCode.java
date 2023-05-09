package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryFreeUnitBusinessCode {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns3")
    private String cbscommon = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    @JacksonXmlText
    private String businessCode;

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }
}
