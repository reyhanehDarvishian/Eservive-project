package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryAccountInfoResEnvelope {
    @JsonProperty("Body")
    QueryAccountInfoResBody queryAccountInfoResBody;

    @XmlElement(name = "Body")
    public QueryAccountInfoResBody getQueryAccountInfoResBody() {
        if (queryAccountInfoResBody == null) queryAccountInfoResBody = new QueryAccountInfoResBody();
        return queryAccountInfoResBody;
    }

    public void setQueryAccountInfoResBody(QueryAccountInfoResBody queryAccountInfoResBody) {
        this.queryAccountInfoResBody = queryAccountInfoResBody;
    }
}