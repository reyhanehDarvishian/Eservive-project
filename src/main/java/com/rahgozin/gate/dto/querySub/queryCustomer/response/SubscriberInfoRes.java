
package com.rahgozin.gate.dto.querySub.queryCustomer.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ns2:subInfo"
})
@Generated("jsonschema2pojo")
public class SubscriberInfoRes {

    @JsonProperty("subInfo")
    private SubInfoResponse subInfoResponse;

    public void setSubInfoResponse(SubInfoResponse subInfoResponse) {
        this.subInfoResponse = subInfoResponse;
    }

    @JsonProperty("subInfo")
    public SubInfoResponse getSubInfo() {

        return subInfoResponse;
    }

    @JsonProperty("subInfo")
    public void setSubInfo(SubInfoResponse subInfoResponse) {
        this.subInfoResponse = subInfoResponse;
    }

}
