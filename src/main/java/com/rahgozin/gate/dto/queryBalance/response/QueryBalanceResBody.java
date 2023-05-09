package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceResBody {
    @JsonProperty("QueryBalanceResultMsg")
	QueryBalanceResultMsg queryBalanceResultMsg;

    @XmlElement(name = "QueryBalanceResultMsg")
    public QueryBalanceResultMsg getQueryBalanceResultMsgBean() {
        if (queryBalanceResultMsg == null) queryBalanceResultMsg = new QueryBalanceResultMsg();
        return queryBalanceResultMsg;
    }

    public void setQueryBalanceResultMsgBean(QueryBalanceResultMsg queryBalanceResultMsg) {
        this.queryBalanceResultMsg = queryBalanceResultMsg;
    }
}