package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "changeIMSIReportRspMsg"
})
@Generated("jsonschema2pojo")
public class ChangeImsiReportResBody {

    @JsonProperty("changeIMSIReportRspMsg")
    private ChangeIMSIReportRspMsg changeIMSIReportRspMsg;

    @JsonProperty("changeIMSIReportRspMsg")
    public ChangeIMSIReportRspMsg getChangeIMSIReportRspMsg() {
        if (changeIMSIReportRspMsg == null) changeIMSIReportRspMsg = new ChangeIMSIReportRspMsg();
        return changeIMSIReportRspMsg;
    }

    @JsonProperty("changeIMSIReportRspMsg")
    public void setChangeIMSIReportRspMsg(ChangeIMSIReportRspMsg changeIMSIReportRspMsg) {
        this.changeIMSIReportRspMsg = changeIMSIReportRspMsg;
    }

}