package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RequestOrderRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(RequestOrderRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;


    public RequestOrderRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("requestOrderRestTemplate")
    public RestTemplate requestOrderRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("RequestOrderRestTemplateConfig => requestOrderRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration
                        .ofMillis(applicationProperties.getQueryRequestOrderConnection().getConnectionTimeout()))
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryRequestOrderConnection().getReadTimeout()))
                .build();
    }
}