package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryCustomerInfoResponse {
    String defaultAccountId;
    @JsonProperty("customer")
    List<CustomerBean> customerBeanList;

    public void setDefaultAccountId(String defaultAccountId) {
        this.defaultAccountId = defaultAccountId;
    }

    @XmlAttribute(name = "defaultAccountId")
    public String getDefaultAccountId() {
        return defaultAccountId;
    }

    public void setCustomerBeanList(List<CustomerBean> customerBeanList) {
        this.customerBeanList = customerBeanList;
    }

    @XmlElement(name = "customer")
    public List<CustomerBean> getCustomerBeanList() {
        if (customerBeanList == null)
            customerBeanList = new ArrayList<CustomerBean>();
        return customerBeanList;
    }
}