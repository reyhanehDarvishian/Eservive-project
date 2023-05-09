package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class EntityInfo {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns2")
    private String envelope = "http://www.huawei.com/bes/crminterface/cmtype";
    @JsonProperty("entityType")
    String entityType = "";
    @JsonProperty("entityId")
    String entityId = "";

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @XmlAttribute(name = "entityId")
    public String getEntityId() {
        return entityId;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @XmlAttribute(name = "entityType")
    public String getEntityType() {
        return entityType;
    }
}