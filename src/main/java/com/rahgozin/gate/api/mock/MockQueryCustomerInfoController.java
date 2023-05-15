package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock/api/v1")
public class MockQueryCustomerInfoController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;
//    public MockQueryCustomerInfoService mockQueryCustomerInfoService = new MockServiceImpl(restTemplateBuilder,applicationProperties);

    public MockQueryCustomerInfoController(RestTemplateBuilder restTemplateBuilder,
                                           ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-customer-info/{phone-number}")
    public Object mockQueryCustomerInfo(@PathVariable(name = "phone-number") String phoneNumber,
                                        @RequestHeader(name = "ERROR",required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"queryCustomerInfoRspMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 1,\n" +
                    "        \"resultCode\": 14809002,\n" +
                    "        \"resultDesc\": \"customer OR subscriber does not exist\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryCustomerInfoRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"success\"\n" +
                    "            },\n" +
                    "            \"queryCustomerInfoResponse\": {\n" +
                    "                \"customer\": {\n" +
                    "                    \"customerId\": \"8611000000731043\",\n" +
                    "                    \"custBasicInfo\": {\n" +
                    "                        \"custCode\": \"11000000698040\",\n" +
                    "                        \"custType\": \"1\",\n" +
                    "                        \"custClass\": \"1\",\n" +
                    "                        \"partyId\": \"11000000814086\",\n" +
                    "                        \"regionId\": \"10101\"\n" +
                    "                    },\n" +
                    "                    \"individualInfo\": {\n" +
                    "                        \"individualBaseInfo\": {\n" +
                    "                            \"individualId\": \"11000000814086\",\n" +
                    "                            \"firstName\": \"طاهره\",\n" +
                    "                            \"lastName\": \"طاهری بازخانه\",\n" +
                    "                            \"title\": \"3\",\n" +
                    "                            \"gender\": \"0\",\n" +
                    "                            \"birthday\": \"1990-08-12T00:00:00\",\n" +
                    "                            \"nationality\": \"IRN\",\n" +
                    "                            \"nativePlace\": \"بجنورد\",\n" +
                    "                            \"writtenLang\": \"Persian\",\n" +
                    "                            \"phoneticLang\": \"4\",\n" +
                    "                            \"individualProperty\": {\n" +
                    "                                \"code\": \"birthIDCardIssuedPlace\",\n" +
                    "                                \"value\": \"بجنورد\"\n" +
                    "                            },\n" +
                    "                            \"individualProperties\": [\n" +
                    "                                {\n" +
                    "                                    \"code\": \"birthIDCardIssuedPlace\",\n" +
                    "                                    \"value\": \"بجنورد\"\n" +
                    "                                }\n" +
                    "                            ]\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    \"addressInfo\": {\n" +
                    "                        \"addressId\": \"8612000000649068\",\n" +
                    "                        \"preferenceFlag\": \"Y\",\n" +
                    "                        \"effDate\": \"2019-01-22T16:41:49\",\n" +
                    "                        \"expDate\": \"2037-01-01T00:00:00\",\n" +
                    "                        \"addrType\": \"6010506003\",\n" +
                    "                        \"addressInfo\": {\n" +
                    "                            \"addrId\": \"8612000000649068\",\n" +
                    "                            \"addrClass\": \"S\",\n" +
                    "                            \"addr1\": \"ایران\",\n" +
                    "                            \"addr2\": \"آذربایجان غربی\",\n" +
                    "                            \"addr3\": \"سردشت\",\n" +
                    "                            \"usAddr\": \"تست تست تست\",\n" +
                    "                            \"postalCode\": \"1111111111\"\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                },\n" +
                    "                \"defaultAccountId\": \"8611000000751118\"\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}
