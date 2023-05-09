package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryBalanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class QueryBalanceController {
    private final QueryBalanceService queryBalanceService;

    public QueryBalanceController(QueryBalanceService queryBalanceService) {
        this.queryBalanceService = queryBalanceService;
    }
    @GetMapping("/query-balance")
    public Object queryBalance(){
        return queryBalanceService.queryBalanceService();
    }
}
