package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ContactPersonInfoBean {
    String contactPersonId;
    String contactPersonType;
    String firstName;
    String lastName;
    String mobilePhone;
    @JsonProperty("addressInfo")
    AddressInfoBean addressInfoBean;

    public void setContactPersonId(String contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    @XmlAttribute(name = "contactPersonId")
    public String getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonType(String contactPersonType) {
        this.contactPersonType = contactPersonType;
    }

    @XmlAttribute(name = "contactPersonType")
    public String getContactPersonType() {
        return contactPersonType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlAttribute(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlAttribute(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @XmlAttribute(name = "mobilePhone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    @XmlElement(name = "addressInfo")
    public AddressInfoBean getAddressInfoBean() {
        if (addressInfoBean == null) addressInfoBean = new AddressInfoBean();
        return addressInfoBean;
    }

    public void setAddressInfoBean(AddressInfoBean addressInfoBean) {
        this.addressInfoBean = addressInfoBean;
    }
}