package com.rahgozin.gate.dto.queryEntityId.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryEntityIdRequestHeader {
    @JsonProperty("crm:version")
    QueryEntityIdVersion version;
    @JsonProperty("crm:businessCode")
    QueryEntityIdBusinessCode businessCode;
    @JsonProperty("crm:messageSeq")
    QueryEntityIdMessageSeq messageSeq;
    @JsonProperty("ownershipInfo")
    QueryEntityIdOwnershipInfo ownershipInfo;
    @JsonProperty("accessSecurity")
    QueryEntityIdAccessSecurity accessSecurity;
    @JsonProperty("operatorInfo")
    QueryEntityIdOperatorInfo operatorInfo;
    @JsonProperty("crm:channelType")
    QueryEntityIdChannelType channelType;

    @JsonIgnore
    @XmlElement(name = "crm:version")
    public QueryEntityIdVersion getVersion() {
        if (version ==null) version = new QueryEntityIdVersion();
        return version;
    }

    public void setVersion(QueryEntityIdVersion version) {
        this.version = version;
    }

    @JsonIgnore
    @XmlElement(name = "crm:businessCode")
    public QueryEntityIdBusinessCode getBusinessCode() {
        if (businessCode == null) businessCode = new QueryEntityIdBusinessCode();
        return businessCode;
    }

    public void setBusinessCode(QueryEntityIdBusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    @JsonIgnore
    @XmlElement(name = "crm:messageSeq")
    public QueryEntityIdMessageSeq getMessageSeq() {
        if (messageSeq == null) messageSeq = new QueryEntityIdMessageSeq();
        return messageSeq;
    }

    public void setMessageSeq(QueryEntityIdMessageSeq messageSeq) {
        this.messageSeq = messageSeq;
    }

    @JsonIgnore
    @XmlElement(name = "ownershipInfo")
    public QueryEntityIdOwnershipInfo getOwnershipInfo() {
        if (ownershipInfo == null) ownershipInfo = new QueryEntityIdOwnershipInfo();
        return ownershipInfo;
    }

    public void setOwnershipInfo(QueryEntityIdOwnershipInfo ownershipInfo) {
        this.ownershipInfo = ownershipInfo;
    }

    @JsonIgnore
    @XmlElement(name = "accessSecurity")
    public QueryEntityIdAccessSecurity getAccessSecurity() {
        if (accessSecurity == null) accessSecurity = new QueryEntityIdAccessSecurity();
        return accessSecurity;
    }

    public void setAccessSecurity(QueryEntityIdAccessSecurity accessSecurity) {
        this.accessSecurity = accessSecurity;
    }

    @JsonIgnore
    @XmlElement(name = "operatorInfo")
    public QueryEntityIdOperatorInfo getOperatorInfo() {
        if (operatorInfo == null) operatorInfo = new QueryEntityIdOperatorInfo();
        return operatorInfo;
    }

    public void setOperatorInfo(QueryEntityIdOperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    @JsonIgnore
    @XmlElement(name = "crm:channelType")
    public QueryEntityIdChannelType getChannelType() {
        if (channelType == null) channelType = new QueryEntityIdChannelType();
        return channelType;
    }

    public void setChannelType(QueryEntityIdChannelType channelType) {
        this.channelType = channelType;
    }
}