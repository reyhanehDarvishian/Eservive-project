package com.rahgozin.gate.api.topIn;

import com.rahgozin.gate.service.topIn.RequestOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class RequestOrderController {
    private final RequestOrderService requestOrderService;

    public RequestOrderController(RequestOrderService requestOrderService) {
        this.requestOrderService = requestOrderService;
    }

    @GetMapping("/request-order")
    public Object requestOrder(String username, String password, String token) {
        return requestOrderService.requestOrder(username, password, token);
    }
}