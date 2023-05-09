package com.rahgozin.gate.dto.querySubscriberNew.queryCust.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


@JsonRootName("soapenv:Envelope")

public class QuerySubEnvelopeReq {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String schemaLocation = "http://schemas.xmlsoap.org/soap/envelope/";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cms")
    private String cms = "http://www.huawei.com/bes/crminterface/cmservices";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crm = "http://www.huawei.com/bes/crminterface/crmheader";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:com")
    private String com = "http://www.huawei.com/bes/crminterface/common";
    @JsonProperty("soapenv:Header")
    QuerySubHeader querySubHeader;
    @JsonProperty("soapenv:Body")
    QuerySubBodyReq querySubBodyReq;

    @JsonIgnore
    public QuerySubBodyReq getBody() {
        if (querySubBodyReq == null) querySubBodyReq = new QuerySubBodyReq();
        return querySubBodyReq;
    }

    public void setBody(QuerySubBodyReq querySubBodyReq) {
        this.querySubBodyReq = querySubBodyReq;
    }

    @JsonIgnore
    @XmlElement(name = "soapenv:Header")
    public QuerySubHeader getHeader() {
        if (querySubHeader == null) querySubHeader = new QuerySubHeader();
        return querySubHeader;
    }

    public void setHeader(QuerySubHeader querySubHeader) {
        this.querySubHeader = querySubHeader;
    }

    public String getCms() {
        return cms;
    }

    public void setCms(String cms) {
        this.cms = cms;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
}