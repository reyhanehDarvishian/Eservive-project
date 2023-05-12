package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceResAcctList {
    @JsonProperty("AcctKey")
    String acctKey;
    @JsonProperty("BalanceResult")
    QueryBalanceResBalanceResult queryBalanceResBalanceResult;
    @JsonProperty("AccountCredit")
    QueryBalanceResAccountCredit queryBalanceResAccountCredit;

    @XmlAttribute(name = "AcctKey")
    public String getAcctKey() {
        return acctKey;
    }

    public void setAcctKey(String acctKey) {
        this.acctKey = acctKey;
    }

    @XmlElement(name = "AccountCredit")
    public QueryBalanceResAccountCredit getQueryBalanceResAccountCredit() {
        return queryBalanceResAccountCredit;
    }

    public void setQueryBalanceResAccountCredit(QueryBalanceResAccountCredit queryBalanceResAccountCredit) {
        this.queryBalanceResAccountCredit = queryBalanceResAccountCredit;
    }

    @XmlElement(name = "BalanceResult")
    public QueryBalanceResBalanceResult getQueryBalanceResBalanceResult() {
        return queryBalanceResBalanceResult;
    }

    public void setQueryBalanceResBalanceResult(QueryBalanceResBalanceResult queryBalanceResBalanceResult) {
        this.queryBalanceResBalanceResult = queryBalanceResBalanceResult;
    }
}