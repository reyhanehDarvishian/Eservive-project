package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryAccountInfoResBody {
    @JsonProperty("queryAccountInfoRspMsg")
	QueryAccountInfoRspMsg queryAccountInfoRspMsg;

    @XmlElement(name = "queryAccountInfoRspMsg")
    public QueryAccountInfoRspMsg getQueryAccountInfoRspMsgBean() {
        if (queryAccountInfoRspMsg == null) queryAccountInfoRspMsg = new QueryAccountInfoRspMsg();
        return queryAccountInfoRspMsg;
    }

    public void setQueryAccountInfoRspMsgBean(QueryAccountInfoRspMsg queryAccountInfoRspMsg) {
        this.queryAccountInfoRspMsg = queryAccountInfoRspMsg;
    }

}