package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryAccountInfoAcctAccessCode {
    @JsonProperty("cms:accountId")
    private String accountId;

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @XmlAttribute(name = "cms:accountId")
    public String getAccountId() {
        return accountId;
    }
}