package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.rahgozin.gate.dto.querySub.querySubscriber.response.SubscriberInfoRes;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class QueryEntityIdResponse {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns1")
    private String envelope = "http://www.huawei.com/bes/crminterface/cmservices";

    @JsonProperty("entityInfo")
    private EntityInfo entityInfo;
    private List<EntityInfo> entityInfos = new ArrayList<>();

    public void addToEntityInfos(EntityInfo entityInfo) {
        entityInfos.add(entityInfo);
    }
    @JsonProperty("entityInfo")
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