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
                    "                        \"localVoiceCallsName\": \"مکالمه\",\n" +
                    "                        \"totalVoiceCallsDuration\": \"0.0\",\n" +
                    "                        \"subscriptionFeeTitle\": \"آبونمان\",\n" +
                    "                        \"subscriptionFee\": \"6510.0\",\n" +
                    "                        \"localVoiceCalls\": \"0.0\",\n" +
                    "                        \"InternationVoiceCallsTitle\": \"مکالمه با خارج از کشور\",\n" +
                    "                        \"internationVoiceCalls\": \"0.0\",\n" +
                    "                        \"internationalRoamingChargesTitle\": \"رومینگ بین الملل\",\n" +
                    "                        \"internationalRoamingCharges\": \"0.0\",\n" +
                    "                        \"smsTitle\": \"پیام کوتاه\",\n" +
                    "                        \"sms\": \"0.0\",\n" +
                    "                        \"vmsTitle\": \"پیام صوتی\",\n" +
                    "                        \"vms\": \"0.0\",\n" +
                    "                        \"mms\": \"0.0\",\n" +
                    "                        \"internetTitle\": \"اینترنت با تعرفه عادی\",\n" +
                    "                        \"internet\": \"0.0\",\n" +
                    "                        \"vasTitle\": \"بسته خدمات مبتنی بر محتوا\",\n" +
                    "                        \"vas\": \"0.0\",\n" +
                    "                        \"packagesTitle\": \"بسته ها\",\n" +
                    "                        \"packages\": \"0.0\",\n" +
                    "                        \"specialServicesTitle\": \"سرویس های ویژه\",\n" +
                    "                        \"specialServices\": \"0.0\",\n" +
                    "                        \"crmCostsTitle\": \"کارمزد خدمات\",\n" +
                    "                        \"totalAmountTitle\": \"جمع صورتحساب\",\n" +
                    "                        \"totalAmount\": \"6510.0\",\n" +
                    "                        \"discountTitle\": \"تخفیفات صورتحساب\",\n" +
                    "                        \"discount\": \"0.0\",\n" +
                    "                        \"taxTitle\": \"مالیات و عوارض\",\n" +
                    "                        \"tax\": \"585.9\",\n" +
                    "                        \"exemptionFeeTitle\": \"معافیت\",\n" +
                    "                        \"exemptionFee\": \"0.0\",\n" +
                    "                        \"charityTitle\": \"کمک های مردمی و باشگاه هواداری\",\n" +
                    "                        \"charity\": \"0.0\",\n" +
                    "                        \"governmentGeneralIncomeTitle\": \"درآمد عمومی دولت\",\n" +
                    "                        \"governmentGeneralIncome\": \"0.0\",\n" +
                    "                        \"sumTitle\": \"جمع سایر هزینه ها\",\n" +
                    "                        \"sum\": \"7095.9\",\n" +
                    "                        \"totalOldDebtsTitle\": \"بدهکاری پیشین\",\n" +
                    "                        \"totalOldDebts\": \"16287.7\",\n" +
                    "                        \"totalOldCreditTitle\": \"بستانکاری\",\n" +
                    "                        \"totalOldCredit\": \"0.0\",\n" +
                    "                        \"unconfirmedPaymentTitle\": \"وصولی تایید نشده\",\n" +
                    "                        \"unconfirmedPayment\": \"0.0\",\n" +
                    "                        \"roundingTitle\": \"کسر هزار ریال\",\n" +
                    "                        \"rounding\": \"383\",\n" +
                    "                        \"payableTitle\": \"مبلغ قابل پرداخت\",\n" +
                    "                        \"payable\": \"23000\",\n" +
                    "                        \"billId\": \"6186801230154\",\n" +
                    "                        \"paymentId\": \"2326377\",\n" +
                    "                        \"advancePayment\": \"0\",\n" +
                    "                        \"eGovTitle\": \"خدمات دولت الکترونیک\",\n" +
                    "                        \"eGov\": \"0.0\",\n" +
                    "                        \"onnetAmount\": \"0.0\",\n" +
                    "                        \"offnetAmount\": \"0.0\",\n" +
                    "                        \"onnetDuration\": \"0\",\n" +
                    "                        \"offnetDuration\": \"0\",\n" +
                    "                        \"totatRatingDiscount\": \"0.0\",\n" +
                    "                        \"voiceRatingDiscount\": \"0.0\",\n" +
                    "                        \"smsRatingDiscount\": \"0.0\",\n" +
                    "                        \"gprsRatingDiscount\": \"0.0\",\n" +
                    "                        \"postToPreBTTitle\": \"انتقال اعتبار\",\n" +
                    "                        \"postToPreBT\": \"0\",\n" +
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
