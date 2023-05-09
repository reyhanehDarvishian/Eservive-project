package com.rahgozin.gate.dto.queryPaymentLog.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class QueryPaymentLogRequest {
    @JsonProperty("ars:AcctAccessCode")
    QueryPaymentLogAcctAccessCode acctAccessCode;
    @JsonProperty("ars:TotalRowNum")
    private String totalRowNum;
    @JsonProperty("ars:BeginRowNum")
    private String beginRowNum;
    @JsonProperty("ars:FetchRowNum")
    private String fetchRowNum;
    @JsonProperty("ars:StartTime")
    private String startTime;
    @JsonProperty("ars:EndTime")
    private String endTime;

    @XmlElement(name = "ars:AcctAccessCode")
    public QueryPaymentLogAcctAccessCode getAcctAccessCode() {
        if (acctAccessCode == null) acctAccessCode = new QueryPaymentLogAcctAccessCode();
        return acctAccessCode;
    }

    public void setAcctAccessCode(QueryPaymentLogAcctAccessCode acctAccessCode) {
        this.acctAccessCode = acctAccessCode;
    }

    @XmlElement(name = "ars:TotalRowNum")
    public String getTotalRowNum() {
        return totalRowNum;
    }

    public void setTotalRowNum(String totalRowNum) {
        this.totalRowNum = totalRowNum;
    }

    @XmlElement(name = "ars:BeginRowNum")
    public String getBeginRowNum() {
        return beginRowNum;
    }

    public void setBeginRowNum(String beginRowNum) {
        this.beginRowNum = beginRowNum;
    }

    @XmlElement(name = "ars:FetchRowNum")
    public String getFetchRowNum() {
        return fetchRowNum;
    }

    public void setFetchRowNum(String fetchRowNum) {
        this.fetchRowNum = fetchRowNum;
    }

    @XmlElement(name = "ars:StartTime")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @XmlElement(name = "ars:EndTime")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
