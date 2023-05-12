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

    public void setAcctClass(String acctClass) {
        this.acctClass = acctClass;
    }

    @XmlAttribute(name = "acctClass")
    public String getAcctClass() {
        return acctClass;
    }

    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    @XmlAttribute(name = "acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    @XmlAttribute(name = "acctName")
    public String getAcctName() {
        return acctName;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    @XmlAttribute(name = "acctType")
    public String getAcctType() {
        return acctType;
    }

    public void setBillLang(String billLang) {
        this.billLang = billLang;
    }

    @XmlAttribute(name = "billLang")
    public String getBillLang() {
        return billLang;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    @XmlAttribute(name = "currencyId")
    public String getCurrencyId() {
        return currencyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @XmlAttribute(name = "partyId")
    public String getPartyId() {
        return partyId;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @XmlAttribute(name = "paymentType")
    public String getPaymentType() {
        return paymentType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlAttribute(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    @XmlAttribute(name = "statusTime")
    public String getStatusTime() {
        return statusTime;
    }

    @XmlElement(name = "extProperties")
    public ExtProperties getExtProperties() {
        if (extProperties == null) extProperties = new ExtProperties();
        return extProperties;
    }

    public void setExtProperties(ExtProperties extProperties) {
        addToExtProperties(extProperties);
        this.extProperties = extProperties;
    }

}