
package com.rahgozin.gate.dto.querySub.queryCustomer.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")
public class QuerySubEnvelopeRes {

    @JsonProperty("Body")
    private QuerySubBodyRes querySubBodyRes;

    @JsonProperty("Body")
    public QuerySubBodyRes getBody() {
        return querySubBodyRes;
    }

    @JsonProperty("Body")
    public void setBody(QuerySubBodyRes querySubBodyRes) {
        this.querySubBodyRes = querySubBodyRes;
    }

}
