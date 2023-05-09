package com.rahgozin.gate.dto.queryImsiinfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryImsiResBody {
    @JsonProperty("queryIMSIInfoRspMsg")
    QueryIMSIInfoRspMsg queryIMSIInfoRspMsg;

    @XmlElement(name = "queryIMSIInfoRspMsg")
    public QueryIMSIInfoRspMsg getQueryIMSIInfoRspMsg() {
        if (queryIMSIInfoRspMsg == null) queryIMSIInfoRspMsg = new QueryIMSIInfoRspMsg();
        return queryIMSIInfoRspMsg;
    }

    public void setQueryIMSIInfoRspMsg(QueryIMSIInfoRspMsg queryIMSIInfoRspMsg) {
        this.queryIMSIInfoRspMsg = queryIMSIInfoRspMsg;
    }

}