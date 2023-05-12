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

    public ChargeCodeNames getChargeCodeNames() {
        return chargeCodeNames;
    }

    @XmlElement(name = "chargeCodeNames")
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

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    @XmlAttribute(name = "chargeCode")
    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    @XmlAttribute(name = "chargeType")
    public String getChargeType() {
        return chargeType;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @XmlAttribute(name = "discount")
    public String getDiscount() {
        return discount;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @XmlAttribute(name = "tax")
    public String getTax() {
        return tax;
    }

    public void setTotaUpfrontCost(String totaUpfrontCost) {
        this.totaUpfrontCost = totaUpfrontCost;
    }

    @XmlAttribute(name = "totaUpfrontCost")
    public String getTotaUpfrontCost() {
        return totaUpfrontCost;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @XmlAttribute(name = "total")
    public String getTotal() {
        return total;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @XmlAttribute(name = "unitPrice")
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setWaived(String waived) {
        this.waived = waived;
    }

    @XmlAttribute(name = "waived")
    public String getWaived() {
        return waived;
    }

}