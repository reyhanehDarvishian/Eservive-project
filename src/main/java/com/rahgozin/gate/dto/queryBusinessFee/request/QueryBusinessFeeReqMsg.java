package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBusinessFeeReqMsg {

    @JsonProperty("requestHeader")
    QueryBusinessFeeReqHeader queryBusinessFeeReqHeader;
    @JsonProperty("queryBusinessFeeRequest")
    QueryBusinessFeeRequest queryBusinessFeeRequest;


    @JsonIgnore
    @XmlElement(name = "requestHeader")
    public QueryBusinessFeeReqHeader getBusinessFeeReqHeader() {
        if (queryBusinessFeeReqHeader == null) queryBusinessFeeReqHeader = new QueryBusinessFeeReqHeader();
        return queryBusinessFeeReqHeader;
    }

    public void setBusinessFeeReqHeader(QueryBusinessFeeReqHeader queryBusinessFeeReqHeader) {
        this.queryBusinessFeeReqHeader = queryBusinessFeeReqHeader;
    }

    @XmlElement(name = "queryBusinessFeeRequest")
    public QueryBusinessFeeRequest getQueryBusinessFeeRequest() {
        if (queryBusinessFeeRequest == null) queryBusinessFeeRequest = new QueryBusinessFeeRequest();
        return queryBusinessFeeRequest;
    }

    public void setQueryBusinessFeeRequestList(QueryBusinessFeeRequest queryBusinessFeeRequest) {
        this.queryBusinessFeeRequest = queryBusinessFeeRequest;
    }
}