package com.rahgozin.gate.dto.changeImsiReport.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class ChangeIMSIReportReqMsg {
    @JsonProperty("requestHeader")
    ChangeImsiReportRequestHeader changeImsiReportRequestHeader;
    @JsonProperty("changeIMSIReportRequest")
    ChangeImsiReportRequest changeImsiReportRequest;

    @XmlElement(name = "changeIMSIReportRequest")
    public ChangeImsiReportRequest getChangeImsiReportRequest() {
        if (changeImsiReportRequest == null) changeImsiReportRequest = new ChangeImsiReportRequest();
        return changeImsiReportRequest;
    }

    public void setChangeImsiReportRequest(ChangeImsiReportRequest changeImsiReportRequest) {
        this.changeImsiReportRequest = changeImsiReportRequest;
    }


    @XmlElement(name = "requestHeader")
    public ChangeImsiReportRequestHeader getRequestHeaderBean() {
        if (changeImsiReportRequestHeader == null)
            changeImsiReportRequestHeader = new ChangeImsiReportRequestHeader();
        return changeImsiReportRequestHeader;
    }

    public void setRequestHeaderBean(ChangeImsiReportRequestHeader changeImsiReportRequestHeader) {
        this.changeImsiReportRequestHeader = changeImsiReportRequestHeader;
    }

}