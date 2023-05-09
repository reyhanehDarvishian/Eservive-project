
package com.rahgozin.gate.dto.querySubscriberNew.querySub.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pageSize",
    "startNum",
    "totalNum"
})
@Generated("jsonschema2pojo")
public class PageQueryResponse {

    @JsonProperty("pageSize")
    private String pageSize;
    @JsonProperty("startNum")
    private String startNum;
    @JsonProperty("totalNum")
    private String totalNum;

    @JsonProperty("pageSize")
    public String getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageSize")
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("startNum")
    public String getStartNum() {
        return startNum;
    }

    @JsonProperty("startNum")
    public void setStartNum(String startNum) {
        this.startNum = startNum;
    }

    @JsonProperty("totalNum")
    public String getTotalNum() {
        return totalNum;
    }

    @JsonProperty("totalNum")
    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

}
