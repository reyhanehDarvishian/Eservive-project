package com.rahgozin.gate.api;

import com.rahgozin.gate.service.QueryEntityIdService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class QueryEntityIdController {

    private final QueryEntityIdService queryEntityIdService;

    public QueryEntityIdController(QueryEntityIdService queryEntityIdService) {
        this.queryEntityIdService = queryEntityIdService;
    }

    @GetMapping("/query-entity-id/{phone-number}")
    public Object queryEntityId(@PathVariable(name = "phone-number") String phoneNumber) {
        return queryEntityIdService.entityId(phoneNumber);
    }
}