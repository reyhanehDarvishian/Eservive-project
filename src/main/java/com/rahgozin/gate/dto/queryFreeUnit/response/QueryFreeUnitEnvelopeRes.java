package com.rahgozin.gate.dto.queryFreeUnit.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rahgozin.gate.config.ApplicationProperties;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")
public class QueryFreeUnitEnvelopeRes {
    @JsonProperty("body")
    private QueryFreeUnitBodyRes freeUnitBodyRes;

    @JsonProperty("body")
    public QueryFreeUnitBodyRes getBody() {
        return freeUnitBodyRes;
    }

    @JsonProperty("Body")
    public void setBody(QueryFreeUnitBodyRes freeUnitBodyRes) {
        this.freeUnitBodyRes = freeUnitBodyRes;
    }
}