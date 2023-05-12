package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceResult {
    @JsonProperty("AcctList")
    QueryBalanceResAcctList queryBalanceResAcctList;

    @XmlElement(name = "AcctList")

    public QueryBalanceResAcctList getQueryBalanceResAcctList() {
        if (queryBalanceResAcctList == null) queryBalanceResAcctList = new QueryBalanceResAcctList();
        return queryBalanceResAcctList;
    }

    public void setQueryBalanceResAcctList(QueryBalanceResAcctList queryBalanceResAcctList) {
        this.queryBalanceResAcctList = queryBalanceResAcctList;
    }
}