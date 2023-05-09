package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryImsiInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/v1")
@RestController
public class QueryImsiInfoController {
    private final QueryImsiInfoService queryImsiInfoService;

    public QueryImsiInfoController(QueryImsiInfoService queryImsiInfoService) {
        this.queryImsiInfoService = queryImsiInfoService;
    }

    @GetMapping("/query-imsi-info/{phone-number}")
    public Object queryImsiInfo(@PathVariable(name = "phone-number") String phoneNumber) {
        return queryImsiInfoService.queryImsiInfo(phoneNumber);
    }
}