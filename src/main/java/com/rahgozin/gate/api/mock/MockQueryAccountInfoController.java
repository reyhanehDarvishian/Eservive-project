package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock/api/v1")
public class MockQueryAccountInfoController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryAccountInfoController(RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-account-info/{account-id}")
    public Object mockQueryAccountInfo(@PathVariable(name = "account-id") String accountId,
                                       @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"queryAccountInfoRspMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 5,\n" +
                    "        \"resultCode\": 118030429,\n" +
                    "        \"resultDesc\": \"Customer account does not exist.\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryAccountInfoRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"5.0\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"success\"\n" +
                    "            },\n" +
                    "            \"queryAccountInfoResponse\": {\n" +
                    "                \"accountInfo\": {\n" +
                    "                    \"accountBasicInfo\": {\n" +
                    "                        \"extsProperties\": [\n" +
                    "                            {\n" +
                    "                                \"code\": \"CustomerSegment\",\n" +
                    "                                \"value\": \"1\"\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"code\": \"CustomerLevel\",\n" +
                    "                                \"value\": \"0\"\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"code\": \"MainSegment\",\n" +
                    "                                \"value\": \"No\"\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"code\": \"SubSegment\",\n" +
                    "                                \"value\": \"No\"\n" +
                    "                            }\n" +
                    "                        ],\n" +
                    "                        \"extProperties\": {\n" +
                    "                            \"code\": \"SubSegment\",\n" +
                    "                            \"value\": \"No\"\n" +
                    "                        },\n" +
                    "                        \"acctCode\": \"11010002925010\",\n" +
                    "                        \"acctName\": \"طاهره طاهری بازخانه\",\n" +
                    "                        \"partyId\": \"11000000814086\",\n" +
                    "                        \"acctType\": \"1\",\n" +
                    "                        \"acctClass\": \"1\",\n" +
                    "                        \"paymentType\": \"0\",\n" +
                    "                        \"currencyId\": \"1069\",\n" +
                    "                        \"status\": \"2\",\n" +
                    "                        \"statusTime\": \"2022-12-12T11:56:49\",\n" +
                    "                        \"billLang\": \"Persian\"\n" +
                    "                    },\n" +
                    "                    \"accountId\": \"8611010003113018\",\n" +
                    "                    \"billCycleInfo\": {\n" +
                    "                        \"acctBillCycleId\": \"8611010002738007\",\n" +
                    "                        \"billCycleTypeCode\": \"1st Of Each Month\",\n" +
                    "                        \"billCycleTypeDesc\": \"1st Of Each Month\",\n" +
                    "                        \"billCycleTypeId\": \"1\",\n" +
                    "                        \"beginDate\": \"1\",\n" +
                    "                        \"cycleType\": \"M\",\n" +
                    "                        \"effDate\": \"2022-12-12T11:56:49\",\n" +
                    "                        \"expDate\": \"2037-01-01T00:00:00\"\n" +
                    "                    },\n" +
                    "                    \"contactPersonInfo\": {\n" +
                    "                        \"contactPersonId\": \"8611010002702010\",\n" +
                    "                        \"addressInfo\": null,\n" +
                    "                        \"contactPersonType\": \"1\",\n" +
                    "                        \"firstName\": \"طاهره\",\n" +
                    "                        \"lastName\": \"طاهری بازخانه\",\n" +
                    "                        \"mobilePhone\": \"9921906571\"\n" +
                    "                    },\n" +
                    "                    \"vip\": \"0\",\n" +
                    "                    \"accountGroupInfo\": {\n" +
                    "                        \"accountGroupId\": \"0\",\n" +
                    "                        \"accountGroupCode\": \"0\",\n" +
                    "                        \"accountGroupName\": \"none\",\n" +
                    "                        \"exemptionAmount\": \"0\"\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}
