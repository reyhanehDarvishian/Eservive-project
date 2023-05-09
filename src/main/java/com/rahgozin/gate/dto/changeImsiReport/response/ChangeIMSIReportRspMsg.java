package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class ChangeIMSIReportRspMsg {
    @JsonProperty("changeIMSIReportResponse")
    ChangeIMSIReportResponse changeIMSIReportResponse;
    @JsonProperty("resultHeader")
    ChangeImsiReportResResultHeader changeImsiReportResResultHeader;

    @XmlElement(name = "changeIMSIReportResponse")
    public ChangeIMSIReportResponse getChangeIMSIReportResponse() {
        if (changeIMSIReportResponse == null) changeIMSIReportResponse = new ChangeIMSIReportResponse();
        return changeIMSIReportResponse;
    }

    public void setChangeIMSIReportResponse(ChangeIMSIReportResponse changeIMSIReportResponse) {
        this.changeIMSIReportResponse = changeIMSIReportResponse;
    }

    @XmlElement(name = "resultHeader")
    public ChangeImsiReportResResultHeader getChangeImsiReportResResultHeader() {
        if (changeImsiReportResResultHeader == null)
            changeImsiReportResResultHeader = new ChangeImsiReportResResultHeader();
        return changeImsiReportResResultHeader;
    }

    public void setChangeImsiReportResResultHeader(ChangeImsiReportResResultHeader changeImsiReportResResultHeader) {
        this.changeImsiReportResResultHeader = changeImsiReportResResultHeader;
    }
}