package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryAccountInfo.request.*;
import com.rahgozin.gate.dto.queryAccountInfo.response.*;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class QueryAccountInfoService {
    private final RestTemplate queryAccountInfoRestTemplate;

    public final XmlMapper xmlMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryAccountInfoService(@Qualifier("queryAccountInfoRestTemplate") RestTemplate queryAccountInfoRestTemplate,
                                   XmlMapper xmlMapper, ApplicationProperties applicationProperties,
                                   TokenService tokenService) {
        this.queryAccountInfoRestTemplate = queryAccountInfoRestTemplate;
        this.xmlMapper = xmlMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public QueryAccountInfoResEnvelope queryAccountInfo() {
        QueryAccountInfoEnvelope queryAccountInfoEnvelope = new QueryAccountInfoEnvelope();
        QueryAccountInfoBody queryAccountInfoBody = new QueryAccountInfoBody();
        QueryAccountInfoReqMsg queryAccountInfoReqMsg = new QueryAccountInfoReqMsg();
        QueryAccountInfoRequestHeader queryAccountInfoRequestHeader = new QueryAccountInfoRequestHeader();
        QueryAccountInfoRequest queryAccountInfoRequest = new QueryAccountInfoRequest();

        queryAccountInfoRequestHeader.setVersion("5.0");
        queryAccountInfoRequestHeader.setBusinessCode("queryAccountInfo");
        queryAccountInfoRequestHeader.setMessageSeq("123658744");
        queryAccountInfoRequestHeader.getQueryAccountInfoOwnershipInfo().setBeId("10101");
        queryAccountInfoRequestHeader.getQueryAccountInfoOwnershipInfo().setRegionId("10101");
        queryAccountInfoRequestHeader.getQueryAccountInfoAccessSecurity().setLoginSystemCode("714");
        queryAccountInfoRequestHeader.getQueryAccountInfoAccessSecurity().setPassword("i3qsntAtJug0YxeTIr+7Ij0gR9Dgz02gTwWd3E9uhfI=");
        queryAccountInfoRequestHeader.getQueryAccountInfoOperatorInfo().setOperatorId("714");
        queryAccountInfoRequestHeader.getQueryAccountInfoOperatorInfo().setOrgId("101");
        queryAccountInfoRequestHeader.setChannelType("714");

        queryAccountInfoRequest.getQueryAccountInfoQueryObj().getQueryAccountInfoAcctAccessCode().setAccountId("8611010003113018");
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeAcctBillCycleFlag("Y");
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeAcctCreditLimitFlag("Y");
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeDeactivationFlag("Y");
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludePaymentChannelFlag("Y");
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeContactPersonFlag("Y");
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeBillMediumFlag("Y");

        queryAccountInfoReqMsg.setQueryAccountInfoRequest(queryAccountInfoRequest);
        queryAccountInfoReqMsg.setQueryAccountInfoRequestHeader(queryAccountInfoRequestHeader);
        queryAccountInfoBody.setQueryAccountInfoReqMsg(queryAccountInfoReqMsg);
        queryAccountInfoEnvelope.setQueryAccountInfoBody(queryAccountInfoBody);

        HttpHeaders queryAccountInfoHeaders = new HttpHeaders();
        queryAccountInfoHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getQueryAccountInfo());
        queryAccountInfoHeaders.add("soapaction", "QueryAccountInfo");
        queryAccountInfoHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> queryAccountInfoResBody = null;
        try {
            queryAccountInfoResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(queryAccountInfoEnvelope), queryAccountInfoHeaders);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Map<String,String> queryAccountInfoResponse = queryAccountInfoRestTemplate.postForEntity("https://sandbox.mci.ir/api/v1/ecare/query-account-info-soap", queryAccountInfoResBody, Map.class).getBody();
        return new ObjectMapper().convertValue(queryAccountInfoResponse,QueryAccountInfoResEnvelope.class);
    }
}