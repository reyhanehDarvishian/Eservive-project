package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.changeSubscriberIdentity.request.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ChangeSubIdentityService {
    private final RestTemplate changeSubIdentityRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    public ChangeSubIdentityService(@Qualifier("changeSubIdentityRestTemplate")
                                            RestTemplate changeSubIdentityRestTemplate,
                                    ApplicationProperties applicationProperties,
                                    TokenService tokenService) {
        this.changeSubIdentityRestTemplate = changeSubIdentityRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public Map changeSubIdentity() {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        ChangeSubIdentityMainBody changeSubIdentityMainBody = new ChangeSubIdentityMainBody();

        ChangeSubIdentityEnvelopeReq changeSubIdentityEnvelopeReq = new ChangeSubIdentityEnvelopeReq();

        ChangeSubIdentityBody changeSubIdentityBody = new ChangeSubIdentityBody();

        ChangeSubscriberIdentityReqMsg changeSubscriberIdentityReqMsg = new ChangeSubscriberIdentityReqMsg();

        ChangeSubIdentityRequestHeader changeSubIdentityRequestHeader = new ChangeSubIdentityRequestHeader();
        ChangeSubscriberIdentityRequest changeSubscriberIdentityRequest = new ChangeSubscriberIdentityRequest();
        List<ChangeSubIdentityDelSubIdentity> changeSubIdentityDelSubIdentity = new ArrayList<>();
        List<ChangeSubIdentityAddSubIdentity> changeSubIdentityAddSubIdentity = new ArrayList<>();


        ChangeSubIdentityOwnershipInfoReq changeSubIdentityOwnershipInfoReq = new ChangeSubIdentityOwnershipInfoReq();
        ChangeSubIdentityAccessSecurityReq changeSubIdentityAccessSecurityReq = new ChangeSubIdentityAccessSecurityReq();
        ChangeSubIdentityOperatorInfoReq changeSubIdentityOperatorInfoReq = new ChangeSubIdentityOperatorInfoReq();
        ChangeSubIdentitySubAccessCode changeSubIdentitySubAccessCode = new ChangeSubIdentitySubAccessCode();

        //requestHeader
        changeSubIdentityRequestHeader.setVersion(applicationProperties.getChangeSubIdentityConnection().getVersion());
        changeSubIdentityRequestHeader.setBusinessCode(
                applicationProperties.getChangeSubIdentityConnection().getBusinessCode());
        changeSubIdentityRequestHeader.setMessageSeq(
                applicationProperties.getChangeSubIdentityConnection().getMessageSeq());
        changeSubIdentityRequestHeader.getChangeSubIdentityOwnershipInfoReq().setBeId(
                applicationProperties.getChangeSubIdentityConnection().getBeId());
        changeSubIdentityRequestHeader.getChangeSubIdentityOwnershipInfoReq().setRegionId(
                applicationProperties.getChangeSubIdentityConnection().getRegionId());
        changeSubIdentityRequestHeader.getChangeSubIdentityAccessSecurityReq().setLoginSystemCode(
                applicationProperties.getChangeSubIdentityConnection().getLoginSystemCode());
        changeSubIdentityRequestHeader.getChangeSubIdentityAccessSecurityReq().setPassword(
                applicationProperties.getChangeSubIdentityConnection().getPassword());
        changeSubIdentityRequestHeader.getChangeSubIdentityOperatorInfoReq().setOperatorId(
                applicationProperties.getChangeSubIdentityConnection().getOperatorId());
        changeSubIdentityRequestHeader.getChangeSubIdentityOperatorInfoReq().setOrgId(
                applicationProperties.getChangeSubIdentityConnection().getOrgId());
        changeSubIdentityRequestHeader.setChannelType(
                applicationProperties.getChangeSubIdentityConnection().getChannelType());

        //changeSubscriberIdentityRequest
        changeSubscriberIdentityRequest.getChangeSubIdentitySubAccessCode().setPrimaryIdentity(
                applicationProperties.getChangeSubIdentityConnection().getPrimaryIdentity());
        changeSubIdentityDelSubIdentity.add(
                new ChangeSubIdentityDelSubIdentity("2", "432113938116435"));
        changeSubIdentityDelSubIdentity.add(
                new ChangeSubIdentityDelSubIdentity("3", "8998113900038116435"));
        changeSubIdentityDelSubIdentity.add(
                new ChangeSubIdentityDelSubIdentity("3", "8998113900038116435"));
        changeSubIdentityAddSubIdentity.add(
                new ChangeSubIdentityAddSubIdentity("2", "432113901015951"));
        changeSubIdentityAddSubIdentity.add(
                new ChangeSubIdentityAddSubIdentity("3", "8998113900001015951"));
        changeSubscriberIdentityRequest.setChangeSubIdentityAddSubIdentity(changeSubIdentityAddSubIdentity);
        changeSubscriberIdentityRequest.setChangeSubIdentityDelSubIdentity(changeSubIdentityDelSubIdentity);

        changeSubscriberIdentityReqMsg.setChangeSubscriberIdentityRequest(changeSubscriberIdentityRequest);
        changeSubscriberIdentityReqMsg.setChangeSubIdentityRequestHeader(changeSubIdentityRequestHeader);

        changeSubIdentityBody.setChangeSubscriberIdentityReqMsg(changeSubscriberIdentityReqMsg);
        changeSubIdentityEnvelopeReq.setChangeSubIdentityBody(changeSubIdentityBody);
        changeSubIdentityMainBody.setChangeSubIdentityEnvelopeReq(changeSubIdentityEnvelopeReq);

        HttpHeaders changeSubIdentityHeaders = new HttpHeaders();
        changeSubIdentityHeaders.add(HttpHeaders.AUTHORIZATION, "");
        changeSubIdentityHeaders.add(HttpHeaders.CONTENT_TYPE, "application/xml");

        HttpEntity<String> changeSubIdentityResBody = null;
        try {
            changeSubIdentityResBody =
                    new HttpEntity<>(xmlMapper.writeValueAsString(changeSubIdentityMainBody), changeSubIdentityHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return changeSubIdentityRestTemplate
                .postForEntity(applicationProperties.getChangeSubIdentityConnection().getBaseUrl(),
                        changeSubIdentityResBody, Map.class).getBody();
    }
}