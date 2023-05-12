package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class BusinessFeeResBody {

    @JsonProperty("queryBusinessFeeRspMsg")
    QueryBusinessFeeRspMsg queryBusinessFeeRspMsg;

    @XmlElement(name = "queryBusinessFeeRspMsg")
    public QueryBusinessFeeRspMsg getQueryBusinessFeeRspMsg() {
        if (queryBusinessFeeRspMsg == null) queryBusinessFeeRspMsg = new QueryBusinessFeeRspMsg();
        return queryBusinessFeeRspMsg;
    }

    public void setQueryBusinessFeeRspMsg(QueryBusinessFeeRspMsg queryBusinessFeeRspMsg) {
        this.queryBusinessFeeRspMsg = queryBusinessFeeRspMsg;
    }

}
