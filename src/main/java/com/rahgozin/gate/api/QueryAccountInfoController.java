package com.rahgozin.gate.api;


import com.rahgozin.gate.service.QueryAccountInfoService;
import com.rahgozin.gate.service.QueryCustomerInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class QueryAccountInfoController {
    private final QueryAccountInfoService queryAccountInfoService;

    public QueryAccountInfoController(QueryAccountInfoService queryAccountInfoService) {
        this.queryAccountInfoService = queryAccountInfoService;
    }

    @GetMapping("/query-account-info")
    public Object queryAccountInfo() {
        return queryAccountInfoService.queryAccountInfo();
    }

}
