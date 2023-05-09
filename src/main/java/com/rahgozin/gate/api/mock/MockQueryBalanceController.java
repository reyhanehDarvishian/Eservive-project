package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryBalanceController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryBalanceController(RestTemplateBuilder restTemplateBuilder,
                                      ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-balance")
    public Object mockQueryBalanceService() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <soapenv:Body>\n" +
                "        <ars:QueryBalanceResultMsg xmlns:ars=\"http://www.huawei.com/bme/cbsinterface/arservices\" xmlns:arc=\"http://cbs.huawei.com/ar/wsservice/arcommon\" xmlns:cbs=\"http://www.huawei.com/bme/cbsinterface/cbscommon\">\n" +
                "            <ResultHeader>\n" +
                "                <cbs:Version>1</cbs:Version>\n" +
                "                <cbs:ResultCode>0</cbs:ResultCode>\n" +
                "                <cbs:MsgLanguageCode>2002</cbs:MsgLanguageCode>\n" +
                "                <cbs:ResultDesc>Operation successfully.</cbs:ResultDesc>\n" +
                "            </ResultHeader>\n" +
                "            <QueryBalanceResult>\n" +
                "                <ars:AcctList>\n" +
                "                    <ars:AcctKey>8611010003113018</ars:AcctKey>\n" +
                "                    <ars:BalanceResult>\n" +
                "                        <arc:BalanceType>C_MAIN_ACCOUNT_1278128700</arc:BalanceType>\n" +
                "                        <arc:BalanceTypeName>Prepaid_Balance_Subaccount</arc:BalanceTypeName>\n" +
                "                        <arc:TotalAmount>0</arc:TotalAmount>\n" +
                "                        <arc:DepositFlag>N</arc:DepositFlag>\n" +
                "                        <arc:RefundFlag>1</arc:RefundFlag>\n" +
                "                        <arc:CurrencyID>1069</arc:CurrencyID>\n" +
                "                        <arc:BalanceDetail>\n" +
                "                            <arc:BalanceInstanceID>701000000000206973</arc:BalanceInstanceID>\n" +
                "                            <arc:Amount>0</arc:Amount>\n" +
                "                            <arc:InitialAmount>0</arc:InitialAmount>\n" +
                "                            <arc:UsedAmount>0</arc:UsedAmount>\n" +
                "                            <arc:EffectiveTime>20221212115648</arc:EffectiveTime>\n" +
                "                            <arc:ExpireTime>20370101033000</arc:ExpireTime>\n" +
                "                        </arc:BalanceDetail>\n" +
                "                    </ars:BalanceResult>\n" +
                "                    <ars:AccountCredit>\n" +
                "                        <ars:TotalCreditAmount>0</ars:TotalCreditAmount>\n" +
                "                        <ars:TotalUsageAmount>0</ars:TotalUsageAmount>\n" +
                "                        <ars:TotalRemainAmount>0</ars:TotalRemainAmount>\n" +
                "                        <ars:CurrencyID>1069</ars:CurrencyID>\n" +
                "                    </ars:AccountCredit>\n" +
                "                </ars:AcctList>\n" +
                "            </QueryBalanceResult>\n" +
                "        </ars:QueryBalanceResultMsg>\n" +
                "    </soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }
}
