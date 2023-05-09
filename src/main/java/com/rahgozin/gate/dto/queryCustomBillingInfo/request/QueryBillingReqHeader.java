package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryBillingReqHeader {
    @JsonProperty("cbs:BusinessCode")
    String businessCode = "";
    @JsonProperty("cbs:MessageSeq")
    String messageSeq = "";
    @JsonProperty("cbs:Version")
    String version = "";
    @JsonProperty("cbs:AccessSecurity")
    AccessSecurity accessSecurity;
    @JsonProperty("cbs:OperatorInfo")
    OperatorInfo operatorInfo;
    @JsonProperty("cbs:OwnershipInfo")
    OwnershipInfo ownershipInfo;

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    @XmlAttribute(name = "BusinessCode")
    public String getBusinessCode() {
        return businessCode;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }

    @XmlAttribute(name = "MessageSeq")
    public String getMessageSeq() {
        return messageSeq;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "Version")
    public String getVersion() {
        return version;
    }

    @XmlElement(name = "AccessSecurity")
    public AccessSecurity getAccessSecurity() {
        if (accessSecurity == null) accessSecurity = new AccessSecurity();
        return accessSecurity;
    }

    public void setAccessSecurity(AccessSecurity accessSecurity) {
        this.accessSecurity = accessSecurity;
    }

    @XmlElement(name = "OperatorInfo")
    public OperatorInfo getOperatorInfo() {
        if (operatorInfo == null) operatorInfo = new OperatorInfo();
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    @XmlElement(name = "OwnershipInfo")
    public OwnershipInfo getOwnershipInfo() {
        if (ownershipInfo == null) ownershipInfo = new OwnershipInfo();
        return ownershipInfo;
    }

    public void setOwnershipInfo(OwnershipInfo ownershipInfo) {
        this.ownershipInfo = ownershipInfo;
    }

}