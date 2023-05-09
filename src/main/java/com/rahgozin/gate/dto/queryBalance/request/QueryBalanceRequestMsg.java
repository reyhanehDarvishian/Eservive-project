package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceRequestMsg {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ars")
    private String cbs = "http://www.huawei.com/bme/cbsinterface/arservices";
    @JsonProperty("RequestHeader")
    QueryBalanceReqHeader queryBalanceReqHeader;

    @JsonProperty("QueryBalanceRequest")
    QueryBalanceRequest queryBalanceRequest;

    @XmlElement(name = "RequestHeader")
    public QueryBalanceReqHeader getQueryBalanceReqHeader() {
        if (queryBalanceReqHeader == null) queryBalanceReqHeader = new QueryBalanceReqHeader();
        return queryBalanceReqHeader;
    }

    public void setQueryBalanceReqHeader(QueryBalanceReqHeader queryBalanceReqHeader) {
        this.queryBalanceReqHeader = queryBalanceReqHeader;
    }

    @XmlElement(name = "QueryBalanceRequest")
    public QueryBalanceRequest getQueryBalanceRequest() {
        if (queryBalanceRequest == null) queryBalanceRequest = new QueryBalanceRequest();
        return queryBalanceRequest;
    }

    public void setQueryBalanceRequest(QueryBalanceRequest queryBalanceRequest) {
        this.queryBalanceRequest = queryBalanceRequest;
    }
}