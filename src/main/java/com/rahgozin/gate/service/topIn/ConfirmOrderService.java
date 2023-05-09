package com.rahgozin.gate.service.topIn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.topIn.confirmOrder.request.ConfirmOrder;
import com.rahgozin.gate.service.TokenService;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConfirmOrderService {
    private final RestTemplate confirmOrderRestTemplate;
    public final ObjectMapper objectMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;

    @Autowired
    public ConfirmOrderService(@Qualifier("confirmOrderRestTemplate") RestTemplate confirmOrderRestTemplate, ObjectMapper objectMapper, ApplicationProperties applicationProperties, TokenService tokenService) {
        this.confirmOrderRestTemplate = confirmOrderRestTemplate;
        this.objectMapper = objectMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
    }

    public String confirmOrderService(String username, String password, String token) {
        ConfirmOrder confirmOrder = new ConfirmOrder();
        confirmOrder.setOrderId(applicationProperties.getQueryConfirmOrderConnection().getOrderId());
        confirmOrder.setBankCode(applicationProperties.getQueryConfirmOrderConnection().getBankCode());
        confirmOrder.setCardNo(applicationProperties.getQueryConfirmOrderConnection().getCardNo());
        confirmOrder.setCardType(applicationProperties.getQueryConfirmOrderConnection().getCardType());
        confirmOrder.setRRN(applicationProperties.getQueryConfirmOrderConnection().getRRN());

        HttpHeaders confirmOrderHeaders = new HttpHeaders();
        confirmOrderHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getRequestHeaderAuthorization(username, password, token));
        confirmOrderHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");

        HttpEntity<String> confirmOrderResBody = null;
        try {
            confirmOrderResBody = new HttpEntity<>(objectMapper.writeValueAsString(confirmOrder), confirmOrderHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        JSONObject confirmOrderResponse = XML.toJSONObject(confirmOrderRestTemplate.postForEntity(applicationProperties.getQueryConfirmOrderConnection().getBaseUrl(), confirmOrderResBody, String.class).getBody());
        return confirmOrderResponse.toString(4);
    }

}

