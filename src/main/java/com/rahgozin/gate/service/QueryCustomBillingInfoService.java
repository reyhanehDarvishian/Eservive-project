package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryCustomBillingInfo.request.*;
import com.rahgozin.gate.dto.queryCustomBillingInfo.response.QueryCustomBillingInfoResEnvelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QueryCustomBillingInfoService {
    private final RestTemplate queryCustomBillingInfoRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryCustomBillingInfoService
            (@Qualifier("queryCustomBillingInfoRestTemplate") RestTemplate queryCustomBillingInfoRestTemplate,
             ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryCustomBillingInfoRestTemplate = queryCustomBillingInfoRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public QueryCustomBillingInfoResEnvelope queryCustomBillingInfo(String phoneNumber, String date, int opType) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        QueryBillingEnvelope billingEnvelope = new QueryBillingEnvelope();
        QueryBillingBody billingBody = new QueryBillingBody();
        QueryCustomBillingInfoRequestMsg queryCustomBillingInfoRequestMsg = new QueryCustomBillingInfoRequestMsg();
        QueryCustomBillingInfoRequest queryCustomBillingInfoRequest = new QueryCustomBillingInfoRequest();
        QueryBillingReqHeader queryBillingReqHeader = new QueryBillingReqHeader();
        queryBillingReqHeader
                .setVersion(applicationProperties.getQueryBillingInfoConnection().getVersion().toString());
        queryBillingReqHeader
                .setBusinessCode("QueryCustomBillingInfo");
        queryBillingReqHeader
                .setMessageSeq(applicationProperties.getQueryBillingInfoConnection().getMessageSeq());
        queryBillingReqHeader.getOwnershipInfo().setBEID("10101");

        queryBillingReqHeader.getAccessSecurity()
                .setLoginSystemCode(applicationProperties.getQueryBillingInfoConnection().getLoginSystemCode().toString());
        queryBillingReqHeader.getAccessSecurity()
                .setPassword("i3qsntAtJug0YxeTIr+7Ij0gR9Dgz02gTwWd3E9uhfI=");
        queryBillingReqHeader.getOperatorInfo()
                .setOperatorID(applicationProperties.getQueryBillingInfoConnection().getOperatorId().toString());
        queryBillingReqHeader.getOperatorInfo()
                .setChannelID(applicationProperties.getQueryBillingInfoConnection().getOperatorId().toString());

        queryCustomBillingInfoRequest.getAcctAccessCode()
                .setPrimaryIdentity(phoneNumber);

        if (opType == 0) {

            queryCustomBillingInfoRequest.setBillCycleID(date);
        }
        queryCustomBillingInfoRequest
                .setOpType(String.valueOf(opType));
        queryCustomBillingInfoRequestMsg.setQueryBillingReqHeader(queryBillingReqHeader);
        queryCustomBillingInfoRequestMsg.setQueryCustomBillingInfoRequestList(queryCustomBillingInfoRequest);
        billingBody.setQueryCustomBillingInfoRequestMsg(queryCustomBillingInfoRequestMsg);
        billingEnvelope.setQueryBillingBody(billingBody);

        HttpHeaders queryCustomBillingHeaders = new HttpHeaders();
        queryCustomBillingHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getBillingToken());
        queryCustomBillingHeaders.add("soapaction", "QueryCustomBillingInfo");
        queryCustomBillingHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");
        HttpEntity<String> queryCustomBillingResBody = null;
        try {
            queryCustomBillingResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(billingEnvelope), queryCustomBillingHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        QueryCustomBillingInfoResEnvelope body = queryCustomBillingInfoRestTemplate.postForEntity(applicationProperties.getQueryBillingInfoConnection().getBaseUrl(), queryCustomBillingResBody, QueryCustomBillingInfoResEnvelope.class).getBody();

        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setLocalVoiceCallsName(applicationProperties.getBilling().getOrDefault("localVoiceCalls", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setInternationVoiceCallsName(applicationProperties.getBilling().getOrDefault("internationVoiceCalls", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setInternationalRoamingChargesName(applicationProperties.getBilling().getOrDefault("internationalRoamingCharges", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setSmsName(applicationProperties.getBilling().getOrDefault("sms", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setVmsName(applicationProperties.getBilling().getOrDefault("vms", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setPackagesName(applicationProperties.getBilling().getOrDefault("packages", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setInternetName(applicationProperties.getBilling().getOrDefault("internet", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setVasName(applicationProperties.getBilling().getOrDefault("vas", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setcRMCostsName(applicationProperties.getBilling().getOrDefault("crmCosts", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setSpecialServicesName(applicationProperties.getBilling().getOrDefault("specialServices", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().seteGovName(applicationProperties.getBilling().getOrDefault("eGov", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setSubscriptionFeeName(applicationProperties.getBilling().getOrDefault("subscriptionFee", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setTotalAmountName(applicationProperties.getBilling().getOrDefault("totalAmount", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setTaxName(applicationProperties.getBilling().getOrDefault("tax", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setTotalOldDebtsName(applicationProperties.getBilling().getOrDefault("totalOldDebts", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setCharityName(applicationProperties.getBilling().getOrDefault("charity", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setGovernmentGeneralIncomeName(applicationProperties.getBilling().getOrDefault("governmentGeneralIncome", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setPostToPreBTName(applicationProperties.getBilling().getOrDefault("postToPreBT", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setSumName(applicationProperties.getBilling().getOrDefault("sum", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setDiscountName(applicationProperties.getBilling().getOrDefault("discount", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setTotalOldCreditName(applicationProperties.getBilling().getOrDefault("totalOldCredit", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setUnconfirmedPaymentName(applicationProperties.getBilling().getOrDefault("unconfirmedPayment", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setExemptionFeeName(applicationProperties.getBilling().getOrDefault("exemptionFee", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setRoundingName(applicationProperties.getBilling().getOrDefault("rounding", "none"));
        body.getBody().getQueryCustomBillingInfoResultMsg().getQueryCustomBillingInfoResult().getInvoiceInfo().getInvoiceSummary().setPayableName(applicationProperties.getBilling().getOrDefault("payable", "none"));
        return body;
    }
}