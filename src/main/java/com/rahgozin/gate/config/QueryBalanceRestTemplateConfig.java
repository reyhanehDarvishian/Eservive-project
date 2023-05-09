package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryBalanceRestTemplateConfig {

    Logger log = LoggerFactory.getLogger(QueryBalanceRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QueryBalanceRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean
    public RestTemplate queryBalanceRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryBalanceRestTemplateConfig => queryBalanceRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getQueryBalanceConnection()
                        .getConnectionTimeout()))
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryBalanceConnection().getReadTimeout()))
                .build();
    }
}
