package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryBalanceResEnvelope {
    @JsonProperty("Body")
    QueryBalanceResBody queryBalanceResBody;

    @XmlElement(name = "Body")
    public QueryBalanceResBody getBodyBean() {
        if (queryBalanceResBody == null) queryBalanceResBody = new QueryBalanceResBody();
        return queryBalanceResBody;
    }

    public void setBodyBean(QueryBalanceResBody queryBalanceResBody) {
        this.queryBalanceResBody = queryBalanceResBody;
    }
}