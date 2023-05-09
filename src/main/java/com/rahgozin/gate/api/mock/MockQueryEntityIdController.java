package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mock/api/v1")
@RestController
public class MockQueryEntityIdController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;
//    MockQueryEntityIdService mockQueryEntityIdService = new MockServiceImpl(restTemplateBuilder, applicationProperties);

    public MockQueryEntityIdController
            (RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-entity-id/{phone-number}")
    public Object mockQueryEntityId() {
        return "<ns0:Envelope xmlns:ns0=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <ns0:Body xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "        <ns1:queryEntityIdRspMsg>\n" +
                "            <resultHeader xmlns:ns3=\"http://www.huawei.com/bes/crminterface/crmheader\">\n" +
                "                <ns3:version>1</ns3:version>\n" +
                "                <ns3:resultCode>0</ns3:resultCode>\n" +
                "                <ns3:resultDesc>success</ns3:resultDesc>\n" +
                "            </resultHeader>\n" +
                "            <queryEntityIdResponse xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                <ns1:entityInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                    <ns2:entityType>A</ns2:entityType>\n" +
                "                    <ns2:entityId>8611010003113018</ns2:entityId>\n" +
                "                </ns1:entityInfo>\n" +
                "                <ns1:entityInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                    <ns2:entityType>S</ns2:entityType>\n" +
                "                    <ns2:entityId>8611010003008013</ns2:entityId>\n" +
                "                </ns1:entityInfo>\n" +
                "                <ns1:entityInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                    <ns2:entityType>C</ns2:entityType>\n" +
                "                    <ns2:entityId>8611000000731043</ns2:entityId>\n" +
                "                </ns1:entityInfo>\n" +
                "            </queryEntityIdResponse>\n" +
                "        </ns1:queryEntityIdRspMsg>\n" +
                "    </ns0:Body>\n" +
                "</ns0:Envelope>";
    }
}