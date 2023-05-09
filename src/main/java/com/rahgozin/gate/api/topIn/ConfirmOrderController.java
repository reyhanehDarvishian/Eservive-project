package com.rahgozin.gate.api.topIn;

import com.rahgozin.gate.service.topIn.ConfirmOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class ConfirmOrderController {

    private final ConfirmOrderService confirmOrderService;

    public ConfirmOrderController(ConfirmOrderService confirmOrderService) {
        this.confirmOrderService = confirmOrderService;
    }

    @GetMapping("/confirm-order")
    public Object confirmOrder(String username, String password, String token) {
        return confirmOrderService.confirmOrderService(username, password, token);
    }
}