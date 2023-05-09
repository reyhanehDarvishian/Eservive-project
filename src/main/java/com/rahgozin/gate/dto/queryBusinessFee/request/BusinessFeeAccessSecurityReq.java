package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class BusinessFeeAccessSecurityReq {

    @JsonProperty("crm:loginSystemCode")
    Integer loginSystemCode;
    @JsonProperty("crm:password")
    String password;

    @JsonIgnore
    String remoteIp;

    @JsonIgnore
    public String getRemoteIp() {
        return remoteIp;
    }

    @JsonIgnore
    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

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