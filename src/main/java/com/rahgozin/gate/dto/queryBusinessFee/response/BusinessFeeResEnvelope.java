package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")
public class BusinessFeeResEnvelope {
    @JsonProperty("body")
    private BusinessFeeResBody businessFeeResBody;

    @JsonProperty("body")
    public BusinessFeeResBody getBusinessFeeResBody() {
        return businessFeeResBody;
    }

    @JsonProperty("Body")
    public void setBusinessFeeResBody(BusinessFeeResBody businessFeeResBody) {
        this.businessFeeResBody = businessFeeResBody;
    }
}