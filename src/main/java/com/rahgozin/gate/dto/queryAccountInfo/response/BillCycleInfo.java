package com.rahgozin.gate.dto.queryAccountInfo.response;

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

    public void setAcctBillCycleId(String acctBillCycleId) {
        this.acctBillCycleId = acctBillCycleId;
    }

    @XmlAttribute(name = "acctBillCycleId")
    public String getAcctBillCycleId() {
        return acctBillCycleId;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    @XmlAttribute(name = "beginDate")
    public String getBeginDate() {
        return beginDate;
    }

    public void setBillCycleTypeCode(String billCycleTypeCode) {
        this.billCycleTypeCode = billCycleTypeCode;
    }

    @XmlAttribute(name = "billCycleTypeCode")
    public String getBillCycleTypeCode() {
        return billCycleTypeCode;
    }

    public void setBillCycleTypeDesc(String billCycleTypeDesc) {
        this.billCycleTypeDesc = billCycleTypeDesc;
    }

    @XmlAttribute(name = "billCycleTypeDesc")
    public String getBillCycleTypeDesc() {
        return billCycleTypeDesc;
    }

    public void setBillCycleTypeId(String billCycleTypeId) {
        this.billCycleTypeId = billCycleTypeId;
    }

    @XmlAttribute(name = "billCycleTypeId")
    public String getBillCycleTypeId() {
        return billCycleTypeId;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    @XmlAttribute(name = "cycleType")
    public String getCycleType() {
        return cycleType;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    @XmlAttribute(name = "effDate")
    public String getEffDate() {
        return effDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @XmlAttribute(name = "expDate")
    public String getExpDate() {
        return expDate;
    }
}