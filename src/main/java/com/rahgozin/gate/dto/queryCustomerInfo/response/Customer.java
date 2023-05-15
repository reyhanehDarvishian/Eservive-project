package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerId",
        "custBasicInfo",
        "individualInfo",
        "addressInfo"
})
@Generated("jsonschema2pojo")
public class Customer {
    private String customerId;
	private CustBasicInfo custBasicInfo;
	private IndividualInfo individualInfo;
	private NsOneAddressInfo addressInfo;

    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("addressInfo")
    public NsOneAddressInfo getAddressInfo() {
        if (addressInfo == null) addressInfo = new NsOneAddressInfo();
        return addressInfo;
    }

    @JsonProperty("addressInfo")
    public void setAddressInfo(NsOneAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    @JsonProperty("custBasicInfo")
    public CustBasicInfo getCustBasicInfo() {
        return custBasicInfo;
    }

    @JsonProperty("custBasicInfo")
    public void setCustBasicInfo(CustBasicInfo custBasicInfo) {
        this.custBasicInfo = custBasicInfo;
    }

    @JsonProperty("individualInfo")
    public IndividualInfo getIndividualInfo() {
        return individualInfo;
    }

    @JsonProperty("individualInfo")
    public void setIndividualInfo(IndividualInfo individualInfo) {
        this.individualInfo = individualInfo;
    }
}