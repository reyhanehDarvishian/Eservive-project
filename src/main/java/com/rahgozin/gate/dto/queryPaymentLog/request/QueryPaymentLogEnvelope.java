package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;

@JsonRootName("soapenv:Envelope")
public class QueryPaymentLogEnvelope {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelope = "http://schemas.xmlsoap.org/soap/envelope/";

    @JsonProperty("soapenv:Header")
    QueryPaymentLogHeader queryPaymentLogHeader;
    @JsonProperty("soapenv:Body")
    QueryPaymentLogBody queryPaymentLogBody;

    @XmlAttribute(name = "soapenv:Header")
    public QueryPaymentLogHeader getQueryPaymentLogHeader() {
        if (queryPaymentLogHeader == null) queryPaymentLogHeader = new QueryPaymentLogHeader();
        return queryPaymentLogHeader;
    }

    public void setQueryPaymentLogHeader(QueryPaymentLogHeader queryPaymentLogHeader) {
        this.queryPaymentLogHeader = queryPaymentLogHeader;
    }

    @XmlAttribute(name = "soapenv:Body")
    public QueryPaymentLogBody getQueryPaymentLogBody() {
        if (queryPaymentLogBody == null) queryPaymentLogBody = new QueryPaymentLogBody();
        return queryPaymentLogBody;
    }

    public void setQueryPaymentLogBody(QueryPaymentLogBody queryPaymentLogBody) {
        this.queryPaymentLogBody = queryPaymentLogBody;
    }
}
