package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryCustomerInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class QueryCustomerInfoController {
    private final QueryCustomerInfoService queryCustomerInfoService;

    public QueryCustomerInfoController(QueryCustomerInfoService queryCustomerInfoService) {
        this.queryCustomerInfoService = queryCustomerInfoService;
    }

    @GetMapping("/query-customer-info/{phone-number}")
    public Object queryCustomerInfo(@PathVariable(name = "phone-number") String phoneNumber) {
        return queryCustomerInfoService.queryCustomerInfo(phoneNumber);
    }
}
