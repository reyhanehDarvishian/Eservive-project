package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ChangeImsiReportRequestHeader {
    @JsonProperty("crm:version")
    private String version;
    @JsonProperty("crm:businessCode")
    private String businessCode;
    @JsonProperty("crm:messageSeq")
    private String messageSeq;
    @JsonProperty("crm:ownershipInfo")
    ChangeImsiReportOwnershipInfo changeImsiReportOwnershipInfo;
    @JsonProperty("crm:accessSecurity")
    ChangeImsiReportAccessSecurity changeImsiReportAccessSecurity;
    @JsonProperty("crm:operatorInfo")
    ChangeImsiReportOperatorInfo changeImsiReportOperatorInfo;
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

    @JsonIgnore
    @XmlElement(name = "crm:accessSecurity")
    public ChangeImsiReportAccessSecurity getAccessSecurity() {
        if (changeImsiReportAccessSecurity == null)
            changeImsiReportAccessSecurity = new ChangeImsiReportAccessSecurity();
        return changeImsiReportAccessSecurity;
    }

    public void setAccessSecurity(ChangeImsiReportAccessSecurity changeImsiReportAccessSecurity) {
        this.changeImsiReportAccessSecurity = changeImsiReportAccessSecurity;
    }

    @XmlElement(name = "crm:operatorInfo")
    public ChangeImsiReportOperatorInfo getOperatorInfo() {
        if (changeImsiReportOperatorInfo == null) changeImsiReportOperatorInfo = new ChangeImsiReportOperatorInfo();
        return changeImsiReportOperatorInfo;
    }

    public void setOperatorInfo(ChangeImsiReportOperatorInfo changeImsiReportOperatorInfo) {
        this.changeImsiReportOperatorInfo = changeImsiReportOperatorInfo;
    }

    @JsonIgnore
    @XmlElement(name = "crm:ownershipInfo")
    public ChangeImsiReportOwnershipInfo getOwnershipInfo() {
        if (changeImsiReportOwnershipInfo == null) changeImsiReportOwnershipInfo = new ChangeImsiReportOwnershipInfo();
        return changeImsiReportOwnershipInfo;
    }

    public void setOwnershipInfo(ChangeImsiReportOwnershipInfo changeImsiReportOwnershipInfo) {
        this.changeImsiReportOwnershipInfo = changeImsiReportOwnershipInfo;
    }
}