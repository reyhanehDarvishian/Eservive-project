package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")
public class QueryCustomerInfoResEnvelope {
    @JsonProperty("body")
    private QueryCustomerInfoResBody queryCustomerInfoResBody;

    @JsonProperty("body")
    public QueryCustomerInfoResBody getQueryCustomerInfoResBody() {
        return queryCustomerInfoResBody;
    }

    @JsonProperty("Body")
    public void setQueryCustomerInfoResBody(QueryCustomerInfoResBody queryCustomerInfoResBody) {
        this.queryCustomerInfoResBody = queryCustomerInfoResBody;
    }
}