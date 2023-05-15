package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryImsiInfoController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryImsiInfoController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-imsi-info/{phone-number}")
    public Object mockQueryImsiInfo(@PathVariable(name = "phone-number") String phoneNumber,
                                    @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"queryIMSIInfoRspMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 1,\n" +
                    "        \"resultCode\": 60102090004,\n" +
                    "        \"resultDesc\": \"Mobile number 91905802 is not found in the region.\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryImsiInfoRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"Success\"\n" +
                    "            },\n" +
                    "            \"queryImsiInfoResponse\": {\n" +
                    "                \"simType\": \"1\",\n" +
                    "                \"status\": \"2\",\n" +
                    "                \"warehouse\": \"1\",\n" +
                    "                \"pin1\": \"8357\",\n" +
                    "                \"pin2\": \"4764\",\n" +
                    "                \"puk1\": \"15603085\",\n" +
                    "                \"puk2\": \"57171612\",\n" +
                    "                \"imsi\": \"432113960608020\",\n" +
                    "                \"iccId\": \"8998113900060608020\"\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}