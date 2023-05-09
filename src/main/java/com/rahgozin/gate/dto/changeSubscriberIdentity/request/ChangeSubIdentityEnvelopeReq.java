package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


@JsonRootName("ns0:Envelope")
public class ChangeSubIdentityEnvelopeReq {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns0")
    private String schemaEnv = "http://schemas.xmlsoap.org/soap/envelope/";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String cmsService = "http://schemas.xmlsoap.org/soap/envelope/";

    @JsonProperty("soapenv:Header")
    ChangeSubHeader changeSubHeader;
    @JsonProperty("soapenv:Body")
    ChangeSubIdentityBody changeSubIdentityBody;

    @JsonIgnore
    @XmlElement(name = "soapenv:Header")
    public ChangeSubHeader getChangeSubHeader() {
        if (changeSubHeader == null) changeSubHeader = new ChangeSubHeader();
        return changeSubHeader;
    }

    public void setChangeSubHeader(ChangeSubHeader changeSubHeader) {
        this.changeSubHeader = changeSubHeader;
    }

    @JsonIgnore
    @XmlElement(name = "soapenv:Body")
    public ChangeSubIdentityBody getChangeSubIdentityBody() {
        if (changeSubIdentityBody == null) changeSubIdentityBody = new ChangeSubIdentityBody();
        return changeSubIdentityBody;
    }

    public void setChangeSubIdentityBody(ChangeSubIdentityBody changeSubIdentityBody) {
        this.changeSubIdentityBody = changeSubIdentityBody;
    }

}