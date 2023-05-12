package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryCustomerInfoResEnvelope {
    @JsonProperty("Body")
    QueryCustomerInfoResBody queryCustomerInfoResBody;

    @XmlElement(name = "Body")
    public QueryCustomerInfoResBody getQueryCustomerInfoResBody() {
        if (queryCustomerInfoResBody == null) queryCustomerInfoResBody = new QueryCustomerInfoResBody();
        return queryCustomerInfoResBody;
    }

    public void setQueryCustomerInfoResBody(QueryCustomerInfoResBody queryCustomerInfoResBody) {
        this.queryCustomerInfoResBody = queryCustomerInfoResBody;
    }
}