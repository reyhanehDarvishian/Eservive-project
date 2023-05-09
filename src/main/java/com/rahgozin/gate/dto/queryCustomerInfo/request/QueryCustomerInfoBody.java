package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryCustomerInfoBody {
    @JsonProperty("ns4:queryCustomerInfoReqMsg")
    QueryCustomerInfoReqMsg queryCustomerInfoReqMsg;

    @XmlElement(name = "ns4:queryCustomerInfoReqMsg")
    public QueryCustomerInfoReqMsg getQueryCustomerInfoReqMsg() {
        if (queryCustomerInfoReqMsg == null) queryCustomerInfoReqMsg = new QueryCustomerInfoReqMsg();
        return queryCustomerInfoReqMsg;
    }

    public void setQueryCustomerInfoReqMsg(QueryCustomerInfoReqMsg queryCustomerInfoReqMsg) {
        this.queryCustomerInfoReqMsg = queryCustomerInfoReqMsg;
    }
}