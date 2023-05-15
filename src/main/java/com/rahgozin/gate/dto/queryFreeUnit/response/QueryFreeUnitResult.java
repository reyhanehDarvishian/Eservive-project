package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rahgozin.gate.dto.queryEntityId.response.EntityInfo;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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