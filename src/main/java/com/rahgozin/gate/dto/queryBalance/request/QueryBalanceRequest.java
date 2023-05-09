package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceRequest {
    @JsonProperty("ars:QueryObj")
    QueryObj queryObj;

    @XmlElement(name = "ars:QueryObj")
    public QueryObj getQueryObj() {
        if (queryObj == null) queryObj = new QueryObj();
        return queryObj;
    }

    public void setQueryObj(QueryObj queryObj) {
        this.queryObj = queryObj;
    }
}
