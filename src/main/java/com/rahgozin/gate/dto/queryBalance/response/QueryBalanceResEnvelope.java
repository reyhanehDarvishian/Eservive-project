package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryBalanceResEnvelope {
    @JsonProperty("Body")
    QueryBalanceResBody queryBalanceResBody;

    @XmlElement(name = "Body")
    public QueryBalanceResBody getQueryBalanceResBody() {
        if (queryBalanceResBody == null) queryBalanceResBody = new QueryBalanceResBody();
        return queryBalanceResBody;
    }

    public void setQueryBalanceResBody(QueryBalanceResBody queryBalanceResBody) {
        this.queryBalanceResBody = queryBalanceResBody;
    }
}