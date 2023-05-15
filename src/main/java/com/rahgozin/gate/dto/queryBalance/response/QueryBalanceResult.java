package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "acctList"
})
public class QueryBalanceResult {
    private QueryBalanceResAcctList queryBalanceResAcctList;

    @JsonProperty("acctList")
    public QueryBalanceResAcctList getQueryBalanceResAcctList() {
        if (queryBalanceResAcctList == null) queryBalanceResAcctList = new QueryBalanceResAcctList();
        return queryBalanceResAcctList;
    }

    @JsonProperty("AcctList")
    public void setQueryBalanceResAcctList(QueryBalanceResAcctList queryBalanceResAcctList) {
        this.queryBalanceResAcctList = queryBalanceResAcctList;
    }
}