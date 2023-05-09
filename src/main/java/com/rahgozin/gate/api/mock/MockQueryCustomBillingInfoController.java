package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/middle-turn/query-custom-billing-info")
    public Object mockQueryCustomBillingInfoMiddle() {
        return "<NS1:Envelope xmlns:NS1=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <NS1:Body>\n" +
                "        <arc:QueryCustomBillingInfoResultMsg xmlns:arc=\"http://www.huawei.com/bme/cbsinterface/arcustomizedservices\" xmlns:cbs=\"http://www.huawei.com/bme/cbsinterface/cbscommon\">\n" +
                "            <ResultHeader>\n" +
                "                <cbs:Version>1</cbs:Version>\n" +
                "                <cbs:ResultCode>0</cbs:ResultCode>\n" +
                "                <cbs:MsgLanguageCode>2002</cbs:MsgLanguageCode>\n" +
                "                <cbs:ResultDesc>Operation successfully.</cbs:ResultDesc>\n" +
                "            </ResultHeader>\n" +
                "            <QueryCustomBillingInfoResult>\n" +
                "                <arc:InvoiceInfo>\n" +
                "                    <arc:AcctKey>1611010003100016</arc:AcctKey>\n" +
                "                    <arc:CustKey>1611010002969012</arc:CustKey>\n" +
                "                    <arc:SubKey>1611010002997007</arc:SubKey>\n" +
                "                    <arc:PrimaryIdentity>9960449819</arc:PrimaryIdentity>\n" +
                "                    <arc:Status>N</arc:Status>\n" +
                "                    <arc:InvoiceSummary>\n" +
                "                        <arc:TotalVoiceCallsDuration>0.0</arc:TotalVoiceCallsDuration>\n" +
                "                        <arc:SubscriptionFee>3150.0</arc:SubscriptionFee>\n" +
                "                        <arc:LocalVoiceCalls>0.0</arc:LocalVoiceCalls>\n" +
                "                        <arc:InternationVoiceCalls>0.0</arc:InternationVoiceCalls>\n" +
                "                        <arc:InternationalRoamingCharges>0.0</arc:InternationalRoamingCharges>\n" +
                "                        <arc:SMS>0.0</arc:SMS>\n" +
                "                        <arc:VMS>0.0</arc:VMS>\n" +
                "                        <arc:MMS>0.0</arc:MMS>\n" +
                "                        <arc:Internet>0.0</arc:Internet>\n" +
                "                        <arc:VAS>0.0</arc:VAS>\n" +
                "                        <arc:Packages>0.0</arc:Packages>\n" +
                "                        <arc:SpecialServices>0.0</arc:SpecialServices>\n" +
                "                        <arc:CRMCosts>0.0</arc:CRMCosts>\n" +
                "                        <arc:TotalAmount>3150.0</arc:TotalAmount>\n" +
                "                        <arc:Discount>0.0</arc:Discount>\n" +
                "                        <arc:Tax>283.5</arc:Tax>\n" +
                "                        <arc:ExemptionFee>0.0</arc:ExemptionFee>\n" +
                "                        <arc:Charity>0.0</arc:Charity>\n" +
                "                        <arc:GovernmentGeneralIncome>0.0</arc:GovernmentGeneralIncome>\n" +
                "                        <arc:Sum>3433.5</arc:Sum>\n" +
                "                        <arc:TotalOldDebts>16287.7</arc:TotalOldDebts>\n" +
                "                        <arc:TotalOldCredit>0.0</arc:TotalOldCredit>\n" +
                "                        <arc:UnconfirmedPayment>0.0</arc:UnconfirmedPayment>\n" +
                "                        <arc:Rounding>721</arc:Rounding>\n" +
                "                        <arc:Payable>19000</arc:Payable>\n" +
                "                        <arc:BillId>6186801230154</arc:BillId>\n" +
                "                        <arc:PaymentId>1926273</arc:PaymentId>\n" +
                "                        <arc:AdvancePayment>0</arc:AdvancePayment>\n" +
                "                        <arc:eGov>0.0</arc:eGov>\n" +
                "                        <arc:onnetAmount>0.0</arc:onnetAmount>\n" +
                "                        <arc:offnetAmount>0.0</arc:offnetAmount>\n" +
                "                        <arc:onnetDuration>0</arc:onnetDuration>\n" +
                "                        <arc:offnetDuration>0</arc:offnetDuration>\n" +
                "                        <arc:totatRatingDiscount>0.0</arc:totatRatingDiscount>\n" +
                "                        <arc:voiceRatingDiscount>0.0</arc:voiceRatingDiscount>\n" +
                "                        <arc:smsRatingDiscount>0.0</arc:smsRatingDiscount>\n" +
                "                        <arc:gprsRatingDiscount>0.0</arc:gprsRatingDiscount>\n" +
                "                        <arc:postToPreBT>0</arc:postToPreBT>\n" +
                "                    </arc:InvoiceSummary>\n" +
                "                </arc:InvoiceInfo>\n" +
                "            </QueryCustomBillingInfoResult>\n" +
                "        </arc:QueryCustomBillingInfoResultMsg>\n" +
                "    </NS1:Body>\n" +
                "</NS1:Envelope>";
    }

    @GetMapping("/end-turn/query-custom-billing-info")
    public Object mockQueryCustomBillingInfoPayan() {
        return "<NS1:Envelope xmlns:NS1=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <NS1:Body>\n" +
                "        <arc:QueryCustomBillingInfoResultMsg xmlns:arc=\"http://www.huawei.com/bme/cbsinterface/arcustomizedservices\" xmlns:cbs=\"http://www.huawei.com/bme/cbsinterface/cbscommon\">\n" +
                "            <ResultHeader>\n" +
                "                <cbs:Version>1</cbs:Version>\n" +
                "                <cbs:ResultCode>0</cbs:ResultCode>\n" +
                "                <cbs:MsgLanguageCode>2002</cbs:MsgLanguageCode>\n" +
                "                <cbs:ResultDesc>Operation successfully.</cbs:ResultDesc>\n" +
                "            </ResultHeader>\n" +
                "            <QueryCustomBillingInfoResult>\n" +
                "                <arc:InvoiceInfo>\n" +
                "                    <arc:AcctKey>1611010003100016</arc:AcctKey>\n" +
                "                    <arc:CustKey>1611010002969012</arc:CustKey>\n" +
                "                    <arc:SubKey>1611010002997007</arc:SubKey>\n" +
                "                    <arc:PrimaryIdentity>9960449819</arc:PrimaryIdentity>\n" +
                "                    <arc:Status>N</arc:Status>\n" +
                "                    <arc:InvoiceSummary>\n" +
                "                        <arc:TotalVoiceCallsDuration>0.0</arc:TotalVoiceCallsDuration>\n" +
                "                        <arc:SubscriptionFee>3150.0</arc:SubscriptionFee>\n" +
                "                        <arc:LocalVoiceCalls>0.0</arc:LocalVoiceCalls>\n" +
                "                        <arc:InternationVoiceCalls>0.0</arc:InternationVoiceCalls>\n" +
                "                        <arc:InternationalRoamingCharges>0.0</arc:InternationalRoamingCharges>\n" +
                "                        <arc:SMS>0.0</arc:SMS>\n" +
                "                        <arc:VMS>0.0</arc:VMS>\n" +
                "                        <arc:MMS>0.0</arc:MMS>\n" +
                "                        <arc:Internet>0.0</arc:Internet>\n" +
                "                        <arc:VAS>0.0</arc:VAS>\n" +
                "                        <arc:Packages>0.0</arc:Packages>\n" +
                "                        <arc:SpecialServices>0.0</arc:SpecialServices>\n" +
                "                        <arc:CRMCosts>0.0</arc:CRMCosts>\n" +
                "                        <arc:TotalAmount>3150.0</arc:TotalAmount>\n" +
                "                        <arc:Discount>0.0</arc:Discount>\n" +
                "                        <arc:Tax>283.5</arc:Tax>\n" +
                "                        <arc:ExemptionFee>0.0</arc:ExemptionFee>\n" +
                "                        <arc:Charity>0.0</arc:Charity>\n" +
                "                        <arc:GovernmentGeneralIncome>0.0</arc:GovernmentGeneralIncome>\n" +
                "                        <arc:Sum>3433.5</arc:Sum>\n" +
                "                        <arc:TotalOldDebts>16287.7</arc:TotalOldDebts>\n" +
                "                        <arc:TotalOldCredit>0.0</arc:TotalOldCredit>\n" +
                "                        <arc:UnconfirmedPayment>0.0</arc:UnconfirmedPayment>\n" +
                "                        <arc:Rounding>721</arc:Rounding>\n" +
                "                        <arc:Payable>19000</arc:Payable>\n" +
                "                        <arc:BillId>6186801230154</arc:BillId>\n" +
                "                        <arc:PaymentId>1926273</arc:PaymentId>\n" +
                "                        <arc:AdvancePayment>0</arc:AdvancePayment>\n" +
                "                        <arc:eGov>0.0</arc:eGov>\n" +
                "                        <arc:onnetAmount>0.0</arc:onnetAmount>\n" +
                "                        <arc:offnetAmount>0.0</arc:offnetAmount>\n" +
                "                        <arc:onnetDuration>0</arc:onnetDuration>\n" +
                "                        <arc:offnetDuration>0</arc:offnetDuration>\n" +
                "                        <arc:totatRatingDiscount>0.0</arc:totatRatingDiscount>\n" +
                "                        <arc:voiceRatingDiscount>0.0</arc:voiceRatingDiscount>\n" +
                "                        <arc:smsRatingDiscount>0.0</arc:smsRatingDiscount>\n" +
                "                        <arc:gprsRatingDiscount>0.0</arc:gprsRatingDiscount>\n" +
                "                        <arc:postToPreBT>0</arc:postToPreBT>\n" +
                "                    </arc:InvoiceSummary>\n" +
                "                </arc:InvoiceInfo>\n" +
                "            </QueryCustomBillingInfoResult>\n" +
                "        </arc:QueryCustomBillingInfoResultMsg>\n" +
                "    </NS1:Body>\n" +
                "</NS1:Envelope>";
    }
}
