package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryBillingBody {
    @JsonProperty("arc:QueryCustomBillingInfoRequestMsg")
    QueryCustomBillingInfoRequestMsg queryCustomBillingInfoRequestMsg;

    @XmlElement(name = "arc:QueryCustomBillingInfoRequestMsg")
    public QueryCustomBillingInfoRequestMsg getQueryCustomBillingInfoRequestMsg() {
        if (queryCustomBillingInfoRequestMsg==null) return new QueryCustomBillingInfoRequestMsg();
        return queryCustomBillingInfoRequestMsg;
    }

    public void setQueryCustomBillingInfoRequestMsg(QueryCustomBillingInfoRequestMsg queryCustomBillingInfoRequestMsg) {
        this.queryCustomBillingInfoRequestMsg = queryCustomBillingInfoRequestMsg;
    }
}