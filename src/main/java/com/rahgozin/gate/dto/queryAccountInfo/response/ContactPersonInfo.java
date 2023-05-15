package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ContactPersonInfo {
    String contactPersonId;
    @JsonProperty("addressInfo")
    AddressInfo addressInfo;
    String contactPersonType;
    String firstName;
    String lastName;
    String mobilePhone;

    @JsonProperty("contactPersonId")
    public void setContactPersonId(String contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    @JsonProperty("contactPersonId")
    public String getContactPersonId() {
        return contactPersonId;
    }

    @JsonProperty("contactPersonType")
    public void setContactPersonType(String contactPersonType) {
        this.contactPersonType = contactPersonType;
    }

    @JsonProperty("contactPersonType")
    public String getContactPersonType() {
        return contactPersonType;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("mobilePhone")
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @JsonProperty("mobilePhone")
    public String getMobilePhone() {
        return mobilePhone;
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