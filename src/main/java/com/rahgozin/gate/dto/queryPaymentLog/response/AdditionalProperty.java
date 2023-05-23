package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Code",
        "Value"
})
@Generated("jsonschema2pojo")
public class AdditionalProperty {
    String code = "";
    String value = "";

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

}