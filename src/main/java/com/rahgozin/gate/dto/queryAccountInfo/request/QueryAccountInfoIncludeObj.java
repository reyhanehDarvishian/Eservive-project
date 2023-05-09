package com.rahgozin.gate.dto.queryAccountInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryAccountInfoIncludeObj {
    @JsonProperty("cms:includeAcctBillCycleFlag")
    private String includeAcctBillCycleFlag;
    @JsonProperty("cms:includeAcctCreditLimitFlag")
    private String includeAcctCreditLimitFlag;
    @JsonProperty("cms:includeDeactivationFlag")
    private String includeDeactivationFlag;
    @JsonProperty("cms:includePaymentChannelFlag")
    private String includePaymentChannelFlag;
    @JsonProperty("cms:includeContactPersonFlag")
    private String includeContactPersonFlag;
    @JsonProperty("cms:includeBillMediumFlag")
    private String includeBillMediumFlag;

    public void setIncludeAcctBillCycleFlag(String includeAcctBillCycleFlag) {
        this.includeAcctBillCycleFlag = includeAcctBillCycleFlag;
    }

    @XmlAttribute(name = "cms:includeAcctBillCycleFlag")
    public String getIncludeAcctBillCycleFlag() {
        return includeAcctBillCycleFlag;
    }

    public void setIncludeAcctCreditLimitFlag(String includeAcctCreditLimitFlag) {
        this.includeAcctCreditLimitFlag = includeAcctCreditLimitFlag;
    }

    @XmlAttribute(name = "cms:includeAcctCreditLimitFlag")
    public String getIncludeAcctCreditLimitFlag() {
        return includeAcctCreditLimitFlag;
    }

    public void setIncludeBillMediumFlag(String includeBillMediumFlag) {
        this.includeBillMediumFlag = includeBillMediumFlag;
    }

    @XmlAttribute(name = "cms:includeBillMediumFlag")
    public String getIncludeBillMediumFlag() {
        return includeBillMediumFlag;
    }

    public void setIncludeContactPersonFlag(String includeContactPersonFlag) {
        this.includeContactPersonFlag = includeContactPersonFlag;
    }

    @XmlAttribute(name = "cms:includeContactPersonFlag")
    public String getIncludeContactPersonFlag() {
        return includeContactPersonFlag;
    }

    public void setIncludeDeactivationFlag(String includeDeactivationFlag) {
        this.includeDeactivationFlag = includeDeactivationFlag;
    }

    @XmlAttribute(name = "cms:includeDeactivationFlag")
    public String getIncludeDeactivationFlag() {
        return includeDeactivationFlag;
    }

    public void setIncludePaymentChannelFlag(String includePaymentChannelFlag) {
        this.includePaymentChannelFlag = includePaymentChannelFlag;
    }

    @XmlAttribute(name = "cms:includePaymentChannelFlag")
    public String getIncludePaymentChannelFlag() {
        return includePaymentChannelFlag;
    }

}