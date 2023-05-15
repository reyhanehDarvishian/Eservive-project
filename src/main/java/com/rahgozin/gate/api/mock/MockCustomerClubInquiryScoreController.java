package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockCustomerClubInquiryScoreController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    @GetMapping("customer-club-inquiry-score/{phone-number}")
    public Object mockCustomerClubInquiryScore(@PathVariable(name = "phone-number") String phoneNumber,
                                               @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "    \"responseType\": \"19\",\n" +
                    "    \"responseDesc\": \"پارامتر ورودي اشتباه است\"\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"responseType\": \"0\",\n" +
                    "    \"responseDesc\": \"0\"\n" +
                    "}";
        }
    }
}
