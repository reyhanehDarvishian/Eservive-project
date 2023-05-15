package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryAccountInfoResponse {

    @JsonProperty("accountInfo")
    AccountInfo accountInfo;

    @JsonProperty("accountInfo")
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }
}