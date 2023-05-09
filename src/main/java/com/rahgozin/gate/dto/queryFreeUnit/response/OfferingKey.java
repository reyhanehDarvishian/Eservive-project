package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class OfferingKey {

    @JsonProperty("bbs:OfferingID")
    private String offeringID;
    @JsonProperty("bbs:PurchaseSeq")
    private String purchaseSeq;

    public void setOfferingID(String offeringID) {
        this.offeringID = offeringID;
    }

    @XmlAttribute(name = "bbs:OfferingID")
    public String getOfferingID() {
        return offeringID;
    }

    public void setPurchaseSeq(String purchaseSeq) {
        this.purchaseSeq = purchaseSeq;
    }

    @XmlAttribute(name = "bbs:PurchaseSeq")
    public String getPurchaseSeq() {
        return purchaseSeq;
    }

}