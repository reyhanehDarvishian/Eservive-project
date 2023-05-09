package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryAccountInfoRequestHeader {
    @JsonProperty("crm:version")
    private String version;
    @JsonProperty("crm:businessCode")
    private String businessCode;
    @JsonProperty("crm:messageSeq")
    private String messageSeq;
    @JsonProperty("crm:ownershipInfo")
    QueryAccountInfoOwnershipInfo queryAccountInfoOwnershipInfo;
    @JsonProperty("crm:accessSecurity")
    QueryAccountInfoAccessSecurity queryAccountInfoAccessSecurity;
    @JsonProperty("crm:operatorInfo")
    QueryAccountInfoOperatorInfo queryAccountInfoOperatorInfo;
    @JsonProperty("crm:channelType")
    private String channelType;

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    @XmlAttribute(name = "crm:businessCode")
    public String getBusinessCode() {
        return businessCode;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    @XmlAttribute(name = "crm:channelType")
    public String getChannelType() {
        return channelType;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }

    @XmlAttribute(name = "crm:messageSeq")
    public String getMessageSeq() {
        return messageSeq;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "crm:version")
    public String getVersion() {
        return version;
    }

    @XmlElement(name = "crm:accessSecurity")
    public QueryAccountInfoAccessSecurity getQueryAccountInfoAccessSecurity() {
        if (queryAccountInfoAccessSecurity == null)
            queryAccountInfoAccessSecurity = new QueryAccountInfoAccessSecurity();
        return queryAccountInfoAccessSecurity;
    }

    public void setQueryAccountInfoAccessSecurity(QueryAccountInfoAccessSecurity queryAccountInfoAccessSecurity) {
        this.queryAccountInfoAccessSecurity = queryAccountInfoAccessSecurity;
    }

    @XmlElement(name = "crm:operatorInfo")
    public QueryAccountInfoOperatorInfo getQueryAccountInfoOperatorInfo() {
        if (queryAccountInfoOperatorInfo == null) queryAccountInfoOperatorInfo = new QueryAccountInfoOperatorInfo();
        return queryAccountInfoOperatorInfo;
    }

    public void setQueryAccountInfoOperatorInfo(QueryAccountInfoOperatorInfo queryAccountInfoOperatorInfo) {
        this.queryAccountInfoOperatorInfo = queryAccountInfoOperatorInfo;
    }

    @XmlElement(name = "crm:ownershipInfo")
    public QueryAccountInfoOwnershipInfo getQueryAccountInfoOwnershipInfo() {
        if (queryAccountInfoOwnershipInfo == null) queryAccountInfoOwnershipInfo = new QueryAccountInfoOwnershipInfo();
        return queryAccountInfoOwnershipInfo;
    }

    public void setQueryAccountInfoOwnershipInfo(QueryAccountInfoOwnershipInfo queryAccountInfoOwnershipInfo) {
        this.queryAccountInfoOwnershipInfo = queryAccountInfoOwnershipInfo;
    }
}