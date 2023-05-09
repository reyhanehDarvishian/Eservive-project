package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class OwnershipInfo {
    @JsonProperty("cbs:BEID")
    String bEID = "";

    public void setBEID(String bEID) {
        this.bEID = bEID;
    }

    @XmlAttribute(name = "cbs:BEID")
    @JsonIgnore
    public String getBEID() {
        return bEID;
    }

}