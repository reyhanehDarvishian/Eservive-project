
package com.rahgozin.gate.dto.querySubscriberNew.queryCust.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "querySubscriberRspMsg"
})
@Generated("jsonschema2pojo")
public class QuerySubBodyRes {

    @JsonProperty("querySubscriberRspMsg")
    private QuerySubscriberRspMsg querySubscriberRspMsg;

    @JsonProperty("querySubscriberRspMsg")
    public QuerySubscriberRspMsg getQuerySubscriberRspMsg() {
        return querySubscriberRspMsg;
    }

    @JsonProperty("querySubscriberRspMsg")
    public void setQuerySubscriberRspMsg(QuerySubscriberRspMsg querySubscriberRspMsg) {
        this.querySubscriberRspMsg = querySubscriberRspMsg;
    }
}