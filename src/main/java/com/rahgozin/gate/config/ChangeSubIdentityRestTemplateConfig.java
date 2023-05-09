package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class ChangeSubIdentityRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(QueryBalanceRestTemplateConfig.class);
    private final ApplicationProperties applicationProperties;

    public ChangeSubIdentityRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }
    @Bean
    public RestTemplate changeSubIdentityRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("ChangeSubIdentityRestTemplateConfig => changeSubIdentityRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getChangeSubIdentityConnection().getConnectionTimeout())
                        )
                .setReadTimeout(Duration.ofMillis(applicationProperties.getChangeSubIdentityConnection().getReadTimeout()))
                .build();
    }
}
