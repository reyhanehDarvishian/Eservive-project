package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class QueryCustomBillingInfoRequestMsg {
    @JsonProperty("QueryCustomBillingInfoRequest")
   QueryCustomBillingInfoRequest queryCustomBillingInfoRequestList;
    @JsonProperty("RequestHeader")
    QueryBillingReqHeader queryBillingReqHeader;

    @XmlElement(name = "QueryCustomBillingInfoRequest")
    public QueryCustomBillingInfoRequest getQueryCustomBillingInfoRequestList() {
        if (queryCustomBillingInfoRequestList==null) return new QueryCustomBillingInfoRequest();
        return queryCustomBillingInfoRequestList;
    }

    public void setQueryCustomBillingInfoRequestList(QueryCustomBillingInfoRequest queryCustomBillingInfoRequestList) {
        this.queryCustomBillingInfoRequestList = queryCustomBillingInfoRequestList;
    }

    //    public void setQueryCustomBillingInfoRequestBeanList(List<QueryCustomBillingInfoRequest> queryCustomBillingInfoRequestList) {
//        this.queryCustomBillingInfoRequestList = queryCustomBillingInfoRequestList;
//    }
//
//    @XmlElement(name = "QueryCustomBillingInfoRequest")
//    public List<QueryCustomBillingInfoRequest> getQueryCustomBillingInfoRequestBeanList() {
//        if (queryCustomBillingInfoRequestList == null)
//            queryCustomBillingInfoRequestList = new ArrayList<QueryCustomBillingInfoRequest>();
//        return queryCustomBillingInfoRequestList;
//    }

    @XmlElement(name = "RequestHeader")
    public QueryBillingReqHeader getQueryBillingReqHeader() {
        if (queryBillingReqHeader == null) queryBillingReqHeader = new QueryBillingReqHeader();
        return queryBillingReqHeader;
    }

    public void setQueryBillingReqHeader(QueryBillingReqHeader queryBillingReqHeader) {
        this.queryBillingReqHeader = queryBillingReqHeader;
    }
}