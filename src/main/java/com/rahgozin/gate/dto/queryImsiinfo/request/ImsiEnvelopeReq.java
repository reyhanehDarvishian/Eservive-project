package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.rahgozin.gate.dto.querySub.querySubscriber.request.QuerySubHeader;

@JsonRootName("soapenv:Envelope")
public class ImsiEnvelopeReq {

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:soapenv")
    private String schemaLocation = "http://schemas.xmlsoap.org/soap/envelope/";

    @JsonProperty("soapenv:Header")
    QuerySubHeader querySubHeader;
    @JsonProperty("soapenv:Body")
    QueryImsiBody queryImsiBody;

    @JsonIgnore
    public QueryImsiBody getImsiBodyRequest() {
        if (queryImsiBody == null) queryImsiBody = new QueryImsiBody();
        return queryImsiBody;
    }

    public void setImsiBodyRequest(QueryImsiBody queryImsiBody) {
        this.queryImsiBody = queryImsiBody;
    }
}