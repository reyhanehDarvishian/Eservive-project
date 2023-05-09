package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class ConfirmOrderRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(ConfirmOrderRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public ConfirmOrderRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean("confirmOrderRestTemplate")
    public RestTemplate confirmOrderRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("ConfirmOrderRestTemplateConfig => confirmOrderRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration
                        .ofMillis(applicationProperties.getQueryConfirmOrderConnection().getConnectionTimeout()))
                .setReadTimeout(Duration.ofMillis(applicationProperties.getQueryConfirmOrderConnection().getReadTimeout()))
                .build();
    }
}