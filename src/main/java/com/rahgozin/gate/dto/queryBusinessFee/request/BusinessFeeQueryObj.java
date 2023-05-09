package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BusinessFeeQueryObj {
    @JsonProperty("cus:subAccessCode")
    BusinessFeeSubAccessCode businessFeeSubAccessCode;
    @JsonIgnore
    BusinessFeeCustAccessCode businessFeeCustAccessCode;
    @JsonIgnore
    BusinessFeeAcctAccessCode businessFeeAcctAccessCode;

    @JsonIgnore
    public BusinessFeeCustAccessCode getBusinessFeeCustAccessCode() {
        if (businessFeeCustAccessCode == null) businessFeeCustAccessCode = new BusinessFeeCustAccessCode();
        return businessFeeCustAccessCode;
    }

    public void setBusinessFeeCustAccessCode(BusinessFeeCustAccessCode businessFeeCustAccessCode) {
        this.businessFeeCustAccessCode = businessFeeCustAccessCode;
    }

    @JsonIgnore
    public BusinessFeeAcctAccessCode getBusinessFeeAcctAccessCode() {
        if (businessFeeAcctAccessCode == null) new BusinessFeeAcctAccessCode();
        return businessFeeAcctAccessCode;
    }

    public void setBusinessFeeAcctAccessCode(BusinessFeeAcctAccessCode businessFeeAcctAccessCode) {
        this.businessFeeAcctAccessCode = businessFeeAcctAccessCode;
    }

    @JsonIgnore
    public BusinessFeeSubAccessCode getBusinessFeeSubAccessCode() {
        if (businessFeeSubAccessCode == null) businessFeeSubAccessCode = new BusinessFeeSubAccessCode();
        return businessFeeSubAccessCode;
    }

    public void setBusinessFeeSubAccessCode(BusinessFeeSubAccessCode businessFeeSubAccessCode) {
        this.businessFeeSubAccessCode = businessFeeSubAccessCode;
    }
}