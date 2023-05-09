package com.rahgozin.gate.dto.querySub.querySubscriber.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


public class AccessSecurityReq {
    @JsonProperty("crm:loginSystemCode")
    Integer loginSystemCode;
    @JsonProperty("crm:password")
    String password;

    @XmlElement(name = "crm:loginSystemCode")
    public Integer getLoginSystemCode() {
        return loginSystemCode;
    }

    public void setLoginSystemCode(Integer loginSystemCode) {
        this.loginSystemCode = loginSystemCode;
    }

    @XmlElement(name = "crm:password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}