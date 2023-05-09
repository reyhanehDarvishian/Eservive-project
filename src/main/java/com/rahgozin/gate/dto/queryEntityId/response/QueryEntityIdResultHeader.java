package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryEntityIdResultHeader {

    @JsonProperty("version")
    String version = "";
    @JsonProperty("resultCode")
    String resultCode = "";
    @JsonProperty("resultDesc")
    String resultDesc = "";

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlAttribute(name = "resultCode")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @XmlAttribute(name = "resultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "version")
    public String getVersion() {
        return version;
    }
}