package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitRequestMsg {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns3")
    private String bbservices = "http://www.huawei.com/bme/cbsinterface/bbservices";
    @JsonProperty("RequestHeader")
    QueryFreeUnitRequestHeader queryFreeUnitRequestHeader;
    @JsonProperty("QueryFreeUnitRequest")
    QueryFreeUnitRequest queryFreeUnitRequest;

    @XmlElement(name = "QueryFreeUnitRequest")
    public QueryFreeUnitRequest getQueryFreeUnitRequest() {
        if (queryFreeUnitRequest == null) queryFreeUnitRequest = new QueryFreeUnitRequest();
        return queryFreeUnitRequest;
    }

    public void setQueryFreeUnitRequest(QueryFreeUnitRequest queryFreeUnitRequest) {
        this.queryFreeUnitRequest = queryFreeUnitRequest;
    }

    @XmlElement(name = "RequestHeader")
    public QueryFreeUnitRequestHeader getQueryFreeUnitRequestHeader() {
        if (queryFreeUnitRequestHeader == null) queryFreeUnitRequestHeader = new QueryFreeUnitRequestHeader();
        return queryFreeUnitRequestHeader;
    }

    public void setQueryFreeUnitRequestHeader(QueryFreeUnitRequestHeader queryFreeUnitRequestHeader) {
        this.queryFreeUnitRequestHeader = queryFreeUnitRequestHeader;
    }
}