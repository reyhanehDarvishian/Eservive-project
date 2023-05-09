package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeImsiReportRequest {
    @JsonProperty("cms:serviceNumber")
    private String serviceNumber;
    @JsonProperty("cms:startDate")
    private String startDate;
    @JsonProperty("cms:endDate")
    private String endDate;

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @XmlAttribute(name = "cms:endDate")
    public String getEndDate() {
        return endDate;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @XmlAttribute(name = "cms:serviceNumber")
    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @XmlAttribute(name = "cms:startDate")
    public String getStartDate() {
        return startDate;
    }
}