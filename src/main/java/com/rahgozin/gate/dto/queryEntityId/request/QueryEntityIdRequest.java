package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdRequest {
    @JsonProperty("cms:queryObj")
    QueryEntityIdQueryObj queryObj;

    @XmlElement(name = "cms:queryObj")
    public QueryEntityIdQueryObj getQueryObj() {
        if (queryObj == null) queryObj = new QueryEntityIdQueryObj();
        return queryObj;
    }

    public void setQueryObj(QueryEntityIdQueryObj queryObj) {
        this.queryObj = queryObj;
    }
}
