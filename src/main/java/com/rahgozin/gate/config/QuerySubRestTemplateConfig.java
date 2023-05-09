package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QuerySubRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QuerySubRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QuerySubRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("querySubRestTemplate")
    public RestTemplate querySubRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QuerySubRestTemplateConfig => querySubRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration
                        .ofMillis(applicationProperties.getQuerySubscriberConnection().getConnectionTimeout()))
                .setReadTimeout(Duration
                        .ofMillis(applicationProperties.getQuerySubscriberConnection().getReadTimeout()))
                .build();
    }
}