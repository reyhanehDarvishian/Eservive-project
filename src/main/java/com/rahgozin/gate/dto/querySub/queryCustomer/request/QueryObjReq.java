package com.rahgozin.gate.dto.querySub.queryCustomer.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class QueryObjReq {

    @JsonProperty("cms:custAccessCode")
    CustAccessCodeReq custAccessCodeReq;

    @JsonProperty("cms:custAccessCode")
    public CustAccessCodeReq getCustAccessCodeReq() {
        if (this.custAccessCodeReq==null){
            custAccessCodeReq=new CustAccessCodeReq();
        }
        return custAccessCodeReq;
    }

    public void setCustAccessCodeReq(CustAccessCodeReq custAccessCodeReq) {
        this.custAccessCodeReq = custAccessCodeReq;
    }
}