package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountGroupInfo {
    String accountGroupId;
    String accountGroupCode;
    String accountGroupName;
    String exemptionAmount;

    @JsonProperty("accountGroupCode")
    public void setAccountGroupCode(String accountGroupCode) {
        this.accountGroupCode = accountGroupCode;
    }

    @JsonProperty("accountGroupCode")
    public String getAccountGroupCode() {
        return accountGroupCode;
    }

    @JsonProperty("accountGroupId")
    public void setAccountGroupId(String accountGroupId) {
        this.accountGroupId = accountGroupId;
    }

    @JsonProperty("accountGroupId")
    public String getAccountGroupId() {
        return accountGroupId;
    }

    @JsonProperty("accountGroupName")
    public void setAccountGroupName(String accountGroupName) {
        this.accountGroupName = accountGroupName;
    }

    @JsonProperty("accountGroupName")
    public String getAccountGroupName() {
        return accountGroupName;
    }

    @JsonProperty("exemptionAmount")
    public void setExemptionAmount(String exemptionAmount) {
        this.exemptionAmount = exemptionAmount;
    }

    @JsonProperty("exemptionAmount")
    public String getExemptionAmount() {
        return exemptionAmount;
    }

}