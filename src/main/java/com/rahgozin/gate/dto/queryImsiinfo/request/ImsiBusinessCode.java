package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class ImsiBusinessCode {

    @JacksonXmlText
    private String businessCode;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String businessCodeSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }
}
