package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class ChangeImsiReportRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(ChangeImsiReportRestTemplateConfig.class);

    private final ApplicationProperties applicationProperties;
    public ChangeImsiReportRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }
    @Bean("queryChangeImsiReportRestTemplate")
    public RestTemplate changeImsiReportRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("ChangeImsiReportRestTemplateConfig => changeImsiReportRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getChangeImsiReportConnection().getConnectionTimeout()))
                .setReadTimeout(Duration.ofMillis(applicationProperties.getChangeImsiReportConnection().getReadTimeout()))
                .build();
    }
}
