package com.rahgozin.gate.api;

import com.rahgozin.gate.service.CustomerClubInquiryScoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class CustomerClubInquiryScoreController {
    private final CustomerClubInquiryScoreService customerClubInquiryScoreService;

    public CustomerClubInquiryScoreController(CustomerClubInquiryScoreService customerClubInquiryScoreService) {
        this.customerClubInquiryScoreService = customerClubInquiryScoreService;
    }

    @GetMapping("/customer-club-inquiry-score")
    public Object customerClubInquiryScore() {
        return customerClubInquiryScoreService.customerClubInquiryScore();
    }
}
