
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AcctKey",
    "CustKey",
    "SubKey",
    "PrimaryIdentity",
    "Status",
    "InvoiceSummary"
})
@Generated("jsonschema2pojo")
public class InvoiceInfo {

    private String acctKey;
    private String custKey;
    private String subKey;
    private String primaryIdentity;
    private String status;
    private InvoiceSummary invoiceSummary;

    @JsonProperty("acctKey")
    public String getAcctKey() {
        return acctKey;
    }

    @JsonProperty("AcctKey")
    public void setAcctKey(String acctKey) {
        this.acctKey = acctKey;
    }

    @JsonProperty("custKey")
    public String getCustKey() {
        return custKey;
    }

    @JsonProperty("CustKey")
    public void setCustKey(String custKey) {
        this.custKey = custKey;
    }

    @JsonProperty("subKey")
    public String getSubKey() {
        return subKey;
    }

    @JsonProperty("SubKey")
    public void setSubKey(String subKey) {
        this.subKey = subKey;
    }

    @JsonProperty("primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    @JsonProperty("PrimaryIdentity")
    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("invoiceSummary")
    public InvoiceSummary getInvoiceSummary() {
        return invoiceSummary;
    }

    @JsonProperty("InvoiceSummary")
    public void setInvoiceSummary(InvoiceSummary invoiceSummary) {
        this.invoiceSummary = invoiceSummary;
    }

}
