package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryPaymentLogRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryPaymentLogRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QueryPaymentLogRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }
    @Bean
    public RestTemplate queryPaymentLogRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryPaymentLogRestTemplateConfig => queryPaymentLogRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getQueryPaymentLogConnection().getConnectionTimeout())
                )
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryPaymentLogConnection().getReadTimeout()))
                .build();
    }
}
