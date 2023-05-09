package com.rahgozin.gate.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class CustomerClubInquiryScoreRestTemplateConfig {
    Logger log = LoggerFactory.getLogger(CustomerClubInquiryScoreRestTemplateConfig.class);

    private final ApplicationProperties applicationProperties;

    public CustomerClubInquiryScoreRestTemplateConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }
    @Bean("customerClubInquiryScoreRestTemplate")
    public RestTemplate customerClubInquiryScoreRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        log.info("CustomerClubInquiryScoreRestTemplateConfig => customerClubInquiryScoreRestTemplate");
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(applicationProperties.getCustomerClubInquiryScoreConnection().getConnectionTimeout()))
                .setReadTimeout(Duration.ofMillis(applicationProperties.getCustomerClubInquiryScoreConnection().getReadTimeout()))
                .build();
    }
}
