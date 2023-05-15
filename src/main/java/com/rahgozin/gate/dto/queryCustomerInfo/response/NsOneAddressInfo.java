package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class NsOneAddressInfo {
    private String addressId;
    private String preferenceFlag;
    private String effDate;
    private String expDate;
    private String addrType;
    @JsonProperty("addressInfo")
    private AddressInfo addressInfo;

    @JsonProperty("addressId")
    public String getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("preferenceFlag")
    public String getPreferenceFlag() {
        return preferenceFlag;
    }

    @JsonProperty("preferenceFlag")
    public void setPreferenceFlag(String preferenceFlag) {
        this.preferenceFlag = preferenceFlag;
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

    @JsonProperty("addrType")
    public String getAddrType() {
        return addrType;
    }

    @JsonProperty("addrType")
    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    @JsonProperty("addressInfo")
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    @JsonProperty("addressInfo")
    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }
}
