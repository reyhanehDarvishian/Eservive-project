package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryBusinessFeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class QueryBusinessFeeController {

    private final QueryBusinessFeeService queryBusinessFeeService;


    public QueryBusinessFeeController(QueryBusinessFeeService queryBusinessFeeService) {
        this.queryBusinessFeeService = queryBusinessFeeService;
    }

    @GetMapping("/query-business-fee/{phone-number}")
    public Object queryBusinessFee(@PathVariable(name = "phone-number") String phoneNumber) {
        return queryBusinessFeeService.queryBusinessFee(phoneNumber);
    }
}