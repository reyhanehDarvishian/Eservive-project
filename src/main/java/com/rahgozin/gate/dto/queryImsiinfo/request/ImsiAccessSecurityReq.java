package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class ImsiAccessSecurityReq {
    @JsonProperty("loginSystemCode")
    Integer loginSystemCode;
    @JsonProperty("password")
    String password;

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String accessSecurity = "http://www.huawei.com/bes/crminterface/crmheader";

    @XmlElement(name = "loginSystemCode")
    public Integer getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setLoginSystemCode(Integer loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlElement(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}