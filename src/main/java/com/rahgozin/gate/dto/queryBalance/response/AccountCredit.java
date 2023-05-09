package com.rahgozin.gate.dto.queryBalance.response;

import javax.xml.bind.annotation.XmlAttribute;

public class AccountCredit {

    String currencyID;
    String totalCreditAmount;
    String totalRemainAmount;
    String totalUsageAmount;

    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    @XmlAttribute(name = "CurrencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    public void setTotalCreditAmount(String totalCreditAmount) {
        this.totalCreditAmount = totalCreditAmount;
    }

    @XmlAttribute(name = "TotalCreditAmount")
    public String getTotalCreditAmount() {
        return totalCreditAmount;
    }

    public void setTotalRemainAmount(String totalRemainAmount) {
        this.totalRemainAmount = totalRemainAmount;
    }

    @XmlAttribute(name = "TotalRemainAmount")
    public String getTotalRemainAmount() {
        return totalRemainAmount;
    }

    public void setTotalUsageAmount(String totalUsageAmount) {
        this.totalUsageAmount = totalUsageAmount;
    }

    @XmlAttribute(name = "TotalUsageAmount")
    public String getTotalUsageAmount() {
        return totalUsageAmount;
    }

}