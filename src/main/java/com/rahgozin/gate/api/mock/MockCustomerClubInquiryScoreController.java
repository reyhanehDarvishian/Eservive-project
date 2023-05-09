package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mock/api/v1")
@RestController
public class MockCustomerClubInquiryScoreController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    @GetMapping("customer-club-inquiry-score")
    public Object mockCustomerClubInquiryScore() {
        return "{\n" +
                "    \"responseType\": \"0\",\n" +
                "    \"responseDesc\": \"0\"\n" +
                "}";
    }
}
