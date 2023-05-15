package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resultHeader",
        "queryBalanceResult"
})
@Generated("jsonschema2pojo")
public class QueryBalanceResultMsg {
    private QueryBalanceResResultHeader balanceResResultHeader;
    private QueryBalanceResult queryBalanceResult;

    @JsonProperty("resultHeader")
    public QueryBalanceResResultHeader getBalanceResResultHeader() {
        return balanceResResultHeader;
    }

    @JsonProperty("ResultHeader")
    public void setBalanceResResultHeader(QueryBalanceResResultHeader balanceResResultHeader) {
        this.balanceResResultHeader = balanceResResultHeader;
    }

    @JsonProperty("queryBalanceResult")
    public QueryBalanceResult getQueryBalanceResult() {
        return queryBalanceResult;
    }

    @JsonProperty("QueryBalanceResult")
    public void setQueryBalanceResult(QueryBalanceResult queryBalanceResult) {
        this.queryBalanceResult = queryBalanceResult;
    }
}