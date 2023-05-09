package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryAccountInfoRequest {
    @JsonProperty("cms:queryObj")
    QueryAccountInfoQueryObj queryAccountInfoQueryObj;
    @JsonProperty("cms:includeObj")
    QueryAccountInfoIncludeObj queryAccountInfoIncludeObj;

    @XmlElement(name = "cms:includeObj")
    public QueryAccountInfoIncludeObj getQueryAccountInfoIncludeObj() {
        if (queryAccountInfoIncludeObj == null) queryAccountInfoIncludeObj = new QueryAccountInfoIncludeObj();
        return queryAccountInfoIncludeObj;
    }

    public void setQueryAccountInfoIncludeObj(QueryAccountInfoIncludeObj queryAccountInfoIncludeObj) {
        this.queryAccountInfoIncludeObj = queryAccountInfoIncludeObj;
    }

    @XmlElement(name = "cms:queryObj")
    public QueryAccountInfoQueryObj getQueryAccountInfoQueryObj() {
        if (queryAccountInfoQueryObj == null) queryAccountInfoQueryObj = new QueryAccountInfoQueryObj();
        return queryAccountInfoQueryObj;
    }

    public void setQueryAccountInfoQueryObj(QueryAccountInfoQueryObj queryAccountInfoQueryObj) {
        this.queryAccountInfoQueryObj = queryAccountInfoQueryObj;
    }
}