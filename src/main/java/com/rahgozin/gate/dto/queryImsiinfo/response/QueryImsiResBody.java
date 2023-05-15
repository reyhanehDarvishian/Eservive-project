package com.rahgozin.gate.dto.queryImsiinfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "queryIMSIInfoRspMsg"
})
@Generated("jsonschema2pojo")
public class QueryImsiResBody {
    @JsonProperty("queryImsiInfoRspMsg")
    private QueryIMSIInfoRspMsg queryIMSIInfoRspMsg;

    @JsonProperty("queryImsiInfoRspMsg")
    public QueryIMSIInfoRspMsg getQueryIMSIInfoRspMsg() {
        return queryIMSIInfoRspMsg;
    }

    @JsonProperty("queryIMSIInfoRspMsg")
    public void setQueryIMSIInfoRspMsg(QueryIMSIInfoRspMsg queryIMSIInfoRspMsg) {
        this.queryIMSIInfoRspMsg = queryIMSIInfoRspMsg;
    }

}