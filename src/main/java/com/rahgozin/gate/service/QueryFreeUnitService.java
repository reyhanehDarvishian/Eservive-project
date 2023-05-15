package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryCustomBillingInfo.response.QueryCustomBillingInfoResEnvelope;
import com.rahgozin.gate.dto.queryFreeUnit.request.*;
import com.rahgozin.gate.dto.queryFreeUnit.response.QueryFreeUnitEnvelopeRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class QueryFreeUnitService {

    private final RestTemplate queryFreeUnitRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryFreeUnitService(@Qualifier("queryFreeUnitRestTemplate") RestTemplate queryFreeUnitRestTemplate,  ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryFreeUnitRestTemplate = queryFreeUnitRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public QueryFreeUnitEnvelopeRes queryFreeUnit(String phoneNumber) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        QueryFreeUnitEnvelope queryFreeUnitEnvelope = new QueryFreeUnitEnvelope();
        QueryFreeUnitBody queryFreeUnitBody = new QueryFreeUnitBody();
        QueryFreeUnitRequestMsg queryFreeUnitRequestMsg = new QueryFreeUnitRequestMsg();
        QueryFreeUnitRequestHeader queryFreeUnitRequestHeader = new QueryFreeUnitRequestHeader();
        QueryFreeUnitRequest queryFreeUnitRequest = new QueryFreeUnitRequest();

        queryFreeUnitRequestHeader.getVersion().setVersion(applicationProperties.getQueryFreeUnitConnection().getVersion());
        queryFreeUnitRequestHeader.getBusinessCode().setBusinessCode(applicationProperties.getQueryFreeUnitConnection().getBusinessCode());
        queryFreeUnitRequestHeader.getMessageSeq().setMessageSeq(applicationProperties.getQueryFreeUnitConnection().getMessageSeq());
        queryFreeUnitRequestHeader.getQueryFreeUnitOwnershipInfo().setBeId(applicationProperties.getQueryFreeUnitConnection().getBeId());
        queryFreeUnitRequestHeader.getQueryFreeUnitAccessSecurity().setLoginSystemCode(applicationProperties.getQueryFreeUnitConnection().getLoginSystemCode());
        queryFreeUnitRequestHeader.getQueryFreeUnitAccessSecurity().setPassword(applicationProperties.getQueryFreeUnitConnection().getPassword());
        queryFreeUnitRequestHeader.getQueryFreeUnitOperatorInfo().setOperatorID(applicationProperties.getQueryFreeUnitConnection().getOperatorId());
        queryFreeUnitRequestHeader.getQueryFreeUnitOperatorInfo().setChannelID(applicationProperties.getQueryFreeUnitConnection().getChannelId());
        queryFreeUnitRequest.getQueryFreeUnitQueryObj().getQueryFreeUnitSubAccessCode().getPrimaryIdentity().setPrimaryIdentity(phoneNumber);
        queryFreeUnitRequestMsg.setQueryFreeUnitRequestHeader(queryFreeUnitRequestHeader);
        queryFreeUnitRequestMsg.setQueryFreeUnitRequest(queryFreeUnitRequest);
        queryFreeUnitBody.setQueryFreeUnitRequestMsg(queryFreeUnitRequestMsg);
        queryFreeUnitEnvelope.setQueryFreeUnitBody(queryFreeUnitBody);

        HttpHeaders queryFreeUnitHeaders = new HttpHeaders();
        queryFreeUnitHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getQueryFreeUnitToken());
        queryFreeUnitHeaders.add("soapaction", "QueryFreeUnit");
        queryFreeUnitHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");
        HttpEntity<String> queryFreeUnitResBody = null;
        try {
            queryFreeUnitResBody = new HttpEntity<>(xmlMapper.writeValueAsString(queryFreeUnitEnvelope), queryFreeUnitHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return queryFreeUnitRestTemplate.postForEntity(applicationProperties.getQueryFreeUnitConnection().getBaseUrl(), queryFreeUnitResBody, QueryFreeUnitEnvelopeRes.class).getBody();
    }
}