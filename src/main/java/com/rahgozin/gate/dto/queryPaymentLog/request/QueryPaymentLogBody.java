package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryPaymentLogBody {

    @JsonProperty("ars:QueryPaymentLogRequestMsg")
    QueryPaymentLogReqMsg queryPaymentLogReqMsg;

    @XmlElement(name = "ars:QueryPaymentLogRequestMsg")
    public QueryPaymentLogReqMsg getQueryPaymentLogReqMsg() {
        if (queryPaymentLogReqMsg == null) queryPaymentLogReqMsg = new QueryPaymentLogReqMsg();
        return queryPaymentLogReqMsg;
    }

    public void setQueryPaymentLogReqMsg(QueryPaymentLogReqMsg queryPaymentLogReqMsg) {
        this.queryPaymentLogReqMsg = queryPaymentLogReqMsg;
    }
}
