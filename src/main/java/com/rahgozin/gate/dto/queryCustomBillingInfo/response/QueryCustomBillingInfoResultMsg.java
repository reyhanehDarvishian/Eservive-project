package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryCustomBillingInfoResultMsg {
    @JsonProperty("QueryCustomBillingInfoResult")
    List<QueryCustomBillingInfoResult> queryCustomBillingInfoResultList;
    @JsonProperty("ResultHeader")
    QueryCustomBillingInfoResultHeader queryCustomBillingInfoResultHeader;

    public void setQueryCustomBillingInfoResultBeanList(List<QueryCustomBillingInfoResult> queryCustomBillingInfoResultList) {
        this.queryCustomBillingInfoResultList = queryCustomBillingInfoResultList;
    }

    @XmlElement(name = "QueryCustomBillingInfoResult")
    public List<QueryCustomBillingInfoResult> getQueryCustomBillingInfoResultBeanList() {
        if (queryCustomBillingInfoResultList == null)
            queryCustomBillingInfoResultList = new ArrayList<QueryCustomBillingInfoResult>();
        return queryCustomBillingInfoResultList;
    }

    @XmlElement(name = "ResultHeader")
    public QueryCustomBillingInfoResultHeader getResultHeaderBean() {
        if (queryCustomBillingInfoResultHeader == null)
            queryCustomBillingInfoResultHeader = new QueryCustomBillingInfoResultHeader();
        return queryCustomBillingInfoResultHeader;
    }

    public void setResultHeaderBean(QueryCustomBillingInfoResultHeader queryCustomBillingInfoResultHeader) {
        this.queryCustomBillingInfoResultHeader = queryCustomBillingInfoResultHeader;
    }
}