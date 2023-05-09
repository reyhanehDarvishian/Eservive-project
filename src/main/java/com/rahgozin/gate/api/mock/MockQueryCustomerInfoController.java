package com.rahgozin.gate.api.mock;

import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock/api/v1")
public class MockQueryCustomerInfoController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;
//    public MockQueryCustomerInfoService mockQueryCustomerInfoService = new MockServiceImpl(restTemplateBuilder,applicationProperties);

    public MockQueryCustomerInfoController(RestTemplateBuilder restTemplateBuilder,
                                           ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-customer-info")
    public Object mockQueryCustomerInfo() {
        return "<ns0:Envelope xmlns:ns0=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <ns0:Body xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "        <ns1:queryCustomerInfoRspMsg>\n" +
                "            <resultHeader xmlns:ns3=\"http://www.huawei.com/bes/crminterface/crmheader\">\n" +
                "                <ns3:version>1</ns3:version>\n" +
                "                <ns3:resultCode>0</ns3:resultCode>\n" +
                "                <ns3:resultDesc>success</ns3:resultDesc>\n" +
                "            </resultHeader>\n" +
                "            <queryCustomerInfoResponse xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                <ns1:customer xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                    <ns2:customerId>8611000000731043</ns2:customerId>\n" +
                "                    <ns2:custBasicInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                        <ns2:custCode>11000000698040</ns2:custCode>\n" +
                "                        <ns2:custType>1</ns2:custType>\n" +
                "                        <ns2:custClass>1</ns2:custClass>\n" +
                "                        <ns2:partyId>11000000814086</ns2:partyId>\n" +
                "                        <ns2:regionId>10101</ns2:regionId>\n" +
                "                    </ns2:custBasicInfo>\n" +
                "                    <ns2:individualInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                        <ns2:individualBaseInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                            <ns2:individualId>11000000814086</ns2:individualId>\n" +
                "                            <ns2:firstName>طاهره</ns2:firstName>\n" +
                "                            <ns2:lastName>طاهری بازخانه</ns2:lastName>\n" +
                "                            <ns2:title>3</ns2:title>\n" +
                "                            <ns2:gender>0</ns2:gender>\n" +
                "                            <ns2:birthday>1990-08-12T00:00:00</ns2:birthday>\n" +
                "                            <ns2:nationality>IRN</ns2:nationality>\n" +
                "                            <ns2:nativePlace>بجنورد</ns2:nativePlace>\n" +
                "                            <ns2:writtenLang>Persian</ns2:writtenLang>\n" +
                "                            <ns2:phoneticLang>4</ns2:phoneticLang>\n" +
                "                            <ns2:individualProperty>\n" +
                "                                <code>fatherName</code>\n" +
                "                                <value>پرویز</value>\n" +
                "                            </ns2:individualProperty>\n" +
                "                            <ns2:individualProperty>\n" +
                "                                <code>birthIDCardNumber</code>\n" +
                "                                <value>0</value>\n" +
                "                            </ns2:individualProperty>\n" +
                "                            <ns2:individualProperty>\n" +
                "                                <code>birthIDCardIssuedPlace</code>\n" +
                "                                <value>بجنورد</value>\n" +
                "                            </ns2:individualProperty>\n" +
                "                        </ns2:individualBaseInfo>\n" +
                "                    </ns2:individualInfo>\n" +
                "                    <ns2:addressInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                        <ns2:addressId>8612000000649068</ns2:addressId>\n" +
                "                        <ns2:preferenceFlag>Y</ns2:preferenceFlag>\n" +
                "                        <ns2:effDate>2019-01-22T16:41:49</ns2:effDate>\n" +
                "                        <ns2:expDate>2037-01-01T00:00:00</ns2:expDate>\n" +
                "                        <ns2:addrType>6010506003</ns2:addrType>\n" +
                "                        <ns2:addressInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                            <ns2:addrId>8612000000649068</ns2:addrId>\n" +
                "                            <ns2:addrClass>S</ns2:addrClass>\n" +
                "                            <ns2:addr1>ایران</ns2:addr1>\n" +
                "                            <ns2:addr2>آذربایجان غربی</ns2:addr2>\n" +
                "                            <ns2:addr3>سردشت</ns2:addr3>\n" +
                "                            <ns2:usAddr>تست تست تست</ns2:usAddr>\n" +
                "                            <ns2:postalCode>1111111111</ns2:postalCode>\n" +
                "                        </ns2:addressInfo>\n" +
                "                    </ns2:addressInfo>\n" +
                "                </ns1:customer>\n" +
                "                <ns1:defaultAccountId>8611000000751118</ns1:defaultAccountId>\n" +
                "            </queryCustomerInfoResponse>\n" +
                "        </ns1:queryCustomerInfoRspMsg>\n" +
                "    </ns0:Body>\n" +
                "</ns0:Envelope>";
    }

}
