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

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @XmlAttribute(name = "accountId")
    public String getAccountId() {
        return accountId;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @XmlAttribute(name = "vip")
    public String getVip() {
        return vip;
    }

    @XmlElement(name = "accountBasicInfo")
    public AccountBasicInfo getAccountBasicInfo() {
        if (accountBasicInfo == null) accountBasicInfo = new AccountBasicInfo();
        return accountBasicInfo;
    }

    public void setAccountBasicInfo(AccountBasicInfo accountBasicInfo) {
        this.accountBasicInfo = accountBasicInfo;
    }

    @XmlElement(name = "accountGroupInfo")
    public AccountGroupInfo getAccountGroupInfo() {
        if (accountGroupInfo == null) accountGroupInfo = new AccountGroupInfo();
        return accountGroupInfo;
    }

    public void setAccountGroupInfo(AccountGroupInfo accountGroupInfo) {
        this.accountGroupInfo = accountGroupInfo;
    }

    @XmlElement(name = "billCycleInfo")
    public BillCycleInfo getBillCycleInfo() {
        if (billCycleInfo == null) billCycleInfo = new BillCycleInfo();
        return billCycleInfo;
    }

    public void setBillCycleInfo(BillCycleInfo billCycleInfo) {
        this.billCycleInfo = billCycleInfo;
    }

    @XmlElement(name = "contactPersonInfo")
    public ContactPersonInfo getContactPersonInfo() {
        if (contactPersonInfo == null) contactPersonInfo = new ContactPersonInfo();
        return contactPersonInfo;
    }

    public void setContactPersonInfo(ContactPersonInfo contactPersonInfo) {
        this.contactPersonInfo = contactPersonInfo;
    }

}