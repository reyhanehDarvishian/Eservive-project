package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceAccessSecurityReq {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String schemaLocation = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JsonProperty("LoginSystemCode")
    Integer loginSystemCode;
    @JsonProperty("Password")
    String password;

    @XmlElement(name = "LoginSystemCode")
    public Integer getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setLoginSystemCode(Integer loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlElement(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
