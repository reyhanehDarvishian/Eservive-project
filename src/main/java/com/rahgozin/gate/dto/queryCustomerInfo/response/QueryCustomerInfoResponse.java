package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryCustomerInfoResponse {
    @JsonProperty("customer")
    Customer customer;
    String defaultAccountId;

    public void setDefaultAccountId(String defaultAccountId) {
        this.defaultAccountId = defaultAccountId;
    }

    @XmlAttribute(name = "defaultAccountId")
    public String getDefaultAccountId() {
        return defaultAccountId;
    }

    @XmlElement(name = "customer")
    public Customer getCustomer() {
        if (customer == null) customer = new Customer();
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}