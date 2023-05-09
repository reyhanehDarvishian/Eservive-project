package com.rahgozin.gate.dto.queryImsiinfo.response;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryIMSIInfoResponse {
    String iCCID = "";
    String iMSI = "";
    String pIN1 = "";
    String pIN2 = "";
    String pUK1 = "";
    String pUK2 = "";
    String simType = "";
    String status = "";
    String warehouse = "";

    public void setICCID(String iCCID) {
        this.iCCID = iCCID;
    }

    @XmlAttribute(name = "ICCID")
    public String getICCID() {
        return iCCID;
    }

    public void setIMSI(String iMSI) {
        this.iMSI = iMSI;
    }

    @XmlAttribute(name = "IMSI")
    public String getIMSI() {
        return iMSI;
    }

    public void setPIN1(String pIN1) {
        this.pIN1 = pIN1;
    }

    @XmlAttribute(name = "PIN1")
    public String getPIN1() {
        return pIN1;
    }

    public void setPIN2(String pIN2) {
        this.pIN2 = pIN2;
    }

    @XmlAttribute(name = "PIN2")
    public String getPIN2() {
        return pIN2;
    }

    public void setPUK1(String pUK1) {
        this.pUK1 = pUK1;
    }

    @XmlAttribute(name = "PUK1")
    public String getPUK1() {
        return pUK1;
    }

    public void setPUK2(String pUK2) {
        this.pUK2 = pUK2;
    }

    @XmlAttribute(name = "PUK2")
    public String getPUK2() {
        return pUK2;
    }

    public void setSimType(String simType) {
        this.simType = simType;
    }

    @XmlAttribute(name = "simType")
    public String getSimType() {
        return simType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlAttribute(name = "status")
    public String getStatus() {
        return status;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    @XmlAttribute(name = "warehouse")
    public String getWarehouse() {
        return warehouse;
    }
}