package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resultHeader",
        "queryCustomerInfoResponse"
})
@Generated("jsonschema2pojo")
public class QueryCustomerInfoRspMsg {
    private QueryCustomerInfoResResultHeader queryCustomerInfoResResultHeader;
    private QueryCustomerInfoResponse queryCustomerInfoResponse;

    @JsonProperty("queryCustomerInfoResponse")
    public QueryCustomerInfoResponse getQueryCustomerInfoResponse() {
        return queryCustomerInfoResponse;
    }

    @JsonProperty("queryCustomerInfoResponse")
    public void setQueryCustomerInfoResponse(QueryCustomerInfoResponse queryCustomerInfoResponse) {
        this.queryCustomerInfoResponse = queryCustomerInfoResponse;
    }

    @JsonProperty("resultHeader")
    public QueryCustomerInfoResResultHeader getQueryCustomerInfoResResultHeader() {
        return queryCustomerInfoResResultHeader;
    }

    @JsonProperty("resultHeader")
    public void setQueryCustomerInfoResResultHeader(QueryCustomerInfoResResultHeader queryCustomerInfoResResultHeader) {
        this.queryCustomerInfoResResultHeader = queryCustomerInfoResResultHeader;
    }
}