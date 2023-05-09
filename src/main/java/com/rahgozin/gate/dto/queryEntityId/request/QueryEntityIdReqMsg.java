package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdReqMsg {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cms")
    private String cmservices = "http://www.huawei.com/bes/crminterface/cmservices";
    @JsonProperty("requestHeader")
    QueryEntityIdRequestHeader requestHeader;
    @JsonProperty("queryEntityIdRequest")
    QueryEntityIdRequest queryEntityIdRequest;


    @XmlElement(name = "queryEntityIdRequest")
    public QueryEntityIdRequest getQueryEntityIdRequest() {
        if (queryEntityIdRequest == null) queryEntityIdRequest = new QueryEntityIdRequest();
        return queryEntityIdRequest;
    }

    public void setQueryEntityIdRequest(QueryEntityIdRequest queryEntityIdRequest) {
        this.queryEntityIdRequest = queryEntityIdRequest;
    }

    @XmlElement(name = "requestHeader")
    public QueryEntityIdRequestHeader getRequestHeader() {
        if (requestHeader == null) requestHeader = new QueryEntityIdRequestHeader();
        return requestHeader;
    }

    public void setRequestHeader(QueryEntityIdRequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }
}