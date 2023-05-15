package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "acctKey",
        "balanceResult",
        "accountCredit"
})
@Generated("jsonschema2pojo")
public class QueryBalanceResAcctList {
    private String acctKey;
    private QueryBalanceResBalanceResult queryBalanceResBalanceResult;
    private QueryBalanceResAccountCredit queryBalanceResAccountCredit;

    @JsonProperty("acctKey")
    public String getAcctKey() {
        return acctKey;
    }

    @JsonProperty("AcctKey")
    public void setAcctKey(String acctKey) {
        this.acctKey = acctKey;
    }

    @JsonProperty("accountCredit")
    public QueryBalanceResAccountCredit getQueryBalanceResAccountCredit() {
        return queryBalanceResAccountCredit;
    }

    @JsonProperty("AccountCredit")
    public void setQueryBalanceResAccountCredit(QueryBalanceResAccountCredit queryBalanceResAccountCredit) {
        this.queryBalanceResAccountCredit = queryBalanceResAccountCredit;
    }

    @JsonProperty("balanceResult")
    public QueryBalanceResBalanceResult getQueryBalanceResBalanceResult() {
        return queryBalanceResBalanceResult;
    }

    @JsonProperty("BalanceResult")
    public void setQueryBalanceResBalanceResult(QueryBalanceResBalanceResult queryBalanceResBalanceResult) {
        this.queryBalanceResBalanceResult = queryBalanceResBalanceResult;
    }
}