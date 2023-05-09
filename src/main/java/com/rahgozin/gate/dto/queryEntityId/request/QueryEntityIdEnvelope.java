package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName("soapenv:Envelope")
public class QueryEntityIdEnvelope {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelope = "http://schemas.xmlsoap.org/soap/envelope/";
    @JsonProperty("soapenv:Header")
    QueryEntityIdHeader header;
    @JsonProperty("soapenv:Body")
    QueryEntityIdBody body;


    @XmlElement(name = "soapenv:Header")
    public QueryEntityIdHeader getHeader() {
        if (header == null) header = new QueryEntityIdHeader();
        return header;
    }

    public void setHeader(QueryEntityIdHeader header) {
        this.header = header;
    }

    @XmlElement(name = "soapenv:Body")
    public QueryEntityIdBody getBody() {
        if (body == null) body = new QueryEntityIdBody();
        return body;
    }

    public void setBody(QueryEntityIdBody body) {
        this.body = body;
    }
}