package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "queryBusinessFeeRspMsg"
})
@Generated("jsonschema2pojo")
public class BusinessFeeResBody {
    private QueryBusinessFeeRspMsg queryBusinessFeeRspMsg;

    @JsonProperty("queryBusinessFeeRspMsg")
    public QueryBusinessFeeRspMsg getQueryBusinessFeeRspMsg() {
        return queryBusinessFeeRspMsg;
    }

    @JsonProperty("queryBusinessFeeRspMsg")
    public void setQueryBusinessFeeRspMsg(QueryBusinessFeeRspMsg queryBusinessFeeRspMsg) {
        this.queryBusinessFeeRspMsg = queryBusinessFeeRspMsg;
    }

}
