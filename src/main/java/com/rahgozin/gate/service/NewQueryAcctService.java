package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryCustomBillingInfo.response.QueryCustomBillingInfoResEnvelope;
import com.rahgozin.gate.dto.querySub.queryAccount.request.*;
import com.rahgozin.gate.dto.querySub.queryAccount.response.QuerySubEnvelopeRes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class NewQueryAcctService {
    private final RestTemplate querySubRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;
    private final QueryEntityIdService entityIdService;

    public NewQueryAcctService(@Qualifier("querySubRestTemplate") RestTemplate querySubRestTemplate, ApplicationProperties applicationProperties, TokenService tokenService, QueryEntityIdService entityIdService) {
        this.querySubRestTemplate = querySubRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
        this.entityIdService = entityIdService;
    }

    public QuerySubEnvelopeRes newQueryAccount(Pageable pageable, String phoneNumber) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String accountId = (entityIdService.entityId(phoneNumber).getBody().getQueryEntityIdRspMsg().getQueryEntityIdResponse().getEntityInfos().get(0).getEntityId());
        QuerySubEnvelopeReq querySubEnvelopeReq = new QuerySubEnvelopeReq();
        QuerySubBodyReq querySubBodyReq = new QuerySubBodyReq();
        QuerySubscriberReq querySubscriberReq = new QuerySubscriberReq();
        QuerySubscriberReqMsg querySubscriberReqMsg = new QuerySubscriberReqMsg();
        QuerySubReqHeader querySubReqHeader = new QuerySubReqHeader();

        querySubReqHeader.setVersion(applicationProperties.getQuerySubscriberConnection().getVersion());
        querySubReqHeader.setBusinessCode(applicationProperties.getQuerySubscriberConnection().getBusinessCode());
        querySubReqHeader.setMessageSeq("BHS_TEST_${=((int)(Math.random()*(9999999-1000000)+1000000))}");
        querySubReqHeader.getOwnershipInfo().setBeId(applicationProperties.getQuerySubscriberConnection().getBeId());
        querySubReqHeader.getOwnershipInfo().setRegionId(applicationProperties.getQuerySubscriberConnection().getRegionId());
        querySubReqHeader.getAccessSecurity().setLoginSystemCode(applicationProperties.getQuerySubscriberConnection().getLoginSystemCode());
        querySubReqHeader.getAccessSecurity().setPassword(applicationProperties.getQuerySubscriberConnection().getPassword());
        querySubReqHeader.getOperatorInfo().setOperatorId(applicationProperties.getQuerySubscriberConnection().getOperatorId());

        querySubscriberReq.getIncludeObjRequest().setIncludeOfferFlag(applicationProperties.getQuerySubscriberConnection().getIncludeOfferFlag());
        querySubscriberReq.getIncludeObjRequest().setIncludeHistoryFlag(applicationProperties.getQuerySubscriberConnection().getIncludeHistoryFlag());
        querySubscriberReq.getIncludeObjRequest().setIncludeProdFlag(applicationProperties.getQuerySubscriberConnection().getIncludeProdFlag());
        querySubscriberReq.getIncludeObjRequest().setIncludeContractFlag(applicationProperties.getQuerySubscriberConnection().getIncludeContractFlag());
        querySubscriberReq.getPageQueryRequest().setPageSize(pageable.getPageSize());
        querySubscriberReq.getPageQueryRequest().setStartNum((int) pageable.getOffset());
        querySubscriberReq.getPageQueryRequest().setTotalNum(pageable.getPageSize());
        querySubscriberReq.getQueryObjRequest().getAcctAccessCodeReq().setAccountId(accountId);
        querySubscriberReqMsg.setRequestHeader(querySubReqHeader);

        querySubscriberReqMsg.setQuerySubscriberRequestList(querySubscriberReq);
        querySubBodyReq.setQuerySubscriberReqMsg(querySubscriberReqMsg);
        querySubEnvelopeReq.setBody(querySubBodyReq);
        HttpHeaders querySubHeaders = new HttpHeaders();
        querySubHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getSubscriberToken());
        querySubHeaders.add("soapaction", "QuerySubscriber");
        querySubHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> querySubResBody = null;
        try {
            querySubResBody = new HttpEntity<>(xmlMapper.writeValueAsString(querySubEnvelopeReq), querySubHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return querySubRestTemplate.postForEntity(applicationProperties.getQuerySubscriberConnection().getBaseUrl(), querySubResBody, QuerySubEnvelopeRes.class).getBody();

    }
}
