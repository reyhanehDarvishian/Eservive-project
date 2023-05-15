package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryCustomBillingInfoController {

    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryCustomBillingInfoController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }


    @GetMapping("/query-custom-billing-info/{phone-number}")
    @ResponseBody
    public Object queryCustomBillingInfo(@PathVariable(name = "phone-number") String phoneNumber,
                                         @RequestParam(name = "opType") int opType,
                                         @RequestParam(name = "date", required = false) String date,
                                         @RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "  \"body\": {\n" +
                    "    \"queryCustomBillingInfoResultMsg\": {\n" +
                    "      \"resultHeader\": {\n" +
                    "        \"version\": 1,\n" +
                    "        \"resultCode\": 118109004,\n" +
                    "        \"msgLanguageCode\": 2002,\n" +
                    "        \"resultDesc\": \"The service number 996049819 does not exist.\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        } else {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryCustomBillingInfoResultMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"version\": \"1\",\n" +
                    "                \"resultCode\": \"0\",\n" +
                    "                \"rsgLanguageCode\": \"2002\",\n" +
                    "                \"resultDesc\": \"Operation successfully.\"\n" +
                    "            },\n" +
                    "            \"queryCustomBillingInfoResult\": {\n" +
                    "                \"invoiceInfo\": {\n" +
                    "                    \"acctKey\": \"1611010003100016\",\n" +
                    "                    \"custKey\": \"1611010002969012\",\n" +
                    "                    \"subKey\": \"1611010002997007\",\n" +
                    "                    \"primaryIdentity\": \"9960449819\",\n" +
                    "                    \"status\": \"N\",\n" +
                    "                    \"invoiceSummary\": {\n" +
                    "                        \"eGov\": \"0.0\",\n" +
                    "                        \"onnetAmount\": \"0.0\",\n" +
                    "                        \"offnetAmount\": \"0.0\",\n" +
                    "                        \"onnetDuration\": \"0\",\n" +
                    "                        \"offnetDuration\": \"0\",\n" +
                    "                        \"totatRatingDiscount\": \"0.0\",\n" +
                    "                        \"voiceRatingDiscount\": \"0.0\",\n" +
                    "                        \"smsRatingDiscount\": \"0.0\",\n" +
                    "                        \"gprsRatingDiscount\": \"0.0\",\n" +
                    "                        \"postToPreBT\": \"0\",\n" +
                    "                        \"totalVoiceCallsDuration\": \"0.0\",\n" +
                    "                        \"subscriptionFee\": \"10080.0\",\n" +
                    "                        \"localVoiceCalls\": \"0.0\",\n" +
                    "                        \"internationVoiceCalls\": \"0.0\",\n" +
                    "                        \"internationalRoamingCharges\": \"0.0\",\n" +
                    "                        \"sms\": \"0.0\",\n" +
                    "                        \"vms\": \"0.0\",\n" +
                    "                        \"mms\": \"0.0\",\n" +
                    "                        \"internet\": \"0.0\",\n" +
                    "                        \"vas\": \"0.0\",\n" +
                    "                        \"packages\": \"0.0\",\n" +
                    "                        \"specialServices\": \"0.0\",\n" +
                    "                        \"totalAmount\": \"10080.0\",\n" +
                    "                        \"discount\": \"0.0\",\n" +
                    "                        \"tax\": \"907.2\",\n" +
                    "                        \"exemptionFee\": \"0.0\",\n" +
                    "                        \"charity\": \"0.0\",\n" +
                    "                        \"governmentGeneralIncome\": \"0.0\",\n" +
                    "                        \"sum\": \"10987.2\",\n" +
                    "                        \"totalOldDebts\": \"16287.7\",\n" +
                    "                        \"totalOldCredit\": \"0.0\",\n" +
                    "                        \"unconfirmedPayment\": \"0.0\",\n" +
                    "                        \"rounding\": \"274\",\n" +
                    "                        \"payable\": \"27000\",\n" +
                    "                        \"billId\": \"6186801230154\",\n" +
                    "                        \"paymentId\": \"2726200\",\n" +
                    "                        \"advancePayment\": \"0\",\n" +
                    "                        \"crmCosts\": \"0.0\"\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
    }
}
