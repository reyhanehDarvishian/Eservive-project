package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class QueryImsiRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryImsiRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public QueryImsiRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("queryImsiRestTemplate")
    public RestTemplate queryImsiRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("QueryImsiRestTemplateConfig => queryImsiRestTemplate");
        return restTemplateBuilder.setConnectTimeout(Duration.ofMillis(
                applicationProperties.getQueryImsiInfoConnection().getConnectionTimeout()))
                .setReadTimeout(Duration
                        .ofMillis(applicationProperties.getQueryImsiInfoConnection().getReadTimeout()))
                .build();
    }
}