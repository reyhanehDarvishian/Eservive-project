package com.rahgozin.gate.dto.querySub.queryCustomer.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QuerySubscriberReqMsg {

    @JsonProperty("requestHeader")
    QuerySubReqHeader querySubReqHeader;
    @JsonProperty("querySubscriberRequest")
    QuerySubscriberReq querySubscriberReq;


    @XmlElement(name = "requestHeader")
    public QuerySubReqHeader getRequestHeader() {
        if (querySubReqHeader == null) querySubReqHeader = new QuerySubReqHeader();
        return querySubReqHeader;
    }

    public void setRequestHeader(QuerySubReqHeader querySubReqHeader) {
        this.querySubReqHeader = querySubReqHeader;
    }

    public void setQuerySubscriberRequestList(QuerySubscriberReq querySubscriberReq) {
        this.querySubscriberReq = querySubscriberReq;
    }

    @XmlElement(name = "querySubscriberRequest")
    public QuerySubscriberReq getQuerySubscriberRequest() {
        if (querySubscriberReq == null)
            querySubscriberReq = new QuerySubscriberReq();
        return querySubscriberReq;
    }


}