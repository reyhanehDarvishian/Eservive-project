package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryAccountInfoResEnvelope {
    @JsonProperty("Body")
    QueryAccountInfoResBody queryAccountInfoResBody;

    @XmlElement(name = "Body")
    public QueryAccountInfoResBody getBodyBean() {
        if (queryAccountInfoResBody == null) queryAccountInfoResBody = new QueryAccountInfoResBody();
        return queryAccountInfoResBody;
    }

    public void setBodyBean(QueryAccountInfoResBody queryAccountInfoResBody) {
        this.queryAccountInfoResBody = queryAccountInfoResBody;
    }

}