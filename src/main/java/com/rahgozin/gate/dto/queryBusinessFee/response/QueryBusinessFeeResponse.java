package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryBusinessFeeResponse {
    String accountDeduction = "";
    String currencyID = "";
    String totalDiscount = "";
    String totalReceivable = "";
    String totalTax = "";
    String totalTaxWaived = "";
    String totalUpfrontCost = "";
    String totalWaived = "";

    @JsonProperty("feeDetails")
    FeeDetails feeDetails;

    public void setAccountDeduction(String accountDeduction) {
        this.accountDeduction = accountDeduction;
    }

    @XmlAttribute(name = "AccountDeduction")
    public String getAccountDeduction() {
        return accountDeduction;
    }

    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    @XmlAttribute(name = "CurrencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @XmlAttribute(name = "totalDiscount")
    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalReceivable(String totalReceivable) {
        this.totalReceivable = totalReceivable;
    }

    @XmlAttribute(name = "totalReceivable")
    public String getTotalReceivable() {
        return totalReceivable;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    @XmlAttribute(name = "totalTax")
    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTaxWaived(String totalTaxWaived) {
        this.totalTaxWaived = totalTaxWaived;
    }

    @XmlAttribute(name = "totalTaxWaived")
    public String getTotalTaxWaived() {
        return totalTaxWaived;
    }

    public void setTotalUpfrontCost(String totalUpfrontCost) {
        this.totalUpfrontCost = totalUpfrontCost;
    }

    @XmlAttribute(name = "totalUpfrontCost")
    public String getTotalUpfrontCost() {
        return totalUpfrontCost;
    }

    public void setTotalWaived(String totalWaived) {
        this.totalWaived = totalWaived;
    }

    @XmlAttribute(name = "totalWaived")
    public String getTotalWaived() {
        return totalWaived;
    }

    @XmlElement(name = "feeDetails")
    public FeeDetails getFeeDetailsBean() {
        if (feeDetails == null) feeDetails = new FeeDetails();
        return feeDetails;
    }

    public void setFeeDetailsBean(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
    }

}