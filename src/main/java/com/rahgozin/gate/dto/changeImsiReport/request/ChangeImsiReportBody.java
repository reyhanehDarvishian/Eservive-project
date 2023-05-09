package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class ChangeImsiReportBody {
    @JsonProperty("cms:changeIMSIReportReqMsg")
    ChangeIMSIReportReqMsg changeIMSIReportReqMsg;

    @XmlElement(name = "cms:changeIMSIReportReqMsg")
    public ChangeIMSIReportReqMsg getChangeIMSIReportReqMsg() {
        if (changeIMSIReportReqMsg == null) changeIMSIReportReqMsg = new ChangeIMSIReportReqMsg();
        return changeIMSIReportReqMsg;
    }

    public void setChangeIMSIReportReqMsg(ChangeIMSIReportReqMsg changeIMSIReportReqMsg) {
        this.changeIMSIReportReqMsg = changeIMSIReportReqMsg;
    }
}