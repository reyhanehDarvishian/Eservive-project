package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ResultHeader",
        "QueryPaymentLogResult"
})
@Generated("jsonschema2pojo")
public class QueryPaymentLogResultMsg {
    ResultHeader resultHeader;
    QueryPaymentLogResult queryPaymentLogResult;

    @JsonProperty("queryPaymentLogResult")
    public QueryPaymentLogResult getQueryPaymentLogResult() {
        return queryPaymentLogResult;
    }

    @JsonProperty("QueryPaymentLogResult")
    public void setQueryPaymentLogResult(QueryPaymentLogResult queryPaymentLogResult) {
        this.queryPaymentLogResult = queryPaymentLogResult;
    }

    @JsonProperty("resultHeader")
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    @JsonProperty("ResultHeader")
    public void setResultHeader(ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }

}