package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class ProductTypeListRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(ProductListRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public ProductTypeListRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("productTypeListRestTemplate")
    public RestTemplate requestOrderRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("ProductTypeListRestTemplate => requestOrderRestTemplate");
        return restTemplateBuilder.setConnectTimeout(Duration.ofMillis(
                applicationProperties.getProductTypeListConnection().getConnectionTimeout()))
                .setReadTimeout(Duration
                        .ofMillis(applicationProperties.getProductTypeListConnection().getReadTimeout()))
                .build();
    }
}
