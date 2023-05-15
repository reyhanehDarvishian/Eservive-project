package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class BusinessFeeResResultHeader {
    private String resultCode;
    private String resultDesc;
    private String version;

    @JsonProperty("resultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("resultDesc")
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @JsonProperty("resultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

}