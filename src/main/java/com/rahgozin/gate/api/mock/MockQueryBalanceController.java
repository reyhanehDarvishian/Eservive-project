package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryBalanceController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryBalanceController(RestTemplateBuilder restTemplateBuilder,
                                      ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-balance/{phone-number}")
    public Object mockQueryBalanceService(@PathVariable(name = "phone-number") String phoneNumber,
                                          @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"queryBalanceResultMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 1,\n" +
                    "        \"resultCode\": 118109004,\n" +
                    "        \"msgLanguageCode\": 2002,\n" +
                    "        \"resultDesc\": \"The service number 992190651 does not exist.\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryBalanceResultMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"msgLanguageCode\": \"2002\",\n" +
                    "                \"resultDesc\": \"Operation successfully.\"\n" +
                    "            },\n" +
                    "            \"queryBalanceResult\": {\n" +
                    "                \"acctList\": {\n" +
                    "                    \"acctKey\": \"8611010003113018\",\n" +
                    "                    \"balanceResult\": {\n" +
                    "                        \"balanceType\": \"C_MAIN_ACCOUNT_1278128700\",\n" +
                    "                        \"balanceTypeName\": \"Prepaid_Balance_Subaccount\",\n" +
                    "                        \"totalAmount\": \"0\",\n" +
                    "                        \"depositFlag\": \"N\",\n" +
                    "                        \"refundFlag\": \"1\",\n" +
                    "                        \"currencyID\": \"1069\",\n" +
                    "                        \"balanceDetail\": {\n" +
                    "                            \"balanceInstanceID\": \"701000000000206973\",\n" +
                    "                            \"amount\": \"0\",\n" +
                    "                            \"initialAmount\": \"0\",\n" +
                    "                            \"usedAmount\": \"0\",\n" +
                    "                            \"effectiveTime\": \"20221212115648\",\n" +
                    "                            \"expireTime\": \"20370101033000\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    \"accountCredit\": {\n" +
                    "                        \"totalCreditAmount\": \"0\",\n" +
                    "                        \"totalUsageAmount\": \"0\",\n" +
                    "                        \"totalRemainAmount\": \"0\",\n" +
                    "                        \"currencyID\": \"1069\"\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}
