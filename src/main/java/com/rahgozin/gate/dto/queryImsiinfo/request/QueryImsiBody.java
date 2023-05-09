package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName(value = "soapenv:Body")
public class QueryImsiBody {
    @JsonProperty("ns2:queryIMSIInfoReqMsg")
    QueryImsiInfoReqMsg queryImsiInfoReqMsg;

    @XmlElement(name = "ns2:queryIMSIInfoReqMsg")
    public QueryImsiInfoReqMsg getQueryImsiInfoReqMsg() {
        if (queryImsiInfoReqMsg == null) queryImsiInfoReqMsg = new QueryImsiInfoReqMsg();
        return queryImsiInfoReqMsg;
    }

    public void setQueryImsiInfoReqMsg(QueryImsiInfoReqMsg queryImsiInfoReqMsg) {
        this.queryImsiInfoReqMsg = queryImsiInfoReqMsg;
    }
}