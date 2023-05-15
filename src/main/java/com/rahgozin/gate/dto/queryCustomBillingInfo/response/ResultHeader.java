
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Version",
    "ResultCode",
    "MsgLanguageCode",
    "ResultDesc"
})
@Generated("jsonschema2pojo")
public class ResultHeader {

    private String version;
    private String resultCode;
    private String msgLanguageCode;
    private String resultDesc;

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("ResultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @JsonProperty("rsgLanguageCode")
    public String getMsgLanguageCode() {
        return msgLanguageCode;
    }

    @JsonProperty("MsgLanguageCode")
    public void setMsgLanguageCode(String msgLanguageCode) {
        this.msgLanguageCode = msgLanguageCode;
    }

    @JsonProperty("resultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    @JsonProperty("ResultDesc")
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

}
