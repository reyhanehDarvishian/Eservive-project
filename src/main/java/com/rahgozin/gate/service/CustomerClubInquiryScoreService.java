package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.customerClubInquiryScore.request.CustomerClubInquiryScoreBody;
import com.rahgozin.gate.dto.customerClubInquiryScore.request.CustomerClubInquiryScoreChannel;
import com.rahgozin.gate.dto.customerClubInquiryScore.request.CustomerClubInquiryScoreMobileNumber;
import com.rahgozin.gate.dto.customerClubInquiryScore.response.CustomerClubInquiryScoreResEnvelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CustomerClubInquiryScoreService {

    private final RestTemplate customerClubInquiryScoreRestTemplate;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;


    @Autowired
    public CustomerClubInquiryScoreService(@Qualifier("customerClubInquiryScoreRestTemplate") RestTemplate customerClubInquiryScoreRestTemplate,
                                           ApplicationProperties applicationProperties, TokenService tokenService) {
        this.customerClubInquiryScoreRestTemplate = customerClubInquiryScoreRestTemplate;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public CustomerClubInquiryScoreResEnvelope customerClubInquiryScore(String phoneNumber) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        CustomerClubInquiryScoreBody customerClubInquiryScoreBody = new CustomerClubInquiryScoreBody();
        CustomerClubInquiryScoreChannel customerClubInquiryScoreChannel = new CustomerClubInquiryScoreChannel();
        CustomerClubInquiryScoreMobileNumber customerClubInquiryScoreMobileNumber = new CustomerClubInquiryScoreMobileNumber();
        customerClubInquiryScoreChannel.setChannel(applicationProperties.getCustomerClubInquiryScoreConnection().getChannel());
        customerClubInquiryScoreMobileNumber.setMobileNumber(phoneNumber);
        customerClubInquiryScoreBody.setMobileNumber(customerClubInquiryScoreMobileNumber);
        customerClubInquiryScoreBody.setChannel(customerClubInquiryScoreChannel);

        HttpHeaders customerClubInquiryScoreHeaders = new HttpHeaders();
        customerClubInquiryScoreHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getCustomerClubInquiryScoreToken());
        customerClubInquiryScoreHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");

        HttpEntity<String> customerClubInquiryScoreResBody = null;
        try {
            customerClubInquiryScoreResBody =
                    new HttpEntity<>(objectMapper.writeValueAsString(customerClubInquiryScoreBody), customerClubInquiryScoreHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Map body = customerClubInquiryScoreRestTemplate.postForEntity(applicationProperties.getCustomerClubInquiryScoreConnection().getBaseUrl(), customerClubInquiryScoreResBody, Map.class).getBody();
        return objectMapper.convertValue(body,CustomerClubInquiryScoreResEnvelope.class);
    }
}