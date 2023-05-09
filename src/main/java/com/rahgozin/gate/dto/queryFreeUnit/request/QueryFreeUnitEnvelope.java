package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.rahgozin.gate.dto.querySub.queryCustomer.request.QuerySubHeader;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@JsonRootName("soapenv:Envelope")
public class QueryFreeUnitEnvelope {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelope = "http://schemas.xmlsoap.org/soap/envelope/";

    @JsonProperty("soapenv:Header")
    QuerySubHeader header;
    @JsonProperty("soapenv:Body")
    QueryFreeUnitBody queryFreeUnitBody;

    @XmlAttribute(name = "soapenv:Header")
    public QuerySubHeader getHeader() {
        return header;
    }

    public void setHeader(QuerySubHeader header) {
        this.header = header;
    }

    @XmlElement(name = "soapenv:Body")
    public QueryFreeUnitBody getQueryFreeUnitBody() {
        if (queryFreeUnitBody == null) queryFreeUnitBody = new QueryFreeUnitBody();
        return queryFreeUnitBody;
    }

    public void setQueryFreeUnitBody(QueryFreeUnitBody queryFreeUnitBody) {
        this.queryFreeUnitBody = queryFreeUnitBody;
    }
}