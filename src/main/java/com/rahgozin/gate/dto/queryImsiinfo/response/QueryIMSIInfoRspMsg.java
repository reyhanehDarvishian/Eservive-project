package com.rahgozin.gate.dto.queryImsiinfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahgozin.gate.dto.querySub.queryCustomer.response.SubscriberInfoRes;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class QueryIMSIInfoRspMsg {

    @JsonProperty("resultHeader")
    QueryImsiResResultHeader queryImsiResResultHeader;
    @JsonProperty("queryIMSIInfoResponse")
    QueryIMSIInfoResponse queryIMSIInfoResponse;

//    List<QueryIMSIInfoResponse> queryIMSIInfoResponseList=new ArrayList<>();

//    public void addToImsiInfoRes(QueryIMSIInfoResponse queryIMSIInfoResponse) {
//        queryIMSIInfoResponseList.add(queryIMSIInfoResponse);
//    }
    @XmlElement(name = "queryIMSIInfoResponse")
    public QueryIMSIInfoResponse getQueryIMSIInfoResponse() {
        return queryIMSIInfoResponse;
    }

    public void setQueryIMSIInfoResponse(QueryIMSIInfoResponse queryIMSIInfoResponse) {
//        addToImsiInfoRes(queryIMSIInfoResponse);
        this.queryIMSIInfoResponse = queryIMSIInfoResponse;
    }

    @XmlElement(name = "resultHeader")
    public QueryImsiResResultHeader getQueryImsiResResultHeader() {
        if (queryImsiResResultHeader == null) queryImsiResResultHeader = new QueryImsiResResultHeader();
        return queryImsiResResultHeader;
    }

    public void setQueryImsiResResultHeader(QueryImsiResResultHeader queryImsiResResultHeader) {
        this.queryImsiResResultHeader = queryImsiResResultHeader;
    }
}