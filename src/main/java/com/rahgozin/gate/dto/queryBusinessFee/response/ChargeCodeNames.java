package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class ChargeCodeNames {
    String chargeCodeName = "";
    String languageCode = "";

    @JsonProperty("chargeCodeName")
    public void setChargeCodeName(String chargeCodeName) {
        this.chargeCodeName = chargeCodeName;
    }

    @JsonProperty("chargeCodeName")
    public String getChargeCodeName() {
        return chargeCodeName;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

}