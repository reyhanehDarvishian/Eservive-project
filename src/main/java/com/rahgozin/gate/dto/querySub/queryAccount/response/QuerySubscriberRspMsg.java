
package com.rahgozin.gate.dto.querySub.queryAccount.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resultHeader",
    "querySubscriberResponse"
})
@Generated("jsonschema2pojo")
public class QuerySubscriberRspMsg {

    @JsonProperty("resultHeader")
    private QuerySubResultHeader querySubResultHeader;
    @JsonProperty("querySubscriberResponse")
    private QuerySubscriberRes querySubscriberRes;

    @JsonProperty("resultHeader")
    public QuerySubResultHeader getResultHeader() {
        return querySubResultHeader;
    }

    @JsonProperty("resultHeader")
    public void setResultHeader(QuerySubResultHeader querySubResultHeader) {
        this.querySubResultHeader = querySubResultHeader;
    }

    @JsonProperty("querySubscriberResponse")
    public QuerySubscriberRes getQuerySubscriberResponse() {
        return querySubscriberRes;
    }

    @JsonProperty("querySubscriberResponse")
    public void setQuerySubscriberResponse(QuerySubscriberRes querySubscriberRes) {
        this.querySubscriberRes = querySubscriberRes;
    }

}
