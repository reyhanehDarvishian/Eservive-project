package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FreeUnitType",
        "Description",
        "FreeUnitTypeName",
        "MeasureUnit",
        "MeasureUnitName",
        "TotalInitialAmount",
        "TotalUnusedAmount",
        "FreeUnitItemDetail"
})
@Generated("jsonschema2pojo")
public class FreeUnitItem {
    String freeUnitType;
    String description;
    String unitInitTitle;
    String unitUnusedTitle;
    String callInitTitle;
    String callUnusedTitle;
    String messageInitTitle;
    String messageUnusedTitle;
    String freeUnitTypeName;
    String measureUnit;
    String measureUnitName;
    String totalInitialAmount;
    String totalUnusedAmount;
    private FreeUnitItemDetail freeUnitItemDetail;


    public String getUnitUnusedTitle() {
        return unitUnusedTitle;
    }

    public void setUnitUnusedTitle(String unitUnusedTitle) {
        this.unitUnusedTitle = unitUnusedTitle;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public String getUnitInitTitle() {
        return unitInitTitle;
    }

    public void setUnitInitTitle(String unitInitTitle) {
        this.unitInitTitle = unitInitTitle;
    }

    public String getCallInitTitle() {
        return callInitTitle;
    }

    public void setCallInitTitle(String callInitTitle) {
        this.callInitTitle = callInitTitle;
    }

    public String getCallUnusedTitle() {
        return callUnusedTitle;
    }

    public void setCallUnusedTitle(String callUnusedTitle) {
        this.callUnusedTitle = callUnusedTitle;
    }

    public String getMessageInitTitle() {
        return messageInitTitle;
    }

    public void setMessageInitTitle(String messageInitTitle) {
        this.messageInitTitle = messageInitTitle;
    }

    public String getMessageUnusedTitle() {
        return messageUnusedTitle;
    }

    public void setMessageUnusedTitle(String messageUnusedTitle) {
        this.messageUnusedTitle = messageUnusedTitle;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("FreeUnitType")
    public void setFreeUnitType(String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }

    @JsonProperty("freeUnitType")
    public String getFreeUnitType() {
        return freeUnitType;
    }

    @JsonProperty("FreeUnitTypeName")
    public void setFreeUnitTypeName(String freeUnitTypeName) {
        this.freeUnitTypeName = freeUnitTypeName;
    }

    @JsonProperty("freeUnitTypeName")
    public String getFreeUnitTypeName() {
        return freeUnitTypeName;
    }

    @JsonProperty("MeasureUnit")
    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    @JsonProperty("measureUnit")
    public String getMeasureUnit() {
        return measureUnit;
    }

    @JsonProperty("MeasureUnitName")
    public void setMeasureUnitName(String measureUnitName) {
        this.measureUnitName = measureUnitName;
    }

    @JsonProperty("measureUnitName")
    public String getMeasureUnitName() {
        return measureUnitName;
    }

    @JsonProperty("TotalInitialAmount")
    public void setTotalInitialAmount(String totalInitialAmount) {
        this.totalInitialAmount = totalInitialAmount;
    }

    @JsonProperty("totalInitialAmount")
    public String getTotalInitialAmount() {
        return totalInitialAmount;
    }

    @JsonProperty("TotalUnusedAmount")
    public void setTotalUnusedAmount(String totalUnusedAmount) {
        this.totalUnusedAmount = totalUnusedAmount;
    }

    @JsonProperty("totalUnusedAmount")
    public String getTotalUnusedAmount() {
        return totalUnusedAmount;
    }

    @JsonProperty("freeUnitItemDetail")
    public FreeUnitItemDetail getFreeUnitItemDetail() {
        return freeUnitItemDetail;
    }

    @JsonProperty("FreeUnitItemDetail")
    public void setFreeUnitItemDetail(FreeUnitItemDetail freeUnitItemDetail) {
        this.freeUnitItemDetail = freeUnitItemDetail;
    }

}