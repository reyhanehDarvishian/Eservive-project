package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryBusinessFeeController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryBusinessFeeController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-business-fee/{phone-number}")
    public Object mockQueryBusinessFee(@PathVariable(name = "phone-number") String phoneNumber,
                                       @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"queryBusinessFeeRspMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 1,\n" +
                    "        \"resultCode\": 2,\n" +
                    "        \"resultDesc\": \"Input Parameter (PrimaryIdentity) should include only numbers.\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryBusinessFeeRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"Success\",\n" +
                    "                \"version\": \"1\"\n" +
                    "            },\n" +
                    "            \"queryBusinessFeeResponse\": {\n" +
                    "                \"accountDeduction\": \"272500\",\n" +
                    "                \"currencyID\": \"1069\",\n" +
                    "                \"totalDiscount\": \"0\",\n" +
                    "                \"totalReceivable\": \"0\",\n" +
                    "                \"totalTax\": \"22500\",\n" +
                    "                \"totalTaxWaived\": \"0\",\n" +
                    "                \"totalUpfrontCost\": \"250000\",\n" +
                    "                \"totalWaived\": \"0\",\n" +
                    "                \"feeDetails\": {\n" +
                    "                    \"chargeCodesNames\": [\n" +
                    "                        {\n" +
                    "                            \"chargeCodeName\": \"Transfer of Ownership Fee\",\n" +
                    "                            \"languageCode\": \"en_US\"\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"chargeCodeName\": \"هزینه انتقال مالکیت \",\n" +
                    "                            \"languageCode\": \"fa_IR\"\n" +
                    "                        }\n" +
                    "                    ],\n" +
                    "                    \"chargeCode\": \"C_TRANSFER_OWNERSHIP_FEE\",\n" +
                    "                    \"chargeType\": \"Charge Account\",\n" +
                    "                    \"discount\": \"0\",\n" +
                    "                    \"tax\": \"22500\",\n" +
                    "                    \"totaUpfrontCost\": \"250000\",\n" +
                    "                    \"total\": \"272500\",\n" +
                    "                    \"unitPrice\": \"250000\",\n" +
                    "                    \"waived\": \"0\",\n" +
                    "                    \"chargeCodeNames\": {\n" +
                    "                        \"chargeCodeName\": \"هزینه انتقال مالکیت \",\n" +
                    "                        \"languageCode\": \"fa_IR\"\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}