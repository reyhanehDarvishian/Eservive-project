package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitBodyRes {
    @JsonProperty("bbs:QueryFreeUnitResultMsg")
    QueryFreeUnitResultMsg queryFreeUnitResultMsg;

    @XmlElement(name = "bbs:QueryFreeUnitResultMsg")
    public QueryFreeUnitResultMsg getQueryFreeUnitResultMsg() {
        if (queryFreeUnitResultMsg == null) queryFreeUnitResultMsg = new QueryFreeUnitResultMsg();
        return queryFreeUnitResultMsg;
    }

    public void setQueryFreeUnitResultMsg(QueryFreeUnitResultMsg queryFreeUnitResultMsg) {
        this.queryFreeUnitResultMsg = queryFreeUnitResultMsg;
    }

}