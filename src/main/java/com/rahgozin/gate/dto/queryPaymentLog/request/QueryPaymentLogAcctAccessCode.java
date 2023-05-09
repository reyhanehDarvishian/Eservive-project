package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryPaymentLogAcctAccessCode {
    @JacksonXmlProperty(isAttribute = true, localName = "xsi:type")
    private String AcctAccessCodeSchema = "ars:AcctAccessCode_type0";
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:xsi")
    private String XMLSchema = "http://www.w3.org/2001/XMLSchema-instance";
    @JsonProperty("arc:PrimaryIdentity")
    QueryPaymentLogPrimaryIdentity primaryIdentity;
    @JsonProperty("arc:AccountKey")
    QueryPaymentLogAccountKey accountKey;
    @JsonProperty("arc:AccountCode")
    QueryPaymentLogAccountCode accountCode;

    @XmlElement(name = "ars:PrimaryIdentity")
    public QueryPaymentLogPrimaryIdentity getPrimaryIdentity() {
        if (primaryIdentity == null) primaryIdentity = new QueryPaymentLogPrimaryIdentity();
        return primaryIdentity;
    }

    public void setPrimaryIdentity(QueryPaymentLogPrimaryIdentity primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @XmlElement(name = "ars:AccountKey")
    public QueryPaymentLogAccountKey getAccountKey() {
        if (accountKey == null) accountKey = new QueryPaymentLogAccountKey();
        return accountKey;
    }

    public void setAccountKey(QueryPaymentLogAccountKey accountKey) {
        this.accountKey = accountKey;
    }

    @XmlElement(name = "ars:AccountCode")
    public QueryPaymentLogAccountCode getAccountCode() {
        if (accountCode == null) accountCode = new QueryPaymentLogAccountCode();
        return accountCode;
    }

    public void setAccountCode(QueryPaymentLogAccountCode accountCode) {
        this.accountCode = accountCode;
    }
}
