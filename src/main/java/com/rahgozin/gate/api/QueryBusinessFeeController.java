package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryBusinessFeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class QueryBusinessFeeController {

    private final QueryBusinessFeeService queryBusinessFeeService;


    public QueryBusinessFeeController(QueryBusinessFeeService queryBusinessFeeService) {
        this.queryBusinessFeeService = queryBusinessFeeService;
    }

    @GetMapping("/query-business-fee")
    public Object queryBusinessFee() {
        return queryBusinessFeeService.queryBusinessFee();
    }
}