package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class AccessSecurity {
    @JsonProperty("cbs:LoginSystemCode")
    String loginSystemCode="";
    @JsonProperty("cbs:Password")
    String password="";
  public void setLoginSystemCode(String loginSystemCode) {
		this.loginSystemCode=loginSystemCode;
	}
    @XmlAttribute(name = "cbs:LoginSystemCode")
    public String getLoginSystemCode() {
		return loginSystemCode;
	}
  public void setPassword(String password) {
		this.password=password;
	}
    @XmlAttribute(name = "cbs:Password")
    public String getPassword() {
		return password;
	}

}