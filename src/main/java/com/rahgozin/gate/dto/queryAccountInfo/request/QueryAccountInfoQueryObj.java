package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryAccountInfoQueryObj {
    @JsonProperty("cms:acctAccessCode")
    QueryAccountInfoAcctAccessCode queryAccountInfoAcctAccessCode;

    @XmlElement(name = "cms:acctAccessCode")
    public QueryAccountInfoAcctAccessCode getQueryAccountInfoAcctAccessCode() {
        if (queryAccountInfoAcctAccessCode == null)
            queryAccountInfoAcctAccessCode = new QueryAccountInfoAcctAccessCode();
        return queryAccountInfoAcctAccessCode;
    }

    public void setQueryAccountInfoAcctAccessCode(QueryAccountInfoAcctAccessCode queryAccountInfoAcctAccessCode) {
        this.queryAccountInfoAcctAccessCode = queryAccountInfoAcctAccessCode;
    }
}