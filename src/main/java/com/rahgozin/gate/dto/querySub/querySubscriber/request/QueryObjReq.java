package com.rahgozin.gate.dto.querySub.querySubscriber.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class QueryObjReq {

    @JsonProperty("cms:subAccessCode")
    SubAccessCodeReq subAccessCodeReq;

    @XmlElement(name = "cms:subAccessCode")
    public SubAccessCodeReq getSubAccessCodeReq() {
        if (subAccessCodeReq == null) subAccessCodeReq = new SubAccessCodeReq();
        return subAccessCodeReq;
    }

    public void setSubAccessCodeReq(SubAccessCodeReq subAccessCodeReq) {
        this.subAccessCodeReq = subAccessCodeReq;
    }
}