package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryCustomerInfoReqMsg {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns4")
    private String cmservices = "http://www.huawei.com/bes/crminterface/cmservices";

    @JsonProperty("requestHeader")
    QueryCustomerInfoRequestHeader queryCustomerInfoRequestHeader;
    @JsonProperty("queryCustomerInfoRequest")
    QueryCustomerInfoRequest queryCustomerInfoRequest;

    public void setQueryCustomerInfoRequestHeader(QueryCustomerInfoRequestHeader queryCustomerInfoRequestHeader) {
        this.queryCustomerInfoRequestHeader = queryCustomerInfoRequestHeader;
    }

    @XmlElement(name = "queryCustomerInfoRequest")
    public QueryCustomerInfoRequest getQueryCustomerInfoRequest() {
        if (queryCustomerInfoRequest == null) queryCustomerInfoRequest = new QueryCustomerInfoRequest();
        return queryCustomerInfoRequest;
    }

    public void setQueryCustomerInfoRequest(QueryCustomerInfoRequest queryCustomerInfoRequest) {
        this.queryCustomerInfoRequest = queryCustomerInfoRequest;
    }

    @XmlElement(name = "requestHeader")
    public QueryCustomerInfoRequestHeader getQueryCustomerInfoRequestHeader() {
        if (queryCustomerInfoRequestHeader == null)
            queryCustomerInfoRequestHeader = new QueryCustomerInfoRequestHeader();
        return queryCustomerInfoRequestHeader;
    }
}