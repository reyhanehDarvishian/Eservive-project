package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitRequest {
    @JsonProperty("ns3:QueryObj")
    QueryFreeUnitQueryObj queryFreeUnitQueryObj;

    @XmlElement(name = "ns3:QueryObj")
    public QueryFreeUnitQueryObj getQueryFreeUnitQueryObj() {
        if (queryFreeUnitQueryObj == null) queryFreeUnitQueryObj = new QueryFreeUnitQueryObj();
        return queryFreeUnitQueryObj;
    }

    public void setQueryFreeUnitQueryObj(QueryFreeUnitQueryObj queryFreeUnitQueryObj) {
        this.queryFreeUnitQueryObj = queryFreeUnitQueryObj;
    }
}