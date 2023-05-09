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
public class ProductTypeListService {
    public final ObjectMapper objectMapper;
    private final TokenService tokenService;
    private final RestTemplate productTypeListRestTemplate;
    private final ApplicationProperties applicationProperties;

    @Autowired
    public ProductTypeListService(ObjectMapper objectMapper, TokenService tokenService,
                                  @Qualifier("productTypeListRestTemplate") RestTemplate productTypeListRestTemplate,
                                  ApplicationProperties applicationProperties) {
        this.objectMapper = objectMapper;
        this.tokenService = tokenService;
        this.productTypeListRestTemplate = productTypeListRestTemplate;
        this.applicationProperties = applicationProperties;
    }

    public String getProductId(String username, String password, String token) {
        HttpHeaders productTypeListHeaders = new HttpHeaders();
        productTypeListHeaders.add(HttpHeaders.AUTHORIZATION,
                tokenService.getRequestHeaderAuthorization(username, password, token));
        JSONObject json = null;
        JSONArray data = null;
        JSONObject productId = null;
        String productIdValue = "";
        HttpEntity<String> productTypeListResBody = new HttpEntity<>("parameters", productTypeListHeaders);
        String productTypeListResponse = productTypeListRestTemplate.exchange(applicationProperties.getProductTypeListConnection().getBaseUrl(), HttpMethod.GET, productTypeListResBody, String.class).getBody();
        try {
            json = new JSONObject(productTypeListResponse);
            data = (JSONArray) json.get("data");
            productId = data.getJSONObject(0);
            productIdValue = productId.getString("productId");
            if (productIdValue.equals("1"))
                productIdValue = "1";
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("productIdValue: " + productIdValue);
        return productIdValue;
    }
}
