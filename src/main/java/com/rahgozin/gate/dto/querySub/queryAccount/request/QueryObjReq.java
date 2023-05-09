package com.rahgozin.gate.dto.querySub.queryAccount.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class QueryObjReq {

    @JsonProperty("cms:acctAccessCode")
    AcctAccessCodeReq acctAccessCodeReq;

    @JsonIgnore
    public AcctAccessCodeReq getAcctAccessCodeReq() {
        if (this.acctAccessCodeReq ==null){
            acctAccessCodeReq =new AcctAccessCodeReq();
        }
        return acctAccessCodeReq;
    }

    public void setAcctAccessCodeReq(AcctAccessCodeReq acctAccessCodeReq) {
        this.acctAccessCodeReq = acctAccessCodeReq;
    }
}