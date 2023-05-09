package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryAccountInfoRspMsg {
    @JsonProperty("queryAccountInfoResponse")
    List<QueryAccountInfoResponse> queryAccountInfoResponseList;
    @JsonProperty("resultHeader")
	QueryAccountInfoResResultHeader queryAccountInfoResResultHeader;

    @XmlElement(name = "queryAccountInfoResponse")
    public List<QueryAccountInfoResponse> getQueryAccountInfoResponseBeanList() {
        if (queryAccountInfoResponseList == null)
            queryAccountInfoResponseList = new ArrayList<QueryAccountInfoResponse>();
        return queryAccountInfoResponseList;
    }

    @XmlElement(name = "resultHeader")
    public QueryAccountInfoResResultHeader getResultHeaderBean() {
        if (queryAccountInfoResResultHeader == null) queryAccountInfoResResultHeader = new QueryAccountInfoResResultHeader();
        return queryAccountInfoResResultHeader;
    }

    public void setResultHeaderBean(QueryAccountInfoResResultHeader queryAccountInfoResResultHeader) {
        this.queryAccountInfoResResultHeader = queryAccountInfoResResultHeader;
    }

}