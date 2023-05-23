package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "TaxAmount",
        "TaxCode"
})
@Generated("jsonschema2pojo")
public class TaxList {
    String taxAmount = "";
    String taxCode = "";

    @JsonProperty("TaxAmount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("taxAmount")
    public String getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("TaxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

}