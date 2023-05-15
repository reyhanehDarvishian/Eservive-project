package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryFreeUnitController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryFreeUnitController(RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-free-unit/{phone-number}")
    public Object mockQueryFreeUnit(@PathVariable(name = "phone-number") String phoneNumber,@RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"queryFreeUnitResultMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 1,\n" +
                    "        \"resultCode\": 118040195,\n" +
                    "        \"resultDesc\": \"Failed to authenticate the LoginSystemCode, Password , and RemoteIp in the WebService message.\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryFreeUnitResultMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"Operation successfully.\"\n" +
                    "            },\n" +
                    "            \"queryFreeUnitResult\": {\n" +
                    "                \"freeUnitItems\": [\n" +
                    "                    {\n" +
                    "                        \"freeUnitType\": \"C_Data_NoDisc\",\n" +
                    "                        \"freeUnitTypeName\": \"Internet_Data_Free\",\n" +
                    "                        \"measureUnit\": \"1106\",\n" +
                    "                        \"measureUnitName\": \"Bytes\",\n" +
                    "                        \"totalInitialAmount\": \"1086324736\",\n" +
                    "                        \"totalUnusedAmount\": \"1086324736\",\n" +
                    "                        \"freeUnitItemDetail\": {\n" +
                    "                            \"freeUnitInstanceID\": \"701000000011173916\",\n" +
                    "                            \"initialAmount\": \"1086324736\",\n" +
                    "                            \"currentAmount\": \"1086324736\",\n" +
                    "                            \"usedAmount\": \"0\",\n" +
                    "                            \"effectiveTime\": \"20230419200152\",\n" +
                    "                            \"expireTime\": \"20230519200152\",\n" +
                    "                            \"freeUnitOrigin\": {\n" +
                    "                                \"offeringKey\": {\n" +
                    "                                    \"offeringID\": \"703700\",\n" +
                    "                                    \"purchaseSeq\": \"860100010217784144\"\n" +
                    "                                },\n" +
                    "                                \"originType\": \"1\"\n" +
                    "                            },\n" +
                    "                            \"rollOverFlag\": \"N\",\n" +
                    "                            \"lastRollOveredTime\": \"19700101033000\"\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ],\n" +
                    "                \"freeUnitItem\": {\n" +
                    "                    \"freeUnitType\": \"C_Data_NoDisc\",\n" +
                    "                    \"freeUnitTypeName\": \"Internet_Data_Free\",\n" +
                    "                    \"measureUnit\": \"1106\",\n" +
                    "                    \"measureUnitName\": \"Bytes\",\n" +
                    "                    \"totalInitialAmount\": \"1086324736\",\n" +
                    "                    \"totalUnusedAmount\": \"1086324736\",\n" +
                    "                    \"freeUnitItemDetail\": {\n" +
                    "                        \"freeUnitInstanceID\": \"701000000011173916\",\n" +
                    "                        \"initialAmount\": \"1086324736\",\n" +
                    "                        \"currentAmount\": \"1086324736\",\n" +
                    "                        \"usedAmount\": \"0\",\n" +
                    "                        \"effectiveTime\": \"20230419200152\",\n" +
                    "                        \"expireTime\": \"20230519200152\",\n" +
                    "                        \"freeUnitOrigin\": {\n" +
                    "                            \"offeringKey\": {\n" +
                    "                                \"offeringID\": \"703700\",\n" +
                    "                                \"purchaseSeq\": \"860100010217784144\"\n" +
                    "                            },\n" +
                    "                            \"originType\": \"1\"\n" +
                    "                        },\n" +
                    "                        \"rollOverFlag\": \"N\",\n" +
                    "                        \"lastRollOveredTime\": \"19700101033000\"\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}