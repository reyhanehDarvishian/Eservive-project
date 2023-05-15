package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQuerySubscriberController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQuerySubscriberController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-subscriber/sub/{phone-number}")
    public Object mockQuerySubscriber(Pageable pageable, @PathVariable(name = "phone-number") String phoneNumber,
                                      @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"resultHeader\": {\n" +
                    "      \"version\": 1,\n" +
                    "      \"resultCode\": 14809002,\n" +
                    "      \"resultDesc\": \"customer OR subscriber does not exist\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"querySubscriberRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"success\"\n" +
                    "            },\n" +
                    "            \"querySubscriberResponse\": {\n" +
                    "                \"subscriberInfo\": {\n" +
                    "                    \"subInfo\": {\n" +
                    "                        \"subsId\": \"8611010002820090\",\n" +
                    "                        \"ownerPartyRoleType\": \"C\",\n" +
                    "                        \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                        \"subsName\": \"9921905802\",\n" +
                    "                        \"subsWrittenLang\": \"Persian\",\n" +
                    "                        \"subsVocieLang\": \"4\",\n" +
                    "                        \"offeringId\": \"107\",\n" +
                    "                        \"brand\": \"2\",\n" +
                    "                        \"primaryIdentity\": \"9921905802\",\n" +
                    "                        \"networkType\": \"1\",\n" +
                    "                        \"defaultAcctId\": \"8611010002877093\",\n" +
                    "                        \"paymentType\": \"1\",\n" +
                    "                        \"imsi\": \"432113911287746\",\n" +
                    "                        \"iccid\": \"8998113900011287746\",\n" +
                    "                        \"subType\": \"1\",\n" +
                    "                        \"effDate\": \"2022-04-26T16:45:47\",\n" +
                    "                        \"expDate\": \"2022-12-12T11:46:54\",\n" +
                    "                        \"activeDate\": \"2022-04-26T16:45:47\",\n" +
                    "                        \"status\": \"9\",\n" +
                    "                        \"statusTime\": \"2022-12-12T11:46:56\",\n" +
                    "                        \"statusDetail\": \"000000000000\",\n" +
                    "                        \"salesChannelType\": \"601\",\n" +
                    "                        \"salesChannelId\": \"5236334594\",\n" +
                    "                        \"beId\": \"10101\",\n" +
                    "                        \"remark\": \"Bulk Unbar B2BCreditControlReason\"\n" +
                    "                    }\n" +
                    "                },\n" +
                    "                \"pageQuery\": {\n" +
                    "                    \"pageSize\": \"20\",\n" +
                    "                    \"startNum\": \"0\",\n" +
                    "                    \"totalNum\": \"20\"\n" +
                    "                },\n" +
                    "                \"subscribersInfoRes\": [\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611010002820090\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9921905802\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"107\",\n" +
                    "                            \"brand\": \"2\",\n" +
                    "                            \"primaryIdentity\": \"9921905802\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611010002877093\",\n" +
                    "                            \"paymentType\": \"1\",\n" +
                    "                            \"imsi\": \"432113911287746\",\n" +
                    "                            \"iccid\": \"8998113900011287746\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2022-04-26T16:45:47\",\n" +
                    "                            \"expDate\": \"2022-12-12T11:46:54\",\n" +
                    "                            \"activeDate\": \"2022-04-26T16:45:47\",\n" +
                    "                            \"status\": \"9\",\n" +
                    "                            \"statusTime\": \"2022-12-12T11:46:56\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"5236334594\",\n" +
                    "                            \"beId\": \"10101\",\n" +
                    "                            \"remark\": \"Bulk Unbar B2BCreditControlReason\"\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }

    }

    @GetMapping("/query-subscriber/cust/{customer-id}")
    public Object mockQuerySubscriberCustomer(Pageable pageable, @PathVariable(name = "customer-id") String customerId,
                                              @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"Body\": {\n" +
                    "    \"Fault\": {\n" +
                    "      \"faultcode\": 14805001,\n" +
                    "      \"faultstring\": \"The service offered by esb is not available to be accessed\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"querySubscriberRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"success\"\n" +
                    "            },\n" +
                    "            \"querySubscriberResponse\": {\n" +
                    "                \"subscriberInfo\": {\n" +
                    "                    \"subInfo\": {\n" +
                    "                        \"subsId\": \"8611000000759062\",\n" +
                    "                        \"ownerPartyRoleType\": \"C\",\n" +
                    "                        \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                        \"subsName\": \"9922119704\",\n" +
                    "                        \"subsWrittenLang\": \"Persian\",\n" +
                    "                        \"subsVocieLang\": \"4\",\n" +
                    "                        \"offeringId\": \"107\",\n" +
                    "                        \"brand\": \"2\",\n" +
                    "                        \"primaryIdentity\": \"9922119704\",\n" +
                    "                        \"networkType\": \"1\",\n" +
                    "                        \"defaultAcctId\": \"8611000000751127\",\n" +
                    "                        \"paymentType\": \"1\",\n" +
                    "                        \"imsi\": \"432113952249110\",\n" +
                    "                        \"iccid\": \"8998113900052249110\",\n" +
                    "                        \"subType\": \"1\",\n" +
                    "                        \"effDate\": \"2019-01-22T17:02:02\",\n" +
                    "                        \"expDate\": \"2021-09-22T11:39:42\",\n" +
                    "                        \"activeDate\": \"2019-01-22T17:02:02\",\n" +
                    "                        \"status\": \"9\",\n" +
                    "                        \"statusTime\": \"2021-09-22T11:39:42\",\n" +
                    "                        \"statusDetail\": \"000000000000\",\n" +
                    "                        \"salesChannelType\": \"601\",\n" +
                    "                        \"salesChannelId\": \"5000000051\",\n" +
                    "                        \"beId\": \"10101\"\n" +
                    "                    }\n" +
                    "                },\n" +
                    "                \"pageQuery\": {\n" +
                    "                    \"pageSize\": \"20\",\n" +
                    "                    \"startNum\": \"0\",\n" +
                    "                    \"totalNum\": \"20\"\n" +
                    "                },\n" +
                    "                \"subscribersInfoRes\": [\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611000000759062\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9922119704\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"107\",\n" +
                    "                            \"brand\": \"2\",\n" +
                    "                            \"primaryIdentity\": \"9922119704\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611000000751127\",\n" +
                    "                            \"paymentType\": \"1\",\n" +
                    "                            \"imsi\": \"432113952249110\",\n" +
                    "                            \"iccid\": \"8998113900052249110\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2019-01-22T17:02:02\",\n" +
                    "                            \"expDate\": \"2021-09-22T11:39:42\",\n" +
                    "                            \"activeDate\": \"2019-01-22T17:02:02\",\n" +
                    "                            \"status\": \"9\",\n" +
                    "                            \"statusTime\": \"2021-09-22T11:39:42\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"5000000051\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }

    }

    @GetMapping("/query-subscriber/acct/{account-id}")
    public Object mockQuerySubscriberAccount(Pageable pageable, @PathVariable(name = "account-id") String accountId,
                                             @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"Body\": {\n" +
                    "    \"Fault\": {\n" +
                    "      \"faultcode\": 14805001,\n" +
                    "      \"faultstring\": \"The service offered by esb is not available to be accessed\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"querySubscriberRspMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"resultDesc\": \"success\"\n" +
                    "            },\n" +
                    "            \"querySubscriberResponse\": {\n" +
                    "                \"subscriberInfo\": {\n" +
                    "                    \"subInfo\": {\n" +
                    "                        \"subsId\": \"8611010003008015\",\n" +
                    "                        \"ownerPartyRoleType\": \"C\",\n" +
                    "                        \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                        \"subsName\": \"9921905802\",\n" +
                    "                        \"subsWrittenLang\": \"Persian\",\n" +
                    "                        \"subsVocieLang\": \"4\",\n" +
                    "                        \"offeringId\": \"300005\",\n" +
                    "                        \"brand\": \"1\",\n" +
                    "                        \"primaryIdentity\": \"9921905802\",\n" +
                    "                        \"networkType\": \"1\",\n" +
                    "                        \"defaultAcctId\": \"8611010003113020\",\n" +
                    "                        \"paymentType\": \"0\",\n" +
                    "                        \"imsi\": \"432113960608020\",\n" +
                    "                        \"iccid\": \"8998113900060608020\",\n" +
                    "                        \"subType\": \"1\",\n" +
                    "                        \"effDate\": \"2022-12-12T12:22:59\",\n" +
                    "                        \"expDate\": \"2037-01-01T00:00:00\",\n" +
                    "                        \"activeDate\": \"2022-12-12T12:22:59\",\n" +
                    "                        \"status\": \"3\",\n" +
                    "                        \"statusTime\": \"2023-04-12T20:04:15\",\n" +
                    "                        \"statusDetail\": \"001000000000\",\n" +
                    "                        \"salesChannelType\": \"601\",\n" +
                    "                        \"salesChannelId\": \"5000000051\",\n" +
                    "                        \"beId\": \"10101\"\n" +
                    "                    }\n" +
                    "                },\n" +
                    "                \"pageQuery\": {\n" +
                    "                    \"pageSize\": \"20\",\n" +
                    "                    \"startNum\": \"0\",\n" +
                    "                    \"totalNum\": \"20\"\n" +
                    "                },\n" +
                    "                \"subscribersInfoRes\": [\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611010003008015\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9921905802\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"300005\",\n" +
                    "                            \"brand\": \"1\",\n" +
                    "                            \"primaryIdentity\": \"9921905802\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611010003113020\",\n" +
                    "                            \"paymentType\": \"0\",\n" +
                    "                            \"imsi\": \"432113960608020\",\n" +
                    "                            \"iccid\": \"8998113900060608020\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2022-12-12T12:22:59\",\n" +
                    "                            \"expDate\": \"2037-01-01T00:00:00\",\n" +
                    "                            \"activeDate\": \"2022-12-12T12:22:59\",\n" +
                    "                            \"status\": \"3\",\n" +
                    "                            \"statusTime\": \"2023-04-12T20:04:15\",\n" +
                    "                            \"statusDetail\": \"001000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"5000000051\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }

    @GetMapping("/query-subscriber/new/cust/{customer-id}")
    public Object mockNewQuerySubscriberCustomer(Pageable pageable, @PathVariable(name = "customer-id") String customerId,
                                                 @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "";
        } else {
            return "";
        }
    }

    @GetMapping("/query-subscriber/new/acct/{account-id}")
    public Object mockNewQuerySubscriberAccount(Pageable pageable, @PathVariable(name = "account-id") String accountId,
                                                @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "";
        } else {
            return "";
        }

    }


}