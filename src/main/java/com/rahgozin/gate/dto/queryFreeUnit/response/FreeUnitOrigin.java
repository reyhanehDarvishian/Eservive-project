package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class FreeUnitOrigin {

	@JsonProperty("bbs:OriginType")
	private String originType;
    @JsonProperty("bbs:OfferingKey")
    OfferingKey offeringKey;

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    @XmlAttribute(name = "bbs:OriginType")
    public String getOriginType() {
        return originType;
    }

    @XmlElement(name = "bbs:OfferingKey")
    public OfferingKey getOfferingKey() {
        if (offeringKey == null) offeringKey = new OfferingKey();
        return offeringKey;
    }

    public void setOfferingKey(OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }

}