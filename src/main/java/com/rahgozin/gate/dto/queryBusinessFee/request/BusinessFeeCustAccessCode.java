package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BusinessFeeCustAccessCode {
    @JsonIgnore
    Number customerId;

    @JsonIgnore
    public Number getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Number customerId) {
        this.customerId = customerId;
    }
}
