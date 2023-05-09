package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.querySubscriberNew.queryCust.request.*;
import com.rahgozin.gate.dto.querySubscriberNew.queryCust.response.*;
import org.json.Cookie;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewQueryCustService {
    private final RestTemplate querySubRestTemplate;
    public final XmlMapper xmlMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;
    private final QueryEntityIdService entityIdService;


    public NewQueryCustService(@Qualifier("querySubRestTemplate") RestTemplate querySubRestTemplate, XmlMapper xmlMapper, ApplicationProperties applicationProperties, TokenService tokenService, QueryEntityIdService entityIdService) {
        this.querySubRestTemplate = querySubRestTemplate;
        this.xmlMapper = xmlMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
        this.entityIdService = entityIdService;
    }
    public Object newQueryCustomer(Pageable pageable,String phoneNumber) {
        JSONObject customerIdJSONObj = XML.toJSONObject(String.valueOf(entityIdService.entityId(phoneNumber))); // ino fix konam, string nemide.
        JSONArray entityInfo = null;
        JSONObject customerId = null;
        String customerIdValue = "";
        entityInfo = (JSONArray) customerIdJSONObj.get("entityInfo");
        if (entityInfo.getJSONObject(0).equals("C")) {
            customerId = entityInfo.getJSONObject(1);
            customerIdValue = customerId.getString("entityId");
        }
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
        querySubReqHeader.getAccessSecurity().setPassword("i3qsntAtJug0YxeTIr+7Ij0gR9Dgz02gTwWd3E9uhfI");
        querySubReqHeader.getOperatorInfo().setOperatorId(applicationProperties.getQuerySubscriberConnection().getOperatorId());

        querySubscriberReq.getIncludeObjRequest().setIncludeOfferFlag(applicationProperties.getQuerySubscriberConnection().getIncludeOfferFlag());
        querySubscriberReq.getIncludeObjRequest().setIncludeHistoryFlag(applicationProperties.getQuerySubscriberConnection().getIncludeHistoryFlag());
        querySubscriberReq.getIncludeObjRequest().setIncludeProdFlag(applicationProperties.getQuerySubscriberConnection().getIncludeProdFlag());
        querySubscriberReq.getIncludeObjRequest().setIncludeContractFlag(applicationProperties.getQuerySubscriberConnection().getIncludeContractFlag());
        querySubscriberReq.getPageQueryRequest().setPageSize(pageable.getPageSize());
        querySubscriberReq.getPageQueryRequest().setStartNum((int) pageable.getOffset());
        querySubscriberReq.getPageQueryRequest().setTotalNum(pageable.getPageSize());
        querySubscriberReq.getQueryObjRequest().getCustAccessCodeReq().setCustomerId(customerIdValue);
        querySubscriberReqMsg.setRequestHeader(querySubReqHeader);

        querySubscriberReqMsg.setQuerySubscriberRequestList(querySubscriberReq);
        querySubBodyReq.setQuerySubscriberReqMsg(querySubscriberReqMsg);
        querySubEnvelopeReq.setBody(querySubBodyReq);
        HttpHeaders querySubHeaders = new HttpHeaders();
        querySubHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getSubscriberToken());
        querySubHeaders.add("soapaction", "QuerySubscriber");
        querySubHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> queryCustResBody = null;
        try {
            queryCustResBody = new HttpEntity<>(xmlMapper.writeValueAsString(querySubEnvelopeReq), querySubHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return querySubRestTemplate.postForEntity(applicationProperties.getQuerySubscriberConnection().getBaseUrl(), queryCustResBody, QuerySubEnvelopeRes.class).getBody();
    }
}
