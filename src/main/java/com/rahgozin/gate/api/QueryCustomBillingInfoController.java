package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryCustomBillingInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class QueryCustomBillingInfoController {
    private final QueryCustomBillingInfoService queryCustomBillingInfoService;

    public QueryCustomBillingInfoController(QueryCustomBillingInfoService queryCustomBillingInfoService) {
        this.queryCustomBillingInfoService = queryCustomBillingInfoService;
    }

    @GetMapping("/query-custom-billing-info")
    public Object queryCustomBillingInfo(@RequestParam(name="opType" ) int opType,@RequestParam(name="date" ,required = false) String date ) {
        return queryCustomBillingInfoService.queryCustomBillingInfo(date,opType);
    }

}