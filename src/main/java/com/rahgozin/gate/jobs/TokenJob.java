package com.rahgozin.gate.jobs;

import com.rahgozin.gate.service.TokenService;
import org.springframework.stereotype.Component;


@Component
public class TokenJob {

    private final TokenService tokenService;

    public TokenJob(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void imsiTokenJob() {
        tokenService.reNewImsiToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void subscriberTokenJob() {
        tokenService.reNewSubscriberToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void entityIdTokenJob() {
        tokenService.reNewEntityIdToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void businessFeeTokenJob() {
        tokenService.reNewBusinessFeeToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void customBillingInfoTokenJob() {
        tokenService.reNewBillingToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void queryBalanceTokenJob() {
        tokenService.reNewQueryBalanceToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void queryCustomerInfoJob() {
        tokenService.reNewQueryCustomerInfoToken();
    }

    public void queryAccountInfoJob() {
        tokenService.reNewQueryAccountInfoToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void queryFreeUnitJob() {
        tokenService.reNewQueryFreeUnitToken();
    }

    //    @Scheduled(fixedRateString = "${scheduler-time}")
    public void customerClubInquiryScoreJob() {
        tokenService.reNewCustomerClubInquiryScoreToken();
    }
}