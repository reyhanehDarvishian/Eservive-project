package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Version",
        "ResultCode",
        "ResultDesc"
})
@Generated("jsonschema2pojo")
public class QueryFreeUnitResultHeader {
    private String version;
    private String resultCode;
    private String resultDesc;

    @JsonProperty("ResultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("ResultDesc")
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @JsonProperty("resultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

}