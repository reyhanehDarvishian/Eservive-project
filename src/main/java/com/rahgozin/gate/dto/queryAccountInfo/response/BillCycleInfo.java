package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class BillCycleInfo {
    String acctBillCycleId;
    String billCycleTypeCode;
    String billCycleTypeDesc;
    String billCycleTypeId;
    String beginDate;
    String cycleType;
    String effDate;
    String expDate;

    @JsonProperty("acctBillCycleId")
    public void setAcctBillCycleId(String acctBillCycleId) {
        this.acctBillCycleId = acctBillCycleId;
    }

    @JsonProperty("acctBillCycleId")
    public String getAcctBillCycleId() {
        return acctBillCycleId;
    }

    @JsonProperty("beginDate")
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    @JsonProperty("beginDate")
    public String getBeginDate() {
        return beginDate;
    }

    @JsonProperty("billCycleTypeCode")
    public void setBillCycleTypeCode(String billCycleTypeCode) {
        this.billCycleTypeCode = billCycleTypeCode;
    }

    @JsonProperty("billCycleTypeCode")
    public String getBillCycleTypeCode() {
        return billCycleTypeCode;
    }

    @JsonProperty("billCycleTypeDesc")
    public void setBillCycleTypeDesc(String billCycleTypeDesc) {
        this.billCycleTypeDesc = billCycleTypeDesc;
    }

    @JsonProperty("billCycleTypeDesc")
    public String getBillCycleTypeDesc() {
        return billCycleTypeDesc;
    }

    @JsonProperty("billCycleTypeId")
    public void setBillCycleTypeId(String billCycleTypeId) {
        this.billCycleTypeId = billCycleTypeId;
    }

    @JsonProperty("billCycleTypeId")
    public String getBillCycleTypeId() {
        return billCycleTypeId;
    }

    @JsonProperty("cycleType")
    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    @JsonProperty("cycleType")
    public String getCycleType() {
        return cycleType;
    }

    @JsonProperty("effDate")
    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    @JsonProperty("effDate")
    public String getEffDate() {
        return effDate;
    }

    @JsonProperty("expDate")
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @JsonProperty("expDate")
    public String getExpDate() {
        return expDate;
    }
}