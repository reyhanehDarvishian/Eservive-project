package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resultHeader",
        "queryBusinessFeeResponse"
})
@Generated("jsonschema2pojo")
public class QueryBusinessFeeRspMsg {
    @JsonProperty("resultHeader")
    BusinessFeeResResultHeader businessFeeResResultHeader;

    @JsonProperty("queryBusinessFeeResponse")
    QueryBusinessFeeResponse queryBusinessFeeResponse;

    @JsonProperty("queryBusinessFeeResponse")
    public QueryBusinessFeeResponse getQueryBusinessFeeResponse() {
        return queryBusinessFeeResponse;
    }

    @JsonProperty("QueryBusinessFeeResponse")
    public void setQueryBusinessFeeResponse(QueryBusinessFeeResponse queryBusinessFeeResponse) {
        this.queryBusinessFeeResponse = queryBusinessFeeResponse;
    }

    @JsonProperty("resultHeader")
    public BusinessFeeResResultHeader getBusinessFeeResResultHeader() {
        return businessFeeResResultHeader;
    }

    @JsonProperty("ResultHeader")
    public void setBusinessFeeResResultHeader(BusinessFeeResResultHeader businessFeeResResultHeader) {
        this.businessFeeResResultHeader = businessFeeResResultHeader;
    }
}