package com.rahgozin.gate.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.customerClubInquiryScore.request.CustomerClubInquiryScoreBody;
import com.rahgozin.gate.dto.customerClubInquiryScore.request.CustomerClubInquiryScoreChannel;
import com.rahgozin.gate.dto.customerClubInquiryScore.request.CustomerClubInquiryScoreMobileNumber;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerClubInquiryScoreService {

    private final RestTemplate customerClubInquiryScoreRestTemplate;
    public final ObjectMapper objectMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;


    @Autowired
    public CustomerClubInquiryScoreService(@Qualifier("customerClubInquiryScoreRestTemplate") RestTemplate customerClubInquiryScoreRestTemplate, ObjectMapper objectMapper,
                                           ApplicationProperties applicationProperties, TokenService tokenService) {
        this.customerClubInquiryScoreRestTemplate = customerClubInquiryScoreRestTemplate;
        this.objectMapper = objectMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public String customerClubInquiryScore() {
        CustomerClubInquiryScoreBody customerClubInquiryScoreBody = new CustomerClubInquiryScoreBody();
        CustomerClubInquiryScoreChannel customerClubInquiryScoreChannel = new CustomerClubInquiryScoreChannel();
        CustomerClubInquiryScoreMobileNumber customerClubInquiryScoreMobileNumber = new CustomerClubInquiryScoreMobileNumber();
        customerClubInquiryScoreChannel.setChannel(applicationProperties.getCustomerClubInquiryScoreConnection().getChannel());
        customerClubInquiryScoreMobileNumber.setMobileNumber(applicationProperties.getCustomerClubInquiryScoreConnection().getMobileNumber());
        customerClubInquiryScoreBody.setMobileNumber(customerClubInquiryScoreMobileNumber);
        customerClubInquiryScoreBody.setChannel(customerClubInquiryScoreChannel);

        HttpHeaders customerClubInquiryScoreHeaders = new HttpHeaders();
        customerClubInquiryScoreHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getCustomerClubInquiryScoreToken());
        customerClubInquiryScoreHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");

        HttpEntity<String> customerClubInquiryScoreResBody = null;
        try {
            customerClubInquiryScoreResBody = new HttpEntity<>(objectMapper.writeValueAsString(customerClubInquiryScoreBody), customerClubInquiryScoreHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return customerClubInquiryScoreRestTemplate.postForEntity(applicationProperties.getCustomerClubInquiryScoreConnection().getBaseUrl(), customerClubInquiryScoreResBody, String.class).getBody();
    }
}
