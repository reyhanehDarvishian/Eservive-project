package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryCustomerInfoResBody {
    @JsonProperty("queryCustomerInfoRspMsg")
	QueryCustomerInfoRspMsg queryCustomerInfoRspMsg;

    @XmlElement(name = "queryCustomerInfoRspMsg")
    public QueryCustomerInfoRspMsg getQueryCustomerInfoRspMsg() {
        if (queryCustomerInfoRspMsg == null) queryCustomerInfoRspMsg = new QueryCustomerInfoRspMsg();
        return queryCustomerInfoRspMsg;
    }

    public void setQueryCustomerInfoRspMsg(QueryCustomerInfoRspMsg queryCustomerInfoRspMsg) {
        this.queryCustomerInfoRspMsg = queryCustomerInfoRspMsg;
    }
}