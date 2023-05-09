package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryImsiInfoReqMsg {
    @JsonProperty("requestHeader")
    ImsiReqHeader imsiReqHeader;
    @JsonProperty("queryIMSIInfoRequest")
    QueryImsiInfoReq queryImsiInfoReq;

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns2")
    private String schemaLocation = "http://www.huawei.com/bes/crminterface/invservices";

    @XmlElement(name = "requestHeader")
    public ImsiReqHeader getImsiReqHeader() {
        if (imsiReqHeader == null)
            imsiReqHeader = new ImsiReqHeader();
        return imsiReqHeader;
    }

    public void setImsiReqHeader(ImsiReqHeader imsiReqHeader) {
        this.imsiReqHeader = imsiReqHeader;
    }

    @JsonIgnore
    @XmlElement(name = "queryIMSIInfoRequest")
    public QueryImsiInfoReq getImsiQueryIMSIInfoReq() {
        return queryImsiInfoReq;
    }

    public void setImsiQueryIMSIInfoReq(QueryImsiInfoReq queryImsiInfoReq) {
        this.queryImsiInfoReq = queryImsiInfoReq;
    }
}