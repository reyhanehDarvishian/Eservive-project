package com.rahgozin.gate.api;


import com.rahgozin.gate.service.QueryCustomerInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class QueryAccountInfoController {
    private final QueryCustomerInfoService queryCustomerInfoService;

    public QueryAccountInfoController(QueryCustomerInfoService queryCustomerInfoService) {
        this.queryCustomerInfoService = queryCustomerInfoService;
    }

    @GetMapping("/query-account-info")
    public Object queryAccountInfo() {
        return queryCustomerInfoService.queryCustomerInfo();
    }

}
