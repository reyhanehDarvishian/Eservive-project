package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class ChangeImsiReportSubAccessCode {
    @JsonProperty("cms:primaryIdentity")
    private String primaryIdentity;

    @XmlAttribute(name = "cms:primaryIdentity")
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}
