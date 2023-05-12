package com.rahgozin.gate.dto.queryBusinessFee.response;

import javax.xml.bind.annotation.XmlAttribute;


public class ChargeCodeNames {
    String chargeCodeName = "";
    String languageCode = "";

    public void setChargeCodeName(String chargeCodeName) {
        this.chargeCodeName = chargeCodeName;
    }

    @XmlAttribute(name = "chargeCodeName")
    public String getChargeCodeName() {
        return chargeCodeName;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @XmlAttribute(name = "languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

}