
package com.rahgozin.gate.dto.querySubscriberNew.queryAcct.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subsId",
    "ownerPartyRoleType",
    "ownerPartyRoleId",
    "subsName",
    "subsWrittenLang",
    "subsVocieLang",
    "offeringId",
    "brand",
    "primaryIdentity",
    "networkType",
    "defaultAcctId",
    "paymentType",
    "imsi",
    "iccid",
    "subType",
    "effDate",
    "expDate",
    "activeDate",
    "status",
    "statusTime",
    "statusDetail",
    "salesChannelType",
    "salesChannelId",
    "beId"
})
@Generated("jsonschema2pojo")


public class SubInfoResponse {

    @JsonProperty("subsId")
    private String subsId;
    @JsonProperty("ownerPartyRoleType")
    private String ownerPartyRoleType;
    @JsonProperty("ownerPartyRoleId")
    private String ownerPartyRoleId;
    @JsonProperty("subsName")
    private String subsName;
    @JsonProperty("subsWrittenLang")
    private String subsWrittenLang;
    @JsonProperty("subsVocieLang")
    private String subsVocieLang;
    @JsonProperty("offeringId")
    private String offeringId;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("primaryIdentity")
    private String primaryIdentity;
    @JsonProperty("networkType")
    private String networkType;
    @JsonProperty("defaultAcctId")
    private String defaultAcctId;
    @JsonProperty("paymentType")
    private String paymentType;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("iccid")
    private String iccid;
    @JsonProperty("subType")
    private String subType;
    @JsonProperty("effDate")
    private String effDate;
    @JsonProperty("expDate")
    private String expDate;
    @JsonProperty("activeDate")
    private String activeDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusTime")
    private String statusTime;
    @JsonProperty("statusDetail")
    private String statusDetail;
    @JsonProperty("salesChannelType")
    private String salesChannelType;
    @JsonProperty("salesChannelId")
    private String salesChannelId;
    @JsonProperty("beId")
    private String beId;

    @JsonProperty("remark")
    private String remark;


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @JsonProperty("subsId")
    public String getSubsId() {
        return subsId;
    }

    @JsonProperty("subsId")
    public void setSubsId(String subsId) {
        this.subsId = subsId;
    }

    @JsonProperty("ownerPartyRoleType")
    public String getOwnerPartyRoleType() {
        return ownerPartyRoleType;
    }

    @JsonProperty("ownerPartyRoleType")
    public void setOwnerPartyRoleType(String ownerPartyRoleType) {
        this.ownerPartyRoleType = ownerPartyRoleType;
    }

    @JsonProperty("ownerPartyRoleId")
    public String getOwnerPartyRoleId() {
        return ownerPartyRoleId;
    }

    @JsonProperty("ownerPartyRoleId")
    public void setOwnerPartyRoleId(String ownerPartyRoleId) {
        this.ownerPartyRoleId = ownerPartyRoleId;
    }

    @JsonProperty("subsName")
    public String getSubsName() {
        return subsName;
    }

    @JsonProperty("subsName")
    public void setSubsName(String subsName) {
        this.subsName = subsName;
    }

    @JsonProperty("subsWrittenLang")
    public String getSubsWrittenLang() {
        return subsWrittenLang;
    }

    @JsonProperty("subsWrittenLang")
    public void setSubsWrittenLang(String subsWrittenLang) {
        this.subsWrittenLang = subsWrittenLang;
    }

    @JsonProperty("subsVocieLang")
    public String getSubsVocieLang() {
        return subsVocieLang;
    }

    @JsonProperty("subsVocieLang")
    public void setSubsVocieLang(String subsVocieLang) {
        this.subsVocieLang = subsVocieLang;
    }

    @JsonProperty("offeringId")
    public String getOfferingId() {
        return offeringId;
    }

    @JsonProperty("offeringId")
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    @JsonProperty("primaryIdentity")
    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }

    @JsonProperty("networkType")
    public String getNetworkType() {
        return networkType;
    }

    @JsonProperty("networkType")
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    @JsonProperty("defaultAcctId")
    public String getDefaultAcctId() {
        return defaultAcctId;
    }

    @JsonProperty("defaultAcctId")
    public void setDefaultAcctId(String defaultAcctId) {
        this.defaultAcctId = defaultAcctId;
    }

    @JsonProperty("paymentType")
    public String getPaymentType() {
        return paymentType;
    }

    @JsonProperty("paymentType")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonProperty("iccid")
    public String getIccid() {
        return iccid;
    }

    @JsonProperty("iccid")
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    @JsonProperty("subType")
    public String getSubType() {
        return subType;
    }

    @JsonProperty("subType")
    public void setSubType(String subType) {
        this.subType = subType;
    }

    @JsonProperty("effDate")
    public String getEffDate() {
        return effDate;
    }

    @JsonProperty("effDate")
    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    @JsonProperty("expDate")
    public String getExpDate() {
        return expDate;
    }

    @JsonProperty("expDate")
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @JsonProperty("activeDate")
    public String getActiveDate() {
        return activeDate;
    }

    @JsonProperty("activeDate")
    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("statusTime")
    public String getStatusTime() {
        return statusTime;
    }

    @JsonProperty("statusTime")
    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    @JsonProperty("statusDetail")
    public String getStatusDetail() {
        return statusDetail;
    }

    @JsonProperty("statusDetail")
    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    @JsonProperty("salesChannelType")
    public String getSalesChannelType() {
        return salesChannelType;
    }

    @JsonProperty("salesChannelType")
    public void setSalesChannelType(String salesChannelType) {
        this.salesChannelType = salesChannelType;
    }

    @JsonProperty("salesChannelId")
    public String getSalesChannelId() {
        return salesChannelId;
    }

    @JsonProperty("salesChannelId")
    public void setSalesChannelId(String salesChannelId) {
        this.salesChannelId = salesChannelId;
    }

    @JsonProperty("beId")
    public String getBeId() {
        return beId;
    }

    @JsonProperty("beId")
    public void setBeId(String beId) {
        this.beId = beId;
    }

}
