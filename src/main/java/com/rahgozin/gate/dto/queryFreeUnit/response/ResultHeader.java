package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class ResultHeader {
    @JsonProperty("cbs:Version")
    private String version;
    @JsonProperty("cbs:ResultCode")
    private String resultCode;
    @JsonProperty("cbs:ResultDesc")
    private String resultDesc;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlAttribute(name = "cbs:ResultCode")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @XmlAttribute(name = "cbs:ResultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "cbs:Version")
    public String getVersion() {
        return version;
    }

}