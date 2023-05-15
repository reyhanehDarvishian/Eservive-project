package com.rahgozin.gate.dto.customerClubInquiryScore.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerClubInquiryScoreResEnvelope {

    @JsonProperty("responseType")
    private String responseType;
    @JsonProperty("responseDesc")
    private String responseDesc;

    @JsonProperty("responseType")
    public String getResponseType() {
        return responseType;
    }

    @JsonProperty("responseType")
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    @JsonProperty("responseDesc")
    public String getResponseDesc() {
        return responseDesc;
    }

    @JsonProperty("responseDesc")
    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }
}