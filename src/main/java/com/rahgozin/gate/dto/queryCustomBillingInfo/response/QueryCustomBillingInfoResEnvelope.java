package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryCustomBillingInfoResEnvelope {
    @JsonProperty("Body")
	QueryCustomBillingInfoResBody queryCustomBillingInfoResBody;

    @XmlElement(name = "Body")
    public QueryCustomBillingInfoResBody getBodyBean() {
        if (queryCustomBillingInfoResBody == null) queryCustomBillingInfoResBody = new QueryCustomBillingInfoResBody();
        return queryCustomBillingInfoResBody;
    }

    public void setBodyBean(QueryCustomBillingInfoResBody queryCustomBillingInfoResBody) {
        this.queryCustomBillingInfoResBody = queryCustomBillingInfoResBody;
    }

}