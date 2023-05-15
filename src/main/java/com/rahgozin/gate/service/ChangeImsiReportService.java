package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.changeImsiReport.request.*;
import com.rahgozin.gate.dto.changeImsiReport.response.*;
import com.rahgozin.gate.dto.queryCustomBillingInfo.response.QueryCustomBillingInfoResEnvelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ChangeImsiReportService {
    private final RestTemplate queryChangeImsiReportRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public ChangeImsiReportService(@Qualifier("queryChangeImsiReportRestTemplate")
                                   RestTemplate queryChangeImsiReportRestTemplate,
                                   ApplicationProperties applicationProperties, TokenService tokenService) {
        this.queryChangeImsiReportRestTemplate = queryChangeImsiReportRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public ChangeImsiReportResEnvelope changeImsiReport(String phoneNumber) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        ChangeImsiReportEnvelope changeImsiReportEnvelope = new ChangeImsiReportEnvelope();
        ChangeImsiReportBody changeImsiReportBody = new ChangeImsiReportBody();
        ChangeIMSIReportReqMsg changeIMSIReportReqMsg = new ChangeIMSIReportReqMsg();
        ChangeImsiReportRequestHeader changeImsiReportRequestHeader = new ChangeImsiReportRequestHeader();
        ChangeImsiReportRequest changeImsiReportRequest = new ChangeImsiReportRequest();
        changeImsiReportRequestHeader.setVersion(applicationProperties.getChangeImsiReportConnection().getVersion());
        changeImsiReportRequestHeader.setBusinessCode(applicationProperties.getChangeImsiReportConnection().getBusinessCode());
        changeImsiReportRequestHeader.setMessageSeq(applicationProperties.getChangeImsiReportConnection().getMessageSeq());
        changeImsiReportRequestHeader.getOwnershipInfo().setBeId(applicationProperties.getChangeImsiReportConnection().getBeId());
        changeImsiReportRequestHeader.getOwnershipInfo().setRegionId(applicationProperties.getChangeImsiReportConnection().getRegionId());
        changeImsiReportRequestHeader.getAccessSecurity().setLoginSystemCode(applicationProperties.getChangeImsiReportConnection().getLoginSystemCode());
        changeImsiReportRequestHeader.getAccessSecurity().setPassword(applicationProperties.getChangeImsiReportConnection().getPassword());
        changeImsiReportRequestHeader.getOperatorInfo().setOperatorId(applicationProperties.getChangeImsiReportConnection().getOperatorId());
        changeImsiReportRequestHeader.setChannelType(applicationProperties.getChangeImsiReportConnection().getChannelType());
        changeIMSIReportReqMsg.setRequestHeader(changeImsiReportRequestHeader);
        changeImsiReportRequest.setServiceNumber(phoneNumber);
        changeImsiReportRequest.setStartDate(applicationProperties.getChangeImsiReportConnection().getStartDate());
        changeImsiReportRequest.setEndDate(applicationProperties.getChangeImsiReportConnection().getEndDate());
        changeIMSIReportReqMsg.setChangeImsiReportRequest(changeImsiReportRequest);
        changeImsiReportBody.setChangeIMSIReportReqMsg(changeIMSIReportReqMsg);
        changeImsiReportEnvelope.setChangeImsiReportBody(changeImsiReportBody);


        HttpHeaders changeImsiReportHeaders = new HttpHeaders();
        changeImsiReportHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getChangeImsiReportToken());
        changeImsiReportHeaders.add("soapaction", "ChangeIMSIReport");
        changeImsiReportHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> changeImsiReportResBody = null;
        try {
            changeImsiReportResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(changeImsiReportEnvelope), changeImsiReportHeaders);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return  queryChangeImsiReportRestTemplate.postForEntity(applicationProperties.getChangeImsiReportConnection().getBaseUrl(), changeImsiReportResBody, ChangeImsiReportResEnvelope.class).getBody();
    }
}
