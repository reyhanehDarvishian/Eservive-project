package com.rahgozin.gate.dto.querySub.queryCustomer.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;


public class PageQueryReq {
    @JsonProperty("com:pageSize")
    Integer pageSize;
    @JsonProperty("com:startNum")
    Integer startNum;
    @JsonProperty("com:totalNum")
    Integer totalNum;

    @XmlElement(name = "com:pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @XmlElement(name = "com:startNum")
    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    @XmlElement(name = "com:totalNum")
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

}