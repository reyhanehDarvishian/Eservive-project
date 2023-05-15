package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryCustomBillingInfo.response.QueryCustomBillingInfoResEnvelope;
import com.rahgozin.gate.dto.queryCustomerInfo.request.*;
import com.rahgozin.gate.dto.queryCustomerInfo.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class QueryCustomerInfoService {
    private final RestTemplate queryCustomerInfoRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryCustomerInfoService(@Qualifier("queryCustomerInfoRestTemplate")
                                    RestTemplate queryCustomerInfoRestTemplate,
                                    ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryCustomerInfoRestTemplate = queryCustomerInfoRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public QueryCustomerInfoResEnvelope queryCustomerInfo(String phoneNumber) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        QueryCustomerInfoEnvelope queryCustomerInfoEnvelope = new QueryCustomerInfoEnvelope();
        QueryCustomerInfoBody queryCustomerInfoBody = new QueryCustomerInfoBody();
        QueryCustomerInfoReqMsg queryCustomerInfoReqMsg = new QueryCustomerInfoReqMsg();
        QueryCustomerInfoRequestHeader queryCustomerInfoRequestHeader = new QueryCustomerInfoRequestHeader();
        QueryCustomerInfoRequest queryCustomerInfoRequest = new QueryCustomerInfoRequest();

//        requestHeader
        queryCustomerInfoRequestHeader.getVersion().setVersion(applicationProperties.getQueryCustomerInfoConnection().getVersion());
        queryCustomerInfoRequestHeader.getBusinessCode().setBusinessCode(applicationProperties.getQueryCustomerInfoConnection().getBusinessCode());
        queryCustomerInfoRequestHeader.getMessageSeq().setMessageSeq(applicationProperties.getQueryCustomerInfoConnection().getMessageSeq());
        queryCustomerInfoRequestHeader.getQueryCustomerInfoOwnershipInfo().setBeId(applicationProperties.getQueryCustomerInfoConnection().getBeId());
        queryCustomerInfoRequestHeader.getQueryCustomerInfoOwnershipInfo().setRegionId(applicationProperties.getQueryCustomerInfoConnection().getRegionId());
        queryCustomerInfoRequestHeader.getQueryCustomerInfoAccessSecurity().setLoginSystemCode(applicationProperties.getQueryCustomerInfoConnection().getLoginSystemCode());
        queryCustomerInfoRequestHeader.getQueryCustomerInfoAccessSecurity().setPassword(applicationProperties.getQueryCustomerInfoConnection().getPassword());
        queryCustomerInfoRequestHeader.getQueryCustomerInfoOperatorInfo().setOperatorId(applicationProperties.getQueryCustomerInfoConnection().getOperatorId());
        queryCustomerInfoRequestHeader.getQueryCustomerInfoOperatorInfo().setOrgId(applicationProperties.getQueryCustomerInfoConnection().getOrgId());
        queryCustomerInfoRequestHeader.getChannelType().setChannelType(applicationProperties.getQueryCustomerInfoConnection().getChannelType());

//        queryCustomerInfoRequest
        queryCustomerInfoRequest.getQueryObBean().getSubAccessCode().setPrimaryIdentity(phoneNumber);
        queryCustomerInfoRequest.getIncludeObj().setIncludeAddrFlag(applicationProperties.getQueryCustomerInfoConnection().getIncludeAddrFlag());

        queryCustomerInfoReqMsg.setQueryCustomerInfoRequestHeader(queryCustomerInfoRequestHeader);
        queryCustomerInfoReqMsg.setQueryCustomerInfoRequest(queryCustomerInfoRequest);

        queryCustomerInfoBody.setQueryCustomerInfoReqMsg(queryCustomerInfoReqMsg);
        queryCustomerInfoEnvelope.setQueryCustomerInfoBody(queryCustomerInfoBody);

        HttpHeaders queryCustomerInfoHeaders = new HttpHeaders();
        queryCustomerInfoHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getQueryCustomerInfo());
        queryCustomerInfoHeaders.add("soapaction", "QueryCustomerInfo");
        queryCustomerInfoHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> queryCustomerInfoResBody = null;
        try {
            queryCustomerInfoResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(queryCustomerInfoEnvelope), queryCustomerInfoHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return queryCustomerInfoRestTemplate.postForEntity(applicationProperties.getQueryCustomerInfoConnection().getBaseUrl(), queryCustomerInfoResBody, QueryCustomerInfoResEnvelope.class).getBody();
    }
}