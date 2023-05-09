package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryBalance.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class QueryBalanceService {
    private final RestTemplate queryBalanceRestTemplate;
    public final XmlMapper xmlMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;


    @Autowired
    public QueryBalanceService(@Qualifier("queryBalanceRestTemplate") RestTemplate queryBalanceRestTemplate, XmlMapper xmlMapper, ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryBalanceRestTemplate = queryBalanceRestTemplate;
        this.xmlMapper = xmlMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public Map<String, String> queryBalanceService() {
        QueryBalanceEnvelopeReq queryBalanceEnvelopeReq = new QueryBalanceEnvelopeReq();
        QueryBalanceBody queryBalanceBody = new QueryBalanceBody();
        QueryBalanceRequestMsg queryBalanceRequestMsg = new QueryBalanceRequestMsg();
        QueryBalanceReqHeader queryBalanceReqHeader = new QueryBalanceReqHeader();
        QueryBalanceRequest queryBalanceRequest = new QueryBalanceRequest();

        queryBalanceReqHeader.getVersion().setVersion(applicationProperties.getQueryBalanceConnection().getVersion());
        queryBalanceReqHeader.getBusinessCode().setBusinessCode(applicationProperties.getQueryBalanceConnection()
                .getBusinessCode());
        queryBalanceReqHeader.getMessageSeq().setMessageSeq(applicationProperties.getQueryBalanceConnection()
                .getMessageSeq());
        queryBalanceReqHeader.getOwnershipInfo().setBeId(applicationProperties.getQueryBalanceConnection().getBeId());
        queryBalanceReqHeader.getAccessSecurityReq().setLoginSystemCode(applicationProperties.getQueryBalanceConnection()
                .getLoginSystemCode());
        queryBalanceReqHeader.getAccessSecurityReq().setPassword(applicationProperties.getQueryBalanceConnection()
                .getPassword());
        queryBalanceReqHeader.getOperatorInfoReq().setOperatorId(applicationProperties.getQueryBalanceConnection()
                .getOperatorID());
        queryBalanceReqHeader.getOperatorInfoReq().setChannelId(applicationProperties.getQueryBalanceConnection()
                .getChannelID());

        queryBalanceRequest.getQueryObj().getSubAccessCode().getPrimaryIdentity()
                .setPrimaryIdentity(applicationProperties.getQueryBalanceConnection().getPrimaryIdentity());

        queryBalanceRequestMsg.setQueryBalanceReqHeader(queryBalanceReqHeader);
        queryBalanceRequestMsg.setQueryBalanceRequest(queryBalanceRequest);
        queryBalanceBody.setQueryBalanceRequestMsg(queryBalanceRequestMsg);
        queryBalanceEnvelopeReq.setBody(queryBalanceBody);

        HttpHeaders queryBalanceHeaders = new HttpHeaders();
        queryBalanceHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getQueryBalanceToken());
        queryBalanceHeaders.add("soapaction", "QueryBalance");
        queryBalanceHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> queryBalanceResBody = null;
        try {
            queryBalanceResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(queryBalanceEnvelopeReq), queryBalanceHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return queryBalanceRestTemplate.postForEntity(applicationProperties.getQueryBalanceConnection().getBaseUrl(), queryBalanceResBody, Map.class).getBody();
    }

}
