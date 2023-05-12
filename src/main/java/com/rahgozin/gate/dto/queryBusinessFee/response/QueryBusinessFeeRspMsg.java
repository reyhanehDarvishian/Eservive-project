package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryBusinessFeeRspMsg {
    @JsonProperty("resultHeader")
    BusinessFeeResResultHeader businessFeeResResultHeader;

    @JsonProperty("queryBusinessFeeResponse")
    QueryBusinessFeeResponse queryBusinessFeeResponse;

    @XmlElement(name = "queryBusinessFeeResponse")
    public QueryBusinessFeeResponse getQueryBusinessFeeResponse() {
        if (queryBusinessFeeResponse == null) queryBusinessFeeResponse = new QueryBusinessFeeResponse();
        return queryBusinessFeeResponse;
    }

    public void setQueryBusinessFeeResponse(QueryBusinessFeeResponse queryBusinessFeeResponse) {
        this.queryBusinessFeeResponse = queryBusinessFeeResponse;
    }

    @XmlElement(name = "resultHeader")
    public BusinessFeeResResultHeader getBusinessFeeResResultHeader() {
        if (businessFeeResResultHeader == null) businessFeeResResultHeader = new BusinessFeeResResultHeader();
        return businessFeeResResultHeader;
    }

    public void setBusinessFeeResResultHeader(BusinessFeeResResultHeader businessFeeResResultHeader) {
        this.businessFeeResResultHeader = businessFeeResResultHeader;
    }
}