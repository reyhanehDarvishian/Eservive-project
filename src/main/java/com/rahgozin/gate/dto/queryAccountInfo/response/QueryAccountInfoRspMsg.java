package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryAccountInfoRspMsg {
    @JsonProperty("resultHeader")
    QueryAccountInfoResResultHeader queryAccountInfoResResultHeader;
    @JsonProperty("queryAccountInfoResponse")
    QueryAccountInfoResponse queryAccountInfoResponse;

    @JsonProperty("queryAccountInfoResponse")
    public QueryAccountInfoResponse getQueryAccountInfoResponse() {
        if (queryAccountInfoResponse == null) queryAccountInfoResponse = new QueryAccountInfoResponse();
        return queryAccountInfoResponse;
    }

    @JsonProperty("queryAccountInfoResponse")
    public void setQueryAccountInfoResponse(QueryAccountInfoResponse queryAccountInfoResponse) {
        this.queryAccountInfoResponse = queryAccountInfoResponse;
    }

    @JsonProperty("resultHeader")
    public QueryAccountInfoResResultHeader getQueryAccountInfoResResultHeader() {
        if (queryAccountInfoResResultHeader == null) queryAccountInfoResResultHeader = new QueryAccountInfoResResultHeader();
        return queryAccountInfoResResultHeader;
    }

    @JsonProperty("resultHeader")
    public void setQueryAccountInfoResResultHeader(QueryAccountInfoResResultHeader queryAccountInfoResResultHeader) {
        this.queryAccountInfoResResultHeader = queryAccountInfoResResultHeader;
    }

}