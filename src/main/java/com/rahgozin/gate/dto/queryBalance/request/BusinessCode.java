package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class BusinessCode {
    @JacksonXmlText
    private String businessCode;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String businessCodeSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

}
