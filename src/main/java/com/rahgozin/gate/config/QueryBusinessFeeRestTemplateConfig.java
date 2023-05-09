package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryBusinessFeeRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryBusinessFeeRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QueryBusinessFeeRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("queryBusinessFeeRestTemplate")
    public RestTemplate queryBusinessFeeRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryBusinessFeeConfig => queryBusinessFeeRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration
                        .ofMillis(applicationProperties.getQueryBusinessFeeConnection().getConnectionTimeout()))
                .setReadTimeout(Duration
                        .ofMillis(applicationProperties.getQueryBusinessFeeConnection().getReadTimeout()))
                .build();
    }
}