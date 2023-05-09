package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BusinessFeeAcctAccessCode {
    @JsonIgnore
    Number accountId;

    @JsonIgnore
    public Number getAccountId() {
        return accountId;
    }

    public void setAccountId(Number accountId) {
        this.accountId = accountId;
    }
}
