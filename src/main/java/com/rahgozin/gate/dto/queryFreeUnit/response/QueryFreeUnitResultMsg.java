package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ResultHeader",
        "QueryFreeUnitResult"
})
@Generated("jsonschema2pojo")
public class QueryFreeUnitResultMsg {
    private QueryFreeUnitResultHeader freeUnitResultHeader;
    private QueryFreeUnitResult queryFreeUnitResult;


    @JsonProperty("resultHeader")
    public QueryFreeUnitResultHeader getFreeUnitResultHeader() {
        return freeUnitResultHeader;
    }

    @JsonProperty("ResultHeader")
    public void setFreeUnitResultHeader(QueryFreeUnitResultHeader freeUnitResultHeader) {
        this.freeUnitResultHeader = freeUnitResultHeader;
    }

    @JsonProperty("queryFreeUnitResult")
    public QueryFreeUnitResult getQueryFreeUnitResult() {
        return queryFreeUnitResult;
    }

    @JsonProperty("QueryFreeUnitResult")
    public void setQueryFreeUnitResult(QueryFreeUnitResult queryFreeUnitResult) {
        this.queryFreeUnitResult = queryFreeUnitResult;
    }

}