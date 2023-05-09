package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryFreeUnitRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryFreeUnitRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QueryFreeUnitRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("queryFreeUnitRestTemplate")
    public RestTemplate queryFreeUnitRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryFreeUnitRestTemplateConfig => queryFreeUnitRestTemplate");
        return restTemplateBuilder.setConnectTimeout(Duration.ofMillis(
                applicationProperties.getQueryFreeUnitConnection().getConnectionTimeout()))
                .setReadTimeout(Duration
                        .ofMillis(applicationProperties.getQueryFreeUnitConnection().getReadTimeout()))
                .build();
    }
}