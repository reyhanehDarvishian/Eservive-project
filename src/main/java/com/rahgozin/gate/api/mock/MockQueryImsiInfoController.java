package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryImsiInfoController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;
    public MockQueryImsiInfoController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-imsi-info/{phone-number}")
    public Object mockQueryImsiInfo() {
        return "<ns1:Envelope xmlns:ns0=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <ns1:Body xmlns:ns0=\"http://www.huawei.com/bes/crminterface/invservices\">\n" +
                "        <ns0:queryIMSIInfoRspMsg>\n" +
                "            <resultHeader xmlns:ns2=\"http://www.huawei.com/bes/crminterface/crmheader\">\n" +
                "                <ns2:version>1</ns2:version>\n" +
                "                <ns2:resultCode>0</ns2:resultCode>\n" +
                "                <ns2:resultDesc>Success</ns2:resultDesc>\n" +
                "            </resultHeader>\n" +
                "            <queryIMSIInfoResponse xmlns:ns1=\"http://www.huawei.com/bes/crminterface/invservices\">\n" +
                "                <ns1:PIN1>8357</ns1:PIN1>\n" +
                "                <ns1:PIN2>4764</ns1:PIN2>\n" +
                "                <ns1:PUK1>15603085</ns1:PUK1>\n" +
                "                <ns1:PUK2>57171612</ns1:PUK2>\n" +
                "                <ns1:simType>1</ns1:simType>\n" +
                "                <ns1:IMSI>432113960608020</ns1:IMSI>\n" +
                "                <ns1:ICCID>8998113900060608020</ns1:ICCID>\n" +
                "                <ns1:status>2</ns1:status>\n" +
                "                <ns1:warehouse>1</ns1:warehouse>\n" +
                "            </queryIMSIInfoResponse>\n" +
                "        </ns0:queryIMSIInfoRspMsg>\n" +
                "    </ns1:Body>\n" +
                "</ns1:Envelope>";
    }
}