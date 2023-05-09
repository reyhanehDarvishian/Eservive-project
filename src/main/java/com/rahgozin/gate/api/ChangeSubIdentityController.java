package com.rahgozin.gate.api;

import com.rahgozin.gate.service.ChangeSubIdentityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class ChangeSubIdentityController {
    private final ChangeSubIdentityService changeSubIdentityService;

    public ChangeSubIdentityController(ChangeSubIdentityService changeSubIdentityService) {
        this.changeSubIdentityService = changeSubIdentityService;
    }
    @GetMapping("/change-subscriber-identity")
    public Object changeSubIdentity() {
        return changeSubIdentityService.changeSubIdentity();
    }

}
