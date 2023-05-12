package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class BusinessFeeResEnvelope {
    @JsonProperty("Body")
    BusinessFeeResBody businessFeeResBody;

    @XmlElement(name = "Body")
    public BusinessFeeResBody getBusinessFeeResBody() {
        if (businessFeeResBody == null) businessFeeResBody = new BusinessFeeResBody();
        return businessFeeResBody;
    }

    public void setBusinessFeeResBody(BusinessFeeResBody businessFeeResBody) {
        this.businessFeeResBody = businessFeeResBody;
    }
}