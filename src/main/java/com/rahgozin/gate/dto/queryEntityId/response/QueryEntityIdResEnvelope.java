package com.rahgozin.gate.dto.queryEntityId.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")
public class QueryEntityIdResEnvelope {
    @JsonProperty("body")
    private QueryEntityIdResBody body;

    @JsonProperty("body")
    public QueryEntityIdResBody getBody() {
        return body;
    }

    @JsonProperty("Body")
    public void setBody(QueryEntityIdResBody body) {
        this.body = body;
    }
}