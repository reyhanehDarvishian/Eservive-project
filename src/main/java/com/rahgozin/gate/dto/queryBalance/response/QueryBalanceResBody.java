package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "QueryBalanceResultMsg"
})
@Generated("jsonschema2pojo")
public class QueryBalanceResBody {
	private QueryBalanceResultMsg queryBalanceResultMsg;

    @JsonProperty("queryBalanceResultMsg")
    public QueryBalanceResultMsg getQueryBalanceResultMsg() {
        return queryBalanceResultMsg;
    }

    @JsonProperty("QueryBalanceResultMsg")
    public void setQueryBalanceResultMsg(QueryBalanceResultMsg queryBalanceResultMsg) {
        this.queryBalanceResultMsg = queryBalanceResultMsg;
    }
}