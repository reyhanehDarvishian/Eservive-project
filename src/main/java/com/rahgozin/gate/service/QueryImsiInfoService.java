package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryImsiinfo.request.*;
import com.rahgozin.gate.dto.queryImsiinfo.response.QueryImsiResEnvelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class QueryImsiInfoService {
    private final RestTemplate queryImsiRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryImsiInfoService(@Qualifier("queryImsiRestTemplate") RestTemplate queryImsiRestTemplate, ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryImsiRestTemplate = queryImsiRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public QueryImsiResEnvelope queryImsiInfo(String phoneNumber) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        ImsiEnvelopeReq imsiEnvelopeReq = new ImsiEnvelopeReq();
        QueryImsiBody queryImsiBody = new QueryImsiBody();
        QueryImsiInfoReq queryImsiInfoReq = new QueryImsiInfoReq();
        QueryImsiInfoReqMsg queryImsiInfoReqMsg = new QueryImsiInfoReqMsg();
        ImsiReqHeader imsiReqHeader = new ImsiReqHeader();

        imsiReqHeader.getVersion().setVersion(applicationProperties.getQueryImsiInfoConnection().getVersion());
        imsiReqHeader.getBusinessCode().setBusinessCode(applicationProperties.getQueryImsiInfoConnection().getBusinessCode());
        imsiReqHeader.getMessageSeq().setMessageSeq("714_20180818_134245_123256227890");
        imsiReqHeader.getChannelType().setChannelType(applicationProperties.getQueryImsiInfoConnection().getChannelType());
        imsiReqHeader.getImsiOwnershipInfoReq().setBeId(applicationProperties.getQueryImsiInfoConnection().getBeId());
        imsiReqHeader.getImsiOwnershipInfoReq().setRegionId(applicationProperties.getQueryImsiInfoConnection().getRegionId());
        imsiReqHeader.getImsiAccessSecurityReq().setLoginSystemCode(applicationProperties.getQueryImsiInfoConnection().getLoginSystemCode());
        imsiReqHeader.getImsiAccessSecurityReq().setPassword(applicationProperties.getQueryImsiInfoConnection().getPassword());
        imsiReqHeader.getImsiOperatorInfoReq().setOrgId(applicationProperties.getQueryImsiInfoConnection().getOrgId());
        imsiReqHeader.getImsiOperatorInfoReq().setOperatorId(applicationProperties.getQueryImsiInfoConnection().getOperatorId());

        queryImsiInfoReq.setMobileNumber(phoneNumber);
        queryImsiInfoReqMsg.setImsiReqHeader(imsiReqHeader);
        queryImsiInfoReqMsg.setImsiQueryIMSIInfoReq(queryImsiInfoReq);
        queryImsiBody.setQueryImsiInfoReqMsg(queryImsiInfoReqMsg);
        imsiEnvelopeReq.setImsiBodyRequest(queryImsiBody);

        HttpHeaders imsiHeaders = new HttpHeaders();
        imsiHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getImsiToken());
        imsiHeaders.add("soapaction", "QueryIMSIInfo");
        imsiHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");
        HttpEntity<String> queryImsiInfoResBody = null;
        try {
            queryImsiInfoResBody = new HttpEntity<>(xmlMapper.writeValueAsString(imsiEnvelopeReq), imsiHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Map body = queryImsiRestTemplate.postForEntity(applicationProperties.getQueryImsiInfoConnection().getBaseUrl(),
                queryImsiInfoResBody, Map.class).getBody();
        return new ObjectMapper().convertValue(body, QueryImsiResEnvelope.class);
    }
}