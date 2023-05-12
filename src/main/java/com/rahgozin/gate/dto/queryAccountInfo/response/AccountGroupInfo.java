package com.rahgozin.gate.dto.queryAccountInfo.response;

import javax.xml.bind.annotation.XmlAttribute;

public class AccountGroupInfo {
    String accountGroupId;
    String accountGroupCode;
    String accountGroupName;
    String exemptionAmount;

    public void setAccountGroupCode(String accountGroupCode) {
        this.accountGroupCode = accountGroupCode;
    }

    @XmlAttribute(name = "accountGroupCode")
    public String getAccountGroupCode() {
        return accountGroupCode;
    }

    public void setAccountGroupId(String accountGroupId) {
        this.accountGroupId = accountGroupId;
    }

    @XmlAttribute(name = "accountGroupId")
    public String getAccountGroupId() {
        return accountGroupId;
    }

    public void setAccountGroupName(String accountGroupName) {
        this.accountGroupName = accountGroupName;
    }

    @XmlAttribute(name = "accountGroupName")
    public String getAccountGroupName() {
        return accountGroupName;
    }

    public void setExemptionAmount(String exemptionAmount) {
        this.exemptionAmount = exemptionAmount;
    }

    @XmlAttribute(name = "exemptionAmount")
    public String getExemptionAmount() {
        return exemptionAmount;
    }

}