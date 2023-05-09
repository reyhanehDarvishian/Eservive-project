package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName(value = "soapenv:Body")
public class QueryBusinessFeeReqBody {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cus")
    private String schemaLocation = "http://www.huawei.com/bes/crminterface/custservices";

    @JsonProperty("cus:queryBusinessFeeReqMsg")
    QueryBusinessFeeReqMsg queryBusinessFeeReqMsg;

    @XmlElement(name = "cus:queryBusinessFeeReqMsg")
    public QueryBusinessFeeReqMsg getQueryBusinessFeeReqMsg() {
        if (queryBusinessFeeReqMsg == null) queryBusinessFeeReqMsg = new QueryBusinessFeeReqMsg();
        return queryBusinessFeeReqMsg;
    }

    public void setQueryBusinessFeeReqMsg(QueryBusinessFeeReqMsg queryBusinessFeeReqMsg) {
        this.queryBusinessFeeReqMsg = queryBusinessFeeReqMsg;
    }
}