package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryCustomBillingInfoResult {
    @JsonProperty("InvoiceInfo")
	QueryCustomBillingInfoResInvoiceInfo queryCustomBillingInfoResInvoiceInfo;

    @XmlElement(name = "InvoiceInfo")
    public QueryCustomBillingInfoResInvoiceInfo getInvoiceInfoBean() {
        if (queryCustomBillingInfoResInvoiceInfo == null) queryCustomBillingInfoResInvoiceInfo = new QueryCustomBillingInfoResInvoiceInfo();
        return queryCustomBillingInfoResInvoiceInfo;
    }
    public void setInvoiceInfoBean(QueryCustomBillingInfoResInvoiceInfo queryCustomBillingInfoResInvoiceInfo) {
        this.queryCustomBillingInfoResInvoiceInfo = queryCustomBillingInfoResInvoiceInfo;
    }

}