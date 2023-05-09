package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdBody {
    @JsonProperty("cms:queryEntityIdReqMsg")
    QueryEntityIdReqMsg queryEntityIdReqMsg;

    @XmlElement(name = "cms:queryEntityIdReqMsg")
    public QueryEntityIdReqMsg getQueryEntityIdReqMsg() {
        if (queryEntityIdReqMsg == null) queryEntityIdReqMsg = new QueryEntityIdReqMsg();
        return queryEntityIdReqMsg;
    }

    public void setQueryEntityIdReqMsg(QueryEntityIdReqMsg queryEntityIdReqMsg) {
        this.queryEntityIdReqMsg = queryEntityIdReqMsg;
    }
}