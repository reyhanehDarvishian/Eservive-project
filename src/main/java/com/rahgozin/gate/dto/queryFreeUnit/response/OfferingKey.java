package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OfferingID",
        "PurchaseSeq"
})
@Generated("jsonschema2pojo")
public class OfferingKey {
    private String offeringID;
    private String purchaseSeq;

    @JsonProperty("OfferingID")
    public void setOfferingID(String offeringID) {
        this.offeringID = offeringID;
    }

    @JsonProperty("offeringID")
    public String getOfferingID() {
        return offeringID;
    }

    @JsonProperty("PurchaseSeq")
    public void setPurchaseSeq(String purchaseSeq) {
        this.purchaseSeq = purchaseSeq;
    }

    @JsonProperty("purchaseSeq")
    public String getPurchaseSeq() {
        return purchaseSeq;
    }

}