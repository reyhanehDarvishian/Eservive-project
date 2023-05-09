package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryBusinessFeeReqHeader {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:crm")
    private String crmHeader = "http://www.huawei.com/bes/crminterface/crmheader";

    @JsonProperty("crm:version")
    Integer version;
    @JsonProperty("crm:businessCode")
    String businessCode;
    @JsonProperty("crm:messageSeq")
    String messageSeq;
    @JsonProperty("crm:ownershipInfo")
    BusinessFeeOwnershipInfoReq businessFeeOwnershipInfoReq;
    @JsonProperty("crm:accessSecurity")
    BusinessFeeAccessSecurityReq businessFeeAccessSecurityReq;
    @JsonProperty("crm:operatorInfo")
    BusinessFeeOperatorInfoReq businessFeeOperatorInfoReq;
    @JsonProperty("crm:channelType")
    Integer businessFeeChannelTypeReq;


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
    public BusinessFeeOwnershipInfoReq getBusinessFeeOwnershipInfoReq() {
        if (businessFeeOwnershipInfoReq == null) businessFeeOwnershipInfoReq = new BusinessFeeOwnershipInfoReq();
        return businessFeeOwnershipInfoReq;
    }

    public void setBusinessFeeOwnershipInfoReq(BusinessFeeOwnershipInfoReq businessFeeOwnershipInfoReq) {
        this.businessFeeOwnershipInfoReq = businessFeeOwnershipInfoReq;
    }

    @JsonIgnore
    @XmlElement(name = "crm:accessSecurity")
    public BusinessFeeAccessSecurityReq getBusinessFeeAccessSecurityReq() {
        if (businessFeeAccessSecurityReq == null) businessFeeAccessSecurityReq = new BusinessFeeAccessSecurityReq();
        return businessFeeAccessSecurityReq;
    }

    public void setBusinessFeeAccessSecurityReq(BusinessFeeAccessSecurityReq businessFeeAccessSecurityReq) {
        this.businessFeeAccessSecurityReq = businessFeeAccessSecurityReq;
    }

    @XmlElement(name = "crm:operatorInfo")
    public BusinessFeeOperatorInfoReq getBusinessFeeOperatorInfoReq() {
        if (businessFeeOperatorInfoReq == null) businessFeeOperatorInfoReq = new BusinessFeeOperatorInfoReq();
        return businessFeeOperatorInfoReq;
    }

    public void setBusinessFeeOperatorInfoReq(BusinessFeeOperatorInfoReq businessFeeOperatorInfoReq) {
        this.businessFeeOperatorInfoReq = businessFeeOperatorInfoReq;
    }

    @XmlElement(name = "crm:channelType")
    public Integer getBusinessFeeChannelTypeReq() {
        return businessFeeChannelTypeReq;
    }

    public void setBusinessFeeChannelTypeReq(Integer businessFeeChannelTypeReq) {
        this.businessFeeChannelTypeReq = businessFeeChannelTypeReq;
    }
}
