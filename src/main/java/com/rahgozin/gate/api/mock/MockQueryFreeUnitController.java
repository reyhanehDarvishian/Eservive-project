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
                    "                        \"freeUnitType\": \"C_5015\",\n" +
                    "                        \"description\": \"عادی\",\n" +
                    "                        \"freeUnitTypeName\": \"SMS offnet onnet\",\n" +
                    "                        \"measureUnit\": \"1101\",\n" +
                    "                        \"measureUnitName\": \"Item\",\n" +
                    "                        \"totalInitialAmount\": \"150\",\n" +
                    "                        \"totalUnusedAmount\": \"150\",\n" +
                    "                        \"freeUnitItemDetail\": {\n" +
                    "                            \"freeUnitInstanceID\": \"710000000211934793\",\n" +
                    "                            \"initialAmount\": \"150\",\n" +
                    "                            \"currentAmount\": \"150\",\n" +
                    "                            \"usedAmount\": \"0\",\n" +
                    "                            \"effectiveTime\": \"20230521115521\",\n" +
                    "                            \"expireTime\": \"20230620115521\",\n" +
                    "                            \"freeUnitOrigin\": {\n" +
                    "                                \"offeringKey\": {\n" +
                    "                                    \"offeringID\": \"704129\",\n" +
                    "                                    \"purchaseSeq\": \"760100137789752692\"\n" +
                    "                                },\n" +
                    "                                \"originType\": \"1\"\n" +
                    "                            },\n" +
                    "                            \"rollOverFlag\": \"N\",\n" +
                    "                            \"lastRollOveredTime\": \"19700101033000\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"unitInitTitle\": \"150 دقیقه\",\n" +
                    "                        \"unitUnusedTitle\": \"140 دقیقه\",\n" +
                    "                        \"freeUnitType\": \"C_4000\",\n" +
                    "                        \"description\": \"درون شبکه\",\n" +
                    "                        \"freeUnitTypeName\": \"Onnet call\",\n" +
                    "                        \"measureUnit\": \"1003\",\n" +
                    "                        \"measureUnitName\": \"Second\",\n" +
                    "                        \"totalInitialAmount\": \"9000\",\n" +
                    "                        \"totalUnusedAmount\": \"8420\",\n" +
                    "                        \"freeUnitItemDetail\": {\n" +
                    "                            \"freeUnitInstanceID\": \"710000000211934792\",\n" +
                    "                            \"initialAmount\": \"9000\",\n" +
                    "                            \"currentAmount\": \"8420\",\n" +
                    "                            \"usedAmount\": \"580\",\n" +
                    "                            \"effectiveTime\": \"20230521115521\",\n" +
                    "                            \"expireTime\": \"20230620115521\",\n" +
                    "                            \"freeUnitOrigin\": {\n" +
                    "                                \"offeringKey\": {\n" +
                    "                                    \"offeringID\": \"704129\",\n" +
                    "                                    \"purchaseSeq\": \"760100137789752692\"\n" +
                    "                                },\n" +
                    "                                \"originType\": \"1\"\n" +
                    "                            },\n" +
                    "                            \"rollOverFlag\": \"N\",\n" +
                    "                            \"lastRollOveredTime\": \"19700101033000\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"unitInitTitle\": \"554.0 مگ\",\n" +
                    "                        \"unitUnusedTitle\": \"483.3 مگ\",\n" +
                    "                        \"freeUnitType\": \"C_5007\",\n" +
                    "                        \"description\": \"عادی\",\n" +
                    "                        \"freeUnitTypeName\": \"Data\",\n" +
                    "                        \"measureUnit\": \"1106\",\n" +
                    "                        \"measureUnitName\": \"Bytes\",\n" +
                    "                        \"totalInitialAmount\": \"580911104\",\n" +
                    "                        \"totalUnusedAmount\": \"506787652\",\n" +
                    "                        \"freeUnitItemDetail\": {\n" +
                    "                            \"freeUnitInstanceID\": \"710000000211934794\",\n" +
                    "                            \"initialAmount\": \"580911104\",\n" +
                    "                            \"currentAmount\": \"506787652\",\n" +
                    "                            \"usedAmount\": \"74123452\",\n" +
                    "                            \"effectiveTime\": \"20230521115521\",\n" +
                    "                            \"expireTime\": \"20230620115521\",\n" +
                    "                            \"freeUnitOrigin\": {\n" +
                    "                                \"offeringKey\": {\n" +
                    "                                    \"offeringID\": \"704129\",\n" +
                    "                                    \"purchaseSeq\": \"760100137789752692\"\n" +
                    "                                },\n" +
                    "                                \"originType\": \"1\"\n" +
                    "                            },\n" +
                    "                            \"rollOverFlag\": \"N\",\n" +
                    "                            \"lastRollOveredTime\": \"19700101033000\"\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ],\n" +
                    "                \"totalInitBytes\": \"554.0 مگ\",\n" +
                    "                \"totalUsedBytes\": \"483.3 مگ\",\n" +
                    "                \"freeUnitItem\": {\n" +
                    "                    \"unitInitTitle\": \"554.0 مگ\",\n" +
                    "                    \"unitUnusedTitle\": \"483.3 مگ\",\n" +
                    "                    \"freeUnitType\": \"C_5007\",\n" +
                    "                    \"description\": \"عادی\",\n" +
                    "                    \"freeUnitTypeName\": \"Data\",\n" +
                    "                    \"measureUnit\": \"1106\",\n" +
                    "                    \"measureUnitName\": \"Bytes\",\n" +
                    "                    \"totalInitialAmount\": \"580911104\",\n" +
                    "                    \"totalUnusedAmount\": \"506787652\",\n" +
                    "                    \"freeUnitItemDetail\": {\n" +
                    "                        \"freeUnitInstanceID\": \"710000000211934794\",\n" +
                    "                        \"initialAmount\": \"580911104\",\n" +
                    "                        \"currentAmount\": \"506787652\",\n" +
                    "                        \"usedAmount\": \"74123452\",\n" +
                    "                        \"effectiveTime\": \"20230521115521\",\n" +
                    "                        \"expireTime\": \"20230620115521\",\n" +
                    "                        \"freeUnitOrigin\": {\n" +
                    "                            \"offeringKey\": {\n" +
                    "                                \"offeringID\": \"704129\",\n" +
                    "                                \"purchaseSeq\": \"760100137789752692\"\n" +
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