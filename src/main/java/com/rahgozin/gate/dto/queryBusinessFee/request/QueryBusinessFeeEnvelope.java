package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.rahgozin.gate.dto.querySub.querySubscriber.request.QuerySubHeader;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName("ns0:Envelope")
public class QueryBusinessFeeEnvelope {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns0")
    private String schemaLocation = "http://schemas.xmlsoap.org/soap/envelope/";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelopeSchemaLocation = "http://schemas.xmlsoap.org/soap/envelope/";
    @JsonProperty("soapenv:Header")
    QuerySubHeader querySubHeader;
    @JsonProperty("soapenv:Body")
    QueryBusinessFeeReqBody queryBusinessFeeReqBody;

    @JsonIgnore
    @XmlElement(name = "soapenv:Header")
    public QuerySubHeader getQuerySubHeader() {
        if (querySubHeader == null) querySubHeader = new QuerySubHeader();
        return querySubHeader;
    }

    public void setQuerySubHeader(QuerySubHeader querySubHeader) {
        this.querySubHeader = querySubHeader;
    }

    @JsonIgnore
    @JsonProperty("soapenv:Body")
    public QueryBusinessFeeReqBody getBusinessFeeReqBody() {
        if (queryBusinessFeeReqBody == null) queryBusinessFeeReqBody = new QueryBusinessFeeReqBody();
        return queryBusinessFeeReqBody;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getEnvelopeSchemaLocation() {
        return envelopeSchemaLocation;
    }

    public void setEnvelopeSchemaLocation(String envelopeSchemaLocation) {
        this.envelopeSchemaLocation = envelopeSchemaLocation;
    }

    public QueryBusinessFeeReqBody getQueryBusinessFeeReqBody() {
        return queryBusinessFeeReqBody;
    }

    public void setQueryBusinessFeeReqBody(QueryBusinessFeeReqBody queryBusinessFeeReqBody) {
        this.queryBusinessFeeReqBody = queryBusinessFeeReqBody;
    }

    public void setBusinessFeeReqBody(QueryBusinessFeeReqBody queryBusinessFeeReqBody) {
        this.queryBusinessFeeReqBody = queryBusinessFeeReqBody;


    }
}