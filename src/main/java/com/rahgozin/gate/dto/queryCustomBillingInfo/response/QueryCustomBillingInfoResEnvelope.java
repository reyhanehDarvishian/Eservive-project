
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")
public class QueryCustomBillingInfoResEnvelope {

    @JsonProperty("body")
    private Body body;

    @JsonProperty("body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("Body")
    public void setBody(Body body) {
        this.body = body;
    }


}
