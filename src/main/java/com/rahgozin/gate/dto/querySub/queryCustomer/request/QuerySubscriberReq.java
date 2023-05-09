package com.rahgozin.gate.dto.querySub.queryCustomer.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QuerySubscriberReq {
    @JsonProperty("cms:queryObj")
    QueryObjReq queryObjReq;
    @JsonProperty("cms:includeObj")
    IncludeObjReq includeObjReq;
    @JsonProperty("cms:pageQuery")
    PageQueryReq pageQueryReq;

    @JsonIgnore
    @XmlElement(name = "cms:queryObj")
    public QueryObjReq getQueryObjRequest() {
        if (queryObjReq == null)
            queryObjReq = new QueryObjReq();
        return queryObjReq;
    }

    @JsonIgnore
    @XmlElement(name = "cms:includeObj")
    public IncludeObjReq getIncludeObjRequest() {
        if (includeObjReq == null)
            includeObjReq = new IncludeObjReq();
        return includeObjReq;
    }

    public void setIncludeObj(IncludeObjReq includeObjReq) {
        this.includeObjReq = includeObjReq;
    }

    @JsonIgnore
    @XmlElement(name = "cms:pageQuery")
    public PageQueryReq getPageQueryRequest() {
        if (pageQueryReq == null)
            pageQueryReq = new PageQueryReq();
        return pageQueryReq;
    }

    public void setPageQuery(PageQueryReq pageQueryReq) {
        this.pageQueryReq = pageQueryReq;
    }

    public void setQueryObj(QueryObjReq queryObjReq) {
        this.queryObjReq = queryObjReq;
    }


}