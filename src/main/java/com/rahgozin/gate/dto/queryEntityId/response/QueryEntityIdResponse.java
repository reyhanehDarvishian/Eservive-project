package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "entityInfo"
})
public class QueryEntityIdResponse {
//    @JsonProperty("entityInfo")
    private EntityInfo entityInfo;
    List<EntityInfo> entityInfos = new ArrayList<>();

    public void addToEntityInfos(EntityInfo entityInfo) {
        entityInfos.add(entityInfo);
    }
//    @JsonProperty("entityInfo")
    @JsonIgnore
    public EntityInfo getEntityInfo() {
        return entityInfo;
    }

    @JsonProperty("entityInfo")
    public void setEntityInfo(EntityInfo entityInfo) {
        addToEntityInfos(entityInfo);
        this.entityInfo = entityInfo;
    }
    public List<EntityInfo> getEntityInfos() {
        return entityInfos;
    }
     public void setEntityInfos(List<EntityInfo> entityInfos) {
        this.entityInfos = entityInfos;
    }


}