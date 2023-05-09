package com.rahgozin.gate.dto.queryImsiinfo.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class ImsiReqHeader {

    @JsonProperty("ns1:version")
    ImsiVersion version;
    @JsonProperty("ns1:businessCode")
    ImsiBusinessCode businessCode;
    @JsonProperty("ns1:messageSeq")
    ImsiMessageSeq messageSeq;
    @JsonProperty("ownershipInfo")
    ImsiOwnershipInfo imsiOwnershipInfo;
    @JsonProperty("accessSecurity")
    ImsiAccessSecurityReq imsiAccessSecurityReq;
    @JsonProperty("operatorInfo")
    ImsiOperatorInfoReq imsiOperatorInfoReq;
    @JsonProperty("ns1:channelType")
    ImsiChannelType channelType;

    @XmlElement(name = "ns1:channelType")
    public ImsiChannelType getChannelType() {
        if (channelType == null)
            channelType = new ImsiChannelType();
        return channelType;
    }

    public void setChannelType(ImsiChannelType channelType) {
        this.channelType = channelType;
    }

    @XmlElement(name = "ns1:version")
    public ImsiVersion getVersion() {
        if (version == null)
            version = new ImsiVersion();
        return version;
    }

    public void setVersion(ImsiVersion version) {
        this.version = version;
    }

    @XmlElement(name = "ns1:businessCode")
    public ImsiBusinessCode getBusinessCode() {
        if (businessCode == null)
            businessCode = new ImsiBusinessCode();
        return businessCode;
    }

    public void setBusinessCode(ImsiBusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    @XmlElement(name = "ns1:messageSeq")
    public ImsiMessageSeq getMessageSeq() {
        if (messageSeq == null)
            messageSeq = new ImsiMessageSeq();
        return messageSeq;
    }

    public void setMessageSeq(ImsiMessageSeq messageSeq) {
        this.messageSeq = messageSeq;
    }

    @JsonIgnore
    @XmlElement(name = "ns1:ownershipInfo")
    public ImsiOwnershipInfo getImsiOwnershipInfoReq() {
        if (imsiOwnershipInfo == null)
            imsiOwnershipInfo = new ImsiOwnershipInfo();
        return imsiOwnershipInfo;
    }

    public void setImsiOwnershipInfoReq(ImsiOwnershipInfo imsiOwnershipInfo) {
        this.imsiOwnershipInfo = imsiOwnershipInfo;
    }

    @XmlElement(name = "ns1:accessSecurity")
    public ImsiAccessSecurityReq getImsiAccessSecurityReq() {
        if (imsiAccessSecurityReq == null) imsiAccessSecurityReq = new ImsiAccessSecurityReq();
        return imsiAccessSecurityReq;
    }

    public void setImsiAccessSecurityReq(ImsiAccessSecurityReq imsiAccessSecurityReq) {
        this.imsiAccessSecurityReq = imsiAccessSecurityReq;
    }

    @XmlElement(name = "ns1:operatorInfo")
    public ImsiOperatorInfoReq getImsiOperatorInfoReq() {
        if (imsiOperatorInfoReq == null) imsiOperatorInfoReq = new ImsiOperatorInfoReq();
        return imsiOperatorInfoReq;
    }

    public void setImsiOperatorInfoReq(ImsiOperatorInfoReq imsiOperatorInfoReq) {
        this.imsiOperatorInfoReq = imsiOperatorInfoReq;
    }
}
