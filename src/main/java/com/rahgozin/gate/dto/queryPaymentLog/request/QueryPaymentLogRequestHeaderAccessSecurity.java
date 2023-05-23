package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryPaymentLogRequestHeaderAccessSecurity {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String accessSecuritySchema = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("LoginSystemCode")
    private String loginSystemCode;
    @JsonProperty("Password")
    private String password;

    @XmlAttribute(name = "LoginSystemCode")
    public String getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setLoginSystemCode(String loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlAttribute(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
