package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class AccountInfo {

    @JsonProperty("accountBasicInfo")
    AccountBasicInfo accountBasicInfo;
    @JsonProperty("accountId")
    String accountId;
    @JsonProperty("billCycleInfo")
    BillCycleInfo billCycleInfo;
    @JsonProperty("contactPersonInfo")
    ContactPersonInfo contactPersonInfo;
    @JsonProperty("vip")
    String vip;
    @JsonProperty("accountGroupInfo")
    AccountGroupInfo accountGroupInfo;

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("vip")
    public void setVip(String vip) {
        this.vip = vip;
    }

    @JsonProperty("vip")
    public String getVip() {
        return vip;
    }

    @JsonProperty("accountBasicInfo")
    public AccountBasicInfo getAccountBasicInfo() {
        return accountBasicInfo;
    }

    @JsonProperty("accountBasicInfo")
    public void setAccountBasicInfo(AccountBasicInfo accountBasicInfo) {
        this.accountBasicInfo = accountBasicInfo;
    }

    @JsonProperty("accountGroupInfo")
    public AccountGroupInfo getAccountGroupInfo() {
        if (accountGroupInfo == null) accountGroupInfo = new AccountGroupInfo();
        return accountGroupInfo;
    }

    @JsonProperty("accountGroupInfo")
    public void setAccountGroupInfo(AccountGroupInfo accountGroupInfo) {
        this.accountGroupInfo = accountGroupInfo;
    }

    @JsonProperty("billCycleInfo")
    public BillCycleInfo getBillCycleInfo() {
        if (billCycleInfo == null) billCycleInfo = new BillCycleInfo();
        return billCycleInfo;
    }

    @JsonProperty("billCycleInfo")
    public void setBillCycleInfo(BillCycleInfo billCycleInfo) {
        this.billCycleInfo = billCycleInfo;
    }

    @JsonProperty("contactPersonInfo")
    public ContactPersonInfo getContactPersonInfo() {
        if (contactPersonInfo == null) contactPersonInfo = new ContactPersonInfo();
        return contactPersonInfo;
    }

    @JsonProperty("contactPersonInfo")
    public void setContactPersonInfo(ContactPersonInfo contactPersonInfo) {
        this.contactPersonInfo = contactPersonInfo;
    }

}