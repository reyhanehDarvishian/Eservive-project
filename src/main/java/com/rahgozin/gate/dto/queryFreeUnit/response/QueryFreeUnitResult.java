package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rahgozin.gate.config.ApplicationProperties;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FreeUnitItem"
})
@Generated("jsonschema2pojo")
public class QueryFreeUnitResult {
    private FreeUnitItem freeUnitItem;
    private List<FreeUnitItem> freeUnitItems = new ArrayList<>();

    private String totalInitBytes;
    private String totalUsedBytes;

    private String totalMessageInit;
    private String totalMessageUsed;

    private String totalCallInit;
    private String totalCallUsed;


    public String getTotalMessageInit() {
        return totalMessageInit;
    }

    public void setTotalMessageInit(String totalMessageInit) {
        this.totalMessageInit = totalMessageInit;
    }

    public String getTotalMessageUsed() {
        return totalMessageUsed;
    }

    public void setTotalMessageUsed(String totalMessageUsed) {
        this.totalMessageUsed = totalMessageUsed;
    }

    public String getTotalCallInit() {
        return totalCallInit;
    }

    public void setTotalCallInit(String totalCallInit) {
        this.totalCallInit = totalCallInit;
    }

    public String getTotalCallUsed() {
        return totalCallUsed;
    }

    public void setTotalCallUsed(String totalCallUsed) {
        this.totalCallUsed = totalCallUsed;
    }

    public String getTotalInitBytes() {
        return totalInitBytes;
    }

    public void setTotalInitBytes(String totalInitBytes) {
        this.totalInitBytes = totalInitBytes;
    }

    public String getTotalUsedBytes() {
        return totalUsedBytes;
    }

    public void setTotalUsedBytes(String totalUsedBytes) {
        this.totalUsedBytes = totalUsedBytes;
    }

    public void addToFreeUnitItems(FreeUnitItem freeUnitItem) {
        freeUnitItems.add(freeUnitItem);
    }


    @JsonProperty("freeUnitItem")
    public FreeUnitItem getFreeUnitItem() {
        return freeUnitItem;
    }

    @JsonProperty("FreeUnitItem")
    public void setFreeUnitItem(FreeUnitItem freeUnitItem) {
        addToFreeUnitItems(freeUnitItem);
        this.freeUnitItem = freeUnitItem;
    }

    public List<FreeUnitItem> getFreeUnitItems() {
        return freeUnitItems;
    }

    public void setFreeUnitItems(List<FreeUnitItem> freeUnitItems) {
        this.freeUnitItems = freeUnitItems;
    }
}