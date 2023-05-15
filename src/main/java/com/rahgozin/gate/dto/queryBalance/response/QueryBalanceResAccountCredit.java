package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryBalanceResAccountCredit {
    String totalCreditAmount;
    String totalUsageAmount;
    String totalRemainAmount;
    String currencyID;

    @JsonProperty("CurrencyID")
    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    @JsonProperty("currencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    @JsonProperty("TotalCreditAmount")
    public void setTotalCreditAmount(String totalCreditAmount) {
        this.totalCreditAmount = totalCreditAmount;
    }

    @JsonProperty("totalCreditAmount")
    public String getTotalCreditAmount() {
        return totalCreditAmount;
    }

    @JsonProperty("TotalRemainAmount")
    public void setTotalRemainAmount(String totalRemainAmount) {
        this.totalRemainAmount = totalRemainAmount;
    }

    @JsonProperty("totalRemainAmount")
    public String getTotalRemainAmount() {
        return totalRemainAmount;
    }

    @JsonProperty("TotalUsageAmount")
    public void setTotalUsageAmount(String totalUsageAmount) {
        this.totalUsageAmount = totalUsageAmount;
    }

    @JsonProperty("totalUsageAmount")
    public String getTotalUsageAmount() {
        return totalUsageAmount;
    }

}