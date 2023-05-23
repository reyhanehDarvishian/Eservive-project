package com.rahgozin.gate;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableConfigurationProperties(ApplicationProperties.class)
@SpringBootApplication
//@EnableScheduling
public class GateApplication {
    private final RestTemplate querySubRestTemplate;
    private final RestTemplate queryImsiRestTemplate;
    private final RestTemplate queryEntityIdRestTemplate;
    private final RestTemplate queryBusinessFeeRestTemplate;
    private final RestTemplate requestOrderRestTemplate;
    private final RestTemplate productListRestTemplate;
    private final RestTemplate productTypeListRestTemplate;
    private static ApplicationProperties applicationProperties;
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    GateApplication(@Qualifier("querySubRestTemplate") RestTemplate querySubRestTemplate,
                    @Qualifier("queryImsiRestTemplate") RestTemplate queryImsiRestTemplate,
                    @Qualifier("queryEntityIdRestTemplate") RestTemplate queryEntityIdRestTemplate,
                    @Qualifier("queryBusinessFeeRestTemplate") RestTemplate queryBusinessFeeRestTemplate,
                    @Qualifier("requestOrderRestTemplate") RestTemplate requestOrderRestTemplate,
                    @Qualifier("productListRestTemplate") RestTemplate productListRestTemplate,
                    @Qualifier("productTypeListRestTemplate") RestTemplate productTypeListRestTemplate,
                    ApplicationProperties applicationProperties, RestTemplateBuilder restTemplateBuilder) {
        this.querySubRestTemplate = querySubRestTemplate;
        this.queryImsiRestTemplate = queryImsiRestTemplate;
        this.queryEntityIdRestTemplate = queryEntityIdRestTemplate;
        this.queryBusinessFeeRestTemplate = queryBusinessFeeRestTemplate;
        this.requestOrderRestTemplate = requestOrderRestTemplate;
        this.productListRestTemplate = productListRestTemplate;
        this.productTypeListRestTemplate = productTypeListRestTemplate;
        this.applicationProperties = applicationProperties;
        this.restTemplateBuilder = restTemplateBuilder;
    }
    public static void main(String[] args) {
        SpringApplication.run(GateApplication.class, args);
//        GetTokenService getTokenService = new GetTokenService(applicationProperties);
//        getTokenService.getToken();
    }
}