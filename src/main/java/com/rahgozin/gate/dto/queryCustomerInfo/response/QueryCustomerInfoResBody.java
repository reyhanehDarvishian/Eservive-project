package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "queryCustomerInfoRspMsg"
})
@Generated("jsonschema2pojo")
public class QueryCustomerInfoResBody {
	private QueryCustomerInfoRspMsg queryCustomerInfoRspMsg;

    @JsonProperty("queryCustomerInfoRspMsg")
    public QueryCustomerInfoRspMsg getQueryCustomerInfoRspMsg() {
        return queryCustomerInfoRspMsg;
    }

    @JsonProperty("queryCustomerInfoRspMsg")
    public void setQueryCustomerInfoRspMsg(QueryCustomerInfoRspMsg queryCustomerInfoRspMsg) {
        this.queryCustomerInfoRspMsg = queryCustomerInfoRspMsg;
    }
}