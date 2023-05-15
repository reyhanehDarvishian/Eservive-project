package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "queryEntityIdRspMsg"
})
@Generated("jsonschema2pojo")
public class QueryEntityIdResBody {
    @JsonProperty("queryEntityIdRspMsg")
	QueryEntityIdRspMsg queryEntityIdRspMsg;

    @JsonProperty("queryEntityIdRspMsg")
    public QueryEntityIdRspMsg getQueryEntityIdRspMsg() {
        return queryEntityIdRspMsg;
    }

    @JsonProperty("queryEntityIdRspMsg")
    public void setQueryEntityIdRspMsg(QueryEntityIdRspMsg queryEntityIdRspMsg) {
        this.queryEntityIdRspMsg = queryEntityIdRspMsg;
    }

}