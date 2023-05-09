package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryEntityIdRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryEntityIdRestTemplateConfig.class);

    private final ApplicationProperties applicationProperties;

    public QueryEntityIdRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("queryEntityIdRestTemplate")
    public RestTemplate queryEntityIdRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryEntityIdRestTemplateConfig => queryEntityIdRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getQueryEntityIdConnection().getConnectionTimeout()))
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryEntityIdConnection().getReadTimeout()))
                .build();
    }
}