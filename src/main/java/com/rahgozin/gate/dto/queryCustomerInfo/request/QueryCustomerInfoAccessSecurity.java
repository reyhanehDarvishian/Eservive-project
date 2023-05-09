package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryCustomerInfoAccessSecurity {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String accessSecuritySchema = "http://www.huawei.com/bes/crminterface/crmheader";

    @JsonProperty("loginSystemCode")
    private String loginSystemCode;
    @JsonProperty("password")
    private String password;

    public void setLoginSystemCode(String loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlAttribute(name = "loginSystemCode")
    public String getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlAttribute(name = "password")
    public String getPassword() {
        return password;
    }
}