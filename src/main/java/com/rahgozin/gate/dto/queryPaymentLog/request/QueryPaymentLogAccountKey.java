package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryPaymentLogAccountKey {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:arc")
    private String AccountKeySchema = "http://cbs.huawei.com/ar/wsservice/arcommon";
    private String accountKey;

    public String getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }
}
