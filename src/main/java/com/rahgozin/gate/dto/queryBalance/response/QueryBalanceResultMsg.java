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

    @JsonProperty("ResultHeader")
    QueryBalanceResResultHeader queryBalanceResResultHeader;
    @JsonProperty("QueryBalanceResult")
    List<QueryBalanceResult> queryBalanceResultList;

    public void setQueryBalanceResultBeanList(List<QueryBalanceResult> queryBalanceResultList) {
        this.queryBalanceResultList = queryBalanceResultList;
    }

    @XmlElement(name = "QueryBalanceResult")
    public List<QueryBalanceResult> getQueryBalanceResultBeanList() {
        if (queryBalanceResultList == null)
            queryBalanceResultList = new ArrayList<QueryBalanceResult>();
        return queryBalanceResultList;
    }

    @XmlElement(name = "ResultHeader")
    public QueryBalanceResResultHeader getResultHeaderBean() {
        if (queryBalanceResResultHeader == null) queryBalanceResResultHeader = new QueryBalanceResResultHeader();
        return queryBalanceResResultHeader;
    }

    public void setResultHeaderBean(QueryBalanceResResultHeader queryBalanceResResultHeader) {
        this.queryBalanceResResultHeader = queryBalanceResResultHeader;
    }
}