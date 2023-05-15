
package com.rahgozin.gate.dto.querySubscriberNew.querySub.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "body"
})
@Generated("jsonschema2pojo")
public class QuerySubEnvelopeRes {

    @JsonProperty("body")
    private QuerySubBodyRes querySubBodyRes;

    @JsonProperty("body")
    public QuerySubBodyRes getBody() {
        return querySubBodyRes;
    }

    @JsonProperty("body")
    public void setBody(QuerySubBodyRes querySubBodyRes) {
        this.querySubBodyRes = querySubBodyRes;
    }

}
