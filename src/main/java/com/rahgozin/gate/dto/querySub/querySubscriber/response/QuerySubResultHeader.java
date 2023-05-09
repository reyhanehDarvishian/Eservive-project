
package com.rahgozin.gate.dto.querySub.querySubscriber.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "resultCode",
        "resultDesc"
})
@Generated("jsonschema2pojo")
public class QuerySubResultHeader {

    @JsonProperty("version")
    private String version;
    @JsonProperty("resultCode")
    private String resultCode;
    @JsonProperty("resultDesc")
    private String resultDesc;

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("resultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @JsonProperty("resultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    @JsonProperty("resultDesc")
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

}
