package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@JsonRootName("soapenv:Envelope")
public class ChangeImsiReportEnvelope {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String envelope = "http://schemas.xmlsoap.org/soap/envelope/";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cms")
    private String cmservices = "http://www.huawei.com/bes/crminterface/cmservices";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crmheader = "http://www.huawei.com/bes/crminterface/crmheader";


    @JsonProperty("soapenv:Header")
    ChangeImsiReportHeader header;
    @JsonProperty("soapenv:Body")
    ChangeImsiReportBody changeImsiReportBody;

    @XmlAttribute(name = "soapenv:Header")
    public ChangeImsiReportHeader getHeader() {
        if (header == null) header = new ChangeImsiReportHeader();
        return header;
    }

    public void setHeader(ChangeImsiReportHeader header) {
        this.header = header;
    }

    @XmlElement(name = "soapenv:Body")
    public ChangeImsiReportBody getChangeImsiReportBody() {
        if (changeImsiReportBody == null) changeImsiReportBody = new ChangeImsiReportBody();
        return changeImsiReportBody;
    }

    public void setChangeImsiReportBody(ChangeImsiReportBody changeImsiReportBody) {
        this.changeImsiReportBody = changeImsiReportBody;
    }
}