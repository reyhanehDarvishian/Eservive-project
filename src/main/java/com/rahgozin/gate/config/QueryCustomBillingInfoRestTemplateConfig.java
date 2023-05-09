package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryCustomBillingInfoRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryCustomBillingInfoRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QueryCustomBillingInfoRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("queryCustomBillingInfoRestTemplate")
    public RestTemplate queryCustomBillingInfoRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryCustomBillingInfoRestTemplateConfig => queryCustomBillingInfoRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration
                        .ofMillis(applicationProperties.getQueryBillingInfoConnection().getConnectionTimeout()))
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryBillingInfoConnection().getReadTimeout()))
                .build();
    }
}