//package com.rahgozin.gate;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//import com.rahgozin.gate.config.*;
//import com.rahgozin.gate.service.CustomerClubInquiryScoreService;
//import com.rahgozin.gate.service.QueryAccountInfoService;
//import com.rahgozin.gate.service.TokenService;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.web.client.RestTemplate;
//
//@EnableConfigurationProperties(ApplicationProperties.class)
//@SpringBootTest
//class GateApplicationTests {
//    Logger log = LoggerFactory.getLogger(GateApplicationTests.class);
//    private final RestTemplate querySubRestTemplate;
//    private final RestTemplate queryImsiRestTemplate;
//    private final RestTemplate queryEntityIdRestTemplate;
//    private final RestTemplate queryBusinessFeeRestTemplate;
//    private final RestTemplate queryCustomBillingInfoRestTemplate;
//    private final RestTemplate requestOrderRestTemplate;
//    private final RestTemplate productListRestTemplate;
//    private final RestTemplate productTypeListRestTemplate;
//    private final RestTemplate confirmOrderRestTemplate;
//    private final RestTemplate queryBalanceRestTemplate;
//    private final RestTemplate changeSubIdentityRestTemplate;
//    private final RestTemplate queryCustomerInfoRestTemplate;
//    private final RestTemplate queryPaymentLogRestTemplate;
//    private final RestTemplate customerClubInquiryScoreRestTemplate;
//    private ApplicationProperties applicationProperties;
//    private RestTemplateBuilder restTemplateBuilder;
//
//    @Autowired
//    GateApplicationTests(@Qualifier("querySubRestTemplate") RestTemplate querySubRestTemplate,
//                         @Qualifier("queryImsiRestTemplate") RestTemplate queryImsiRestTemplate,
//                         @Qualifier("queryEntityIdRestTemplate") RestTemplate queryEntityIdRestTemplate,
//                         @Qualifier("queryBusinessFeeRestTemplate") RestTemplate queryBusinessFeeRestTemplate,
//                         @Qualifier("queryCustomBillingInfoRestTemplate") RestTemplate queryCustomBillingInfoRestTemplate,
//                         @Qualifier("requestOrderRestTemplate") RestTemplate requestOrderRestTemplate,
//                         @Qualifier("productListRestTemplate") RestTemplate productListRestTemplate,
//                         @Qualifier("productTypeListRestTemplate") RestTemplate productTypeListRestTemplate,
//                         @Qualifier("confirmOrderRestTemplate") RestTemplate confirmOrderRestTemplate,
//                         @Qualifier("queryBalanceRestTemplate") RestTemplate queryBalanceRestTemplate,
//                         @Qualifier("changeSubIdentityRestTemplate") RestTemplate changeSubIdentityRestTemplate,
//                         @Qualifier("queryCustomerInfoRestTemplate") RestTemplate queryCustomerInfoRestTemplate,
//                         @Qualifier("queryPaymentLogRestTemplate") RestTemplate queryPaymentLogRestTemplate,
//                         @Qualifier("customerClubInquiryScoreRestTemplate") RestTemplate customerClubInquiryScoreRestTemplate,
//                         ApplicationProperties applicationProperties,
//                         RestTemplateBuilder restTemplateBuilder) {
//        this.querySubRestTemplate = querySubRestTemplate;
//        this.queryImsiRestTemplate = queryImsiRestTemplate;
//        this.queryEntityIdRestTemplate = queryEntityIdRestTemplate;
//        this.queryBusinessFeeRestTemplate = queryBusinessFeeRestTemplate;
//        this.queryCustomBillingInfoRestTemplate = queryCustomBillingInfoRestTemplate;
//        this.requestOrderRestTemplate = requestOrderRestTemplate;
//        this.productListRestTemplate = productListRestTemplate;
//        this.productTypeListRestTemplate = productTypeListRestTemplate;
//        this.confirmOrderRestTemplate = confirmOrderRestTemplate;
//        this.queryBalanceRestTemplate = queryBalanceRestTemplate;
//        this.changeSubIdentityRestTemplate = changeSubIdentityRestTemplate;
//        this.queryCustomerInfoRestTemplate = queryCustomerInfoRestTemplate;
//        this.queryPaymentLogRestTemplate = queryPaymentLogRestTemplate;
//        this.customerClubInquiryScoreRestTemplate = customerClubInquiryScoreRestTemplate;
//        this.applicationProperties = applicationProperties;
//        this.restTemplateBuilder = restTemplateBuilder;
//    }
//
//    @Autowired
//    private QuerySubRestTemplateConfig getQuerySubRestTemplate;
//    @Autowired
//    private QueryImsiRestTemplateConfig getQueryImsiRestTemplate;
//    @Autowired
//    private QueryEntityIdRestTemplateConfig getQueryEntityIdRestTemplate;
//    @Autowired
//    private QueryBusinessFeeRestTemplateConfig getQueryBusinessFeeRestTemplate;
//    @Autowired
//    private QueryCustomBillingInfoRestTemplateConfig getQueryCustomBillingInfoRestTemplate;
//    @Autowired
//    private RequestOrderRestTemplateConfig getRequestOrderRestTemplate;
//    @Autowired
//    private ProductListRestTemplateConfig getProductListRestTemplate;
//    @Autowired
//    private ProductTypeListRestTemplateConfig getProductTypeListRestTemplate;
//    @Autowired
//    private ConfirmOrderRestTemplateConfig getConfirmOrderRestTemplate;
//    @Autowired
//    private QueryBalanceRestTemplateConfig getQueryBalanceRestTemplateConfig;
//    @Autowired
//    private ChangeSubIdentityRestTemplateConfig getChangeSubIdentityRestTemplateConfig;
//    @Autowired
//    private QueryCustomerInfoRestTemplateConfig getQueryCustomerInfoRestTemplateConfig;
//    @Autowired
//    private QueryAccountInfoRestTemplateConfig getQueryAccountInfoRestTemplateConfig;
//    @Autowired
//    private QueryPaymentLogRestTemplateConfig getQueryPaymentLogRestTemplateConfig;
//    @Autowired
//    private CustomerClubInquiryScoreRestTemplateConfig getCustomerClubInquiryScoreRestTemplateConfig;
//    @Autowired
//    ChangeImsiReportRestTemplateConfig getChangeImsiReportRestTemplateConfig;
//
//    @Test
//    void contextLoads() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//        XmlMapper xmlMapper = new XmlMapper();
//        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        xmlMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//
//        //-----------------------------token------------------------
//        TokenService tokenService = new TokenService(applicationProperties);
////        getTokenService.getToken();
//
//        //-----------------------------changeImsiReport-----------------------------
////        ChangeImsiReportService changeImsiReportService = new ChangeImsiReportService(
////                getChangeImsiReportRestTemplateConfig.changeImsiReportRestTemplate(restTemplateBuilder),
////                xmlMapper, applicationProperties, tokenService);
////        changeImsiReportService.changeImsiReport();
//
//        //-----------------------------customerClubInquiryScore-----------------------------
////        CustomerClubInquiryScoreService customerClubInquiryScoreService = new CustomerClubInquiryScoreService(
////                getCustomerClubInquiryScoreRestTemplateConfig.customerClubInquiryScoreRestTemplate(restTemplateBuilder),
////                objectMapper, applicationProperties, tokenService);
////        customerClubInquiryScoreService.customerClubInquiryScore();
//        //-----------------------------queryPaymentLog-----------------------------
////        QueryPaymentLogService queryPaymentLogService = new QueryPaymentLogService(
////                getQueryPaymentLogRestTemplateConfig.queryPaymentLogRestTemplate(restTemplateBuilder), xmlMapper,
////                applicationProperties, tokenService);
////        queryPaymentLogService.queryPaymentLog();
//
//        //-----------------------------queryAccountInfo-----------------------------
//        QueryAccountInfoService queryAccountInfoService = new QueryAccountInfoService(
//                getQueryAccountInfoRestTemplateConfig.queryAccountInfoRestTemplate(restTemplateBuilder),
//                xmlMapper, applicationProperties, tokenService);
//        queryAccountInfoService.queryAccountInfo();
//
//        //-----------------------------queryCustomerInfo-----------------------------
////        QueryCustomerInfoService queryCustomerInfoService = new QueryCustomerInfoService(
////                getQueryCustomerInfoRestTemplateConfig.queryCustomerInfoRestTemplate(restTemplateBuilder),
////                xmlMapper, applicationProperties, tokenService);
////        queryCustomerInfoService.queryCustomerInfo();
//
//
//        //-----------------------------changeSubIdentity-----------------------------
////        ChangeSubIdentityService changeSubIdentityService = new ChangeSubIdentityService(
////                getChangeSubIdentityRestTemplateConfig.changeSubIdentityRestTemplate(restTemplateBuilder), xmlMapper,
////                applicationProperties, tokenService);
////        changeSubIdentityService.changeSubIdentity();
//
//        //-----------------------------queryBalance-----------------------------
////        QueryBalanceService queryBalanceService = new QueryBalanceService(
////                getQueryBalanceRestTemplateConfig.queryBalanceRestTemplate(restTemplateBuilder), xmlMapper,
////                applicationProperties, tokenService);
////        queryBalanceService.queryBalanceService();
//
//        //-----------------------------queryImsiInfo-----------------------------
////        QueryImsiInfoService queryImsiInfoService = new QueryImsiInfoService(xmlMapper,
////                getQueryImsiRestTemplate.queryImsiRestTemplate(restTemplateBuilder),
////                applicationProperties, tokenService);
////        queryImsiInfoService.queryImsiInfo("9190771622");
//
//        //-----------------------------querySubReq-----------------------------
////        QuerySubscriberService querySubscriberService = new QuerySubscriberService(xmlMapper,
////                getQuerySubRestTemplate.querySubRestTemplate(restTemplateBuilder), applicationProperties, tokenService);
////        querySubscriberService.querySubscriber(Pageable.ofSize(100), "9921905802");
//
//        //-----------------------------queryBusinessFee-----------------------------
////        QueryBusinessFeeService queryBusinessFeeService = new QueryBusinessFeeService(xmlMapper,
////                getQueryBusinessFeeRestTemplate.queryBusinessFeeRestTemplate(restTemplateBuilder),
////                applicationProperties, tokenService);
////        queryBusinessFeeService.queryBusinessFee();
//
//        //-----------------------------queryEntityId-----------------------------
////        QueryEntityIdService queryEntityIdService = new QueryEntityIdService(xmlMapper,
////                getQueryEntityIdRestTemplate.queryEntityIdRestTemplate(restTemplateBuilder),
////                applicationProperties, tokenService);
////        queryEntityIdService.entityId("9125053921");
//
//        //-----------------------------queryCustomBillingInfo-----------------------------
////        QueryCustomBillingInfoService queryCustomBillingInfoService =
////                new QueryCustomBillingInfoService(getQueryCustomBillingInfoRestTemplate
////                        .queryCustomBillingInfoRestTemplate(restTemplateBuilder), xmlMapper, applicationProperties,
////                        tokenService);
////        queryCustomBillingInfoService.queryCustomBillingInfo();
//
//        //-----------------------------topInToken-----------------------------
////        String token = tokenService.getTopInToken(applicationProperties.getTopInConnection().getUsername(), applicationProperties.getTopInConnection().getPassword());
//        //-----------------------------newPassword-----------------------------
////        String newPassword = tokenService.getTopInAuthPassword(applicationProperties.getTopInConnection().getUsername(),
////                applicationProperties.getTopInConnection().getPassword(), token);
//        //-----------------------------topIn-requestOrder-----------------------------
////        RequestOrderService requestOrderService =
////                new RequestOrderService(getRequestOrderRestTemplate.requestOrderRestTemplate(restTemplateBuilder),
////                        objectMapper, applicationProperties, tokenService,
////                        new ProductListService(objectMapper, tokenService,
////                                getProductListRestTemplate.productListRestTemplate(restTemplateBuilder),
////                                applicationProperties),
////                        new ProductTypeListService(objectMapper, tokenService, getProductTypeListRestTemplate
////                                .requestOrderRestTemplate(restTemplateBuilder), applicationProperties));
////
////        requestOrderService.requestOrder(applicationProperties.getTopInConnection().getUsername(), newPassword, token);
//
//
//        //-----------------------------topIn-confirmOrder-----------------------------
////        ConfirmOrderService confirmOrderService = new ConfirmOrderService(
////                getConfirmOrderRestTemplate.confirmOrderRestTemplate(restTemplateBuilder), objectMapper
////                , applicationProperties, tokenService);
////
////        confirmOrderService.confirmOrderService(applicationProperties.getTopInConnection().getUsername(), newPassword, token);
//
//    }
//}