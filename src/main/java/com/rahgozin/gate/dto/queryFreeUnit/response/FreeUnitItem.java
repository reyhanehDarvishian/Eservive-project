package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class FreeUnitItem {
	String freeUnitType;
	String freeUnitTypeName;
	String measureUnit;
	String measureUnitName;
	String totalInitialAmount;
	String totalUnusedAmount;
    @JsonProperty("FreeUnitItemDetail")
    FreeUnitItemDetail freeUnitItemDetail;

    public void setFreeUnitType(String freeUnitType) {
        this.freeUnitType = freeUnitType;
    }

    @XmlAttribute(name = "FreeUnitType")
    public String getFreeUnitType() {
        return freeUnitType;
    }

    public void setFreeUnitTypeName(String freeUnitTypeName) {
        this.freeUnitTypeName = freeUnitTypeName;
    }

    @XmlAttribute(name = "FreeUnitTypeName")
    public String getFreeUnitTypeName() {
        return freeUnitTypeName;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    @XmlAttribute(name = "MeasureUnit")
    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnitName(String measureUnitName) {
        this.measureUnitName = measureUnitName;
    }

    @XmlAttribute(name = "MeasureUnitName")
    public String getMeasureUnitName() {
        return measureUnitName;
    }

    public void setTotalInitialAmount(String totalInitialAmount) {
        this.totalInitialAmount = totalInitialAmount;
    }

    @XmlAttribute(name = "TotalInitialAmount")
    public String getTotalInitialAmount() {
        return totalInitialAmount;
    }

    public void setTotalUnusedAmount(String totalUnusedAmount) {
        this.totalUnusedAmount = totalUnusedAmount;
    }

    @XmlAttribute(name = "TotalUnusedAmount")
    public String getTotalUnusedAmount() {
        return totalUnusedAmount;
    }

    @XmlElement(name = "bbs:FreeUnitItemDetail")
    public FreeUnitItemDetail getFreeUnitItemDetail() {
        if (freeUnitItemDetail == null) freeUnitItemDetail = new FreeUnitItemDetail();
        return freeUnitItemDetail;
    }

    public void setFreeUnitItemDetail(FreeUnitItemDetail freeUnitItemDetail) {
        this.freeUnitItemDetail = freeUnitItemDetail;
    }

}