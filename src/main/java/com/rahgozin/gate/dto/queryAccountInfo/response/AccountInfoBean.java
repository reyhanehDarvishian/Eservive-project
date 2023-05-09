package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class AccountInfoBean {
    String accountId;
    String vip;
    @JsonProperty("accountBasicInfo")
    AccountBasicInfoBean accountBasicInfoBean;
    @JsonProperty("accountGroupInfo")
    AccountGroupInfoBean accountGroupInfoBean;
    @JsonProperty("billCycleInfo")
    BillCycleInfoBean billCycleInfoBean;
    @JsonProperty("contactPersonInfo")
    ContactPersonInfoBean contactPersonInfoBean;

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
    public AccountBasicInfoBean getAccountBasicInfoBean() {
        if (accountBasicInfoBean == null) accountBasicInfoBean = new AccountBasicInfoBean();
        return accountBasicInfoBean;
    }

    public void setAccountBasicInfoBean(AccountBasicInfoBean accountBasicInfoBean) {
        this.accountBasicInfoBean = accountBasicInfoBean;
    }

    @XmlElement(name = "accountGroupInfo")
    public AccountGroupInfoBean getAccountGroupInfoBean() {
        if (accountGroupInfoBean == null) accountGroupInfoBean = new AccountGroupInfoBean();
        return accountGroupInfoBean;
    }

    public void setAccountGroupInfoBean(AccountGroupInfoBean accountGroupInfoBean) {
        this.accountGroupInfoBean = accountGroupInfoBean;
    }

    @XmlElement(name = "billCycleInfo")
    public BillCycleInfoBean getBillCycleInfoBean() {
        if (billCycleInfoBean == null) billCycleInfoBean = new BillCycleInfoBean();
        return billCycleInfoBean;
    }

    public void setBillCycleInfoBean(BillCycleInfoBean billCycleInfoBean) {
        this.billCycleInfoBean = billCycleInfoBean;
    }

    @XmlElement(name = "contactPersonInfo")
    public ContactPersonInfoBean getContactPersonInfoBean() {
        if (contactPersonInfoBean == null) contactPersonInfoBean = new ContactPersonInfoBean();
        return contactPersonInfoBean;
    }

    public void setContactPersonInfoBean(ContactPersonInfoBean contactPersonInfoBean) {
        this.contactPersonInfoBean = contactPersonInfoBean;
    }

}