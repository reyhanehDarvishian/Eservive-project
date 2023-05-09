package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class ChangeImsiReportResEnvelope {
    @JsonProperty("Body")
    ChangeImsiReportResBody changeImsiReportResBody;

    @XmlElement(name = "Body")
    public ChangeImsiReportResBody getBody() {
        if (changeImsiReportResBody == null) changeImsiReportResBody = new ChangeImsiReportResBody();
        return changeImsiReportResBody;
    }

    public void setBody(ChangeImsiReportResBody changeImsiReportResBody) {
        this.changeImsiReportResBody = changeImsiReportResBody;
    }

}