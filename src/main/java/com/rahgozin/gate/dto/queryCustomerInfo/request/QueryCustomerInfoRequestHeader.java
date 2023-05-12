package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class QueryCustomerInfoRequestHeader {

    @JsonProperty("ns3:version")
    QueryCustomerInfoVersion version;
    @JsonProperty("ns3:businessCode")
    QueryCustomerInfoBusinessCode businessCode;
    @JsonProperty("ns3:messageSeq")
    QueryCustomerInfoMessageSeq messageSeq;
    @JsonProperty("ownershipInfo")
    QueryCustomerInfoOwnershipInfo QueryCustomerInfoOwnershipInfo;
    @JsonProperty("accessSecurity")
    QueryCustomerInfoAccessSecurity queryCustomerInfoAccessSecurity;
    @JsonProperty("operatorInfo")
    QueryCustomerInfoOperatorInfo queryCustomerInfoOperatorInfo;
    @JsonProperty("ns3:channelType")
    QueryCustomerInfoChannelType channelType;

    @JsonIgnore
    @XmlElement(name = "ns3:businessCode")
    public QueryCustomerInfoBusinessCode getBusinessCode() {
        if (businessCode == null) businessCode = new QueryCustomerInfoBusinessCode();
        return businessCode;
    }

    public void setBusinessCode(QueryCustomerInfoBusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    @JsonIgnore
    @XmlElement(name = "ns3:channelType")
    public QueryCustomerInfoChannelType getChannelType() {
        if (channelType == null) channelType = new QueryCustomerInfoChannelType();
        return channelType;
    }

    public void setChannelType(QueryCustomerInfoChannelType channelType) {
        this.channelType = channelType;
    }

    @JsonIgnore
    @XmlElement(name = "ns3:messageSeq")
    public QueryCustomerInfoMessageSeq getMessageSeq() {
        if (messageSeq == null) messageSeq = new QueryCustomerInfoMessageSeq();
        return messageSeq;
    }

    public void setMessageSeq(QueryCustomerInfoMessageSeq messageSeq) {
        this.messageSeq = messageSeq;
    }

    @JsonIgnore
    @XmlElement(name = "ns3:version")
    public QueryCustomerInfoVersion getVersion() {
        if (version == null) version = new QueryCustomerInfoVersion();
        return version;
    }

    public void setVersion(QueryCustomerInfoVersion version) {
        this.version = version;
    }

    @XmlElement(name = "accessSecurity")
    public QueryCustomerInfoAccessSecurity getQueryCustomerInfoAccessSecurity() {
        if (queryCustomerInfoAccessSecurity == null)
            queryCustomerInfoAccessSecurity = new QueryCustomerInfoAccessSecurity();
        return queryCustomerInfoAccessSecurity;
    }

    public void setQueryCustomerInfoAccessSecurity(QueryCustomerInfoAccessSecurity queryCustomerInfoAccessSecurity) {
        this.queryCustomerInfoAccessSecurity = queryCustomerInfoAccessSecurity;
    }

    @XmlElement(name = "operatorInfo")
    public QueryCustomerInfoOperatorInfo getQueryCustomerInfoOperatorInfo() {
        if (queryCustomerInfoOperatorInfo == null) queryCustomerInfoOperatorInfo = new QueryCustomerInfoOperatorInfo();
        return queryCustomerInfoOperatorInfo;
    }

    public void setQueryCustomerInfoOperatorInfo(QueryCustomerInfoOperatorInfo queryCustomerInfoOperatorInfo) {
        this.queryCustomerInfoOperatorInfo = queryCustomerInfoOperatorInfo;
    }

    @XmlElement(name = "ownershipInfo")
    public QueryCustomerInfoOwnershipInfo getQueryCustomerInfoOwnershipInfo() {
        if (QueryCustomerInfoOwnershipInfo == null)
            QueryCustomerInfoOwnershipInfo = new QueryCustomerInfoOwnershipInfo();
        return QueryCustomerInfoOwnershipInfo;
    }

    public void setQueryCustomerInfoOwnershipInfo(QueryCustomerInfoOwnershipInfo queryCustomerInfoOwnershipInfo) {
        this.QueryCustomerInfoOwnershipInfo = queryCustomerInfoOwnershipInfo;
    }
}