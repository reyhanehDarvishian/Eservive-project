package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryCustomerInfoRequestHeader {
    @JsonProperty("ns3:businessCode")
    QueryCustomerInfoBusinessCode businessCode;
    @JsonProperty("ns3:channelType")
    QueryCustomerInfoChannelType channelType;
    @JsonProperty("ns3:messageSeq")
    QueryCustomerInfoMessageSeq messageSeq;
    @JsonProperty("ns3:version")
    QueryCustomerInfoVersion version;
    @JsonProperty("accessSecurity")
    QueryCustomerInfoAccessSecurity queryCustomerInfoAccessSecurity;
    @JsonProperty("operatorInfo")
    QueryCustomerInfoOperatorInfo queryCustomerInfoOperatorInfo;
    @JsonProperty("ownershipInfo")
    QueryCustomerInfoOwnershipInfo QueryCustomerInfoOwnershipInfo;

    public QueryCustomerInfoBusinessCode getBusinessCode() {
        if (businessCode == null) businessCode = new QueryCustomerInfoBusinessCode();
        return businessCode;
    }

    public void setBusinessCode(QueryCustomerInfoBusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    public QueryCustomerInfoChannelType getChannelType() {
        if (channelType == null) channelType = new QueryCustomerInfoChannelType();
        return channelType;
    }

    public void setChannelType(QueryCustomerInfoChannelType channelType) {
        this.channelType = channelType;
    }

    public QueryCustomerInfoMessageSeq getMessageSeq() {
        if (messageSeq == null) messageSeq = new QueryCustomerInfoMessageSeq();
        return messageSeq;
    }

    public void setMessageSeq(QueryCustomerInfoMessageSeq messageSeq) {
        this.messageSeq = messageSeq;
    }

    public QueryCustomerInfoVersion getVersion() {
        if (version == null) version = new QueryCustomerInfoVersion();
        return version;
    }

    public void setVersion(QueryCustomerInfoVersion version) {
        this.version = version;
    }

    public QueryCustomerInfoAccessSecurity getQueryCustomerInfoAccessSecurity() {
        if (queryCustomerInfoAccessSecurity == null)
            queryCustomerInfoAccessSecurity = new QueryCustomerInfoAccessSecurity();
        return queryCustomerInfoAccessSecurity;
    }

    public void setQueryCustomerInfoAccessSecurity(QueryCustomerInfoAccessSecurity queryCustomerInfoAccessSecurity) {
        this.queryCustomerInfoAccessSecurity = queryCustomerInfoAccessSecurity;
    }

    public QueryCustomerInfoOperatorInfo getQueryCustomerInfoOperatorInfo() {
        if (queryCustomerInfoOperatorInfo == null) queryCustomerInfoOperatorInfo = new QueryCustomerInfoOperatorInfo();
        return queryCustomerInfoOperatorInfo;
    }

    public void setQueryCustomerInfoOperatorInfo(QueryCustomerInfoOperatorInfo queryCustomerInfoOperatorInfo) {
        this.queryCustomerInfoOperatorInfo = queryCustomerInfoOperatorInfo;
    }

    public QueryCustomerInfoOwnershipInfo getQueryCustomerInfoOwnershipInfo() {
        if (QueryCustomerInfoOwnershipInfo == null) QueryCustomerInfoOwnershipInfo = new QueryCustomerInfoOwnershipInfo();
        return QueryCustomerInfoOwnershipInfo;
    }

    public void setQueryCustomerInfoOwnershipInfo(QueryCustomerInfoOwnershipInfo queryCustomerInfoOwnershipInfo) {
        this.QueryCustomerInfoOwnershipInfo = queryCustomerInfoOwnershipInfo;
    }
}