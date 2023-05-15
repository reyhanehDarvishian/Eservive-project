
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InvoiceInfo"
})
@Generated("jsonschema2pojo")
public class QueryCustomBillingInfoResult {

    private InvoiceInfo invoiceInfo;

    @JsonProperty("invoiceInfo")
    public InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }

    @JsonProperty("InvoiceInfo")
    public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

}
