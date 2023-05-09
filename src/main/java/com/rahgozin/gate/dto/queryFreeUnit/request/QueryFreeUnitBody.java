package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitBody {
    @JsonProperty("ns3:QueryFreeUnitRequestMsg")
    QueryFreeUnitRequestMsg queryFreeUnitRequestMsg;

    @XmlElement(name = "ns3:QueryFreeUnitRequestMsg")
    public QueryFreeUnitRequestMsg getQueryFreeUnitRequestMsg() {
        if (queryFreeUnitRequestMsg == null) queryFreeUnitRequestMsg = new QueryFreeUnitRequestMsg();
        return queryFreeUnitRequestMsg;
    }

    public void setQueryFreeUnitRequestMsg(QueryFreeUnitRequestMsg queryFreeUnitRequestMsg) {
        this.queryFreeUnitRequestMsg = queryFreeUnitRequestMsg;
    }
}