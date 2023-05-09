package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryFreeUnitController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryFreeUnitController(RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-free-unit")
    public Object mockQueryFreeUnit() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <soapenv:Body>\n" +
                "        <bbs:QueryFreeUnitResultMsg xmlns:bbs=\"http://www.huawei.com/bme/cbsinterface/bbservices\" xmlns:cbs=\"http://www.huawei.com/bme/cbsinterface/cbscommon\">\n" +
                "            <ResultHeader>\n" +
                "                <cbs:Version>1</cbs:Version>\n" +
                "                <cbs:ResultCode>0</cbs:ResultCode>\n" +
                "                <cbs:ResultDesc>Operation successfully.</cbs:ResultDesc>\n" +
                "            </ResultHeader>\n" +
                "            <QueryFreeUnitResult>\n" +
                "                <bbs:FreeUnitItem>\n" +
                "                    <bbs:FreeUnitType>C_5007</bbs:FreeUnitType>\n" +
                "                    <bbs:FreeUnitTypeName>Data</bbs:FreeUnitTypeName>\n" +
                "                    <bbs:MeasureUnit>1106</bbs:MeasureUnit>\n" +
                "                    <bbs:MeasureUnitName>Bytes</bbs:MeasureUnitName>\n" +
                "                    <bbs:TotalInitialAmount>42962255872</bbs:TotalInitialAmount>\n" +
                "                    <bbs:TotalUnusedAmount>34014426830</bbs:TotalUnusedAmount>\n" +
                "                    <bbs:FreeUnitItemDetail>\n" +
                "                        <bbs:FreeUnitInstanceID>704000000226438849</bbs:FreeUnitInstanceID>\n" +
                "                        <bbs:InitialAmount>42962255872</bbs:InitialAmount>\n" +
                "                        <bbs:CurrentAmount>34014426830</bbs:CurrentAmount>\n" +
                "                        <bbs:UsedAmount>8947829042</bbs:UsedAmount>\n" +
                "                        <bbs:EffectiveTime>20230423084426</bbs:EffectiveTime>\n" +
                "                        <bbs:ExpireTime>20230523084426</bbs:ExpireTime>\n" +
                "                        <bbs:FreeUnitOrigin>\n" +
                "                            <bbs:OriginType>1</bbs:OriginType>\n" +
                "                            <bbs:OfferingKey>\n" +
                "                                <bbs:OfferingID>702030</bbs:OfferingID>\n" +
                "                                <bbs:PurchaseSeq>290100135336031585</bbs:PurchaseSeq>\n" +
                "                            </bbs:OfferingKey>\n" +
                "                        </bbs:FreeUnitOrigin>\n" +
                "                        <bbs:RollOverFlag>N</bbs:RollOverFlag>\n" +
                "                        <bbs:LastRollOveredTime>19700101033000</bbs:LastRollOveredTime>\n" +
                "                    </bbs:FreeUnitItemDetail>\n" +
                "                </bbs:FreeUnitItem>\n" +
                "                <bbs:FreeUnitItem>\n" +
                "                    <bbs:FreeUnitType>C_5015</bbs:FreeUnitType>\n" +
                "                    <bbs:FreeUnitTypeName>SMS offnet onnet</bbs:FreeUnitTypeName>\n" +
                "                    <bbs:MeasureUnit>1101</bbs:MeasureUnit>\n" +
                "                    <bbs:MeasureUnitName>Item</bbs:MeasureUnitName>\n" +
                "                    <bbs:TotalInitialAmount>150</bbs:TotalInitialAmount>\n" +
                "                    <bbs:TotalUnusedAmount>142</bbs:TotalUnusedAmount>\n" +
                "                    <bbs:FreeUnitItemDetail>\n" +
                "                        <bbs:FreeUnitInstanceID>704000000227621592</bbs:FreeUnitInstanceID>\n" +
                "                        <bbs:InitialAmount>150</bbs:InitialAmount>\n" +
                "                        <bbs:CurrentAmount>142</bbs:CurrentAmount>\n" +
                "                        <bbs:UsedAmount>8</bbs:UsedAmount>\n" +
                "                        <bbs:EffectiveTime>20230508130024</bbs:EffectiveTime>\n" +
                "                        <bbs:ExpireTime>20230607130022</bbs:ExpireTime>\n" +
                "                        <bbs:FreeUnitOrigin>\n" +
                "                            <bbs:OriginType>1</bbs:OriginType>\n" +
                "                            <bbs:OfferingKey>\n" +
                "                                <bbs:OfferingID>706400</bbs:OfferingID>\n" +
                "                                <bbs:PurchaseSeq>290100136620340923</bbs:PurchaseSeq>\n" +
                "                            </bbs:OfferingKey>\n" +
                "                        </bbs:FreeUnitOrigin>\n" +
                "                        <bbs:RollOverFlag>N</bbs:RollOverFlag>\n" +
                "                        <bbs:LastRollOveredTime>19700101033000</bbs:LastRollOveredTime>\n" +
                "                    </bbs:FreeUnitItemDetail>\n" +
                "                </bbs:FreeUnitItem>\n" +
                "                <bbs:FreeUnitItem>\n" +
                "                    <bbs:FreeUnitType>C_4000</bbs:FreeUnitType>\n" +
                "                    <bbs:FreeUnitTypeName>Onnet call</bbs:FreeUnitTypeName>\n" +
                "                    <bbs:MeasureUnit>1003</bbs:MeasureUnit>\n" +
                "                    <bbs:MeasureUnitName>Second</bbs:MeasureUnitName>\n" +
                "                    <bbs:TotalInitialAmount>9000</bbs:TotalInitialAmount>\n" +
                "                    <bbs:TotalUnusedAmount>9000</bbs:TotalUnusedAmount>\n" +
                "                    <bbs:FreeUnitItemDetail>\n" +
                "                        <bbs:FreeUnitInstanceID>704000000227621573</bbs:FreeUnitInstanceID>\n" +
                "                        <bbs:InitialAmount>9000</bbs:InitialAmount>\n" +
                "                        <bbs:CurrentAmount>9000</bbs:CurrentAmount>\n" +
                "                        <bbs:UsedAmount>0</bbs:UsedAmount>\n" +
                "                        <bbs:EffectiveTime>20230508130013</bbs:EffectiveTime>\n" +
                "                        <bbs:ExpireTime>20230607130013</bbs:ExpireTime>\n" +
                "                        <bbs:FreeUnitOrigin>\n" +
                "                            <bbs:OriginType>1</bbs:OriginType>\n" +
                "                            <bbs:OfferingKey>\n" +
                "                                <bbs:OfferingID>700315</bbs:OfferingID>\n" +
                "                                <bbs:PurchaseSeq>290100136620366732</bbs:PurchaseSeq>\n" +
                "                            </bbs:OfferingKey>\n" +
                "                        </bbs:FreeUnitOrigin>\n" +
                "                        <bbs:RollOverFlag>N</bbs:RollOverFlag>\n" +
                "                        <bbs:LastRollOveredTime>19700101033000</bbs:LastRollOveredTime>\n" +
                "                    </bbs:FreeUnitItemDetail>\n" +
                "                </bbs:FreeUnitItem>\n" +
                "            </QueryFreeUnitResult>\n" +
                "        </bbs:QueryFreeUnitResultMsg>\n" +
                "    </soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }
}