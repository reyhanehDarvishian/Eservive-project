package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryFreeUnitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class QueryFreeUnitController {
   private final QueryFreeUnitService queryFreeUnitService;

    public QueryFreeUnitController(QueryFreeUnitService queryFreeUnitService) {
        this.queryFreeUnitService = queryFreeUnitService;
    }
    @GetMapping("/query-free-unit")
    public Object queryFreeUnit() {
        return queryFreeUnitService.queryFreeUnit();
    }
}
