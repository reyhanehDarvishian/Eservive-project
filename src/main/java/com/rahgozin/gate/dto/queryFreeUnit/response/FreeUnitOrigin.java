package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class FreeUnitOrigin {
    private String originType;
    @JsonProperty("OfferingKey")
    OfferingKey offeringKey;

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    @XmlAttribute(name = "OriginType")
    public String getOriginType() {
        return originType;
    }

    @XmlElement(name = "OfferingKey")
    public OfferingKey getOfferingKey() {
        if (offeringKey == null) offeringKey = new OfferingKey();
        return offeringKey;
    }

    public void setOfferingKey(OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }

}