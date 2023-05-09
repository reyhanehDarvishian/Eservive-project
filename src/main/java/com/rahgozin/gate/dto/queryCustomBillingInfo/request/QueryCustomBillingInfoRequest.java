package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryCustomBillingInfoRequest {
    @JsonProperty("arc:BillCycleID")
    String billCycleID = "";
    @JsonProperty("arc:OpType")
    String opType = "";
    @JsonProperty("arc:AcctAccessCode")
    AcctAccessCode acctAccessCode;

    public void setBillCycleID(String billCycleID) {
        this.billCycleID = billCycleID;
    }

    @XmlAttribute(name = "arc:BillCycleID")
    public String getBillCycleID() {
        return billCycleID;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    @XmlAttribute(name = "arc:OpType")
    public String getOpType() {
        return opType;
    }

    @XmlElement(name = "arc:AcctAccessCode")
    public AcctAccessCode getAcctAccessCode() {
        if (acctAccessCode == null) acctAccessCode = new AcctAccessCode();
        return acctAccessCode;
    }

    public void setAcctAccessCode(AcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }

}