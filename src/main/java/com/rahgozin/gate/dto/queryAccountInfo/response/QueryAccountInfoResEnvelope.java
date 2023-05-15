package com.rahgozin.gate.dto.queryAccountInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")

public class QueryAccountInfoResEnvelope {

    @JsonProperty("body")
    QueryAccountInfoResBody queryAccountInfoResBody;


    @JsonProperty("body")
    public QueryAccountInfoResBody getQueryAccountInfoResBody() {
        return queryAccountInfoResBody;
    }
    @JsonProperty("Body")
    public void setQueryAccountInfoResBody(QueryAccountInfoResBody queryAccountInfoResBody) {
        this.queryAccountInfoResBody = queryAccountInfoResBody;
    }
}