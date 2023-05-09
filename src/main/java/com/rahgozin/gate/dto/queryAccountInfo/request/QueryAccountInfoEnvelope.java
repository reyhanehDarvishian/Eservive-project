package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@JsonRootName("soapenv:Envelope")
public class QueryAccountInfoEnvelope {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelope = "http://schemas.xmlsoap.org/soap/envelope/";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cms")
    private String cmservices = "http://www.huawei.com/bes/crminterface/cmservices";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crmheader = "http://www.huawei.com/bes/crminterface/crmheader";

    @JsonProperty("soapenv:Header")
    QueryAccountInfoHeader queryAccountInfoHeader;
    @JsonProperty("soapenv:Body")
    QueryAccountInfoBody queryAccountInfoBody;

    @XmlAttribute(name = "soapenv:Header")
    public QueryAccountInfoHeader getQueryAccountInfoHeader() {
        if (queryAccountInfoHeader == null) queryAccountInfoHeader = new QueryAccountInfoHeader();
        return queryAccountInfoHeader;
    }

    public void setQueryAccountInfoHeader(QueryAccountInfoHeader queryAccountInfoHeader) {
        this.queryAccountInfoHeader = queryAccountInfoHeader;
    }

    @XmlElement(name = "soapenv:Body")
    public QueryAccountInfoBody getQueryAccountInfoBody() {
        if (queryAccountInfoBody == null) queryAccountInfoBody = new QueryAccountInfoBody();
        return queryAccountInfoBody;
    }

    public void setQueryAccountInfoBody(QueryAccountInfoBody queryAccountInfoBody) {
        this.queryAccountInfoBody = queryAccountInfoBody;
    }

}