package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitEnvelopeRes {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelope = "http://schemas.xmlsoap.org/soap/envelope/";

    @JsonProperty("Body")
    QueryFreeUnitBodyRes queryFreeUnitBodyRes;

    @XmlElement(name = "Body")
    public QueryFreeUnitBodyRes getQueryFreeUnitBodyRes() {
        if (queryFreeUnitBodyRes == null) queryFreeUnitBodyRes = new QueryFreeUnitBodyRes();
        return queryFreeUnitBodyRes;
    }

    public void setQueryFreeUnitBodyRes(QueryFreeUnitBodyRes queryFreeUnitBodyRes) {
        this.queryFreeUnitBodyRes = queryFreeUnitBodyRes;
    }
}