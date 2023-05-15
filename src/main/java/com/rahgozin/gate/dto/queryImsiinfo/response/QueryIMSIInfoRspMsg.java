package com.rahgozin.gate.dto.queryImsiinfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resultHeader",
        "queryIMSIInfoResponse"
})
@Generated("jsonschema2pojo")
public class QueryIMSIInfoRspMsg {
    private QueryImsiResResultHeader imsiResResultHeader;
    private QueryIMSIInfoResponse queryIMSIInfoResponse;

    @JsonProperty("queryImsiInfoResponse")
    public QueryIMSIInfoResponse getQueryIMSIInfoResponse() {
        return queryIMSIInfoResponse;
    }

    @JsonProperty("queryIMSIInfoResponse")
    public void setQueryIMSIInfoResponse(QueryIMSIInfoResponse queryIMSIInfoResponse) {
        this.queryIMSIInfoResponse = queryIMSIInfoResponse;
    }

    @JsonProperty("resultHeader")
    public QueryImsiResResultHeader getImsiResResultHeader() {
        return imsiResResultHeader;
    }

    @JsonProperty("resultHeader")
    public void setImsiResResultHeader(QueryImsiResResultHeader imsiResResultHeader) {
        this.imsiResResultHeader = imsiResResultHeader;
    }
}