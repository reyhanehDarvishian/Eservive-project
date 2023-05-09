package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryAccountInfoReqMsg {
    @JsonProperty("requestHeader")
    QueryAccountInfoRequestHeader queryAccountInfoRequestHeader;
    @JsonProperty("queryAccountInfoRequest")
    QueryAccountInfoRequest queryAccountInfoRequest;

    @XmlElement(name = "queryAccountInfoRequest")
    public QueryAccountInfoRequest getQueryAccountInfoRequest() {
        if (queryAccountInfoRequest == null) queryAccountInfoRequest = new QueryAccountInfoRequest();
        return queryAccountInfoRequest;
    }

    public void setQueryAccountInfoRequest(QueryAccountInfoRequest queryAccountInfoRequestList) {
        this.queryAccountInfoRequest = queryAccountInfoRequestList;
    }

    @XmlElement(name = "requestHeader")
    public QueryAccountInfoRequestHeader getQueryAccountInfoRequestHeader() {
        if (queryAccountInfoRequestHeader == null) queryAccountInfoRequestHeader = new QueryAccountInfoRequestHeader();
        return queryAccountInfoRequestHeader;
    }

    public void setQueryAccountInfoRequestHeader(QueryAccountInfoRequestHeader queryAccountInfoRequestHeader) {
        this.queryAccountInfoRequestHeader = queryAccountInfoRequestHeader;
    }
}