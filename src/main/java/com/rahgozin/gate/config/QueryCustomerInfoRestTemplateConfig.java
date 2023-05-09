package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryCustomerInfoRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryCustomerInfoRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QueryCustomerInfoRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }
    @Bean
    public RestTemplate queryCustomerInfoRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryCustomerInfoRestTemplateConfig => queryCustomerInfoRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getQueryCustomerInfoConnection().getConnectionTimeout())
                )
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryCustomerInfoConnection().getReadTimeout()))
                .build();
    }
}
