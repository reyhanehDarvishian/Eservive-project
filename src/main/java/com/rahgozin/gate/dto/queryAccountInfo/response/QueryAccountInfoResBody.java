package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryAccountInfoResBody {
    @JsonProperty("queryAccountInfoRspMsg")
	QueryAccountInfoRspMsg queryAccountInfoRspMsg;

    @JsonProperty("queryAccountInfoRspMsg")
    public QueryAccountInfoRspMsg getQueryAccountInfoRspMsg() {
        return queryAccountInfoRspMsg;
    }

    @JsonProperty("queryAccountInfoRspMsg")
    public void setQueryAccountInfoRspMsg(QueryAccountInfoRspMsg queryAccountInfoRspMsg) {
        this.queryAccountInfoRspMsg = queryAccountInfoRspMsg;
    }

}