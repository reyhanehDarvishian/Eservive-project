
package com.rahgozin.gate.dto.querySub.querySubscriber.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subscriberInfo",
    "pageQuery"
})
@Generated("jsonschema2pojo")
public class QuerySubscriberRes {

    @JsonProperty("subscriberInfo")
    private SubscriberInfoRes subscriberInfoRes;


    private List<SubscriberInfoRes> subscribersInfoRes=new ArrayList<>();

    @JsonProperty("pageQuery")
    private PageQueryResponse pageQueryResponse;


    public void addToSubsInfo(SubscriberInfoRes subInfoResponse) {
        subscribersInfoRes.add(subInfoResponse);
    }
    @JsonProperty("subscriberInfo")
    public SubscriberInfoRes getSubscriberInfo() {
        return subscriberInfoRes;
    }

    @JsonProperty("subscriberInfo")
    public void setSubscriberInfo(SubscriberInfoRes subscriberInfoRes) {
        addToSubsInfo(subscriberInfoRes);
        this.subscriberInfoRes = subscriberInfoRes;
    }

    @JsonProperty("pageQuery")
    public PageQueryResponse getPageQuery() {
        return pageQueryResponse;
    }

    @JsonProperty("pageQuery")
    public void setPageQuery(PageQueryResponse pageQueryResponse) {
        this.pageQueryResponse = pageQueryResponse;
    }

    public List<SubscriberInfoRes> getSubscribersInfoRes() {
        return subscribersInfoRes;
    }

    public void setSubscribersInfoRes(List<SubscriberInfoRes> subscribersInfoRes) {
        this.subscribersInfoRes = subscribersInfoRes;
    }
}
