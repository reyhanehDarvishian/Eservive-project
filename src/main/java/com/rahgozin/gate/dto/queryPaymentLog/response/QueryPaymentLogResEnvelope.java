package com.rahgozin.gate.dto.queryPaymentLog.response;

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
public class QueryPaymentLogResEnvelope {
    @JsonProperty("body")
    private Body body;

    @JsonProperty("body")
    public Body getBody() {
        if (body == null) body = new Body();
        return body;
    }

    @JsonProperty("Body")
    public void setBody(Body body) {
        this.body = body;
    }

}