package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock/api/v1")
public class MockQueryAccountInfoController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;
//    public MockQueryAccountInfoService mockQueryAccountInfoService = new MockServiceImpl(restTemplateBuilder, applicationProperties);

    public MockQueryAccountInfoController(RestTemplateBuilder restTemplateBuilder, ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-account-info")
    public Object mockQueryAccountInfo() {
        return "<ns0:Envelope xmlns:ns0=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <ns0:Body xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "        <ns1:queryAccountInfoRspMsg>\n" +
                "            <resultHeader xmlns:ns3=\"http://www.huawei.com/bes/crminterface/crmheader\">\n" +
                "                <ns3:version>5.0</ns3:version>\n" +
                "                <ns3:resultCode>0</ns3:resultCode>\n" +
                "                <ns3:resultDesc>success</ns3:resultDesc>\n" +
                "            </resultHeader>\n" +
                "            <queryAccountInfoResponse xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                <ns1:accountInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\" xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                    <ns2:accountBasicInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                        <ns2:extProperties xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                            <ns2:code>CustomerSegment</ns2:code>\n" +
                "                            <ns2:value>1</ns2:value>\n" +
                "                        </ns2:extProperties>\n" +
                "                        <ns2:extProperties xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                            <ns2:code>CustomerLevel</ns2:code>\n" +
                "                            <ns2:value>0</ns2:value>\n" +
                "                        </ns2:extProperties>\n" +
                "                        <ns3:extProperties xmlns:ns3=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                            <ns3:code>MainSegment</ns3:code>\n" +
                "                            <ns3:value>No</ns3:value>\n" +
                "                        </ns3:extProperties>\n" +
                "                        <ns3:extProperties xmlns:ns3=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                            <ns3:code>SubSegment</ns3:code>\n" +
                "                            <ns3:value>No</ns3:value>\n" +
                "                        </ns3:extProperties>\n" +
                "                        <ns2:acctCode>11010002925010</ns2:acctCode>\n" +
                "                        <ns2:acctName>طاهره طاهری بازخانه</ns2:acctName>\n" +
                "                        <ns2:partyId>11000000814086</ns2:partyId>\n" +
                "                        <ns2:acctType>1</ns2:acctType>\n" +
                "                        <ns2:acctClass>1</ns2:acctClass>\n" +
                "                        <ns2:paymentType>0</ns2:paymentType>\n" +
                "                        <ns2:currencyId>1069</ns2:currencyId>\n" +
                "                        <ns2:status>2</ns2:status>\n" +
                "                        <ns2:statusTime>2022-12-12T11:56:49</ns2:statusTime>\n" +
                "                        <ns2:billLang>Persian</ns2:billLang>\n" +
                "                    </ns2:accountBasicInfo>\n" +
                "                    <ns2:accountId>8611010003113018</ns2:accountId>\n" +
                "                    <ns2:billCycleInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                        <ns2:acctBillCycleId>8611010002738007</ns2:acctBillCycleId>\n" +
                "                        <ns2:billCycleTypeCode>1st Of Each Month</ns2:billCycleTypeCode>\n" +
                "                        <ns2:billCycleTypeDesc>1st Of Each Month</ns2:billCycleTypeDesc>\n" +
                "                        <ns2:billCycleTypeId>1</ns2:billCycleTypeId>\n" +
                "                        <ns2:beginDate>1</ns2:beginDate>\n" +
                "                        <ns2:cycleType>M</ns2:cycleType>\n" +
                "                        <ns2:effDate>2022-12-12T11:56:49</ns2:effDate>\n" +
                "                        <ns2:expDate>2037-01-01T00:00:00</ns2:expDate>\n" +
                "                    </ns2:billCycleInfo>\n" +
                "                    <ns2:contactPersonInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                        <ns2:contactPersonId>8611010002702010</ns2:contactPersonId>\n" +
                "                        <ns2:addressInfo xmlns:ns2=\"http://www.huawei.com/bes/crminterface/cmtype\">\n" +
                "                            <ns2:addrId>8612010002937020</ns2:addrId>\n" +
                "                            <ns2:addrClass>S</ns2:addrClass>\n" +
                "                            <ns2:addr1>ایران</ns2:addr1>\n" +
                "                            <ns2:addr2>آذربایجان غربی</ns2:addr2>\n" +
                "                            <ns2:addr3>سردشت</ns2:addr3>\n" +
                "                            <ns2:usAddr>تست تست تست</ns2:usAddr>\n" +
                "                            <ns2:postalCode>1111111111</ns2:postalCode>\n" +
                "                        </ns2:addressInfo>\n" +
                "                        <ns2:contactPersonType>1</ns2:contactPersonType>\n" +
                "                        <ns2:firstName>طاهره</ns2:firstName>\n" +
                "                        <ns2:lastName>طاهری بازخانه</ns2:lastName>\n" +
                "                        <ns2:mobilePhone>9921906571</ns2:mobilePhone>\n" +
                "                    </ns2:contactPersonInfo>\n" +
                "                    <ns2:vip>0</ns2:vip>\n" +
                "                    <ns1:accountGroupInfo xmlns:ns1=\"http://www.huawei.com/bes/crminterface/cmservices\">\n" +
                "                        <ns1:accountGroupId>0</ns1:accountGroupId>\n" +
                "                        <ns1:accountGroupCode>0</ns1:accountGroupCode>\n" +
                "                        <ns1:accountGroupName>none</ns1:accountGroupName>\n" +
                "                        <ns1:exemptionAmount>0</ns1:exemptionAmount>\n" +
                "                    </ns1:accountGroupInfo>\n" +
                "                </ns1:accountInfo>\n" +
                "            </queryAccountInfoResponse>\n" +
                "        </ns1:queryAccountInfoRspMsg>\n" +
                "    </ns0:Body>\n" +
                "</ns0:Envelope>";
    }
}
