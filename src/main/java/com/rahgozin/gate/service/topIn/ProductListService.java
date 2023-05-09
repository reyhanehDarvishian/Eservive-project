package com.rahgozin.gate.service.topIn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.service.TokenService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductListService {
    public final ObjectMapper objectMapper;
    private final TokenService tokenService;
    private final RestTemplate productListRestTemplate;
    private final ApplicationProperties applicationProperties;


    @Autowired
    public ProductListService(ObjectMapper objectMapper, TokenService tokenService, @Qualifier("productListRestTemplate") RestTemplate productListRestTemplate, ApplicationProperties applicationProperties) {
        this.objectMapper = objectMapper;
        this.tokenService = tokenService;
        this.productListRestTemplate = productListRestTemplate;
        this.applicationProperties = applicationProperties;
    }

    public String getPayloadId(String username, String password, String token) {
        HttpHeaders productListHeaders = new HttpHeaders();
        productListHeaders.add(HttpHeaders.AUTHORIZATION,
                tokenService.getRequestHeaderAuthorization(username, password, token));
        JSONObject json = null;
        JSONArray data = null;
        JSONObject payloadId = null;
        String payloadIdValue = "";
        HttpEntity<String> productListResBody = new HttpEntity<>("parameters", productListHeaders);
        String productListResponse = productListRestTemplate.exchange(applicationProperties.getProductListConnection().getBaseUrl(), HttpMethod.GET, productListResBody, String.class).getBody();
        try {
            json = new JSONObject(productListResponse);
            data = (JSONArray) json.get("data");
            payloadId = data.getJSONObject(0);
            payloadIdValue = payloadId.getString("Id");
            if (payloadIdValue.equals("3"))
                payloadIdValue = "3";
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("getPayloadId => payloadIdValue => " + payloadIdValue);
        return payloadIdValue;
    }
}