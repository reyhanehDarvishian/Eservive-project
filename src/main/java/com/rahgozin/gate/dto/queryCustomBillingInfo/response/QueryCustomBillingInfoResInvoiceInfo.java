package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryCustomBillingInfoResInvoiceInfo {
    String acctKey;
    String custKey;
    String primaryIdentity;
    String status;
    String subKey;
    @JsonProperty("InvoiceSummary")
    QueryCustomBillingInfoResInvoiceSummary queryCustomBillingInfoResInvoiceSummary;

    public void setAcctKey(String acctKey) {
        this.acctKey = acctKey;
    }

    @XmlAttribute(name = "AcctKey")
    public String getAcctKey() {
        return acctKey;
    }

    public void setCustKey(String custKey) {
        this.custKey = custKey;
    }

    @XmlAttribute(name = "CustKey")
    public String getCustKey() {
        return custKey;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @XmlAttribute(name = "PrimaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlAttribute(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setSubKey(String subKey) {
        this.subKey = subKey;
    }

    @XmlAttribute(name = "SubKey")
    public String getSubKey() {
        return subKey;
    }

    @XmlElement(name = "InvoiceSummary")
    public QueryCustomBillingInfoResInvoiceSummary getInvoiceSummaryBean() {
        if (queryCustomBillingInfoResInvoiceSummary == null) queryCustomBillingInfoResInvoiceSummary = new QueryCustomBillingInfoResInvoiceSummary();
        return queryCustomBillingInfoResInvoiceSummary;
    }

    public void setInvoiceSummaryBean(QueryCustomBillingInfoResInvoiceSummary queryCustomBillingInfoResInvoiceSummary) {
        this.queryCustomBillingInfoResInvoiceSummary = queryCustomBillingInfoResInvoiceSummary;
    }
}