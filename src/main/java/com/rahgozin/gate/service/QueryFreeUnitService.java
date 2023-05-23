package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.queryFreeUnit.request.*;
import com.rahgozin.gate.dto.queryFreeUnit.response.FreeUnitItem;
import com.rahgozin.gate.dto.queryFreeUnit.response.QueryFreeUnitEnvelopeRes;
import com.rahgozin.gate.util.UnitUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QueryFreeUnitService {

    private final RestTemplate queryFreeUnitRestTemplate;
    public final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public QueryFreeUnitService(@Qualifier("queryFreeUnitRestTemplate") RestTemplate queryFreeUnitRestTemplate, ApplicationProperties applicationProperties, TokenService tokenService) {
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
        queryFreeUnitRequestHeader.getQueryFreeUnitAccessSecurity().setPassword("kQwkaEwWU0gravIASYtwcf0XZq2BP0ahtPj/DKXeZyE=");
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

        Long totalByteInit = 0l;
        Long totalByteUnused = 0l;
        Long totalCallInit = 0l;
        Long totalCallUnused = 0l;
        QueryFreeUnitEnvelopeRes body = queryFreeUnitRestTemplate.postForEntity("https://api.mci.ir/api/v1/ecare/query-free-unit", queryFreeUnitResBody, QueryFreeUnitEnvelopeRes.class).getBody();

        for (FreeUnitItem item : body.getBody().getQueryFreeUnitResultMsg().getQueryFreeUnitResult().getFreeUnitItems()) {
            if (item.getMeasureUnitName().equals("Bytes")) {
                totalByteInit = Long.parseLong(item.getTotalInitialAmount()) + totalByteInit;
                totalByteUnused = Long.parseLong(item.getTotalUnusedAmount()) + totalByteUnused;
                item.setUnitInitTitle(UnitUtil.humanReadableByteCountBin(Long.parseLong(item.getTotalInitialAmount())));
                item.setUnitUnusedTitle(UnitUtil.humanReadableByteCountBin(Long.parseLong(item.getTotalUnusedAmount())));
            }
            else if (item.getFreeUnitTypeName().equals("Onnet call")) {
                totalCallInit = Long.parseLong(item.getTotalInitialAmount()) + totalCallInit;
                totalCallUnused = Long.parseLong(item.getTotalUnusedAmount()) + totalCallUnused;
                item.setUnitInitTitle(UnitUtil.humanReadableSecondCountBin(Long.parseLong(item.getTotalInitialAmount())));
                item.setUnitUnusedTitle(UnitUtil.humanReadableSecondCountBin(Long.parseLong(item.getTotalUnusedAmount())));
            }
            item.setDescription(applicationProperties.getDesc().getOrDefault(item.getFreeUnitType(), "none"));
        }
        body.getBody().getQueryFreeUnitResultMsg().getQueryFreeUnitResult().setTotalInitBytes(UnitUtil.humanReadableByteCountBin(totalByteInit));
        body.getBody().getQueryFreeUnitResultMsg().getQueryFreeUnitResult().setTotalUsedBytes(UnitUtil.humanReadableByteCountBin(totalByteUnused));
        return body;
    }
}