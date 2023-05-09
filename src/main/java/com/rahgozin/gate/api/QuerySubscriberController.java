package com.rahgozin.gate.api;


import com.rahgozin.gate.service.NewQueryCustService;
import com.rahgozin.gate.service.QueryAcctService;
import com.rahgozin.gate.service.QueryCustService;
import com.rahgozin.gate.service.QuerySubService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/v1")
@RestController
public class QuerySubscriberController {
    private final QuerySubService querySubService;
    private final QueryCustService queryCustService;
    private final QueryAcctService queryAcctService;
    private final NewQueryCustService newQueryCustService;

    public QuerySubscriberController(QuerySubService querySubService, QueryCustService queryCustService, QueryAcctService queryAcctService, NewQueryCustService newQueryCustService) {
        this.querySubService = querySubService;
        this.queryCustService = queryCustService;
        this.queryAcctService = queryAcctService;
        this.newQueryCustService = newQueryCustService;
    }

    @GetMapping(value = "/query-subscriber/sub/{phone-number}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object querySubscriber(Pageable pageable, @PathVariable(name = "phone-number") String phoneNumber) {
        return querySubService.querySubscriber(pageable, phoneNumber);
    }


    @GetMapping(value = "/query-subscriber/cust/{customer-id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object queryCust(Pageable pageable, @PathVariable(name = "customer-id") String customerId) {
        return queryCustService.queryCust(pageable, customerId);
    }

    @GetMapping(value = "/query-subscriber/acct/{account-id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object queryAcct(Pageable pageable, @PathVariable(name = "account-id") String accountId) {
        return queryAcctService.queryAcct(pageable, accountId);
    }

    @GetMapping(value ="/query-subscriber/new/cust/{phone-numb}")
    public Object queryNewQueryCust(Pageable pageable, @PathVariable(name = "phone-numb") String phoneNumber) {
        return newQueryCustService.newQueryCustomer(pageable, phoneNumber);
    }
}