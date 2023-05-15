package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "queryFreeUnitResultMsg"
})
@Generated("jsonschema2pojo")
public class QueryFreeUnitBodyRes {
    private QueryFreeUnitResultMsg queryFreeUnitResultMsg;

    @JsonProperty("queryFreeUnitResultMsg")
    public QueryFreeUnitResultMsg getQueryFreeUnitResultMsg() {
        return queryFreeUnitResultMsg;
    }

    @JsonProperty("QueryFreeUnitResultMsg")
    public void setQueryFreeUnitResultMsg(QueryFreeUnitResultMsg queryFreeUnitResultMsg) {
        this.queryFreeUnitResultMsg = queryFreeUnitResultMsg;
    }

}