package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitQueryObj {
    @JsonProperty("ns3:SubAccessCode")
    QueryFreeUnitSubAccessCode queryFreeUnitSubAccessCode;

    @XmlElement(name = "ns3:SubAccessCode")
    public QueryFreeUnitSubAccessCode getQueryFreeUnitSubAccessCode() {
        if (queryFreeUnitSubAccessCode == null) queryFreeUnitSubAccessCode = new QueryFreeUnitSubAccessCode();
        return queryFreeUnitSubAccessCode;
    }

    public void setQueryFreeUnitSubAccessCode(QueryFreeUnitSubAccessCode queryFreeUnitSubAccessCode) {
        this.queryFreeUnitSubAccessCode = queryFreeUnitSubAccessCode;
    }
}