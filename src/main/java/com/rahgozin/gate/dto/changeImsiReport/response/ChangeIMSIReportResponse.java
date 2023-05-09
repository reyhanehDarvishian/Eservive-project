package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class ChangeIMSIReportResponse {
    @JsonProperty("IMSIHistory")
    ChangeIMSIReportResHistory iMSIHistory;

    @XmlElement(name = "IMSIHistory")
    public ChangeIMSIReportResHistory getIMSIHistory() {
        if (iMSIHistory == null) iMSIHistory = new ChangeIMSIReportResHistory();
        return iMSIHistory;
    }

    public void setIMSIHistory(ChangeIMSIReportResHistory iMSIReportResHistoryChange) {
        this.iMSIHistory = iMSIReportResHistoryChange;
    }
}