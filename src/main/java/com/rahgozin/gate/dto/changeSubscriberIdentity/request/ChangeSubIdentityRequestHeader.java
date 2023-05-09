package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class ChangeSubIdentityRequestHeader {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crmHeader = "http://www.huawei.com/bes/crminterface/crmheader";

    @JsonProperty("crm:businessCode")
    private String businessCode;
    @JsonProperty("crm:channelType")
    private String channelType;
    @JsonProperty("crm:messageSeq")
    private String messageSeq;
    @JsonProperty("crm:version")
    private String version;
    @JsonProperty("crm:accessSecurity")
    ChangeSubIdentityAccessSecurityReq changeSubIdentityAccessSecurityReq;
    @JsonProperty("crm:operatorInfo")
    ChangeSubIdentityOperatorInfoReq changeSubIdentityOperatorInfoReq;
    @JsonProperty("crm:ownershipInfo")
    ChangeSubIdentityOwnershipInfoReq changeSubIdentityOwnershipInfoReq;

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
    public ChangeSubIdentityAccessSecurityReq getChangeSubIdentityAccessSecurityReq() {
        if (changeSubIdentityAccessSecurityReq == null) changeSubIdentityAccessSecurityReq = new ChangeSubIdentityAccessSecurityReq();
        return changeSubIdentityAccessSecurityReq;
    }

    public void setChangeSubIdentityAccessSecurityReq(ChangeSubIdentityAccessSecurityReq changeSubIdentityAccessSecurityReq) {
        this.changeSubIdentityAccessSecurityReq = changeSubIdentityAccessSecurityReq;
    }

    @XmlElement(name = "crm:operatorInfo")
    public ChangeSubIdentityOperatorInfoReq getChangeSubIdentityOperatorInfoReq() {
        if (changeSubIdentityOperatorInfoReq == null) changeSubIdentityOperatorInfoReq = new ChangeSubIdentityOperatorInfoReq();
        return changeSubIdentityOperatorInfoReq;
    }

    public void setChangeSubIdentityOperatorInfoReq(ChangeSubIdentityOperatorInfoReq changeSubIdentityOperatorInfoReq) {
        this.changeSubIdentityOperatorInfoReq = changeSubIdentityOperatorInfoReq;
    }

    @XmlElement(name = "crm:ownershipInfo")
    public ChangeSubIdentityOwnershipInfoReq getChangeSubIdentityOwnershipInfoReq() {
        if (changeSubIdentityOwnershipInfoReq == null) changeSubIdentityOwnershipInfoReq = new ChangeSubIdentityOwnershipInfoReq();
        return changeSubIdentityOwnershipInfoReq;
    }

    public void setChangeSubIdentityOwnershipInfoReq(ChangeSubIdentityOwnershipInfoReq changeSubIdentityOwnershipInfoReq) {
        this.changeSubIdentityOwnershipInfoReq = changeSubIdentityOwnershipInfoReq;
    }
}