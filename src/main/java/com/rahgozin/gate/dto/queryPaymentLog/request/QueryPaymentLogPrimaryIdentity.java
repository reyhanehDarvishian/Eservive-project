package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class QueryPaymentLogPrimaryIdentity {

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:arc")
    private String PrimaryIdentitySchema = "http://cbs.huawei.com/ar/wsservice/arcommon";
    @JacksonXmlText
    private String primaryIdentity;

    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}
