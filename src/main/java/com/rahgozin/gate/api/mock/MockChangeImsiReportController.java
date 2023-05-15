package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock/api/v1")
public class MockChangeImsiReportController {

    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockChangeImsiReportController(RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/change-imsi-report/{phone-number}")
    public Object mockChangeImsiReport(@PathVariable(name = "phone-number") String phoneNumber,
                                       @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"changeIMSIReportRspMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 1,\n" +
                    "        \"resultCode\": 0,\n" +
                    "        \"resultDesc\": \"success\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"changeIMSIReportRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"success\"\n" +
                    "            },\n" +
                    "            \"changeIMSIReportResponse\": {\n" +
                    "                \"IMSIHistory\": {\n" +
                    "                    \"businessFee\": \"0\",\n" +
                    "                    \"channelId\": \"601\",\n" +
                    "                    \"createProleId\": \"1551769783058199481\",\n" +
                    "                    \"createProleType\": \"E\",\n" +
                    "                    \"createTime\": \"2019-08-28T15:47:05\",\n" +
                    "                    \"newIMSI\": \"8998113900052249123\",\n" +
                    "                    \"oldIMSI\": \"8998113900001031961\",\n" +
                    "                    \"orderId\": \"130100000001366195\"\n" +
                    "                },\n" +
                    "                \"imsiReportResHistories\": [\n" +
                    "                    {\n" +
                    "                        \"businessFee\": \"0\",\n" +
                    "                        \"channelId\": \"601\",\n" +
                    "                        \"createProleId\": \"1551769783058199481\",\n" +
                    "                        \"createProleType\": \"E\",\n" +
                    "                        \"createTime\": \"2019-08-28T15:47:05\",\n" +
                    "                        \"newIMSI\": \"8998113900052249123\",\n" +
                    "                        \"oldIMSI\": \"8998113900001031961\",\n" +
                    "                        \"orderId\": \"130100000001366195\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}
