package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.rahgozin.gate.dto.querySub.querySubscriber.request.QuerySubHeader;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@JsonRootName("soapenv:Envelope")
public class QueryBillingEnvelope {

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String schemaLocation = "http://schemas.xmlsoap.org/soap/envelope/";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:arc")
    private String envelopeSchemaLocation = "http://www.huawei.com/bme/cbsinterface/arcustomizedservices";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cbs")
    private String cbsCommon = "http://www.huawei.com/bme/cbsinterface/cbscommon";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:arc1")
    private String arcCommon = "http://cbs.huawei.com/ar/wsservice/arcommon";
    @JsonProperty("soapenv:Header")
    QuerySubHeader querySubHeader;
    @JsonProperty("soapenv:Body")
	QueryBillingBody queryBillingBody;

    public void setHeader(QuerySubHeader header) {
        this.querySubHeader = header;
    }

    @JsonIgnore
    @XmlAttribute(name = "soapenv:Header")
    public QuerySubHeader getHeader() {
        if (querySubHeader == null) querySubHeader = new QuerySubHeader();
        return querySubHeader;
    }

    @JsonIgnore
    @XmlElement(name = "soapenv:Body")
    public QueryBillingBody getBody() {
        if (queryBillingBody == null) queryBillingBody = new QueryBillingBody();
        return queryBillingBody;
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

    public QuerySubHeader getQuerySubHeader() {
        return querySubHeader;
    }

    public void setQuerySubHeader(QuerySubHeader querySubHeader) {
        this.querySubHeader = querySubHeader;
    }

    public QueryBillingBody getQueryBillingBody() {
        return queryBillingBody;
    }

    public void setQueryBillingBody(QueryBillingBody queryBillingBody) {
        this.queryBillingBody = queryBillingBody;
    }


}