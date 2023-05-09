package com.rahgozin.gate.dto.queryImsiinfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryImsiResEnvelope {

    @JsonProperty("Body")
    QueryImsiResBody queryImsiResBody;

    @XmlElement(name = "Body")
    public QueryImsiResBody getQueryImsiResBody() {
        if (queryImsiResBody == null) queryImsiResBody = new QueryImsiResBody();
        return queryImsiResBody;
    }

    public void setQueryImsiResBody(QueryImsiResBody queryImsiResBody) {
        this.queryImsiResBody = queryImsiResBody;
    }

}