package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceResult {
    @JsonProperty("AcctList")
    QueryBalanceAcctList queryBalanceAcctList;

    @XmlElement(name = "AcctList")
    public QueryBalanceAcctList getAcctList() {
        if (queryBalanceAcctList == null) queryBalanceAcctList = new QueryBalanceAcctList();
        return queryBalanceAcctList;
    }

    public void setAcctList(QueryBalanceAcctList queryBalanceAcctList) {
        this.queryBalanceAcctList = queryBalanceAcctList;
    }

}