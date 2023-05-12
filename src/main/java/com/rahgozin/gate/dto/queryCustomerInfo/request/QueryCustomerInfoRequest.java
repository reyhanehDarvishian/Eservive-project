package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryCustomerInfoRequest {

    @JsonProperty("ns4:queryObj")
    QueryObj queryObj;
    @JsonProperty("ns4:includeObj")
    IncludeObj includeObj;

    @XmlElement(name = "ns4:includeObj")
    public IncludeObj getIncludeObj() {
        if (includeObj == null) includeObj = new IncludeObj();
        return includeObj;
    }

    public void setIncludeObj(IncludeObj includeObj) {
        this.includeObj = includeObj;
    }

    @XmlElement(name = "ns4:queryObj")
    public QueryObj getQueryObBean() {
        if (queryObj == null) queryObj = new QueryObj();
        return queryObj;
    }

    public void setQueryObj (QueryObj queryObj) {
        this.queryObj = queryObj;
    }

}