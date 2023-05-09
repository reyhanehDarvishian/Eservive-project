package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryCustomerInfoRspMsg {
    @JsonProperty("queryCustomerInfoResponse")
    List<QueryCustomerInfoResponse> queryCustomerInfoResponseList;
    @JsonProperty("resultHeader")
	QueryCustomerInfoResResultHeader queryCustomerInfoResResultHeader;

    public void setQueryCustomerInfoResponseBeanList(List<QueryCustomerInfoResponse> queryCustomerInfoResponseList) {
        this.queryCustomerInfoResponseList = queryCustomerInfoResponseList;
    }

    @XmlElement(name = "queryCustomerInfoResponse")
    public List<QueryCustomerInfoResponse> getQueryCustomerInfoResponseBeanList() {
        if (queryCustomerInfoResponseList == null)
            queryCustomerInfoResponseList = new ArrayList<QueryCustomerInfoResponse>();
        return queryCustomerInfoResponseList;
    }

    @XmlElement(name = "resultHeader")
    public QueryCustomerInfoResResultHeader getResultHeaderBean() {
        if (queryCustomerInfoResResultHeader == null) queryCustomerInfoResResultHeader = new QueryCustomerInfoResResultHeader();
        return queryCustomerInfoResResultHeader;
    }

    public void setResultHeaderBean(QueryCustomerInfoResResultHeader queryCustomerInfoResResultHeader) {
        this.queryCustomerInfoResResultHeader = queryCustomerInfoResResultHeader;
    }

}