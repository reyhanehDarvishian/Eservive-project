package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "BankCode",
        "BankBranchCode"
})
@Generated("jsonschema2pojo")
public class BankInfo {
    String bankBranchCode = "";
    String bankCode = "";

    @JsonProperty("BankBranchCode")
    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }

    @JsonProperty("bankBranchCode")
    public String getBankBranchCode() {
        return bankBranchCode;
    }

    @JsonProperty("BankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

}