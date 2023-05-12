package com.rahgozin.gate.dto.queryBusinessFee.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryBusinessFeeRequest {

    @JsonProperty("cus:queryObj")
    BusinessFeeQueryObj businessFeeQueryObj;

    @JsonProperty("cus:businessCode")
    String businessCode;

    @JsonProperty("cus:AdditionalProperty")
    List<BusinessFeeAdditionalProperty> businessFeeAdditionalProperty;


    @XmlElement(name = "cus:queryObj")
    public BusinessFeeQueryObj getBusinessFeeQueryObj() {
        if (businessFeeQueryObj == null) businessFeeQueryObj = new BusinessFeeQueryObj();
        return businessFeeQueryObj;
    }

    public void setBusinessFeeQueryObj(BusinessFeeQueryObj businessFeeQueryObj) {
        this.businessFeeQueryObj = businessFeeQueryObj;
    }

    @XmlElement(name = "cus:businessCode")
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    @JsonIgnore
    @XmlElement(name = "cus:AdditionalProperty")
    public List<BusinessFeeAdditionalProperty> getBusinessFeeAdditionalProperty() {
        if (businessFeeAdditionalProperty == null) businessFeeAdditionalProperty = new ArrayList<>();
        return businessFeeAdditionalProperty;
    }

    @JsonIgnore
    public void setBusinessFeeAdditionalProperty(List<BusinessFeeAdditionalProperty> businessFeeAdditionalProperty) {
        this.businessFeeAdditionalProperty = businessFeeAdditionalProperty;
    }
}