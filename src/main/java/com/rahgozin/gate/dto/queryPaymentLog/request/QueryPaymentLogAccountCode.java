package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryPaymentLogAccountCode {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:arc")
    private String AccountCodeSchema = "http://cbs.huawei.com/ar/wsservice/arcommon";
    private String accountCode;

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
}
