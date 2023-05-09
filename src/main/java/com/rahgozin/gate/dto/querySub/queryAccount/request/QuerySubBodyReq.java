package com.rahgozin.gate.dto.querySub.queryAccount.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName("soapenv:Body")
public class QuerySubBodyReq {
    @JsonProperty("cms:querySubscriberReqMsg")
    QuerySubscriberReqMsg querySubscriberReqMsg;

    @XmlElement(name = "cms:querySubscriberReqMsg")
    public QuerySubscriberReqMsg getQuerySubscriberReqMsg() {
        if (querySubscriberReqMsg == null) querySubscriberReqMsg = new QuerySubscriberReqMsg();
        return querySubscriberReqMsg;
    }

    public void setQuerySubscriberReqMsg(QuerySubscriberReqMsg querySubscriberReqMsg) {
        this.querySubscriberReqMsg = querySubscriberReqMsg;
    }
}