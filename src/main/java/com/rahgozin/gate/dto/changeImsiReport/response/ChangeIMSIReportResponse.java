package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "IMSIHistory"
})
@Generated("jsonschema2pojo")
public class ChangeIMSIReportResponse {
    private ChangeIMSIReportResHistory iMSIHistory;
    private List<ChangeIMSIReportResHistory> imsiReportResHistories = new ArrayList<>();

    public void addToImsiReportResHistories(ChangeIMSIReportResHistory iMSIHistory) {
        imsiReportResHistories.add(iMSIHistory);
    }

    @JsonProperty("IMSIHistory")
    public ChangeIMSIReportResHistory getiMSIHistory() {
        if (iMSIHistory == null) iMSIHistory = new ChangeIMSIReportResHistory();
        return iMSIHistory;
    }

    @JsonProperty("IMSIHistory")
    public void setiMSIHistory(ChangeIMSIReportResHistory iMSIHistory) {
        addToImsiReportResHistories(iMSIHistory);
        this.iMSIHistory = iMSIHistory;
    }

    public List<ChangeIMSIReportResHistory> getImsiReportResHistories() {
        return imsiReportResHistories;
    }

    public void setImsiReportResHistories(List<ChangeIMSIReportResHistory> imsiReportResHistories) {
        this.imsiReportResHistories = imsiReportResHistories;
    }
}