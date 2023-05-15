
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "QueryCustomBillingInfoResultMsg"
})
@Generated("jsonschema2pojo")
public class Body {
    private QueryCustomBillingInfoResultMsg queryCustomBillingInfoResultMsg;

    @JsonProperty("queryCustomBillingInfoResultMsg")
    public QueryCustomBillingInfoResultMsg getQueryCustomBillingInfoResultMsg() {
        return queryCustomBillingInfoResultMsg;
    }

    @JsonProperty("QueryCustomBillingInfoResultMsg")
    public void setQueryCustomBillingInfoResultMsg(QueryCustomBillingInfoResultMsg queryCustomBillingInfoResultMsg) {
        this.queryCustomBillingInfoResultMsg = queryCustomBillingInfoResultMsg;
    }

}