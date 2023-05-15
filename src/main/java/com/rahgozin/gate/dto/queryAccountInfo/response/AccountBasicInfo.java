package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class AccountBasicInfo {

    @JsonProperty("extProperties")
    ExtProperties extProperties;
    private List<ExtProperties> extsProperties = new ArrayList<>();
    String acctCode;
    String acctName;
    String partyId;
    String acctType;
    String acctClass;
    String paymentType;
    String currencyId;
    String status;
    String statusTime;
    String billLang;

    public void addToExtProperties(ExtProperties extProperties) {
        extsProperties.add(extProperties);
    }
    public List<ExtProperties> getExtsProperties() {
        return extsProperties;
    }

    public void setExtsProperties(List<ExtProperties> extsProperties) {
        this.extsProperties = extsProperties;
    }

    @JsonProperty("acctClass")
    public void setAcctClass(String acctClass) {
        this.acctClass = acctClass;
    }

    @JsonProperty("acctClass")
    public String getAcctClass() {
        return acctClass;
    }

    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    @JsonProperty("acctName")
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    @JsonProperty("acctName")
    public String getAcctName() {
        return acctName;
    }

    @JsonProperty("acctType")
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    @JsonProperty("acctType")
    public String getAcctType() {
        return acctType;
    }

    @JsonProperty("billLang")
    public void setBillLang(String billLang) {
        this.billLang = billLang;
    }

    @JsonProperty("billLang")
    public String getBillLang() {
        return billLang;
    }

    @JsonProperty("currencyId")
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    @JsonProperty("currencyId")
    public String getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("partyId")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @JsonProperty("partyId")
    public String getPartyId() {
        return partyId;
    }

    @JsonProperty("paymentType")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @JsonProperty("paymentType")
    public String getPaymentType() {
        return paymentType;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("statusTime")
    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    @JsonProperty("statusTime")
    public String getStatusTime() {
        return statusTime;
    }

    @JsonProperty("extProperties")
    public ExtProperties getExtProperties() {
        return extProperties;
    }

    @JsonProperty("extProperties")
    public void setExtProperties(ExtProperties extProperties) {
        addToExtProperties(extProperties);
        this.extProperties = extProperties;
    }

}