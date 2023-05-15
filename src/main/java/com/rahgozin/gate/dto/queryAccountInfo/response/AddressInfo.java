package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressInfo {
    String addrId;
    String addrClass;
    String addr1;
    String addr2;
    String addr3;
    String usAddr;
    String postalCode;

    @JsonProperty("addr1")
    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    @JsonProperty("addr1")
    public String getAddr1() {
        return addr1;
    }

    @JsonProperty("addr2")
    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    @JsonProperty("addr2")
    public String getAddr2() {
        return addr2;
    }

    @JsonProperty("addr3")
    public void setAddr3(String addr3) {
        this.addr3 = addr3;
    }

    @JsonProperty("addr3")
    public String getAddr3() {
        return addr3;
    }

    @JsonProperty("addrClass")
    public void setAddrClass(String addrClass) {
        this.addrClass = addrClass;
    }

    @JsonProperty("addrClass")
    public String getAddrClass() {
        return addrClass;
    }

    @JsonProperty("addrId")
    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    @JsonProperty("addrId")
    public String getAddrId() {
        return addrId;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("usAddr")
    public void setUsAddr(String usAddr) {
        this.usAddr = usAddr;
    }

    @JsonProperty("usAddr")
    public String getUsAddr() {
        return usAddr;
    }
}