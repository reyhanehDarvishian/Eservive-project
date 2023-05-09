package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryAccountInfoRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryAccountInfoRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;


    public QueryAccountInfoRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean
    public RestTemplate queryAccountInfoRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryAccountInfoRestTemplateConfig => queryAccountInfoRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getQueryAccountInfoConnection().getConnectionTimeout())
                )
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryAccountInfoConnection().getReadTimeout()))
                .build();
    }
}
