package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryBusinessFee.request.*;
import com.rahgozin.gate.dto.queryBusinessFee.response.*;
import com.rahgozin.gate.dto.queryCustomBillingInfo.response.QueryCustomBillingInfoResEnvelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class QueryBusinessFeeService {
    private final RestTemplate queryBusinessFeeRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryBusinessFeeService(@Qualifier("queryBusinessFeeRestTemplate") RestTemplate queryBusinessFeeRestTemplate,
             ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryBusinessFeeRestTemplate = queryBusinessFeeRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public BusinessFeeResEnvelope queryBusinessFee(String phoneNumber) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        QueryBusinessFeeEnvelope businessFeeEnvelope = new QueryBusinessFeeEnvelope();
        QueryBusinessFeeReqBody queryBusinessFeeReqBody = new QueryBusinessFeeReqBody();
        QueryBusinessFeeReqMsg businessFeeReqMsg = new QueryBusinessFeeReqMsg();
        QueryBusinessFeeRequest queryBusinessFeeRequest = new QueryBusinessFeeRequest();
        QueryBusinessFeeReqHeader queryBusinessFeeReqHeader = new QueryBusinessFeeReqHeader();
        List<BusinessFeeAdditionalProperty> businessFeeAdditionalPropertyList = new ArrayList<>();
        queryBusinessFeeReqHeader
                .setVersion(applicationProperties.getQueryBusinessFeeConnection().getVersion());
        queryBusinessFeeReqHeader
                .setBusinessCode(applicationProperties.getQueryBusinessFeeConnection().getBusinessCode());
        queryBusinessFeeReqHeader
                .setMessageSeq(applicationProperties.getQueryBusinessFeeConnection().getMessageSeq());
        queryBusinessFeeReqHeader
                .getBusinessFeeOwnershipInfoReq()
                .setBeId(applicationProperties.getQueryBusinessFeeConnection().getBeId());
        queryBusinessFeeReqHeader
                .getBusinessFeeOwnershipInfoReq()
                .setRegionId(applicationProperties.getQueryBusinessFeeConnection().getRegionId());
        queryBusinessFeeReqHeader
                .getBusinessFeeAccessSecurityReq()
                .setLoginSystemCode(applicationProperties.getQueryBusinessFeeConnection().getLoginSystemCode());
        queryBusinessFeeReqHeader
                .getBusinessFeeAccessSecurityReq()
                .setPassword(applicationProperties.getQueryBusinessFeeConnection().getPassword());
        queryBusinessFeeReqHeader
                .getBusinessFeeOperatorInfoReq()
                .setOperatorId(applicationProperties.getQueryBusinessFeeConnection().getOperatorId());
        queryBusinessFeeReqHeader
                .getBusinessFeeOperatorInfoReq()
                .setOrgId(applicationProperties.getQueryBusinessFeeConnection().getOrgId());
        queryBusinessFeeReqHeader
                .setBusinessFeeChannelTypeReq(applicationProperties.getQueryBusinessFeeConnection().getChannelType());
        businessFeeAdditionalPropertyList.add(new BusinessFeeAdditionalProperty("ChangeSIMReasonCode", "1"));
        businessFeeAdditionalPropertyList.add(new BusinessFeeAdditionalProperty("New_ICCID", "8998112900008650523"));
        queryBusinessFeeRequest.setBusinessFeeAdditionalProperty(businessFeeAdditionalPropertyList);
        queryBusinessFeeRequest
                .getBusinessFeeQueryObj().getBusinessFeeSubAccessCode()
                .setPrimaryIdentity(phoneNumber);
        queryBusinessFeeRequest
                .setBusinessCode(applicationProperties.getQueryBusinessFeeConnection().getBusinessCode2());
        businessFeeReqMsg.setBusinessFeeReqHeader(queryBusinessFeeReqHeader);
        businessFeeReqMsg.setQueryBusinessFeeRequestList(queryBusinessFeeRequest);
        queryBusinessFeeReqBody.setQueryBusinessFeeReqMsg(businessFeeReqMsg);
        businessFeeEnvelope.setBusinessFeeReqBody(queryBusinessFeeReqBody);
        HttpHeaders queryBusinessFeeHeaders = new HttpHeaders();
        queryBusinessFeeHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getBusinessFeeToken());
        queryBusinessFeeHeaders.add("soapaction", "queryBusinessFee");
        queryBusinessFeeHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");
        HttpEntity<String> queryBusinessFeeResBody = null;
        try {
            queryBusinessFeeResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(businessFeeEnvelope), queryBusinessFeeHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return queryBusinessFeeRestTemplate.postForEntity(applicationProperties.getQueryBusinessFeeConnection().getBaseUrl(), queryBusinessFeeResBody, BusinessFeeResEnvelope.class).getBody();
    }
}