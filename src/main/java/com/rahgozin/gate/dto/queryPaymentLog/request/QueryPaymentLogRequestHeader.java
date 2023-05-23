package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryPaymentLogRequestHeader {

    @JsonProperty("cbs:Version")
    QueryPaymentLogRequestHeaderVersion version;
    @JsonProperty("cbs:BusinessCode")
    QueryPaymentLogRequestHeaderBusinessCode businessCode;
    @JsonProperty("cbs:MessageSeq")
    QueryPaymentLogRequestHeaderMessageSeq messageSeq;
    @JsonProperty("OwnershipInfo")
    QueryPaymentLogRequestHeaderOwnershipInfo ownershipInfo;
    @JsonProperty("AccessSecurity")
    QueryPaymentLogRequestHeaderAccessSecurity accessSecurity;
    @JsonProperty("OperatorInfo")
    QueryPaymentLogRequestHeaderOperatorInfo operatorInfo;

    @JsonIgnore
    @XmlAttribute(name = "cbs:Version")
    public QueryPaymentLogRequestHeaderVersion getVersion() {
        if (version == null) version = new QueryPaymentLogRequestHeaderVersion();
        return version;
    }

    public void setVersion(QueryPaymentLogRequestHeaderVersion version) {
        this.version = version;
    }

    @JsonIgnore
    @XmlAttribute(name = "cbs:BusinessCode")
    public QueryPaymentLogRequestHeaderBusinessCode getBusinessCode() {
        if (businessCode == null) businessCode = new QueryPaymentLogRequestHeaderBusinessCode();
        return businessCode;
    }

    public void setBusinessCode(QueryPaymentLogRequestHeaderBusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    @JsonIgnore
    @XmlAttribute(name = "cbs:MessageSeq")
    public QueryPaymentLogRequestHeaderMessageSeq getMessageSeq() {
        if (messageSeq == null) messageSeq = new QueryPaymentLogRequestHeaderMessageSeq();
        return messageSeq;
    }

    public void setMessageSeq(QueryPaymentLogRequestHeaderMessageSeq messageSeq) {
        messageSeq = messageSeq;
    }

    @XmlAttribute(name = "OwnershipInfo")
    public QueryPaymentLogRequestHeaderOwnershipInfo getOwnershipInfo() {
        if (ownershipInfo == null) ownershipInfo = new QueryPaymentLogRequestHeaderOwnershipInfo();
        return ownershipInfo;
    }

    public void setOwnershipInfo(QueryPaymentLogRequestHeaderOwnershipInfo ownershipInfo) {
        ownershipInfo = ownershipInfo;
    }

    @XmlAttribute(name = "AccessSecurity")
    public QueryPaymentLogRequestHeaderAccessSecurity getAccessSecurity() {
        if (accessSecurity == null) accessSecurity = new QueryPaymentLogRequestHeaderAccessSecurity();
        return accessSecurity;
    }

    public void setAccessSecurity(QueryPaymentLogRequestHeaderAccessSecurity accessSecurity) {
        accessSecurity = accessSecurity;
    }

    @XmlAttribute(name = "OperatorInfo")
    public QueryPaymentLogRequestHeaderOperatorInfo getOperatorInfo() {
        if (operatorInfo == null) operatorInfo = new QueryPaymentLogRequestHeaderOperatorInfo();
        return operatorInfo;
    }

    public void setOperatorInfo(QueryPaymentLogRequestHeaderOperatorInfo operatorInfo) {
        operatorInfo = operatorInfo;
    }
}
