package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock/api/v1")
public class MockChangeImsiReportController {

    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockChangeImsiReportController(RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/change-imsi-report")
    public Object mockChangeImsiReport() {
        return "<ns2:Envelope xmlns:ns0=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns2=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <ns2:Body xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "        <ns1:changeIMSIReportRspMsg>\n" +
                "            <resultHeader xmlns:ns0=\"http://www.huawei.com/bes/crminterface/crmheader\">\n" +
                "                <ns0:version>1</ns0:version>\n" +
                "                <ns0:resultCode>0</ns0:resultCode>\n" +
                "                <ns0:resultDesc>success</ns0:resultDesc>\n" +
                "            </resultHeader>\n" +
                "            <changeIMSIReportResponse xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                <ns1:IMSIHistory xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                    <ns1:businessFee>0</ns1:businessFee>\n" +
                "                    <ns1:channelId>601</ns1:channelId>\n" +
                "                    <ns1:createProleId>1551769783058199481</ns1:createProleId>\n" +
                "                    <ns1:createProleType>E</ns1:createProleType>\n" +
                "                    <ns1:createTime>2019-08-07T10:03:28</ns1:createTime>\n" +
                "                    <ns1:newIMSI>8998113900001031961</ns1:newIMSI>\n" +
                "                    <ns1:oldIMSI>8998113900001031856</ns1:oldIMSI>\n" +
                "                    <ns1:orderId>130100000001343099</ns1:orderId>\n" +
                "                </ns1:IMSIHistory>\n" +
                "                <ns1:IMSIHistory xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                    <ns1:businessFee>0</ns1:businessFee>\n" +
                "                    <ns1:channelId>601</ns1:channelId>\n" +
                "                    <ns1:createProleId>1551769783058199481</ns1:createProleId>\n" +
                "                    <ns1:createProleType>E</ns1:createProleType>\n" +
                "                    <ns1:createTime>2019-08-28T15:47:05</ns1:createTime>\n" +
                "                    <ns1:newIMSI>8998113900052249123</ns1:newIMSI>\n" +
                "                    <ns1:oldIMSI>8998113900001031961</ns1:oldIMSI>\n" +
                "                    <ns1:orderId>130100000001366195</ns1:orderId>\n" +
                "                </ns1:IMSIHistory>\n" +
                "            </changeIMSIReportResponse>\n" +
                "        </ns1:changeIMSIReportRspMsg>\n" +
                "    </ns2:Body>\n" +
                "</ns2:Envelope>";
    }

}
