package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryAccountInfoBody {
    @JsonProperty("cms:queryAccountInfoReqMsg")
    QueryAccountInfoReqMsg queryAccountInfoReqMsg;

    @XmlElement(name = "cms:queryAccountInfoReqMsg")
    public QueryAccountInfoReqMsg getQueryAccountInfoReqMsg() {
        if (queryAccountInfoReqMsg == null) queryAccountInfoReqMsg = new QueryAccountInfoReqMsg();
        return queryAccountInfoReqMsg;
    }

    public void setQueryAccountInfoReqMsg(QueryAccountInfoReqMsg queryAccountInfoReqMsg) {
        this.queryAccountInfoReqMsg = queryAccountInfoReqMsg;
    }
}