package com.rahgozin.gate.service.topIn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.topIn.requestOrder.request.RequestOrder;
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
public class RequestOrderService {
    private final RestTemplate requestOrderRestTemplate;
    public final ObjectMapper objectMapper;
    private final ApplicationProperties applicationProperties;
    private final TokenService tokenService;
    private final ProductListService productListService;
    private final ProductTypeListService productTypeListService;

    @Autowired
    public RequestOrderService(@Qualifier("requestOrderRestTemplate") RestTemplate requestOrderRestTemplate, ObjectMapper objectMapper, ApplicationProperties applicationProperties, TokenService tokenService, ProductListService productListService, ProductTypeListService productTypeListService) {
        this.requestOrderRestTemplate = requestOrderRestTemplate;
        this.objectMapper = objectMapper;
        this.applicationProperties = applicationProperties;
        this.tokenService = tokenService;
        this.productListService = productListService;
        this.productTypeListService = productTypeListService;
    }

    public String requestOrder(String username, String password, String token) {
        RequestOrder requestOrder = new RequestOrder();
        requestOrder.setAmount(applicationProperties.getQueryRequestOrderConnection().getAmount());
        requestOrder.setChannelId(applicationProperties.getQueryRequestOrderConnection().getChannelId());
        requestOrder.setPayloadId(String.valueOf(productListService.getPayloadId(username, password, token)));
        requestOrder.setProductId(String.valueOf(productTypeListService.getProductId(username, password, token)));
        requestOrder.setTelGift(applicationProperties.getQueryRequestOrderConnection().getTelGift());
        requestOrder.setTelNum(applicationProperties.getQueryRequestOrderConnection().getTelNum());

        HttpHeaders requestOrderHeaders = new HttpHeaders();
        requestOrderHeaders.add(HttpHeaders.AUTHORIZATION, tokenService.getRequestHeaderAuthorization(username, password, token));
        requestOrderHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");

        HttpEntity<String> requestOrderResBody = null;
        try {
            requestOrderResBody = new HttpEntity<>(objectMapper.writeValueAsString(requestOrder), requestOrderHeaders);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        JSONObject requestOrderResponse = XML.toJSONObject(requestOrderRestTemplate.postForEntity(applicationProperties.getQueryRequestOrderConnection().getBaseUrl(), requestOrderResBody, String.class).getBody());
        return requestOrderResponse.toString(4);
    }
}
