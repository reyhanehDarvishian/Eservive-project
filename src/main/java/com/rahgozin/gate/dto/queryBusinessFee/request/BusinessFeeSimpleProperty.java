package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class BusinessFeeSimpleProperty {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:com")
    private String schemaLocation = "http://www.huawei.com/bes/crminterface/common";

    @JsonProperty("com:code")
    String code;

    @JsonProperty("com:value")
    String value;

    @XmlElement(name = "com:code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement(name = "com:value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BusinessFeeSimpleProperty(String code, String value) {
        this.code = code;
        this.value = value;
    }

}