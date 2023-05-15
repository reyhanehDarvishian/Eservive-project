package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryBusinessFeeResponse {
    private String accountDeduction;
    private String currencyID;
    private String totalDiscount;
    private String totalReceivable;
    private String totalTax;
    private String totalTaxWaived;
    private String totalUpfrontCost;
    private String totalWaived;
    @JsonProperty("feeDetails")
    private FeeDetails feeDetails;

    @JsonProperty("AccountDeduction")
    public void setAccountDeduction(String accountDeduction) {
        this.accountDeduction = accountDeduction;
    }

    @JsonProperty("accountDeduction")
    public String getAccountDeduction() {
        return accountDeduction;
    }

    @JsonProperty("CurrencyID")
    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    @JsonProperty("currencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    @JsonProperty("totalDiscount")
    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @JsonProperty("totalDiscount")
    public String getTotalDiscount() {
        return totalDiscount;
    }

    @JsonProperty("totalReceivable")
    public void setTotalReceivable(String totalReceivable) {
        this.totalReceivable = totalReceivable;
    }

    @JsonProperty("totalReceivable")
    public String getTotalReceivable() {
        return totalReceivable;
    }

    @JsonProperty("totalTax")
    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    @JsonProperty("totalTax")
    public String getTotalTax() {
        return totalTax;
    }

    @JsonProperty("totalTaxWaived")
    public void setTotalTaxWaived(String totalTaxWaived) {
        this.totalTaxWaived = totalTaxWaived;
    }

    @JsonProperty("totalTaxWaived")
    public String getTotalTaxWaived() {
        return totalTaxWaived;
    }

    @JsonProperty("totalUpfrontCost")
    public void setTotalUpfrontCost(String totalUpfrontCost) {
        this.totalUpfrontCost = totalUpfrontCost;
    }

    @JsonProperty("totalUpfrontCost")
    public String getTotalUpfrontCost() {
        return totalUpfrontCost;
    }

    @JsonProperty("totalWaived")
    public void setTotalWaived(String totalWaived) {
        this.totalWaived = totalWaived;
    }

    @JsonProperty("totalWaived")
    public String getTotalWaived() {
        return totalWaived;
    }

    @JsonProperty("feeDetails")
    public FeeDetails getFeeDetails() {
        return feeDetails;
    }

    @JsonProperty("feeDetails")
    public void setFeeDetails(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
    }

}