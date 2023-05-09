package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeImsiReportIncludeObj {
    @JsonProperty("cms:includeOfferFlag")
    private String includeOfferFlag;
    @JsonProperty("cms:includeHistoryFlag")
    private String includeHistoryFlag;
    @JsonProperty("cms:includeProdFlag")
    private String includeProdFlag;
    @JsonProperty("cms:includeContractFlag")
    private String includeContractFlag;

    @XmlAttribute(name = "cms:includeOfferFlag")
    public String getIncludeOfferFlag() {
        return includeOfferFlag;
    }

    public void setIncludeOfferFlag(String includeOfferFlag) {
        this.includeOfferFlag = includeOfferFlag;
    }

    @XmlAttribute(name = "cms:includeHistoryFlag")
    public String getIncludeHistoryFlag() {
        return includeHistoryFlag;
    }

    public void setIncludeHistoryFlag(String includeHistoryFlag) {
        this.includeHistoryFlag = includeHistoryFlag;
    }

    @XmlAttribute(name = "cms:includeProdFlag")
    public String getIncludeProdFlag() {
        return includeProdFlag;
    }

    public void setIncludeProdFlag(String includeProdFlag) {
        this.includeProdFlag = includeProdFlag;
    }

    @XmlAttribute(name = "cms:includeContractFlag")
    public String getIncludeContractFlag() {
        return includeContractFlag;
    }

    public void setIncludeContractFlag(String includeContractFlag) {
        this.includeContractFlag = includeContractFlag;
    }
}
