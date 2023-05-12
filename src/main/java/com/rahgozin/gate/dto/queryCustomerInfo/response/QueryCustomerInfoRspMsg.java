package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryCustomerInfoRspMsg {
    @JsonProperty("resultHeader")
    QueryCustomerInfoResResultHeader queryCustomerInfoResResultHeader;
    @JsonProperty("queryCustomerInfoResponse")
    QueryCustomerInfoResponse queryCustomerInfoResponse;

    @XmlElement(name = "queryCustomerInfoResponse")
    public QueryCustomerInfoResponse getQueryCustomerInfoResponse() {
        if (queryCustomerInfoResponse == null) queryCustomerInfoResponse = new QueryCustomerInfoResponse();
        return queryCustomerInfoResponse;
    }

    public void setQueryCustomerInfoResponse(QueryCustomerInfoResponse queryCustomerInfoResponse) {
        this.queryCustomerInfoResponse = queryCustomerInfoResponse;
    }

    @XmlElement(name = "resultHeader")
    public QueryCustomerInfoResResultHeader getQueryCustomerInfoResResultHeader() {
        if (queryCustomerInfoResResultHeader == null) queryCustomerInfoResResultHeader = new QueryCustomerInfoResResultHeader();
        return queryCustomerInfoResResultHeader;
    }

    public void setQueryCustomerInfoResResultHeader(QueryCustomerInfoResResultHeader queryCustomerInfoResResultHeader) {
        this.queryCustomerInfoResResultHeader = queryCustomerInfoResResultHeader;
    }
}