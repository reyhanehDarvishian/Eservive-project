package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class OfferingKey {
    private String offeringID;
    private String purchaseSeq;

    public void setOfferingID(String offeringID) {
        this.offeringID = offeringID;
    }

    @XmlAttribute(name = "OfferingID")
    public String getOfferingID() {
        return offeringID;
    }

    public void setPurchaseSeq(String purchaseSeq) {
        this.purchaseSeq = purchaseSeq;
    }

    @XmlAttribute(name = "PurchaseSeq")
    public String getPurchaseSeq() {
        return purchaseSeq;
    }

}