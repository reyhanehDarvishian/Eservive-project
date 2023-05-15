package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OriginType",
        "offeringKey"
})
@Generated("jsonschema2pojo")
public class FreeUnitOrigin {
    private String originType;
    private OfferingKey offeringKey;

    @JsonProperty("OriginType")
    public void setOriginType(String originType) {
        this.originType = originType;
    }

    @JsonProperty("originType")
    public String getOriginType() {
        return originType;
    }

    @JsonProperty("offeringKey")
    public OfferingKey getOfferingKey() {
        return offeringKey;
    }

    @JsonProperty("OfferingKey")
    public void setOfferingKey(OfferingKey offeringKey) {
        this.offeringKey = offeringKey;
    }

}