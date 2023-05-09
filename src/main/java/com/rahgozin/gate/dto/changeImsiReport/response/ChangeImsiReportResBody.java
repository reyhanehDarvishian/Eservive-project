package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class ChangeImsiReportResBody {

    @JsonProperty("changeIMSIReportRspMsg")
    ChangeIMSIReportRspMsg changeIMSIReportRspMsg;

    @XmlElement(name = "changeIMSIReportRspMsg")
    public ChangeIMSIReportRspMsg getChangeIMSIReportRspMsg() {
        if (changeIMSIReportRspMsg == null) changeIMSIReportRspMsg = new ChangeIMSIReportRspMsg();
        return changeIMSIReportRspMsg;
    }

    public void setChangeIMSIReportRspMsg(ChangeIMSIReportRspMsg changeIMSIReportRspMsg) {
        this.changeIMSIReportRspMsg = changeIMSIReportRspMsg;
    }

}