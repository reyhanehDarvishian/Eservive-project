package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryAccountInfoAccessSecurity {
    @JsonProperty("crm:loginSystemCode")
    private String loginSystemCode;
    @JsonProperty("crm:password")
    private String password;

    public void setLoginSystemCode(String loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlAttribute(name = "crm:loginSystemCode")
    public String getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlAttribute(name = "crm:password")
    public String getPassword() {
        return password;
    }
}