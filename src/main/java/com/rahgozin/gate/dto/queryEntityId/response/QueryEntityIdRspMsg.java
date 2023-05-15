package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resultHeader",
        "queryEntityIdResponse"
})
@Generated("jsonschema2pojo")
public class QueryEntityIdRspMsg {
    private QueryEntityIdResultHeader entityIdResultHeader;
    private QueryEntityIdResponse queryEntityIdResponse;

    @JsonProperty("queryEntityIdResponse")
    public void setQueryEntityIdResponse(QueryEntityIdResponse queryEntityIdResponseList) {
        this.queryEntityIdResponse = queryEntityIdResponseList;
    }

    @JsonProperty("queryEntityIdResponse")
    public QueryEntityIdResponse getQueryEntityIdResponse() {
        return queryEntityIdResponse;
    }

    @JsonProperty("resultHeader")
    public QueryEntityIdResultHeader getEntityIdResultHeader() {
        if (entityIdResultHeader == null) entityIdResultHeader = new QueryEntityIdResultHeader();
        return entityIdResultHeader;
    }

    @JsonProperty("resultHeader")
    public void setEntityIdResultHeader(QueryEntityIdResultHeader entityIdResultHeader) {
        this.entityIdResultHeader = entityIdResultHeader;
    }
}