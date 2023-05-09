package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryCustomerInfoResBody {
    @JsonProperty("queryCustomerInfoRspMsg")
	QueryCustomerInfoRspMsg queryCustomerInfoRspMsg;

    @XmlElement(name = "queryCustomerInfoRspMsg")
    public QueryCustomerInfoRspMsg getQueryCustomerInfoRspMsgBean() {
        if (queryCustomerInfoRspMsg == null) queryCustomerInfoRspMsg = new QueryCustomerInfoRspMsg();
        return queryCustomerInfoRspMsg;
    }

    public void setQueryCustomerInfoRspMsgBean(QueryCustomerInfoRspMsg queryCustomerInfoRspMsg) {
        this.queryCustomerInfoRspMsg = queryCustomerInfoRspMsg;
    }
}