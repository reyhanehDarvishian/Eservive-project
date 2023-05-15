
package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resultHeader",
    "queryCustomBillingInfoResult"
})
@Generated("jsonschema2pojo")
public class QueryCustomBillingInfoResultMsg {
    private ResultHeader resultHeader;
    private QueryCustomBillingInfoResult queryCustomBillingInfoResult;

    @JsonProperty("resultHeader")
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    @JsonProperty("ResultHeader")
    public void setResultHeader(ResultHeader resultHeader) {
        this.resultHeader = resultHeader;
    }

    @JsonProperty("queryCustomBillingInfoResult")
    public QueryCustomBillingInfoResult getQueryCustomBillingInfoResult() {
        return queryCustomBillingInfoResult;
    }

    @JsonProperty("QueryCustomBillingInfoResult")
    public void setQueryCustomBillingInfoResult(QueryCustomBillingInfoResult queryCustomBillingInfoResult) {
        this.queryCustomBillingInfoResult = queryCustomBillingInfoResult;
    }

}
