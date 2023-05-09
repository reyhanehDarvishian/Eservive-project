package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName("soapenv:Envelope")
public class QueryBalanceEnvelopeReq {

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String schemaLocation = "http://schemas.xmlsoap.org/soap/envelope/";

    @JsonProperty("soapenv:Header")
    QueryBalanceHeader queryBalanceHeader;
    @JsonProperty("soapenv:Body")
    QueryBalanceBody queryBalanceBody;

    @JsonIgnore
    @XmlElement(name = "soapenv:Header")
    public QueryBalanceHeader getHeader() {
        if (queryBalanceHeader == null) queryBalanceHeader = new QueryBalanceHeader();
        return queryBalanceHeader;
    }

    public void setHeader(QueryBalanceHeader queryBalanceHeader) {
        this.queryBalanceHeader = queryBalanceHeader;
    }

    @JsonIgnore
    public QueryBalanceBody getBody() {
        if (queryBalanceBody == null) queryBalanceBody = new QueryBalanceBody();
        return queryBalanceBody;
    }

    public void setBody(QueryBalanceBody queryBalanceBody) {
        this.queryBalanceBody = queryBalanceBody;
    }
}
