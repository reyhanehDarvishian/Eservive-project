package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryEntityId.request.*;
import com.rahgozin.gate.dto.queryEntityId.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class QueryEntityIdService {

    private final RestTemplate queryEntityIdRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryEntityIdService(@Qualifier("queryEntityIdRestTemplate") RestTemplate queryEntityIdRestTemplate,
                                ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryEntityIdRestTemplate = queryEntityIdRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public QueryEntityIdResEnvelope entityId(String phoneNumber) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        QueryEntityIdEnvelope entityIdEnvelope = new QueryEntityIdEnvelope();
        QueryEntityIdBody entityIdBody = new QueryEntityIdBody();
        QueryEntityIdReqMsg entityIdReqMsg = new QueryEntityIdReqMsg();
        QueryEntityIdRequestHeader entityIdRequestHeader = new QueryEntityIdRequestHeader();
        QueryEntityIdRequest entityIdRequest = new QueryEntityIdRequest();
        entityIdRequestHeader.getVersion().setVersion(applicationProperties.getQueryEntityIdConnection().getVersion());
        entityIdRequestHeader.getBusinessCode().setBusinessCode(applicationProperties.getQueryEntityIdConnection().getBusinessCode());
        entityIdRequestHeader.getMessageSeq().setMessageSeq(applicationProperties.getQueryEntityIdConnection().getMessageSeq());
        entityIdRequestHeader.getOwnershipInfo().setBeId(applicationProperties.getQueryEntityIdConnection().getBeId());
        entityIdRequestHeader.getOwnershipInfo().setRegionId(applicationProperties.getQueryEntityIdConnection().getRegionId());
        entityIdRequestHeader.getAccessSecurity().setLoginSystemCode(applicationProperties.getQueryEntityIdConnection().getLoginSystemCode());
        entityIdRequestHeader.getAccessSecurity().setPassword(applicationProperties.getQueryEntityIdConnection().getPassword());
        entityIdRequestHeader.getOperatorInfo().setOperatorId(applicationProperties.getQueryEntityIdConnection().getOperatorId());
        entityIdRequestHeader.getOperatorInfo().setOrgId(applicationProperties.getQueryEntityIdConnection().getOrgId());
        entityIdRequestHeader.getChannelType().setChannelType(applicationProperties.getQueryEntityIdConnection().getChannelType());
        entityIdRequest.getQueryObj().getSubAccessCode().setPrimaryIdentity(phoneNumber);
        entityIdReqMsg.setQueryEntityIdRequest(entityIdRequest);
        entityIdReqMsg.setRequestHeader(entityIdRequestHeader);
        entityIdBody.setQueryEntityIdReqMsg(entityIdReqMsg);
        entityIdEnvelope.setBody(entityIdBody);

        HttpHeaders queryEntityHeaders = new HttpHeaders();
        queryEntityHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getEntityIdToken());
        queryEntityHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");
        queryEntityHeaders.add("soapaction", "QueryEntityId");
        HttpEntity<String> queryEntityResBody = null;
        try {
            queryEntityResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(entityIdEnvelope), queryEntityHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return queryEntityIdRestTemplate.postForEntity(applicationProperties.getQueryEntityIdConnection().getBaseUrl(), queryEntityResBody, QueryEntityIdResEnvelope.class).getBody();
    }
}