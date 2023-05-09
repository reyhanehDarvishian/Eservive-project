package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdQueryObj {
    @JsonProperty("cms:subAccessCode")
    QueryEntityIdSubAccessCode subAccessCode;

    @XmlElement(name = "cms:subAccessCode")
    public QueryEntityIdSubAccessCode getSubAccessCode() {
        if (subAccessCode == null) subAccessCode = new QueryEntityIdSubAccessCode();
        return subAccessCode;
    }

    public void setSubAccessCode(QueryEntityIdSubAccessCode subAccessCode) {
        this.subAccessCode = subAccessCode;
    }
}