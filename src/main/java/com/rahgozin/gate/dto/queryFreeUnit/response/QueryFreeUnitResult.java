package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryFreeUnitResult {
    @JsonProperty("bbs:FreeUnitItem")
    FreeUnitItem freeUnitItem;

    @XmlElement(name = "bbs:FreeUnitItem")
    public FreeUnitItem getFreeUnitItem() {
        if (freeUnitItem == null) freeUnitItem = new FreeUnitItem();
        return freeUnitItem;
    }

    public void setFreeUnitItem(FreeUnitItem freeUnitItem) {
        this.freeUnitItem = freeUnitItem;
    }

}