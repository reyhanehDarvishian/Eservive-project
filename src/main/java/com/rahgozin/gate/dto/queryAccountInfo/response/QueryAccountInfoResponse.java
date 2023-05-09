package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class QueryAccountInfoResponse {

    @JsonProperty("accountInfo")
    List<AccountInfoBean> accountInfoBeanList;

    @XmlElement(name = "accountInfo")
    public List<AccountInfoBean> getAccountInfoBeanList() {
        if (accountInfoBeanList == null)
            accountInfoBeanList = new ArrayList<AccountInfoBean>();
        return accountInfoBeanList;
    }
}