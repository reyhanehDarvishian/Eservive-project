package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceAcctList {
    String acctKey;
    @JsonProperty("AccountCredit")
    AccountCredit accountCredit;
    @JsonProperty("BalanceResult")
    BalanceResult balanceResult;

    public void setAcctKey(String acctKey) {
        this.acctKey = acctKey;
    }

    @XmlAttribute(name = "AcctKey")
    public String getAcctKey() {
        return acctKey;
    }

    @XmlElement(name = "AccountCredit")
    public AccountCredit getAccountCredit() {
        if (accountCredit == null) accountCredit = new AccountCredit();
        return accountCredit;
    }

    public void setAccountCredit(AccountCredit accountCredit) {
        this.accountCredit = accountCredit;
    }

    @XmlElement(name = "BalanceResult")
    public BalanceResult getBalanceResult() {
        if (balanceResult == null) balanceResult = new BalanceResult();
        return balanceResult;
    }

    public void setBalanceResult(BalanceResult balanceResult) {
        this.balanceResult = balanceResult;
    }
}