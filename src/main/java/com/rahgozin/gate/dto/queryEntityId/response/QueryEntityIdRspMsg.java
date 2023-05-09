package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class QueryEntityIdRspMsg {
    @JsonProperty("resultHeader")
    QueryEntityIdResultHeader entityIdResultHeader;

    @JsonProperty("queryEntityIdResponse")
    QueryEntityIdResponse queryEntityIdResponse;

    public void setQueryEntityIdResponse(QueryEntityIdResponse queryEntityIdResponseList) {
        this.queryEntityIdResponse = queryEntityIdResponseList;
    }

    @XmlElement(name = "queryEntityIdResponse")
    public QueryEntityIdResponse getQueryEntityIdResponse() {
        return queryEntityIdResponse;
    }

    @XmlElement(name = "resultHeader")
    public QueryEntityIdResultHeader getEntityIdResultHeader() {
        if (entityIdResultHeader == null) entityIdResultHeader = new QueryEntityIdResultHeader();
        return entityIdResultHeader;
    }

    public void setEntityIdResultHeader(QueryEntityIdResultHeader entityIdResultHeader) {
        this.entityIdResultHeader = entityIdResultHeader;
    }
}