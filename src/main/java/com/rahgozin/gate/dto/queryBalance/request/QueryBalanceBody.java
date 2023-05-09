package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName("soapenv:Body")
public class QueryBalanceBody {
    @JsonProperty("ars:QueryBalanceRequestMsg")
    QueryBalanceRequestMsg queryBalanceRequestMsg;

    @XmlElement(name = "ars:QueryBalanceRequestMsg")
    public QueryBalanceRequestMsg getQueryBalanceRequestMsg() {
        if (queryBalanceRequestMsg == null) queryBalanceRequestMsg = new QueryBalanceRequestMsg();
        return queryBalanceRequestMsg;
    }

    public void setQueryBalanceRequestMsg(QueryBalanceRequestMsg queryBalanceRequestMsg) {
        this.queryBalanceRequestMsg = queryBalanceRequestMsg;
    }
}
