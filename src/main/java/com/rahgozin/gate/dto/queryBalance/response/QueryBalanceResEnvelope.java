package com.rahgozin.gate.dto.queryBalance.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class QueryBalanceResEnvelope {
    @JsonProperty("body")
    private QueryBalanceResBody balanceResBody;

    @JsonProperty("body")
    public QueryBalanceResBody getBody() {
        return balanceResBody;
    }

    @JsonProperty("Body")
    public void setBody(QueryBalanceResBody balanceResBody) {
        this.balanceResBody = balanceResBody;
    }
}