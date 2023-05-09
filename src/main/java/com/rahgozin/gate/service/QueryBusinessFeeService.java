package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryBusinessFee.request.*;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryBusinessFeeService {
    private final RestTemplate queryBusinessFeeRestTemplate;
    public final XmlMapper xmlMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryBusinessFeeService
            (XmlMapper xmlMapper,
             @Qualifier("queryBusinessFeeRestTemplate") RestTemplate queryBusinessFeeRestTemplate,
             ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryBusinessFeeRestTemplate = queryBusinessFeeRestTemplate;
        this.xmlMapper = xmlMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public Object queryBusinessFee() {
        QueryBusinessFeeEnvelope businessFeeEnvelope = new QueryBusinessFeeEnvelope();
        QueryBusinessFeeReqBody queryBusinessFeeReqBody = new QueryBusinessFeeReqBody();
        QueryBusinessFeeReqMsg businessFeeReqMsg = new QueryBusinessFeeReqMsg();
        QueryBusinessFeeRequest queryBusinessFeeRequest = new QueryBusinessFeeRequest();
        QueryBusinessFeeReqHeader queryBusinessFeeReqHeader = new QueryBusinessFeeReqHeader();
        List<BusinessFeeSimpleProperty> businessFeeSimplePropertyList = new ArrayList<>();

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

        businessFeeSimplePropertyList.add(new BusinessFeeSimpleProperty("ChangeSIMReasonCode", "1"));
        businessFeeSimplePropertyList.add(new BusinessFeeSimpleProperty("New_ICCID", "8998112900008650523"));
        queryBusinessFeeRequest.setBusinessFeeAdditionalProperty(businessFeeSimplePropertyList);
        queryBusinessFeeRequest
                .getBusinessFeeQueryObj().getBusinessFeeSubAccessCode()
                .setPrimaryIdentity(applicationProperties.getQueryBusinessFeeConnection().getPrimaryIdentity());
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
        return queryBusinessFeeRestTemplate.postForEntity(applicationProperties.getQueryBusinessFeeConnection().getBaseUrl(), queryBusinessFeeResBody, String.class).getBody();
    }
}