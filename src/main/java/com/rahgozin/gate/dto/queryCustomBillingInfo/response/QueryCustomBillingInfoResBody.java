package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryCustomBillingInfoResBody {
    @JsonProperty("QueryCustomBillingInfoResultMsg")
    QueryCustomBillingInfoResultMsg queryCustomBillingInfoResultMsg;

    @XmlElement(name = "QueryCustomBillingInfoResultMsg")
    public QueryCustomBillingInfoResultMsg getQueryCustomBillingInfoResultMsgBean() {
        if (queryCustomBillingInfoResultMsg == null)
            queryCustomBillingInfoResultMsg = new QueryCustomBillingInfoResultMsg();
        return queryCustomBillingInfoResultMsg;
    }

    public void setQueryCustomBillingInfoResultMsgBean(QueryCustomBillingInfoResultMsg queryCustomBillingInfoResultMsg) {
        this.queryCustomBillingInfoResultMsg = queryCustomBillingInfoResultMsg;
    }
}