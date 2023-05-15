package com.rahgozin.gate.dto.queryImsiinfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PIN1",
        "PIN2",
        "PUK1",
        "PUK2",
        "simType",
        "IMSI",
        "ICCID",
        "status",
        "warehouse"
})
@Generated("jsonschema2pojo")
public class QueryIMSIInfoResponse {
    private String pin1;
    private String pin2;
    private String puk1;
    private String puk2;
    private String simType;
    private String imsi;
    private String iccId;
    private String status;
    private String warehouse;

    @JsonProperty("ICCID")
    public void setICCID(String iCCID) {
        this.iccId = iCCID;
    }

    @JsonProperty("iccId")
    public String getICCID() {
        return iccId;
    }

    @JsonProperty("IMSI")
    public void setIMSI(String iMSI) {
        this.imsi = iMSI;
    }

    @JsonProperty("imsi")
    public String getIMSI() {
        return imsi;
    }

    @JsonProperty("PIN1")
    public void setPIN1(String pIN1) {
        this.pin1 = pIN1;
    }

    @JsonProperty("pin1")
    public String getPIN1() {
        return pin1;
    }

    @JsonProperty("PIN2")
    public void setPIN2(String pIN2) {
        this.pin2 = pIN2;
    }

    @JsonProperty("pin2")
    public String getPIN2() {
        return pin2;
    }

    @JsonProperty("PUK1")
    public void setPUK1(String pUK1) {
        this.puk1 = pUK1;
    }

    @JsonProperty("puk1")
    public String getPUK1() {
        return puk1;
    }

    @JsonProperty("PUK2")
    public void setPUK2(String pUK2) {
        this.puk2 = pUK2;
    }

    @JsonProperty("puk2")
    public String getPUK2() {
        return puk2;
    }

    @JsonProperty("simType")
    public void setSimType(String simType) {
        this.simType = simType;
    }

    @JsonProperty("simType")
    public String getSimType() {
        return simType;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("warehouse")
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    @JsonProperty("warehouse")
    public String getWarehouse() {
        return warehouse;
    }
}