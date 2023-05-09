package com.rahgozin.gate.dto.queryBalance.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBalanceReqHeader {
    @JsonProperty("cbs:Version")
    Version version;
    @JsonProperty("cbs:BusinessCode")
    BusinessCode businessCode;
    @JsonProperty("cbs:MessageSeq")
    MessageSequence messageSeq;
    @JsonProperty("OwnershipInfo")
    QueryBalanceOwnershipInfo queryBalanceOwnershipInfo;
    @JsonProperty("AccessSecurity")
    QueryBalanceAccessSecurityReq accessSecurityReq;
    @JsonProperty("OperatorInfo")
    QueryBalanceOperatorInfoReq operatorInfoReq;

    @JsonIgnore
    @XmlElement(name = "cbs:Version")
    public Version getVersion() {
        if (version == null) version = new Version();
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @JsonIgnore
    @XmlElement(name = "cbs:BusinessCode")
    public BusinessCode getBusinessCode() {
        if (businessCode == null) businessCode = new BusinessCode();
        return businessCode;
    }

    public void setBusinessCode(BusinessCode businessCode) {
        this.businessCode = businessCode;
    }

    @JsonIgnore
    @XmlElement(name = "cbs:MessageSeq")
    public MessageSequence getMessageSeq() {
        if (messageSeq == null) messageSeq = new MessageSequence();
        return messageSeq;
    }

    public void setMessageSeq(MessageSequence messageSeq) {
        this.messageSeq = messageSeq;
    }

    @JsonIgnore
    @XmlElement(name = "OwnershipInfo")
    public QueryBalanceOwnershipInfo getOwnershipInfo() {
        if (queryBalanceOwnershipInfo == null) queryBalanceOwnershipInfo = new QueryBalanceOwnershipInfo();
        return queryBalanceOwnershipInfo;
    }

    public void setOwnershipInfo(QueryBalanceOwnershipInfo queryBalanceOwnershipInfo) {
        this.queryBalanceOwnershipInfo = queryBalanceOwnershipInfo;
    }


    @JsonIgnore
    @XmlElement(name = "AccessSecurity")
    public QueryBalanceAccessSecurityReq getAccessSecurityReq() {
        if (accessSecurityReq == null) accessSecurityReq = new QueryBalanceAccessSecurityReq();
        return accessSecurityReq;
    }

    public void setAccessSecurityReq(QueryBalanceAccessSecurityReq accessSecurityReq) {
        this.accessSecurityReq = accessSecurityReq;
    }


    @JsonIgnore
    @XmlElement(name = "OperatorInfo")
    public QueryBalanceOperatorInfoReq getOperatorInfoReq() {
        if (operatorInfoReq == null) operatorInfoReq = new QueryBalanceOperatorInfoReq();
        return operatorInfoReq;
    }

    public void setOperatorInfoReq(QueryBalanceOperatorInfoReq operatorInfoReq) {
        this.operatorInfoReq = operatorInfoReq;
    }
}
