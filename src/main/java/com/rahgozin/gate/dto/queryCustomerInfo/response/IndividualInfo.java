package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "individualBaseInfo"
})
@Generated("jsonschema2pojo")
public class IndividualInfo {
    private IndividualBaseInfo individualBaseInfo;

    @JsonProperty("individualBaseInfo")
    public IndividualBaseInfo getIndividualBaseInfo() {
        if (individualBaseInfo == null) individualBaseInfo = new IndividualBaseInfo();
        return individualBaseInfo;
    }

    @JsonProperty("individualBaseInfo")
    public void setIndividualBaseInfo(IndividualBaseInfo individualBaseInfo) {
        this.individualBaseInfo = individualBaseInfo;
    }

}