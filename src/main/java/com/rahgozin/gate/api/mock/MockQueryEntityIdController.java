package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryEntityIdController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryEntityIdController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-entity-id/{phone-number}")
    public Object mockQueryEntityId(@PathVariable(name = "phone-number") String phoneNumber,
                                    @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\\n\" +\n" +
                    "                    \"    \\\"body\\\": {\\n\" +\n" +
                    "                    \"        \\\"queryEntityIdRspMsg\\\": {\\n\" +\n" +
                    "                    \"            \\\"resultHeader\\\": {\\n\" +\n" +
                    "                    \"                \\\"version\\\": \\\"1\\\",\\n\" +\n" +
                    "                    \"                \\\"resultCode\\\": \\\"0\\\",\\n\" +\n" +
                    "                    \"                \\\"resultDesc\\\": \\\"success\\\"\\n\" +\n" +
                    "                    \"            },\\n\" +\n" +
                    "                    \"            \\\"queryEntityIdResponse\\\": {\\n\" +\n" +
                    "                    \"                \\\"entityInfo\\\": {\\n\" +\n" +
                    "                    \"                    \\\"entityType\\\": \\\"C\\\",\\n\" +\n" +
                    "                    \"                },\\n\" +\n" +
                    "                    \"                \\\"entityInfos\\\": [\\n\" +\n" +
                    "                    \"                    {\\n\" +\n" +
                    "                    \"                        \\\"entityType\\\": \\\"C\\\",\\n\" +\n" +
                    "                    \"                    }\\n\" +\n" +
                    "                    \"                ]\\n\" +\n" +
                    "                    \"            }\\n\" +\n" +
                    "                    \"        }\\n\" +\n" +
                    "                    \"    }\\n\" +\n" +
                    "                    \"}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryEntityIdRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"success\"\n" +
                    "            },\n" +
                    "            \"queryEntityIdResponse\": {\n" +
                    "                \"entityInfos\": [\n" +
                    "                    {\n" +
                    "                        \"entityType\": \"A\",\n" +
                    "                        \"entityId\": \"9610032321331805\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"entityType\": \"S\",\n" +
                    "                        \"entityId\": \"9610022321331805\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"entityType\": \"C\",\n" +
                    "                        \"entityId\": \"9610012053388197\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}