package com.rahgozin.gate.dto.queryPaymentLog.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rahgozin.gate.dto.queryFreeUnit.response.FreeUnitItem;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ApplyType",
        "ApplyType",
        "BillCycleId",
        "ChargeAmount",
        "ChargeCode",
        "DiscountAmount",
        "InvoiceDate",
        "InvoiceDetailID",
        "InvoiceID",
        "InvoiceNo",
        "TaxList"
})
@Generated("jsonschema2pojo")
public class PaymentDetail {
    String applyAmount = "";
    String applyType = "";
    String billCycleId = "";
    String chargeAmount = "";
    String chargeCode = "";
    String discountAmount = "";
    String invoiceDate = "";
    String invoiceDetailID = "";
    String invoiceID = "";
    String invoiceNo = "";
    TaxList taxList;
    private List<TaxList> taxLists = new ArrayList<>();
    public void addToTaxLists(TaxList taxList) {
        taxLists.add(taxList);
    }

    public List<TaxList> getTaxLists() {
        return taxLists;
    }
    public void setTaxLists(List<TaxList> taxLists) {
        this.taxLists = taxLists;
    }

    @JsonProperty( "ApplyAmount")
    public void setApplyAmount(String applyAmount) {
        this.applyAmount = applyAmount;
    }

    @JsonProperty( "applyAmount")
    public String getApplyAmount() {
        return applyAmount;
    }

    @JsonProperty( "ApplyType")
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    @JsonProperty( "applyType")
    public String getApplyType() {
        return applyType;
    }

    @JsonProperty( "BillCycleId")
    public void setBillCycleId(String billCycleId) {
        this.billCycleId = billCycleId;
    }

    @JsonProperty( "billCycleId")
    public String getBillCycleId() {
        return billCycleId;
    }

    @JsonProperty( "ChargeAmount")
    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    @JsonProperty( "chargeAmount")
    public String getChargeAmount() {
        return chargeAmount;
    }

    @JsonProperty( "ChargeCode")
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    @JsonProperty( "chargeCode")
    public String getChargeCode() {
        return chargeCode;
    }

    @JsonProperty( "DiscountAmount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty( "discountAmount")
    public String getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty( "InvoiceDate")
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @JsonProperty( "invoiceDate")
    public String getInvoiceDate() {
        return invoiceDate;
    }

    @JsonProperty( "InvoiceDetailID")
    public void setInvoiceDetailID(String invoiceDetailID) {
        this.invoiceDetailID = invoiceDetailID;
    }

    @JsonProperty( "invoiceDetailID")
    public String getInvoiceDetailID() {
        return invoiceDetailID;
    }

    @JsonProperty( "InvoiceID")
    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    @JsonProperty( "invoiceID")
    public String getInvoiceID() {
        return invoiceID;
    }

    @JsonProperty( "InvoiceNo")
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @JsonProperty( "invoiceNo")
    public String getInvoiceNo() {
        return invoiceNo;
    }

    @JsonProperty( "taxList")
    public TaxList getTaxList() {
        if (taxList == null) taxList = new TaxList();
        return taxList;
    }

    @JsonProperty( "TaxList")
    public void setTaxList(TaxList taxList) {
        addToTaxLists(taxList);
        this.taxList = taxList;
    }

}