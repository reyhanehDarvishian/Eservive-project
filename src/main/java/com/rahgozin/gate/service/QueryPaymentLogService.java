package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryPaymentLog.request.*;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QueryPaymentLogService {
    private final RestTemplate queryPaymentLogRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryPaymentLogService(@Qualifier("queryPaymentLogRestTemplate") RestTemplate queryPaymentLogRestTemplate,
                                  ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryPaymentLogRestTemplate = queryPaymentLogRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public String queryPaymentLog() {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        QueryPaymentLogEnvelope queryPaymentLogEnvelope = new QueryPaymentLogEnvelope();
        QueryPaymentLogBody queryPaymentLogBody = new QueryPaymentLogBody();
        QueryPaymentLogReqMsg queryPaymentLogReqMsg = new QueryPaymentLogReqMsg();
        QueryPaymentLogRequestHeader queryPaymentLogRequestHeader = new QueryPaymentLogRequestHeader();
        QueryPaymentLogRequest queryPaymentLogRequest = new QueryPaymentLogRequest();
        queryPaymentLogRequestHeader.getVersion().setVersion(applicationProperties.getQueryPaymentLogConnection().getVersion());
        queryPaymentLogRequestHeader.getBusinessCode().setBusinessCode(applicationProperties.getQueryPaymentLogConnection().getBusinessCode());
        queryPaymentLogRequestHeader.getMessageSeq().setMessageSeq(applicationProperties.getQueryPaymentLogConnection().getMessageSeq());
        queryPaymentLogRequestHeader.getOwnershipInfo().setBeId(applicationProperties.getQueryPaymentLogConnection().getBeId());
        queryPaymentLogRequestHeader.getAccessSecurity().setLoginSystemCode(applicationProperties.getQueryPaymentLogConnection().getLoginSystemCode());
        queryPaymentLogRequestHeader.getAccessSecurity().setPassword(applicationProperties.getQueryPaymentLogConnection().getPassword());
        queryPaymentLogRequestHeader.getOperatorInfo().setOperatorId(applicationProperties.getQueryPaymentLogConnection().getOperatorId());
        queryPaymentLogRequestHeader.getOperatorInfo().setChannelId(applicationProperties.getQueryPaymentLogConnection().getChannelId());
        queryPaymentLogReqMsg.setQueryPaymentLogRequestHeader(queryPaymentLogRequestHeader);
        queryPaymentLogRequest.getAcctAccessCode().getPrimaryIdentity().setPrimaryIdentity(applicationProperties.getQueryPaymentLogConnection().getPrimaryIdentity());
        queryPaymentLogRequest.setTotalRowNum(applicationProperties.getQueryPaymentLogConnection().getTotalRowNum());
        queryPaymentLogRequest.setBeginRowNum(applicationProperties.getQueryPaymentLogConnection().getBeginRowNum());
        queryPaymentLogRequest.setFetchRowNum(applicationProperties.getQueryPaymentLogConnection().getFetchRowNum());
        queryPaymentLogRequest.setStartTime(applicationProperties.getQueryPaymentLogConnection().getStartTime());
        queryPaymentLogRequest.setEndTime(applicationProperties.getQueryPaymentLogConnection().getEndTime());
        queryPaymentLogReqMsg.setQueryPaymentLogRequest(queryPaymentLogRequest);

        queryPaymentLogBody.setQueryPaymentLogReqMsg(queryPaymentLogReqMsg);
        queryPaymentLogEnvelope.setQueryPaymentLogBody(queryPaymentLogBody);
        HttpHeaders queryPaymentLogHeaders = new HttpHeaders();
        queryPaymentLogHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getQueryPaymentLogToken());
        queryPaymentLogHeaders.add("soapaction", "QueryPaymentLog");
        queryPaymentLogHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> queryPaymentLogResBody = null;
        try {
            queryPaymentLogResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(queryPaymentLogEnvelope), queryPaymentLogHeaders);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        JSONObject queryPaymentLogResponse = XML.toJSONObject(queryPaymentLogRestTemplate.postForEntity(applicationProperties.getQueryPaymentLogConnection().getBaseUrl(), queryPaymentLogResBody, String.class).getBody());
        return queryPaymentLogResponse.toString(4);
    }
}
