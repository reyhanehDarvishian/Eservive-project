package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class Customer {
    String customerId = "";
	@JsonProperty("custBasicInfo")
	CustBasicInfo custBasicInfo;
	@JsonProperty("individualInfo")
	IndividualInfo individualInfo;
	@JsonProperty("ns2:addressInfo")
	NsOneAddressInfo addressInfo;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @XmlElement(name = "addressInfo")
    public NsOneAddressInfo getAddressInfo() {
        if (addressInfo == null) addressInfo = new NsOneAddressInfo();
        return addressInfo;
    }

    public void setAddressInfo(NsOneAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    @XmlElement(name = "custBasicInfo")
    public CustBasicInfo getCustBasicInfo() {
        if (custBasicInfo == null) custBasicInfo = new CustBasicInfo();
        return custBasicInfo;
    }

    public void setCustBasicInfo(CustBasicInfo custBasicInfo) {
        this.custBasicInfo = custBasicInfo;
    }

    @XmlElement(name = "individualInfo")
    public IndividualInfo getIndividualInfo() {
        if (individualInfo == null) individualInfo = new IndividualInfo();
        return individualInfo;
    }

    public void setIndividualInfo(IndividualInfo individualInfo) {
        this.individualInfo = individualInfo;
    }
}