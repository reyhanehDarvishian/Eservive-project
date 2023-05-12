package com.rahgozin.gate.dto.queryAccountInfo.response;

import javax.xml.bind.annotation.XmlAttribute;

public class ExtProperties {
    String code;
    String value;

    public void setCode(String code) {
        this.code = code;
    }

    @XmlAttribute(name = "code")
    public String getCode() {
        return code;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute(name = "value")
    public String getValue() {
        return value;
    }

}