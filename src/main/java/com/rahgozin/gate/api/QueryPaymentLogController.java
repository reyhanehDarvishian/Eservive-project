package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryPaymentLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class QueryPaymentLogController {
    private final QueryPaymentLogService queryPaymentLogService;

    public QueryPaymentLogController(QueryPaymentLogService queryPaymentLogService) {
        this.queryPaymentLogService = queryPaymentLogService;
    }

    @GetMapping("/query-payment-log/{phone-number}")
    public Object queryPaymentLog(@PathVariable(name = "phone-number") String phoneNumber) {
        return queryPaymentLogService.queryPaymentLog(phoneNumber);
    }
}
