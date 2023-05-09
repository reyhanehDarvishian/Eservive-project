package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class ProductListRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(ProductListRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public ProductListRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("productListRestTemplate")
    public RestTemplate productListRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("ProductListRestTemplate => productListRestTemplate");
        return restTemplateBuilder.setConnectTimeout(Duration.ofMillis(
                applicationProperties.getProductListConnection().getConnectionTimeout()))
                .setReadTimeout(Duration
                .ofMillis(applicationProperties.getProductListConnection().getReadTimeout()))
                .build();
    }
}
