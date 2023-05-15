package com.rahgozin.gate.dto.queryImsiinfo.response;

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
public class QueryImsiResEnvelope {

    @JsonProperty("body")
    private QueryImsiResBody imsiResBody;

    @JsonProperty("body")
    public QueryImsiResBody getBody() {
        return imsiResBody;
    }

    @JsonProperty("Body")
    public void setBody(QueryImsiResBody imsiResBody) {
        this.imsiResBody = imsiResBody;
    }

}