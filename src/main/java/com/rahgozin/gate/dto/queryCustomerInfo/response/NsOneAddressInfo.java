package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class NsOneAddressInfo {
    String addressId;
    String preferenceFlag;
    String effDate;
    String expDate;
    String addrType;
    @JsonProperty("addressInfo")
    AddressInfo addressInfo;

    @XmlElement(name = "addressId")
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @XmlElement(name = "preferenceFlag")
    public String getPreferenceFlag() {
        return preferenceFlag;
    }

    public void setPreferenceFlag(String preferenceFlag) {
        this.preferenceFlag = preferenceFlag;
    }

    @XmlElement(name = "effDate")
    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    @XmlElement(name = "expDate")
    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @XmlElement(name = "addrType")
    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    @XmlElement(name = "ns1:addressInfo")
    public AddressInfo getAddressInfo() {
        if (addressInfo == null) addressInfo = new AddressInfo();
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }
}
