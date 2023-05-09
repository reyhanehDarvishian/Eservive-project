package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryEntityIdResEnvelope {
    @JsonProperty("Body")
    QueryEntityIdResBody entityIdBody;

    @JsonIgnore
    @XmlElement(name = "Body")
    public QueryEntityIdResBody getBody() {
        if (entityIdBody == null) entityIdBody = new QueryEntityIdResBody();
        return entityIdBody;
    }

    public void setBody(QueryEntityIdResBody entityIdBody) {
        this.entityIdBody = entityIdBody;
    }


}