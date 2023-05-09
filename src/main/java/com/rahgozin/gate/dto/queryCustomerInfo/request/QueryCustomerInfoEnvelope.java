package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName("soapenv:Envelope")
public class QueryCustomerInfoEnvelope {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelope = "http://schemas.xmlsoap.org/soap/envelope/";

    @JsonProperty("soapenv:Header")
    QueryCustomerInfoHeader queryCustomerInfoHeader;
    @JsonProperty("soapenv:Body")
    QueryCustomerInfoBody queryCustomerInfoBody;

    @XmlElement(name = "soapenv:Header")
    public QueryCustomerInfoHeader getQueryCustomerInfoHeader() {
        if (queryCustomerInfoHeader == null) queryCustomerInfoHeader = new QueryCustomerInfoHeader();
        return queryCustomerInfoHeader;
    }

    public void setQueryCustomerInfoHeader(QueryCustomerInfoHeader queryCustomerInfoHeader) {
        this.queryCustomerInfoHeader = queryCustomerInfoHeader;
    }

    @XmlElement(name = "soapenv:Body")
    public QueryCustomerInfoBody getQueryCustomerInfoBody() {
        if (queryCustomerInfoBody == null) queryCustomerInfoBody = new QueryCustomerInfoBody();
        return queryCustomerInfoBody;
    }

    public void setQueryCustomerInfoBody(QueryCustomerInfoBody queryCustomerInfoBody) {
        this.queryCustomerInfoBody = queryCustomerInfoBody;
    }
}