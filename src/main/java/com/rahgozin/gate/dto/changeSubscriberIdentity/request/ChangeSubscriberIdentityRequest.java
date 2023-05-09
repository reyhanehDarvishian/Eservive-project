package com.rahgozin.gate.dto.changeSubscriberIdentity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class ChangeSubscriberIdentityRequest {
    @JsonProperty("cms:addSubIdentity")
    List<ChangeSubIdentityAddSubIdentity> changeSubIdentityAddSubIdentity;
    @JsonProperty("cms:delSubIdentity")
    List<ChangeSubIdentityDelSubIdentity> changeSubIdentityDelSubIdentity;
    @JsonProperty("cms:subAccessCode")
    ChangeSubIdentitySubAccessCode changeSubIdentitySubAccessCode;

    @XmlElement(name = "cms:addSubIdentity")
    public List<ChangeSubIdentityAddSubIdentity> getChangeSubIdentityAddSubIdentity() {
        if (changeSubIdentityAddSubIdentity == null) changeSubIdentityAddSubIdentity = new ArrayList<>();
        return changeSubIdentityAddSubIdentity;
    }

    public void setChangeSubIdentityAddSubIdentity(List<ChangeSubIdentityAddSubIdentity> changeSubIdentityAddSubIdentity) {
        this.changeSubIdentityAddSubIdentity = changeSubIdentityAddSubIdentity;
    }

    @XmlElement(name = "cms:delSubIdentity")
    public List<ChangeSubIdentityDelSubIdentity> getChangeSubIdentityDelSubIdentity() {
        if (changeSubIdentityDelSubIdentity == null) changeSubIdentityDelSubIdentity = new ArrayList<>();
        return changeSubIdentityDelSubIdentity;
    }

    public void setChangeSubIdentityDelSubIdentity(List<ChangeSubIdentityDelSubIdentity> changeSubIdentityDelSubIdentity) {
        this.changeSubIdentityDelSubIdentity = changeSubIdentityDelSubIdentity;
    }

    @XmlElement(name = "cms:subAccessCode")
    public ChangeSubIdentitySubAccessCode getChangeSubIdentitySubAccessCode() {
        if (changeSubIdentitySubAccessCode == null) changeSubIdentitySubAccessCode = new ChangeSubIdentitySubAccessCode();
        return changeSubIdentitySubAccessCode;
    }

    public void setChangeSubIdentitySubAccessCode(ChangeSubIdentitySubAccessCode changeSubIdentitySubAccessCode) {
        this.changeSubIdentitySubAccessCode = changeSubIdentitySubAccessCode;
    }
}