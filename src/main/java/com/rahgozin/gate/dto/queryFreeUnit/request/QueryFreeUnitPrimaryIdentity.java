package com.rahgozin.gate.dto.queryFreeUnit.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryFreeUnitPrimaryIdentity {
    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:ns2")
    private String bbcommon = "http://www.huawei.com/bme/cbsinterface/bbcommon";

    private String primaryIdentity;

    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    public void setPrimaryIdentity(String primaryIdentity) {
        this.primaryIdentity = primaryIdentity;
    }
}
