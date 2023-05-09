package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;


@JsonRootName(value = "soapenv:Body")
public class ChangeSubIdentityBody {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:cms")
    private String schemaEnv = "http://www.huawei.com/bes/crminterface/cmservices";

    @JsonProperty("cms:changeSubscriberIdentityReqMsg")
    ChangeSubscriberIdentityReqMsg changeSubscriberIdentityReqMsg;

    @XmlElement(name = "cms:changeSubscriberIdentityReqMsg")
    public ChangeSubscriberIdentityReqMsg getChangeSubscriberIdentityReqMsg() {
        if (changeSubscriberIdentityReqMsg == null)
            changeSubscriberIdentityReqMsg = new ChangeSubscriberIdentityReqMsg();
        return changeSubscriberIdentityReqMsg;
    }

    public void setChangeSubscriberIdentityReqMsg(ChangeSubscriberIdentityReqMsg changeSubscriberIdentityReqMsg) {
        this.changeSubscriberIdentityReqMsg = changeSubscriberIdentityReqMsg;
    }

}