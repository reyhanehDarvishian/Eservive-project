package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryPaymentLogRequestHeader {

    @JsonProperty("cbs:Version")
    QueryPaymentLogRequestHeaderVersion version;
    @JsonProperty("cbs:BusinessCode")
    QueryPaymentLogRequestHeaderBusinessCode businessCode;
    @JsonProperty("cbs:MessageSeq")
    QueryPaymentLogRequestHeaderMessageSeq messageSeq;
    @JsonProperty("cbs:OwnershipInfo")
    QueryPaymentLogRequestHeaderOwnershipInfo ownershipInfo;
    @JsonProperty("cbs:AccessSecurity")
    QueryPaymentLogRequestHeaderAccessSecurity accessSecurity;
    @JsonProperty("cbs:OperatorInfo")
    QueryPaymentLogRequestHeaderOperatorInfo operatorInfo;

    @XmlAttribute(name = "cbs:Version")
    public QueryPaymentLogRequestHeaderVersion getVersion() {
        if (version == null) version = new QueryPaymentLogRequestHeaderVersion();
        return version;
    }

    public void setVersion(QueryPaymentLogRequestHeaderVersion version) {
        this.version = version;
    }

    @XmlAttribute(name = "cbs:BusinessCode")
    public QueryPaymentLogRequestHeaderBusinessCode getBusinessCode() {
        if (businessCode == null) businessCode = new QueryPaymentLogRequestHeaderBusinessCode();
        return businessCode;
    }

    public void setBusinessCode(QueryPaymentLogRequestHeaderBusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    @XmlAttribute(name = "cbs:MessageSeq")
    public QueryPaymentLogRequestHeaderMessageSeq getMessageSeq() {
        if (messageSeq == null) messageSeq = new QueryPaymentLogRequestHeaderMessageSeq();
        return messageSeq;
    }

    public void setMessageSeq(QueryPaymentLogRequestHeaderMessageSeq messageSeq) {
        messageSeq = messageSeq;
    }

    @XmlAttribute(name = "cbs:OwnershipInfo")
    public QueryPaymentLogRequestHeaderOwnershipInfo getOwnershipInfo() {
        if (ownershipInfo == null) ownershipInfo = new QueryPaymentLogRequestHeaderOwnershipInfo();
        return ownershipInfo;
    }

    public void setOwnershipInfo(QueryPaymentLogRequestHeaderOwnershipInfo ownershipInfo) {
        ownershipInfo = ownershipInfo;
    }

    @XmlAttribute(name = "cbs:AccessSecurity")
    public QueryPaymentLogRequestHeaderAccessSecurity getAccessSecurity() {
        if (accessSecurity == null) accessSecurity = new QueryPaymentLogRequestHeaderAccessSecurity();
        return accessSecurity;
    }

    public void setAccessSecurity(QueryPaymentLogRequestHeaderAccessSecurity accessSecurity) {
        accessSecurity = accessSecurity;
    }

    @XmlAttribute(name = "cbs:OperatorInfo")
    public QueryPaymentLogRequestHeaderOperatorInfo getOperatorInfo() {
        if (operatorInfo == null) operatorInfo = new QueryPaymentLogRequestHeaderOperatorInfo();
        return operatorInfo;
    }

    public void setOperatorInfo(QueryPaymentLogRequestHeaderOperatorInfo operatorInfo) {
        operatorInfo = operatorInfo;
    }
}
