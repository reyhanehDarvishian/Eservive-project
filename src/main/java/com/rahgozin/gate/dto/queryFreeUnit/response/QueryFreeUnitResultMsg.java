package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitResultMsg {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:bbs")
    private String bbservices = "http://www.huawei.com/bme/cbsinterface/bbservices";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String cbscommon = "http://www.huawei.com/bme/cbsinterface/cbscommon";
	@JsonProperty("ResultHeader")
	ResultHeader resultHeader;
	@JsonProperty("QueryFreeUnitResult")
    QueryFreeUnitResult queryFreeUnitResult;

    @XmlElement(name = "QueryFreeUnitResult")
    public QueryFreeUnitResult getQueryFreeUnitResult() {
        if (queryFreeUnitResult == null) queryFreeUnitResult = new QueryFreeUnitResult();
        return queryFreeUnitResult;
    }

    public void setQueryFreeUnitResult(QueryFreeUnitResult queryFreeUnitResult) {
        this.queryFreeUnitResult = queryFreeUnitResult;
    }

    @XmlElement(name = "ResultHeader")
    public ResultHeader getResultHeader() {
        if (resultHeader == null) resultHeader = new ResultHeader();
        return resultHeader;
    }

    public void setResultHeader(ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }

}