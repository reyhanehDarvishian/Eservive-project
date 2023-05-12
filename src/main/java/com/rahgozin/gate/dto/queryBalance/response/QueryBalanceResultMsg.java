package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryBalanceResultMsg {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ars")
    private String arservices = "http://www.huawei.com/bme/cbsinterface/arservices";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:arc")
    private String arcommon = "http://cbs.huawei.com/ar/wsservice/arcommon";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String cbscommon = "http://www.huawei.com/bme/cbsinterface/cbscommon";

    @JsonProperty("resultHeader")
    QueryBalanceResResultHeader queryBalanceResResultHeader;
    @JsonProperty("QueryBalanceResult")
    QueryBalanceResult queryBalanceResult;

    @XmlElement(name = "resultHeader")
    public QueryBalanceResResultHeader getQueryBalanceResResultHeader() {
        if (queryBalanceResResultHeader == null) queryBalanceResResultHeader = new QueryBalanceResResultHeader();
        return queryBalanceResResultHeader;
    }

    public void setQueryBalanceResResultHeader(QueryBalanceResResultHeader queryBalanceResResultHeader) {
        this.queryBalanceResResultHeader = queryBalanceResResultHeader;
    }

    @XmlElement(name = "QueryBalanceResult")
    public QueryBalanceResult getQueryBalanceResult() {
        if (queryBalanceResult == null) queryBalanceResult = new QueryBalanceResult();
        return queryBalanceResult;
    }

    public void setQueryBalanceResult(QueryBalanceResult queryBalanceResult) {
        this.queryBalanceResult = queryBalanceResult;
    }
}