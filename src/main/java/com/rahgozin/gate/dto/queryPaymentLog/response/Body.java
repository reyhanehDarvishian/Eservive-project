package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "QueryPaymentLogResultMsg"
})
@Generated("jsonschema2pojo")
public class Body {
    private QueryPaymentLogResultMsg queryPaymentLogResultMsg;

    @JsonProperty("queryPaymentLogResultMsg")
    public QueryPaymentLogResultMsg getQueryPaymentLogResultMsg() {
        return queryPaymentLogResultMsg;
    }

    @JsonProperty("QueryPaymentLogResultMsg")
    public void setQueryPaymentLogResultMsg(QueryPaymentLogResultMsg queryPaymentLogResultMsg) {
        this.queryPaymentLogResultMsg = queryPaymentLogResultMsg;
    }

}