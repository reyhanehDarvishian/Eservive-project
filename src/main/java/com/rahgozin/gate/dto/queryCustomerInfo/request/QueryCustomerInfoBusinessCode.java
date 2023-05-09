package com.rahgozin.gate.dto.queryCustomerInfo.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryCustomerInfoBusinessCode {
    private String businessCode;
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns3")
    private String businessCodeSchema = "http://www.huawei.com/bes/crminterface/crmheader";

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }
}
