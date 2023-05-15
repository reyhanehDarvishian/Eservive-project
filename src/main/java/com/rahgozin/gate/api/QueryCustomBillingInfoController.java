package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryCustomBillingInfoService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class QueryCustomBillingInfoController {
    private final QueryCustomBillingInfoService queryCustomBillingInfoService;

    public QueryCustomBillingInfoController(QueryCustomBillingInfoService queryCustomBillingInfoService) {
        this.queryCustomBillingInfoService = queryCustomBillingInfoService;
    }

    @GetMapping("/query-custom-billing-info/{phone-number}")
    @ResponseBody
    public Object queryCustomBillingInfo(@PathVariable(name = "phone-number") String phoneNumber, @RequestParam(name = "opType") int opType, @RequestParam(name = "date", required = false) String date) {
        return queryCustomBillingInfoService.queryCustomBillingInfo(phoneNumber, date, opType);
    }

}