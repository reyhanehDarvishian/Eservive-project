package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rahgozin.gate.dto.queryFreeUnit.response.FreeUnitItem;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "BeginRowNum",
        "FetchRowNum",
        "TotalRowNum",
        "PaymentInfo"
})
@Generated("jsonschema2pojo")
public class QueryPaymentLogResult {
    PaymentInfo paymentInfo;
    private List<PaymentInfo> paymentInfos = new ArrayList<>();
    String totalRowNum = "";
    String beginRowNum = "";
    String fetchRowNum = "";

    public List<PaymentInfo> getPaymentInfos() {
        return paymentInfos;
    }

    public void setPaymentInfos(List<PaymentInfo> paymentInfos) {
        this.paymentInfos = paymentInfos;
    }

    public void addToPaymentInfos(PaymentInfo paymentInfo) {
        paymentInfos.add(paymentInfo);
    }

    @JsonProperty("BeginRowNum")
    public void setBeginRowNum(String beginRowNum) {
        this.beginRowNum = beginRowNum;
    }

    @JsonProperty("beginRowNum")
    public String getBeginRowNum() {
        return beginRowNum;
    }

    @JsonProperty("FetchRowNum")
    public void setFetchRowNum(String fetchRowNum) {
        this.fetchRowNum = fetchRowNum;
    }

    @JsonProperty("fetchRowNum")
    public String getFetchRowNum() {
        return fetchRowNum;
    }

    @JsonProperty("TotalRowNum")
    public void setTotalRowNum(String totalRowNum) {
        this.totalRowNum = totalRowNum;
    }

    @JsonProperty("totalRowNum")
    public String getTotalRowNum() {
        return totalRowNum;
    }

    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo() {
        if (paymentInfo == null) paymentInfo = new PaymentInfo();
        return paymentInfo;
    }

    @JsonProperty("PaymentInfo")
    public void setPaymentInfo(PaymentInfo paymentInfo) {
        addToPaymentInfos(paymentInfo);
        this.paymentInfo = paymentInfo;
    }

}