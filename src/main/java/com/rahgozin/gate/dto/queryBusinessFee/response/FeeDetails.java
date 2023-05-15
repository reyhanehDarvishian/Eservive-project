package com.rahgozin.gate.dto.queryBusinessFee.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahgozin.gate.dto.querySub.querySubscriber.response.SubscriberInfoRes;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class FeeDetails {
    String chargeCode = "";
    String chargeType = "";
    String discount = "";
    String tax = "";
    String totaUpfrontCost = "";
    String total = "";
    String unitPrice = "";
    String waived = "";
    @JsonProperty("chargeCodeNames")
    private ChargeCodeNames chargeCodeNames;
    List<ChargeCodeNames> chargeCodesNames = new ArrayList<>();

    public void addToChargeCodeNames(ChargeCodeNames chargeCodeNames) {
        chargeCodesNames.add(chargeCodeNames);
    }

    @JsonProperty("chargeCodeNames")
    public ChargeCodeNames getChargeCodeNames() {
        return chargeCodeNames;
    }

    @JsonProperty("chargeCodeNames")
    public void setChargeCodeNames(ChargeCodeNames chargeCodeNames) {
        addToChargeCodeNames(chargeCodeNames);
        this.chargeCodeNames = chargeCodeNames;
    }

    public List<ChargeCodeNames> getChargeCodesNames() {
        return chargeCodesNames;
    }

    public void setChargeCodesNames(List<ChargeCodeNames> chargeCodesNames) {
        this.chargeCodesNames = chargeCodesNames;
    }

    @JsonProperty("chargeCode")
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    @JsonProperty("chargeCode")
    public String getChargeCode() {
        return chargeCode;
    }

    @JsonProperty("chargeType")
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    @JsonProperty("chargeType")
    public String getChargeType() {
        return chargeType;
    }

    @JsonProperty("discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    @JsonProperty("tax")
    public void setTax(String tax) {
        this.tax = tax;
    }

    @JsonProperty("tax")
    public String getTax() {
        return tax;
    }

    @JsonProperty("totaUpfrontCost")
    public void setTotaUpfrontCost(String totaUpfrontCost) {
        this.totaUpfrontCost = totaUpfrontCost;
    }

    @JsonProperty("totaUpfrontCost")
    public String getTotaUpfrontCost() {
        return totaUpfrontCost;
    }

    @JsonProperty("total")
    public void setTotal(String total) {
        this.total = total;
    }

    @JsonProperty("total")
    public String getTotal() {
        return total;
    }

    @JsonProperty("unitPrice")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @JsonProperty("unitPrice")
    public String getUnitPrice() {
        return unitPrice;
    }

    @JsonProperty("waived")
    public void setWaived(String waived) {
        this.waived = waived;
    }

    @JsonProperty("waived")
    public String getWaived() {
        return waived;
    }

}