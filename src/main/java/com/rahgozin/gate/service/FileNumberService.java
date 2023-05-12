package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryAccountInfo.request.*;
import com.rahgozin.gate.dto.queryAccountInfo.response.QueryAccountInfoResEnvelope;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FileNumberService {
    private final RestTemplate fileNumberRestTemplate;
    public final XmlMapper xmlMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;
    private final QueryEntityIdService entityIdService;

    public FileNumberService(@Qualifier("fileNumberRestTemplate") RestTemplate fileNumberRestTemplate, XmlMapper xmlMapper, ApplicationProperties applicationProperties, TokenService tokenService, QueryEntityIdService entityIdService) {
        this.fileNumberRestTemplate = fileNumberRestTemplate;
        this.xmlMapper = xmlMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
        this.entityIdService = entityIdService;
    }

    public String getFileNumber(String phoneNumber) {
        String accountId = (entityIdService.entityId(phoneNumber).getBody().getQueryEntityIdRspMsg().getQueryEntityIdResponse().getEntityInfos().get(0).getEntityId());
        QueryAccountInfoEnvelope queryAccountInfoEnvelope = new QueryAccountInfoEnvelope();
        QueryAccountInfoBody queryAccountInfoBody = new QueryAccountInfoBody();
        QueryAccountInfoReqMsg queryAccountInfoReqMsg = new QueryAccountInfoReqMsg();
        QueryAccountInfoRequestHeader queryAccountInfoRequestHeader = new QueryAccountInfoRequestHeader();
        QueryAccountInfoRequest queryAccountInfoRequest = new QueryAccountInfoRequest();

        queryAccountInfoRequestHeader.setVersion(applicationProperties.getQueryAccountInfoConnection().getVersion());
        queryAccountInfoRequestHeader.setBusinessCode(applicationProperties.getQueryAccountInfoConnection().getBusinessCode());
        queryAccountInfoRequestHeader.setMessageSeq(applicationProperties.getQueryAccountInfoConnection().getMessageSeq());
        queryAccountInfoRequestHeader.getQueryAccountInfoOwnershipInfo().setBeId(applicationProperties.getQueryAccountInfoConnection().getBeId());
        queryAccountInfoRequestHeader.getQueryAccountInfoOwnershipInfo().setRegionId(applicationProperties.getQueryAccountInfoConnection().getRegionId());
        queryAccountInfoRequestHeader.getQueryAccountInfoAccessSecurity().setLoginSystemCode(applicationProperties.getQueryAccountInfoConnection().getLoginSystemCode());
        queryAccountInfoRequestHeader.getQueryAccountInfoAccessSecurity().setPassword(applicationProperties.getQueryAccountInfoConnection().getPassword());
        queryAccountInfoRequestHeader.getQueryAccountInfoOperatorInfo().setOperatorId(applicationProperties.getQueryAccountInfoConnection().getOperatorId());
        queryAccountInfoRequestHeader.getQueryAccountInfoOperatorInfo().setOrgId(applicationProperties.getQueryAccountInfoConnection().getOrgId());
        queryAccountInfoRequestHeader.setChannelType(applicationProperties.getQueryAccountInfoConnection().getChannelType());
        queryAccountInfoRequest.getQueryAccountInfoQueryObj().getQueryAccountInfoAcctAccessCode().setAccountId(accountId);
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeAcctBillCycleFlag(applicationProperties.getQueryAccountInfoConnection().getIncludeAcctBillCycleFlag());
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeAcctCreditLimitFlag(applicationProperties.getQueryAccountInfoConnection().getIncludeAcctCreditLimitFlag());
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeDeactivationFlag(applicationProperties.getQueryAccountInfoConnection().getIncludeDeactivationFlag());
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludePaymentChannelFlag(applicationProperties.getQueryAccountInfoConnection().getIncludePaymentChannelFlag());
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeContactPersonFlag(applicationProperties.getQueryAccountInfoConnection().getIncludeContactPersonFlag());
        queryAccountInfoRequest.getQueryAccountInfoIncludeObj().setIncludeBillMediumFlag(applicationProperties.getQueryAccountInfoConnection().getIncludeBillMediumFlag());
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
        return fileNumberRestTemplate.postForEntity(applicationProperties.getQueryAccountInfoConnection().getBaseUrl(), queryAccountInfoResBody, QueryAccountInfoResEnvelope.class).getBody().getQueryAccountInfoResBody().getQueryAccountInfoRspMsg().getQueryAccountInfoResponse().getAccountInfo().getAccountBasicInfo().getAcctCode();
    }
}
