package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdAccessSecurity {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String schemaLocation = "http://www.huawei.com/bes/crminterface/crmheader";
    @JsonProperty("loginSystemCode")
    String loginSystemCode;
    @JsonProperty("password")
    String password;

    public void setLoginSystemCode(String loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlElement(name = "loginSystemCode")
    public String getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name = "password")
    public String getPassword() {
        return password;
    }
}