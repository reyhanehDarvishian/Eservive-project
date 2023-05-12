package com.rahgozin.gate.api;

import com.rahgozin.gate.service.FileNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class FileNumberController {
    private final FileNumberService fileNumberService;

    public FileNumberController(FileNumberService fileNumberService) {
        this.fileNumberService = fileNumberService;
    }

    @GetMapping("/file-number/{phone-number}")
    public Object getFileNumber(@PathVariable(name = "phone-number") String phoneNumber) {
        return fileNumberService.getFileNumber(phoneNumber);
    }
}
