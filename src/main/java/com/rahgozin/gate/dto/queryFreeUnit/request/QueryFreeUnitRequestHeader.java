package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitRequestHeader {
    @JsonProperty("ns1:Version")
    QueryFreeUnitVersion version;
    @JsonProperty("ns1:BusinessCode")
    QueryFreeUnitBusinessCode businessCode;
    @JsonProperty("ns1:MessageSeq")
    QueryFreeUnitMessageSeq messageSeq;
    @JsonProperty("OwnershipInfo")
    QueryFreeUnitOwnershipInfo queryFreeUnitOwnershipInfo;
    @JsonProperty("AccessSecurity")
    QueryFreeUnitAccessSecurity queryFreeUnitAccessSecurity;
    @JsonProperty("OperatorInfo")
    QueryFreeUnitOperatorInfo queryFreeUnitOperatorInfo;


    @JsonIgnore
    @XmlElement(name = "ns1:Version")
    public QueryFreeUnitVersion getVersion() {
        if (version == null) version = new QueryFreeUnitVersion();
        return version;
    }

    public void setVersion(QueryFreeUnitVersion version) {
        this.version = version;
    }

    @JsonIgnore
    @XmlElement(name = "ns1:BusinessCode")
    public QueryFreeUnitBusinessCode getBusinessCode() {
        if (businessCode == null) businessCode = new QueryFreeUnitBusinessCode();
        return businessCode;
    }

    public void setBusinessCode(QueryFreeUnitBusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    @JsonIgnore
    @XmlElement(name = "ns1:MessageSeq")
    public QueryFreeUnitMessageSeq getMessageSeq() {
        if (messageSeq == null) messageSeq = new QueryFreeUnitMessageSeq();
        return messageSeq;
    }

    public void setMessageSeq(QueryFreeUnitMessageSeq messageSeq) {
        this.messageSeq = messageSeq;
    }

    @JsonIgnore
    @XmlElement(name = "AccessSecurity")
    public QueryFreeUnitAccessSecurity getQueryFreeUnitAccessSecurity() {
        if (queryFreeUnitAccessSecurity == null) queryFreeUnitAccessSecurity = new QueryFreeUnitAccessSecurity();
        return queryFreeUnitAccessSecurity;
    }

    public void setQueryFreeUnitAccessSecurity(QueryFreeUnitAccessSecurity queryFreeUnitAccessSecurity) {
        this.queryFreeUnitAccessSecurity = queryFreeUnitAccessSecurity;
    }

    @JsonIgnore
    @XmlElement(name = "OperatorInfo")
    public QueryFreeUnitOperatorInfo getQueryFreeUnitOperatorInfo() {
        if (queryFreeUnitOperatorInfo == null) queryFreeUnitOperatorInfo = new QueryFreeUnitOperatorInfo();
        return queryFreeUnitOperatorInfo;
    }

    public void setQueryFreeUnitOperatorInfo(QueryFreeUnitOperatorInfo queryFreeUnitOperatorInfo) {
        this.queryFreeUnitOperatorInfo = queryFreeUnitOperatorInfo;
    }

    @JsonIgnore
    @XmlElement(name = "OwnershipInfo")
    public QueryFreeUnitOwnershipInfo getQueryFreeUnitOwnershipInfo() {
        if (queryFreeUnitOwnershipInfo == null) queryFreeUnitOwnershipInfo = new QueryFreeUnitOwnershipInfo();
        return queryFreeUnitOwnershipInfo;
    }

    public void setQueryFreeUnitOwnershipInfo(QueryFreeUnitOwnershipInfo queryFreeUnitOwnershipInfo) {
        this.queryFreeUnitOwnershipInfo = queryFreeUnitOwnershipInfo;
    }
}