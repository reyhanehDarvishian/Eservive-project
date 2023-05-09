package com.rahgozin.gate.dto.querySubscriberNew.queryAcct.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class IncludeObjReq {
    @JsonProperty("cms:includeOfferFlag")
    String includeOfferFlag;
    @JsonProperty("cms:includeHistoryFlag")
    String includeHistoryFlag;
    @JsonProperty("cms:includeProdFlag")
    String includeProdFlag;
    @JsonProperty("cms:includeContractFlag")
    String includeContractFlag;

    @XmlElement(name = "cms:includeContractFlag")
    public String getIncludeContractFlag() {
        return includeContractFlag;
    }

    public void setIncludeContractFlag(String includeContractFlag) {
        this.includeContractFlag = includeContractFlag;
    }

    @XmlElement(name = "cms:includeHistoryFlag")
    public String getIncludeHistoryFlag() {
        return includeHistoryFlag;
    }

    public void setIncludeHistoryFlag(String includeHistoryFlag) {
        this.includeHistoryFlag = includeHistoryFlag;
    }

    @XmlElement(name = "cms:includeOfferFlag")
    public String getIncludeOfferFlag() {
        return includeOfferFlag;
    }

    public void setIncludeOfferFlag(String includeOfferFlag) {
        this.includeOfferFlag = includeOfferFlag;
    }

    @XmlElement(name = "cms:includeProdFlag")
    public String getIncludeProdFlag() {
        return includeProdFlag;
    }

    public void setIncludeProdFlag(String includeProdFlag) {
        this.includeProdFlag = includeProdFlag;
    }

}