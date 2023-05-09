package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;

@JsonRootName("BODY")
public class ChangeSubIdentityMainBody {
    @JsonProperty("ns0:Envelope")
    ChangeSubIdentityEnvelopeReq changeSubIdentityEnvelopeReq;

    @XmlElement(name = "ns0:Envelope")
    public ChangeSubIdentityEnvelopeReq getChangeSubIdentityEnvelopeReq() {
        if (changeSubIdentityEnvelopeReq == null)
            changeSubIdentityEnvelopeReq = new ChangeSubIdentityEnvelopeReq();
        return changeSubIdentityEnvelopeReq;
    }

    public void setChangeSubIdentityEnvelopeReq(ChangeSubIdentityEnvelopeReq changeSubIdentityEnvelopeReq) {
        this.changeSubIdentityEnvelopeReq = changeSubIdentityEnvelopeReq;
    }
}
