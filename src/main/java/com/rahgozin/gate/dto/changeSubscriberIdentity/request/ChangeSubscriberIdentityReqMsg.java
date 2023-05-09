package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class ChangeSubscriberIdentityReqMsg {
    @JsonProperty("cms:changeSubscriberIdentityRequest")
    ChangeSubscriberIdentityRequest changeSubscriberIdentityRequest;
    @JsonProperty("requestHeader")
    ChangeSubIdentityRequestHeader changeSubIdentityRequestHeader;

    @XmlElement(name = "changeSubscriberIdentityRequest")
    public ChangeSubscriberIdentityRequest getChangeSubscriberIdentityRequest() {
        if (changeSubscriberIdentityRequest == null) changeSubscriberIdentityRequest = new ChangeSubscriberIdentityRequest();
        return changeSubscriberIdentityRequest;
    }

    public void setChangeSubscriberIdentityRequest(ChangeSubscriberIdentityRequest changeSubscriberIdentityRequest) {
        this.changeSubscriberIdentityRequest = changeSubscriberIdentityRequest;
    }

    @XmlElement(name = "requestHeader")
    public ChangeSubIdentityRequestHeader getChangeSubIdentityRequestHeader() {
        if (changeSubIdentityRequestHeader == null) changeSubIdentityRequestHeader = new ChangeSubIdentityRequestHeader();
        return changeSubIdentityRequestHeader;
    }

    public void setChangeSubIdentityRequestHeader(ChangeSubIdentityRequestHeader changeSubIdentityRequestHeader) {
        this.changeSubIdentityRequestHeader = changeSubIdentityRequestHeader;
    }

}