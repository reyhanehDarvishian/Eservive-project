package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryPaymentLogReqMsg {

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ars")
    private String arservices = "http://www.huawei.com/bme/cbsinterface/arservices";

    @JsonProperty("RequestHeader")
    QueryPaymentLogRequestHeader queryPaymentLogRequestHeader;
    @JsonProperty("QueryPaymentLogRequest")
    QueryPaymentLogRequest queryPaymentLogRequest;

    @XmlElement(name = "RequestHeader")
    public QueryPaymentLogRequestHeader getQueryPaymentLogRequestHeader() {
        if (queryPaymentLogRequestHeader == null) queryPaymentLogRequestHeader = new QueryPaymentLogRequestHeader();
        return queryPaymentLogRequestHeader;
    }

    public void setQueryPaymentLogRequestHeader(QueryPaymentLogRequestHeader queryPaymentLogRequestHeader) {
        this.queryPaymentLogRequestHeader = queryPaymentLogRequestHeader;
    }

    @XmlElement(name = "QueryPaymentLogRequest")
    public QueryPaymentLogRequest getQueryPaymentLogRequest() {
        if (queryPaymentLogRequest == null) queryPaymentLogRequest = new QueryPaymentLogRequest();
        return queryPaymentLogRequest;
    }

    public void setQueryPaymentLogRequest(QueryPaymentLogRequest queryPaymentLogRequest) {
        this.queryPaymentLogRequest = queryPaymentLogRequest;
    }
}
