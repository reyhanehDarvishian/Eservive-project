package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceResBody {
    @JsonProperty("QueryBalanceResultMsg")
	QueryBalanceResultMsg queryBalanceResultMsg;

    @XmlElement(name = "QueryBalanceResultMsg")
    public QueryBalanceResultMsg getQueryBalanceResultMsg() {
        if (queryBalanceResultMsg == null) queryBalanceResultMsg = new QueryBalanceResultMsg();
        return queryBalanceResultMsg;
    }

    public void setQueryBalanceResultMsg(QueryBalanceResultMsg queryBalanceResultMsg) {
        this.queryBalanceResultMsg = queryBalanceResultMsg;
    }
}