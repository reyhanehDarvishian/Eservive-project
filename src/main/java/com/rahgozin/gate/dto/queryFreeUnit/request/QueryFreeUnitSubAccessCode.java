package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitSubAccessCode {
    @JsonProperty("ns2:PrimaryIdentity")
    QueryFreeUnitPrimaryIdentity primaryIdentity;

    @JsonIgnore
    @XmlElement(name = "ns2:PrimaryIdentity")
    public QueryFreeUnitPrimaryIdentity getPrimaryIdentity() {
        if (primaryIdentity == null) primaryIdentity = new QueryFreeUnitPrimaryIdentity();
        return primaryIdentity;
    }

    public void setPrimaryIdentity(QueryFreeUnitPrimaryIdentity primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}