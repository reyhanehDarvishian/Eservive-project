package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryFreeUnitAccessSecurity {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String schemaLocation = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("LoginSystemCode")
    private String loginSystemCode;
    @JsonProperty("Password")
    private String password;

    public void setLoginSystemCode(String loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlAttribute(name = "LoginSystemCode")
    public String getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlAttribute(name = "Password")
    public String getPassword() {
        return password;
    }

}