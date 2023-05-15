package com.rahgozin.gate.api;


import com.rahgozin.gate.service.ChangeImsiReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ChangeImsiReportController {
    private final ChangeImsiReportService changeImsiReportService;

    public ChangeImsiReportController(ChangeImsiReportService changeImsiReportService) {
        this.changeImsiReportService = changeImsiReportService;
    }

    @GetMapping("/change-imsi-report/{phone-number}")
    public Object changeImsiReport(@PathVariable(name = "phone-number") String phoneNumber) {
        return changeImsiReportService.changeImsiReport(phoneNumber);
    }
}