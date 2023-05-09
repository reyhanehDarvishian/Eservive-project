package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryEntityIdResBody {

    @JsonProperty("queryEntityIdRspMsg")
	QueryEntityIdRspMsg queryEntityIdRspMsg;

    @XmlElement(name = "queryEntityIdRspMsg")
    public QueryEntityIdRspMsg getQueryEntityIdRspMsg() {
        if (queryEntityIdRspMsg == null) queryEntityIdRspMsg = new QueryEntityIdRspMsg();
        return queryEntityIdRspMsg;
    }

    public void setQueryEntityIdRspMsg(QueryEntityIdRspMsg queryEntityIdRspMsg) {
        this.queryEntityIdRspMsg = queryEntityIdRspMsg;
    }

}