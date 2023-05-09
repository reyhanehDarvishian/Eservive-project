package com.rahgozin.gate.dto.querySub.querySubscriber.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QuerySubReqHeader {

    @JsonProperty("crm:version")
    Integer version;
    @JsonProperty("crm:businessCode")
    String businessCode;
    @JsonProperty("crm:messageSeq")
    String messageSeq;
    @JsonProperty("crm:ownershipInfo")
    OwnershipInfoReq ownershipInfoReq;
    @JsonProperty("crm:accessSecurity")
    AccessSecurityReq accessSecurityReq;
    @JsonProperty("crm:operatorInfo")
    OperatorInfoReq operatorInfoReq;

    @XmlElement(name = "crm:version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @XmlElement(name = "crm:businessCode")
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    @XmlElement(name = "crm:messageSeq")
    public String getMessageSeq() {
        return messageSeq;
    }

    public void setMessageSeq(String messageSeq) {
        this.messageSeq = messageSeq;
    }

    @JsonIgnore
    @XmlElement(name = "crm:ownershipInfo")
    public OwnershipInfoReq getOwnershipInfo() {
        if (ownershipInfoReq == null) ownershipInfoReq = new OwnershipInfoReq();
        return ownershipInfoReq;
    }

    public void setOwnershipInfo(OwnershipInfoReq ownershipInfoReq) {
        this.ownershipInfoReq = ownershipInfoReq;
    }


    @JsonIgnore
    @XmlElement(name = "crm:accessSecurity")
    public AccessSecurityReq getAccessSecurity() {
        if (accessSecurityReq == null) accessSecurityReq = new AccessSecurityReq();
        return accessSecurityReq;
    }

    public void setAccessSecurity(AccessSecurityReq accessSecurityReq) {
        this.accessSecurityReq = accessSecurityReq;
    }

    @JsonIgnore
    @XmlElement(name = "crm:operatorInfo")
    public OperatorInfoReq getOperatorInfo() {
        if (operatorInfoReq == null) operatorInfoReq = new OperatorInfoReq();
        return operatorInfoReq;
    }

    public void setOperatorInfo(OperatorInfoReq operatorInfoReq) {
        this.operatorInfoReq = operatorInfoReq;
    }
}