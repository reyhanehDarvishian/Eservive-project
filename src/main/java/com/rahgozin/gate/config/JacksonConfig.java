package com.rahgozin.gate.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
//    @Bean
//    public XmlMapper xmlMapper() {
//        XmlMapper xmlMapper = new XmlMapper();
//        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        return xmlMapper;
//    }
}