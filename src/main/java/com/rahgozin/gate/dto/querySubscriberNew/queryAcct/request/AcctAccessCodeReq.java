package com.rahgozin.gate.dto.querySubscriberNew.queryAcct.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class AcctAccessCodeReq {
    @JsonProperty("cms:accountId")
    String accountId;

    @XmlElement(name = "cms:accountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}