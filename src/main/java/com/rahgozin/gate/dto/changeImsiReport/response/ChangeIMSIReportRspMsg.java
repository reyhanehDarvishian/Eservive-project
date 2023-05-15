package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resultHeader",
        "changeIMSIReportResponse"
})
@Generated("jsonschema2pojo")
public class ChangeIMSIReportRspMsg {
    @JsonProperty("resultHeader")
    ChangeImsiReportResResultHeader changeImsiReportResResultHeader;
    @JsonProperty("changeIMSIReportResponse")
    ChangeIMSIReportResponse changeIMSIReportResponse;

    @JsonProperty("changeIMSIReportResponse")
    public ChangeIMSIReportResponse getChangeIMSIReportResponse() {
        if (changeIMSIReportResponse == null) changeIMSIReportResponse = new ChangeIMSIReportResponse();
        return changeIMSIReportResponse;
    }

    @JsonProperty("changeIMSIReportResponse")
    public void setChangeIMSIReportResponse(ChangeIMSIReportResponse changeIMSIReportResponse) {
        this.changeIMSIReportResponse = changeIMSIReportResponse;
    }

    @JsonProperty("resultHeader")
    public ChangeImsiReportResResultHeader getChangeImsiReportResResultHeader() {
        if (changeImsiReportResResultHeader == null)
            changeImsiReportResResultHeader = new ChangeImsiReportResResultHeader();
        return changeImsiReportResResultHeader;
    }

    @JsonProperty("resultHeader")
    public void setChangeImsiReportResResultHeader(ChangeImsiReportResResultHeader changeImsiReportResResultHeader) {
        this.changeImsiReportResResultHeader = changeImsiReportResResultHeader;
    }
}