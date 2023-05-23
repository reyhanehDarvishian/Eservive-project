package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryPaymentLogRequestHeaderBusinessCode {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String businessCodeSchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JacksonXmlText
    private String businessCode;

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }
}
