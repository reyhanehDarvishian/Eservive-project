package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryBusinessFeeController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryBusinessFeeController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-business-fee")
    public Object mockQueryBusinessFee() {
        return "<ns0:Envelope xmlns:ns0=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <ns0:Body xmlns:ns12=\"http://www.huawei.com/bes/crminterface/custservices\">\n" +
                "        <ns12:queryBusinessFeeRspMsg>\n" +
                "            <resultHeader xmlns:ns6=\"http://www.huawei.com/bes/crminterface/crmheader\">\n" +
                "                <ns6:version>1</ns6:version>\n" +
                "                <ns6:resultCode>0</ns6:resultCode>\n" +
                "                <ns6:resultDesc>Success</ns6:resultDesc>\n" +
                "            </resultHeader>\n" +
                "            <queryBusinessFeeResponse xmlns:ns12=\"http://www.huawei.com/bes/crminterface/custservices\">\n" +
                "                <ns12:feeDetails xmlns:ns12=\"http://www.huawei.com/bes/crminterface/custservices\">\n" +
                "                    <ns12:chargeCode>C_TRANSFER_OWNERSHIP_FEE</ns12:chargeCode>\n" +
                "                    <ns12:chargeCodeNames xmlns:ns12=\"http://www.huawei.com/bes/crminterface/custservices\">\n" +
                "                        <ns12:languageCode>en_US</ns12:languageCode>\n" +
                "                        <ns12:chargeCodeName>Transfer of Ownership Fee</ns12:chargeCodeName>\n" +
                "                    </ns12:chargeCodeNames>\n" +
                "                    <ns12:chargeCodeNames xmlns:ns12=\"http://www.huawei.com/bes/crminterface/custservices\">\n" +
                "                        <ns12:languageCode>fa_IR</ns12:languageCode>\n" +
                "                        <ns12:chargeCodeName>هزینه انتقال مالکیت </ns12:chargeCodeName>\n" +
                "                    </ns12:chargeCodeNames>\n" +
                "                    <ns12:chargeType>Charge Account</ns12:chargeType>\n" +
                "                    <ns12:unitPrice>250000</ns12:unitPrice>\n" +
                "                    <ns12:totaUpfrontCost>250000</ns12:totaUpfrontCost>\n" +
                "                    <ns12:tax>22500</ns12:tax>\n" +
                "                    <ns12:discount>0</ns12:discount>\n" +
                "                    <ns12:waived>0</ns12:waived>\n" +
                "                    <ns12:total>272500</ns12:total>\n" +
                "                </ns12:feeDetails>\n" +
                "                <ns12:totalUpfrontCost>250000</ns12:totalUpfrontCost>\n" +
                "                <ns12:totalTax>22500</ns12:totalTax>\n" +
                "                <ns12:totalTaxWaived>0</ns12:totalTaxWaived>\n" +
                "                <ns12:totalDiscount>0</ns12:totalDiscount>\n" +
                "                <ns12:totalWaived>0</ns12:totalWaived>\n" +
                "                <ns12:AccountDeduction>272500</ns12:AccountDeduction>\n" +
                "                <ns12:totalReceivable>0</ns12:totalReceivable>\n" +
                "                <ns12:CurrencyID>1069</ns12:CurrencyID>\n" +
                "            </queryBusinessFeeResponse>\n" +
                "        </ns12:queryBusinessFeeRspMsg>\n" +
                "    </ns0:Body>\n" +
                "</ns0:Envelope>";
    }
}