package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "custCode",
        "custType",
        "custClass",
        "partyId",
        "regionId"
})
@Generated("jsonschema2pojo")
public class CustBasicInfo {
    private String custCode = "";
    private String custType = "";
    private String custClass = "";
    private String partyId = "";
    private String regionId = "";

    @JsonProperty("custClass")
    public void setCustClass(String custClass) {
        this.custClass = custClass;
    }

    @JsonProperty("custClass")
    public String getCustClass() {
        return custClass;
    }

    @JsonProperty("custCode")
    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    @JsonProperty("custCode")
    public String getCustCode() {
        return custCode;
    }

    @JsonProperty("custType")
    public void setCustType(String custType) {
        this.custType = custType;
    }

    @JsonProperty("custType")
    public String getCustType() {
        return custType;
    }

    @JsonProperty("partyId")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @JsonProperty("partyId")
    public String getPartyId() {
        return partyId;
    }

    @JsonProperty("regionId")
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @JsonProperty("regionId")
    public String getRegionId() {
        return regionId;
    }

}