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
                    "                    },\n" +
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
                    "                            \"subsId\": \"8611010003008013\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9921906571\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"300005\",\n" +
                    "                            \"brand\": \"1\",\n" +
                    "                            \"primaryIdentity\": \"9921906571\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611010003113018\",\n" +
                    "                            \"paymentType\": \"0\",\n" +
                    "                            \"imsi\": \"432113960608023\",\n" +
                    "                            \"iccid\": \"8998113900060608023\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2022-12-12T11:56:41\",\n" +
                    "                            \"expDate\": \"2037-01-01T00:00:00\",\n" +
                    "                            \"activeDate\": \"2022-12-12T11:56:41\",\n" +
                    "                            \"status\": \"3\",\n" +
                    "                            \"statusTime\": \"2023-05-20T13:43:45\",\n" +
                    "                            \"statusDetail\": \"001000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"5000000051\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    },\n" +
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
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611000000759057\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9107539968\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"300005\",\n" +
                    "                            \"brand\": \"1\",\n" +
                    "                            \"primaryIdentity\": \"9107539968\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611000000751118\",\n" +
                    "                            \"paymentType\": \"0\",\n" +
                    "                            \"imsi\": \"432113952249119\",\n" +
                    "                            \"iccid\": \"8998113900052249119\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2019-01-22T16:41:47\",\n" +
                    "                            \"expDate\": \"2020-05-11T13:38:06\",\n" +
                    "                            \"activeDate\": \"2019-01-22T16:41:47\",\n" +
                    "                            \"status\": \"9\",\n" +
                    "                            \"statusTime\": \"2020-05-11T13:38:07\",\n" +
                    "                            \"statusDetail\": \"001000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"5000000051\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611010002820092\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9921906571\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"151\",\n" +
                    "                            \"brand\": \"1\",\n" +
                    "                            \"primaryIdentity\": \"9921906571\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611010002906181\",\n" +
                    "                            \"paymentType\": \"1\",\n" +
                    "                            \"imsi\": \"432113914089606\",\n" +
                    "                            \"iccid\": \"8998113900014089606\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2022-05-22T17:12:48\",\n" +
                    "                            \"expDate\": \"2022-12-12T11:47:36\",\n" +
                    "                            \"activeDate\": \"2022-04-26T16:54:22\",\n" +
                    "                            \"status\": \"9\",\n" +
                    "                            \"statusTime\": \"2022-12-12T11:47:37\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"5236334594\",\n" +
                    "                            \"beId\": \"10101\",\n" +
                    "                            \"remark\": \"Bulk Unbar B2BCreditControlReason\"\n" +
                    "                        }\n" +
                    "                    },\n" +
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
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611000001000028\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9102135075\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"157\",\n" +
                    "                            \"brand\": \"2\",\n" +
                    "                            \"primaryIdentity\": \"9102135075\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611000000994016\",\n" +
                    "                            \"paymentType\": \"1\",\n" +
                    "                            \"imsi\": \"432113911875753\",\n" +
                    "                            \"iccid\": \"8998113900011875753\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2019-12-31T12:14:26\",\n" +
                    "                            \"expDate\": \"2020-01-14T12:18:06\",\n" +
                    "                            \"activeDate\": \"2019-12-31T12:14:26\",\n" +
                    "                            \"status\": \"9\",\n" +
                    "                            \"statusTime\": \"2020-01-14T12:18:06\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"663\",\n" +
                    "                            \"salesChannelId\": \"663\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611000001000022\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9923015540\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"300063\",\n" +
                    "                            \"brand\": \"1\",\n" +
                    "                            \"primaryIdentity\": \"9923015540\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611000000994013\",\n" +
                    "                            \"paymentType\": \"0\",\n" +
                    "                            \"imsi\": \"432113911875754\",\n" +
                    "                            \"iccid\": \"8998113900011875754\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2018-12-31T12:02:48\",\n" +
                    "                            \"expDate\": \"2020-01-14T12:18:06\",\n" +
                    "                            \"activeDate\": \"2018-12-31T12:02:48\",\n" +
                    "                            \"status\": \"9\",\n" +
                    "                            \"statusTime\": \"2020-01-14T12:18:06\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"663\",\n" +
                    "                            \"salesChannelId\": \"663\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"8611000000759066\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"8611000000731043\",\n" +
                    "                            \"subsName\": \"9922114839\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"107\",\n" +
                    "                            \"brand\": \"2\",\n" +
                    "                            \"primaryIdentity\": \"9922114839\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"8611000000751133\",\n" +
                    "                            \"paymentType\": \"1\",\n" +
                    "                            \"imsi\": \"432113920542034\",\n" +
                    "                            \"iccid\": \"8998113900020542034\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2019-01-22T17:27:15\",\n" +
                    "                            \"expDate\": \"2021-09-22T11:39:00\",\n" +
                    "                            \"activeDate\": \"2019-01-22T17:27:15\",\n" +
                    "                            \"status\": \"9\",\n" +
                    "                            \"statusTime\": \"2021-09-22T11:39:01\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"5000000051\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    },\n" +
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
                    "                        \"subsId\": \"9610022321331805\",\n" +
                    "                        \"ownerPartyRoleType\": \"C\",\n" +
                    "                        \"ownerPartyRoleId\": \"9610012053388197\",\n" +
                    "                        \"subsWrittenLang\": \"Persian\",\n" +
                    "                        \"subsVocieLang\": \"4\",\n" +
                    "                        \"offeringId\": \"105\",\n" +
                    "                        \"brand\": \"2\",\n" +
                    "                        \"primaryIdentity\": \"9128598759\",\n" +
                    "                        \"networkType\": \"1\",\n" +
                    "                        \"defaultAcctId\": \"9610032321331805\",\n" +
                    "                        \"paymentType\": \"1\",\n" +
                    "                        \"imsi\": \"432112405263907\",\n" +
                    "                        \"iccid\": \"8998112400005263907\",\n" +
                    "                        \"subType\": \"1\",\n" +
                    "                        \"effDate\": \"2014-01-20T15:06:00\",\n" +
                    "                        \"expDate\": \"2037-01-01T00:00:00\",\n" +
                    "                        \"activeDate\": \"2014-01-20T15:06:00\",\n" +
                    "                        \"status\": \"2\",\n" +
                    "                        \"statusTime\": \"2018-02-05T00:00:01\",\n" +
                    "                        \"statusDetail\": \"000000000000\",\n" +
                    "                        \"salesChannelType\": \"601\",\n" +
                    "                        \"salesChannelId\": \"10101\",\n" +
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
                    "                            \"subsId\": \"9610021011994488\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"9610012053388197\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"300001\",\n" +
                    "                            \"brand\": \"1\",\n" +
                    "                            \"primaryIdentity\": \"9193052756\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"9610031011994488\",\n" +
                    "                            \"paymentType\": \"0\",\n" +
                    "                            \"imsi\": \"432113906326948\",\n" +
                    "                            \"iccid\": \"8998113900006326948\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2007-12-01T13:32:00\",\n" +
                    "                            \"expDate\": \"2037-01-01T00:00:00\",\n" +
                    "                            \"activeDate\": \"2007-12-01T13:32:00\",\n" +
                    "                            \"status\": \"2\",\n" +
                    "                            \"statusTime\": \"2017-03-18T14:17:09\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"beId\": \"10101\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"subInfo\": {\n" +
                    "                            \"subsId\": \"9610022321331805\",\n" +
                    "                            \"ownerPartyRoleType\": \"C\",\n" +
                    "                            \"ownerPartyRoleId\": \"9610012053388197\",\n" +
                    "                            \"subsWrittenLang\": \"Persian\",\n" +
                    "                            \"subsVocieLang\": \"4\",\n" +
                    "                            \"offeringId\": \"105\",\n" +
                    "                            \"brand\": \"2\",\n" +
                    "                            \"primaryIdentity\": \"9128598759\",\n" +
                    "                            \"networkType\": \"1\",\n" +
                    "                            \"defaultAcctId\": \"9610032321331805\",\n" +
                    "                            \"paymentType\": \"1\",\n" +
                    "                            \"imsi\": \"432112405263907\",\n" +
                    "                            \"iccid\": \"8998112400005263907\",\n" +
                    "                            \"subType\": \"1\",\n" +
                    "                            \"effDate\": \"2014-01-20T15:06:00\",\n" +
                    "                            \"expDate\": \"2037-01-01T00:00:00\",\n" +
                    "                            \"activeDate\": \"2014-01-20T15:06:00\",\n" +
                    "                            \"status\": \"2\",\n" +
                    "                            \"statusTime\": \"2018-02-05T00:00:01\",\n" +
                    "                            \"statusDetail\": \"000000000000\",\n" +
                    "                            \"salesChannelType\": \"601\",\n" +
                    "                            \"salesChannelId\": \"10101\",\n" +
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

    @GetMapping("/query-subscriber/new/acct/{account-id}")
    public Object mockNewQuerySubscriberAccount(Pageable pageable, @PathVariable(name = "account-id") String accountId,
                                                @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "";
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


}