package com.rahgozin.gate.api.mock;


import com.rahgozin.gate.config.ApplicationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock/api/v1")
public class MockQueryPaymentLogController {
    private RestTemplateBuilder restTemplateBuilder;
    private ApplicationProperties applicationProperties;

    public MockQueryPaymentLogController(RestTemplateBuilder restTemplateBuilder,
                                         ApplicationProperties applicationProperties) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/query-payment-log")
    public Object mockQueryPaymentLog(@RequestHeader(name = "ERROR", required = false) Boolean error) {
        if (error) {
            return "{\n" +
                    "    \"body\": {\n" +
                    "        \"queryPaymentLogResultMsg\": {\n" +
                    "            \"resultHeader\": {\n" +
                    "                \"msgLanguageCode\": \"2002\",\n" +
                    "                \"resultCode\": \"118109004\",\n" +
                    "                \"resultDesc\": \"The service number 91250539 does not exist.\",\n" +
                    "                \"version\": \"1\"\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        } else {
            return "success";
//            return "{\n" +
//                    "    \"body\": {\n" +
//                    "        \"queryPaymentLogResultMsg\": {\n" +
//                    "            \"resultHeader\": {\n" +
//                    "                \"msgLanguageCode\": \"2002\",\n" +
//                    "                \"resultCode\": \"0\",\n" +
//                    "                \"resultDesc\": \"Operation successfully.\",\n" +
//                    "                \"version\": \"1\"\n" +
//                    "            },\n" +
//                    "            \"queryPaymentLogResult\": {\n" +
//                    "                \"paymentInfos\": [\n" +
//                    "                    {\n" +
//                    "                        \"additionalProperties\": [\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENTTYPE\",\n" +
//                    "                                \"value\": \"6\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                                \"value\": \"3\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"BANKNAME\",\n" +
//                    "                                \"value\": \"EBCOM\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"CreationDate\",\n" +
//                    "                                \"value\": \"14011103033000\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"paymentDetails\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"57759049\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"28879526\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-552612\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"962650\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196197\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"28879526\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"13320\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"6660\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-241\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"222\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196198\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"6660\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-30\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"30\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196199\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"378000\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"189000\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-6867\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"6300\",\n" +
//                    "                                \"chargeCode\": \"C_POST_PRIMARY_RENTAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196200\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"189000\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"2002500\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"1001250\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-36378\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"33375\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196201\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"1001250\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-11250\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"11250\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196202\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"176220\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"88110\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-3201\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"2937\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196203\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"88110\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-990\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"990\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196204\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"6276712\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"3138353\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-114026\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221201\",\n" +
//                    "                                \"chargeAmount\": \"104611\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20230123074805\",\n" +
//                    "                                \"invoiceDetailID\": \"8047196205\",\n" +
//                    "                                \"invoiceID\": \"1935508795\",\n" +
//                    "                                \"invoiceNo\": \"14011029-07388959\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"3138353\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"155401\",\n" +
//                    "                                \"applyType\": \"2\",\n" +
//                    "                                \"billCycleId\": \"\",\n" +
//                    "                                \"chargeAmount\": \"\",\n" +
//                    "                                \"chargeCode\": \"\",\n" +
//                    "                                \"discountAmount\": \"\",\n" +
//                    "                                \"invoiceDate\": \"\",\n" +
//                    "                                \"invoiceDetailID\": \"\",\n" +
//                    "                                \"invoiceID\": \"\",\n" +
//                    "                                \"invoiceNo\": \"\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"accessMode\": \"3\",\n" +
//                    "                        \"acctKey\": \"2911000169688085\",\n" +
//                    "                        \"amount\": \"881000\",\n" +
//                    "                        \"curAmount\": \"155401\",\n" +
//                    "                        \"currencyID\": \"1069\",\n" +
//                    "                        \"custKey\": \"2910011061796381\",\n" +
//                    "                        \"deptID\": \"101\",\n" +
//                    "                        \"extTransID\": \"CBSAR32546853148\",\n" +
//                    "                        \"operID\": \"101\",\n" +
//                    "                        \"oriAmount\": \"0\",\n" +
//                    "                        \"payChannelID\": \"80\",\n" +
//                    "                        \"paymentMethod\": \"1001\",\n" +
//                    "                        \"paymentTime\": \"20230123033000\",\n" +
//                    "                        \"primaryIdentity\": \"9125053921\",\n" +
//                    "                        \"status\": \"N\",\n" +
//                    "                        \"subKey\": \"2911000167149586\",\n" +
//                    "                        \"totalPaymentAmount\": \"881000\",\n" +
//                    "                        \"transID\": \"32546853149\",\n" +
//                    "                        \"transType\": \"PPM\",\n" +
//                    "                        \"additionalProperty\": {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14011103033000\"\n" +
//                    "                        },\n" +
//                    "                        \"bankInfo\": {\n" +
//                    "                            \"bankBranchCode\": \"300000\",\n" +
//                    "                            \"bankCode\": \"33\"\n" +
//                    "                        },\n" +
//                    "                        \"paymentDetail\": {\n" +
//                    "                            \"taxLists\": [],\n" +
//                    "                            \"applyAmount\": \"155401\",\n" +
//                    "                            \"applyType\": \"2\",\n" +
//                    "                            \"billCycleId\": \"\",\n" +
//                    "                            \"chargeAmount\": \"\",\n" +
//                    "                            \"chargeCode\": \"\",\n" +
//                    "                            \"discountAmount\": \"\",\n" +
//                    "                            \"invoiceDate\": \"\",\n" +
//                    "                            \"invoiceDetailID\": \"\",\n" +
//                    "                            \"invoiceID\": \"\",\n" +
//                    "                            \"invoiceNo\": \"\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"\",\n" +
//                    "                                \"taxCode\": \"\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    },\n" +
//                    "                    {\n" +
//                    "                        \"additionalProperties\": [\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENTTYPE\",\n" +
//                    "                                \"value\": \"4\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                                \"value\": \"0\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"BANKNAME\",\n" +
//                    "                                \"value\": \"EBCOM\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"CreationDate\",\n" +
//                    "                                \"value\": \"14011015033000\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"paymentDetails\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"64053727\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"32026861\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-517732\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"1067562\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536592\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"32026861\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"119880\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"59940\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-2177\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"1998\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536593\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"59940\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-270\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"270\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536594\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"378000\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"189000\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-6867\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"6300\",\n" +
//                    "                                \"chargeCode\": \"C_POST_PRIMARY_RENTAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536595\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"189000\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"6137152\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"3068572\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-111491\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"102285\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536596\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"3068572\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"213600\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"106800\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-3880\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"3560\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536597\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"106800\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-1200\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"1200\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536598\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"2888940\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"1444470\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-52482\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"48149\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536599\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"1444470\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-15898\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221101\",\n" +
//                    "                                \"chargeAmount\": \"16230\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221224071851\",\n" +
//                    "                                \"invoiceDetailID\": \"7848536600\",\n" +
//                    "                                \"invoiceID\": \"1912164839\",\n" +
//                    "                                \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"accessMode\": \"3\",\n" +
//                    "                        \"acctKey\": \"2911000169688085\",\n" +
//                    "                        \"amount\": \"712000\",\n" +
//                    "                        \"curAmount\": \"-331\",\n" +
//                    "                        \"currencyID\": \"1069\",\n" +
//                    "                        \"custKey\": \"2910011061796381\",\n" +
//                    "                        \"deptID\": \"101\",\n" +
//                    "                        \"extTransID\": \"CBSAR32207746857\",\n" +
//                    "                        \"operID\": \"101\",\n" +
//                    "                        \"oriAmount\": \"0\",\n" +
//                    "                        \"payChannelID\": \"80\",\n" +
//                    "                        \"paymentMethod\": \"1001\",\n" +
//                    "                        \"paymentTime\": \"20230105033000\",\n" +
//                    "                        \"primaryIdentity\": \"9125053921\",\n" +
//                    "                        \"status\": \"N\",\n" +
//                    "                        \"subKey\": \"2911000167149586\",\n" +
//                    "                        \"totalPaymentAmount\": \"712000\",\n" +
//                    "                        \"transID\": \"32207746858\",\n" +
//                    "                        \"transType\": \"PPM\",\n" +
//                    "                        \"additionalProperty\": {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14011015033000\"\n" +
//                    "                        },\n" +
//                    "                        \"bankInfo\": {\n" +
//                    "                            \"bankBranchCode\": \"300000\",\n" +
//                    "                            \"bankCode\": \"33\"\n" +
//                    "                        },\n" +
//                    "                        \"paymentDetail\": {\n" +
//                    "                            \"taxLists\": [],\n" +
//                    "                            \"applyAmount\": \"-15898\",\n" +
//                    "                            \"applyType\": \"1\",\n" +
//                    "                            \"billCycleId\": \"20221101\",\n" +
//                    "                            \"chargeAmount\": \"16230\",\n" +
//                    "                            \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                            \"discountAmount\": \"0\",\n" +
//                    "                            \"invoiceDate\": \"20221224071851\",\n" +
//                    "                            \"invoiceDetailID\": \"7848536600\",\n" +
//                    "                            \"invoiceID\": \"1912164839\",\n" +
//                    "                            \"invoiceNo\": \"14010929-07241551\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"\",\n" +
//                    "                                \"taxCode\": \"\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    },\n" +
//                    "                    {\n" +
//                    "                        \"additionalProperties\": [\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENTTYPE\",\n" +
//                    "                                \"value\": \"6\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                                \"value\": \"3\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"BANKNAME\",\n" +
//                    "                                \"value\": \"EBCOM\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"CreationDate\",\n" +
//                    "                                \"value\": \"14010905033000\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"paymentDetails\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"15490758\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"7745380\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-95003\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"258179\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132325\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"7745380\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"133500\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"66750\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-2425\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"2225\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132326\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"66750\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-750\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"750\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132327\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"1169460\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"584730\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-21245\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"19491\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132328\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"584730\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-6570\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"6570\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132329\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-10000\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"10000\",\n" +
//                    "                                \"chargeCode\": \"C_TRANSFER_CREDIT_LIMIT\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132330\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"24000\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"12000\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-436\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"400\",\n" +
//                    "                                \"chargeCode\": \"C_BALANCE_TRANSFER_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132331\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"12000\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"3651981\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"1825992\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-66344\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"60866\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132332\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"1825992\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"119880\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"59940\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-2177\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"1998\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132333\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"59940\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-270\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"270\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132334\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"48000000\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"24000000\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-872000\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"800000\",\n" +
//                    "                                \"chargeCode\": \"C_SpecialTariffPackage\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132335\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"24000000\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"378000\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"189000\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-6867\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20221001\",\n" +
//                    "                                \"chargeAmount\": \"6300\",\n" +
//                    "                                \"chargeCode\": \"C_POST_PRIMARY_RENTAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20221124100637\",\n" +
//                    "                                \"invoiceDetailID\": \"7658132336\",\n" +
//                    "                                \"invoiceID\": \"1889633551\",\n" +
//                    "                                \"invoiceNo\": \"14010829-07095268\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"189000\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"145910\",\n" +
//                    "                                \"applyType\": \"2\",\n" +
//                    "                                \"billCycleId\": \"\",\n" +
//                    "                                \"chargeAmount\": \"\",\n" +
//                    "                                \"chargeCode\": \"\",\n" +
//                    "                                \"discountAmount\": \"\",\n" +
//                    "                                \"invoiceDate\": \"\",\n" +
//                    "                                \"invoiceDetailID\": \"\",\n" +
//                    "                                \"invoiceID\": \"\",\n" +
//                    "                                \"invoiceNo\": \"\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"accessMode\": \"3\",\n" +
//                    "                        \"acctKey\": \"2911000169688085\",\n" +
//                    "                        \"amount\": \"1230000\",\n" +
//                    "                        \"curAmount\": \"145910\",\n" +
//                    "                        \"currencyID\": \"1069\",\n" +
//                    "                        \"custKey\": \"2910011061796381\",\n" +
//                    "                        \"deptID\": \"101\",\n" +
//                    "                        \"extTransID\": \"CBSAR31544884295\",\n" +
//                    "                        \"operID\": \"101\",\n" +
//                    "                        \"oriAmount\": \"0\",\n" +
//                    "                        \"payChannelID\": \"80\",\n" +
//                    "                        \"paymentMethod\": \"1001\",\n" +
//                    "                        \"paymentTime\": \"20221126033000\",\n" +
//                    "                        \"primaryIdentity\": \"9125053921\",\n" +
//                    "                        \"status\": \"N\",\n" +
//                    "                        \"subKey\": \"2911000167149586\",\n" +
//                    "                        \"totalPaymentAmount\": \"1230000\",\n" +
//                    "                        \"transID\": \"31544884296\",\n" +
//                    "                        \"transType\": \"PPM\",\n" +
//                    "                        \"additionalProperty\": {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14010905033000\"\n" +
//                    "                        },\n" +
//                    "                        \"bankInfo\": {\n" +
//                    "                            \"bankBranchCode\": \"300000\",\n" +
//                    "                            \"bankCode\": \"33\"\n" +
//                    "                        },\n" +
//                    "                        \"paymentDetail\": {\n" +
//                    "                            \"taxLists\": [],\n" +
//                    "                            \"applyAmount\": \"145910\",\n" +
//                    "                            \"applyType\": \"2\",\n" +
//                    "                            \"billCycleId\": \"\",\n" +
//                    "                            \"chargeAmount\": \"\",\n" +
//                    "                            \"chargeCode\": \"\",\n" +
//                    "                            \"discountAmount\": \"\",\n" +
//                    "                            \"invoiceDate\": \"\",\n" +
//                    "                            \"invoiceDetailID\": \"\",\n" +
//                    "                            \"invoiceID\": \"\",\n" +
//                    "                            \"invoiceNo\": \"\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"\",\n" +
//                    "                                \"taxCode\": \"\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    },\n" +
//                    "                    {\n" +
//                    "                        \"additionalProperties\": [\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENTTYPE\",\n" +
//                    "                                \"value\": \"4\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                                \"value\": \"0\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"BANKNAME\",\n" +
//                    "                                \"value\": \"EBCOM\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"CreationDate\",\n" +
//                    "                                \"value\": \"14010716033000\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"paymentDetails\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"35765696\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"17882855\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-188000\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220801\",\n" +
//                    "                                \"chargeAmount\": \"596094\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220925052505\",\n" +
//                    "                                \"invoiceDetailID\": \"7311544390\",\n" +
//                    "                                \"invoiceID\": \"1848691596\",\n" +
//                    "                                \"invoiceNo\": \"14010629-06805445\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"17882855\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"accessMode\": \"3\",\n" +
//                    "                        \"acctKey\": \"2911000169688085\",\n" +
//                    "                        \"amount\": \"188000\",\n" +
//                    "                        \"curAmount\": \"-566\",\n" +
//                    "                        \"currencyID\": \"1069\",\n" +
//                    "                        \"custKey\": \"2910011061796381\",\n" +
//                    "                        \"deptID\": \"101\",\n" +
//                    "                        \"extTransID\": \"CBSAR30697741438\",\n" +
//                    "                        \"operID\": \"101\",\n" +
//                    "                        \"oriAmount\": \"0\",\n" +
//                    "                        \"payChannelID\": \"80\",\n" +
//                    "                        \"paymentMethod\": \"1001\",\n" +
//                    "                        \"paymentTime\": \"20221008033000\",\n" +
//                    "                        \"primaryIdentity\": \"9125053921\",\n" +
//                    "                        \"status\": \"N\",\n" +
//                    "                        \"subKey\": \"2911000167149586\",\n" +
//                    "                        \"totalPaymentAmount\": \"188000\",\n" +
//                    "                        \"transID\": \"30697741439\",\n" +
//                    "                        \"transType\": \"PPM\",\n" +
//                    "                        \"additionalProperty\": {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14010716033000\"\n" +
//                    "                        },\n" +
//                    "                        \"bankInfo\": {\n" +
//                    "                            \"bankBranchCode\": \"300000\",\n" +
//                    "                            \"bankCode\": \"33\"\n" +
//                    "                        },\n" +
//                    "                        \"paymentDetail\": {\n" +
//                    "                            \"taxLists\": [\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"35765696\",\n" +
//                    "                                    \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                },\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"17882855\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            ],\n" +
//                    "                            \"applyAmount\": \"-188000\",\n" +
//                    "                            \"applyType\": \"1\",\n" +
//                    "                            \"billCycleId\": \"20220801\",\n" +
//                    "                            \"chargeAmount\": \"596094\",\n" +
//                    "                            \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                            \"discountAmount\": \"0\",\n" +
//                    "                            \"invoiceDate\": \"20220925052505\",\n" +
//                    "                            \"invoiceDetailID\": \"7311544390\",\n" +
//                    "                            \"invoiceID\": \"1848691596\",\n" +
//                    "                            \"invoiceNo\": \"14010629-06805445\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"17882855\",\n" +
//                    "                                \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    },\n" +
//                    "                    {\n" +
//                    "                        \"additionalProperties\": [\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENTTYPE\",\n" +
//                    "                                \"value\": \"5\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"BANKNAME\",\n" +
//                    "                                \"value\": \"EBCOM\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"CreationDate\",\n" +
//                    "                                \"value\": \"14010613033000\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"paymentDetails\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"44899550\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"22449775\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-317361\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220701\",\n" +
//                    "                                \"chargeAmount\": \"748325\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220825035808\",\n" +
//                    "                                \"invoiceDetailID\": \"7155866085\",\n" +
//                    "                                \"invoiceID\": \"1829322088\",\n" +
//                    "                                \"invoiceNo\": \"14010529-06661553\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"22449775\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"378000\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"189000\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-6867\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220701\",\n" +
//                    "                                \"chargeAmount\": \"6300\",\n" +
//                    "                                \"chargeCode\": \"C_POST_PRIMARY_RENTAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220825035808\",\n" +
//                    "                                \"invoiceDetailID\": \"7155866086\",\n" +
//                    "                                \"invoiceID\": \"1829322088\",\n" +
//                    "                                \"invoiceNo\": \"14010529-06661553\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"189000\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"10680\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"5340\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-194\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220701\",\n" +
//                    "                                \"chargeAmount\": \"178\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220825035808\",\n" +
//                    "                                \"invoiceDetailID\": \"7155866087\",\n" +
//                    "                                \"invoiceID\": \"1829322088\",\n" +
//                    "                                \"invoiceNo\": \"14010529-06661553\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"5340\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-60\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220701\",\n" +
//                    "                                \"chargeAmount\": \"60\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220825035808\",\n" +
//                    "                                \"invoiceDetailID\": \"7155866088\",\n" +
//                    "                                \"invoiceID\": \"1829322088\",\n" +
//                    "                                \"invoiceNo\": \"14010529-06661553\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"8299470\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"4149732\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-150773\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220701\",\n" +
//                    "                                \"chargeAmount\": \"138324\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220825035808\",\n" +
//                    "                                \"invoiceDetailID\": \"7155866089\",\n" +
//                    "                                \"invoiceID\": \"1829322088\",\n" +
//                    "                                \"invoiceNo\": \"14010529-06661553\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"4149732\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"24\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"12\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"0\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220701\",\n" +
//                    "                                \"chargeAmount\": \"0\",\n" +
//                    "                                \"chargeCode\": \"C_GPRS_NO_ROAM_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220825035808\",\n" +
//                    "                                \"invoiceDetailID\": \"7155866090\",\n" +
//                    "                                \"invoiceID\": \"1829322088\",\n" +
//                    "                                \"invoiceNo\": \"14010529-06661553\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"12\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"64080\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"32040\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-1164\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220701\",\n" +
//                    "                                \"chargeAmount\": \"1068\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220825035808\",\n" +
//                    "                                \"invoiceDetailID\": \"7155866091\",\n" +
//                    "                                \"invoiceID\": \"1829322088\",\n" +
//                    "                                \"invoiceNo\": \"14010529-06661553\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"32040\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"23579\",\n" +
//                    "                                \"applyType\": \"2\",\n" +
//                    "                                \"billCycleId\": \"\",\n" +
//                    "                                \"chargeAmount\": \"\",\n" +
//                    "                                \"chargeCode\": \"\",\n" +
//                    "                                \"discountAmount\": \"\",\n" +
//                    "                                \"invoiceDate\": \"\",\n" +
//                    "                                \"invoiceDetailID\": \"\",\n" +
//                    "                                \"invoiceID\": \"\",\n" +
//                    "                                \"invoiceNo\": \"\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"accessMode\": \"3\",\n" +
//                    "                        \"acctKey\": \"2911000169688085\",\n" +
//                    "                        \"amount\": \"500000\",\n" +
//                    "                        \"curAmount\": \"23579\",\n" +
//                    "                        \"currencyID\": \"1069\",\n" +
//                    "                        \"custKey\": \"2910011061796381\",\n" +
//                    "                        \"deptID\": \"101\",\n" +
//                    "                        \"extTransID\": \"CBSAR30166208776\",\n" +
//                    "                        \"operID\": \"101\",\n" +
//                    "                        \"oriAmount\": \"0\",\n" +
//                    "                        \"payChannelID\": \"80\",\n" +
//                    "                        \"paymentMethod\": \"1001\",\n" +
//                    "                        \"paymentTime\": \"20220904033000\",\n" +
//                    "                        \"primaryIdentity\": \"9125053921\",\n" +
//                    "                        \"status\": \"N\",\n" +
//                    "                        \"subKey\": \"2911000167149586\",\n" +
//                    "                        \"totalPaymentAmount\": \"500000\",\n" +
//                    "                        \"transID\": \"30166208777\",\n" +
//                    "                        \"transType\": \"PPM\",\n" +
//                    "                        \"additionalProperty\": {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14010613033000\"\n" +
//                    "                        },\n" +
//                    "                        \"bankInfo\": {\n" +
//                    "                            \"bankBranchCode\": \"300000\",\n" +
//                    "                            \"bankCode\": \"33\"\n" +
//                    "                        },\n" +
//                    "                        \"paymentDetail\": {\n" +
//                    "                            \"taxLists\": [],\n" +
//                    "                            \"applyAmount\": \"23579\",\n" +
//                    "                            \"applyType\": \"2\",\n" +
//                    "                            \"billCycleId\": \"\",\n" +
//                    "                            \"chargeAmount\": \"\",\n" +
//                    "                            \"chargeCode\": \"\",\n" +
//                    "                            \"discountAmount\": \"\",\n" +
//                    "                            \"invoiceDate\": \"\",\n" +
//                    "                            \"invoiceDetailID\": \"\",\n" +
//                    "                            \"invoiceID\": \"\",\n" +
//                    "                            \"invoiceNo\": \"\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"\",\n" +
//                    "                                \"taxCode\": \"\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    },\n" +
//                    "                    {\n" +
//                    "                        \"additionalProperties\": [\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENTTYPE\",\n" +
//                    "                                \"value\": \"4\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                                \"value\": \"0\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"BANKNAME\",\n" +
//                    "                                \"value\": \"EBCOM\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"CreationDate\",\n" +
//                    "                                \"value\": \"14010518033000\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"paymentDetails\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"28479107\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"14239558\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-133331\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"474651\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671281\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"14239558\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"66600\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"33300\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-1209\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"1110\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671282\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"33300\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-150\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"150\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671283\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"26700\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"13350\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-485\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"445\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671284\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"13350\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-150\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"150\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671285\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"21360\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"10680\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-388\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"356\",\n" +
//                    "                                \"chargeCode\": \"C_SMS_LOCAL_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671286\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"10680\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [],\n" +
//                    "                                \"applyAmount\": \"-120\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"120\",\n" +
//                    "                                \"chargeCode\": \"C_GGIChargeCode\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671287\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"\",\n" +
//                    "                                    \"taxCode\": \"\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"24\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"12\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"0\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"0\",\n" +
//                    "                                \"chargeCode\": \"C_GPRS_NO_ROAM_FEE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671288\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"12\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"3324940\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"1662468\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-60164\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220601\",\n" +
//                    "                                \"chargeAmount\": \"55415\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220725081152\",\n" +
//                    "                                \"invoiceDetailID\": \"6983671289\",\n" +
//                    "                                \"invoiceID\": \"1807184843\",\n" +
//                    "                                \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"1662468\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"accessMode\": \"3\",\n" +
//                    "                        \"acctKey\": \"2911000169688085\",\n" +
//                    "                        \"amount\": \"196000\",\n" +
//                    "                        \"curAmount\": \"-238\",\n" +
//                    "                        \"currencyID\": \"1069\",\n" +
//                    "                        \"custKey\": \"2910011061796381\",\n" +
//                    "                        \"deptID\": \"101\",\n" +
//                    "                        \"extTransID\": \"CBSAR29747555896\",\n" +
//                    "                        \"operID\": \"101\",\n" +
//                    "                        \"oriAmount\": \"0\",\n" +
//                    "                        \"payChannelID\": \"80\",\n" +
//                    "                        \"paymentMethod\": \"1001\",\n" +
//                    "                        \"paymentTime\": \"20220809033000\",\n" +
//                    "                        \"primaryIdentity\": \"9125053921\",\n" +
//                    "                        \"status\": \"N\",\n" +
//                    "                        \"subKey\": \"2911000167149586\",\n" +
//                    "                        \"totalPaymentAmount\": \"196000\",\n" +
//                    "                        \"transID\": \"29747555897\",\n" +
//                    "                        \"transType\": \"PPM\",\n" +
//                    "                        \"additionalProperty\": {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14010518033000\"\n" +
//                    "                        },\n" +
//                    "                        \"bankInfo\": {\n" +
//                    "                            \"bankBranchCode\": \"300000\",\n" +
//                    "                            \"bankCode\": \"33\"\n" +
//                    "                        },\n" +
//                    "                        \"paymentDetail\": {\n" +
//                    "                            \"taxLists\": [\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"3324940\",\n" +
//                    "                                    \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                },\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"1662468\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            ],\n" +
//                    "                            \"applyAmount\": \"-60164\",\n" +
//                    "                            \"applyType\": \"1\",\n" +
//                    "                            \"billCycleId\": \"20220601\",\n" +
//                    "                            \"chargeAmount\": \"55415\",\n" +
//                    "                            \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                            \"discountAmount\": \"0\",\n" +
//                    "                            \"invoiceDate\": \"20220725081152\",\n" +
//                    "                            \"invoiceDetailID\": \"6983671289\",\n" +
//                    "                            \"invoiceID\": \"1807184843\",\n" +
//                    "                            \"invoiceNo\": \"14010429-06518504\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"1662468\",\n" +
//                    "                                \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    },\n" +
//                    "                    {\n" +
//                    "                        \"additionalProperties\": [\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENTTYPE\",\n" +
//                    "                                \"value\": \"4\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                                \"value\": \"0\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                                \"value\": \"1\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"BANKNAME\",\n" +
//                    "                                \"value\": \"EBCOM\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"code\": \"CreationDate\",\n" +
//                    "                                \"value\": \"14010411033000\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"paymentDetails\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxLists\": [\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"27093668\",\n" +
//                    "                                        \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                    },\n" +
//                    "                                    {\n" +
//                    "                                        \"taxAmount\": \"13546839\",\n" +
//                    "                                        \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                    }\n" +
//                    "                                ],\n" +
//                    "                                \"applyAmount\": \"-260000\",\n" +
//                    "                                \"applyType\": \"1\",\n" +
//                    "                                \"billCycleId\": \"20220501\",\n" +
//                    "                                \"chargeAmount\": \"451561\",\n" +
//                    "                                \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                                \"discountAmount\": \"0\",\n" +
//                    "                                \"invoiceDate\": \"20220624071224\",\n" +
//                    "                                \"invoiceDetailID\": \"6815452365\",\n" +
//                    "                                \"invoiceID\": \"1785638277\",\n" +
//                    "                                \"invoiceNo\": \"14010329-06376528\",\n" +
//                    "                                \"taxList\": {\n" +
//                    "                                    \"taxAmount\": \"13546839\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"accessMode\": \"3\",\n" +
//                    "                        \"acctKey\": \"2911000169688085\",\n" +
//                    "                        \"amount\": \"260000\",\n" +
//                    "                        \"curAmount\": \"-94\",\n" +
//                    "                        \"currencyID\": \"1069\",\n" +
//                    "                        \"custKey\": \"2910011061796381\",\n" +
//                    "                        \"deptID\": \"101\",\n" +
//                    "                        \"extTransID\": \"CBSAR29160300597\",\n" +
//                    "                        \"operID\": \"101\",\n" +
//                    "                        \"oriAmount\": \"0\",\n" +
//                    "                        \"payChannelID\": \"80\",\n" +
//                    "                        \"paymentMethod\": \"1001\",\n" +
//                    "                        \"paymentTime\": \"20220702033000\",\n" +
//                    "                        \"primaryIdentity\": \"9125053921\",\n" +
//                    "                        \"status\": \"N\",\n" +
//                    "                        \"subKey\": \"2911000167149586\",\n" +
//                    "                        \"totalPaymentAmount\": \"260000\",\n" +
//                    "                        \"transID\": \"29160300598\",\n" +
//                    "                        \"transType\": \"PPM\",\n" +
//                    "                        \"additionalProperty\": {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14010411033000\"\n" +
//                    "                        },\n" +
//                    "                        \"bankInfo\": {\n" +
//                    "                            \"bankBranchCode\": \"300000\",\n" +
//                    "                            \"bankCode\": \"33\"\n" +
//                    "                        },\n" +
//                    "                        \"paymentDetail\": {\n" +
//                    "                            \"taxLists\": [\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"27093668\",\n" +
//                    "                                    \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                },\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"13546839\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            ],\n" +
//                    "                            \"applyAmount\": \"-260000\",\n" +
//                    "                            \"applyType\": \"1\",\n" +
//                    "                            \"billCycleId\": \"20220501\",\n" +
//                    "                            \"chargeAmount\": \"451561\",\n" +
//                    "                            \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                            \"discountAmount\": \"0\",\n" +
//                    "                            \"invoiceDate\": \"20220624071224\",\n" +
//                    "                            \"invoiceDetailID\": \"6815452365\",\n" +
//                    "                            \"invoiceID\": \"1785638277\",\n" +
//                    "                            \"invoiceNo\": \"14010329-06376528\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"13546839\",\n" +
//                    "                                \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    }\n" +
//                    "                ],\n" +
//                    "                \"paymentInfo\": {\n" +
//                    "                    \"additionalProperties\": [\n" +
//                    "                        {\n" +
//                    "                            \"code\": \"PAYMENTTYPE\",\n" +
//                    "                            \"value\": \"4\"\n" +
//                    "                        },\n" +
//                    "                        {\n" +
//                    "                            \"code\": \"PAYMENT_TYPE\",\n" +
//                    "                            \"value\": \"0\"\n" +
//                    "                        },\n" +
//                    "                        {\n" +
//                    "                            \"code\": \"PAYMENT_STATUS\",\n" +
//                    "                            \"value\": \"1\"\n" +
//                    "                        },\n" +
//                    "                        {\n" +
//                    "                            \"code\": \"BANKNAME\",\n" +
//                    "                            \"value\": \"EBCOM\"\n" +
//                    "                        },\n" +
//                    "                        {\n" +
//                    "                            \"code\": \"CreationDate\",\n" +
//                    "                            \"value\": \"14010411033000\"\n" +
//                    "                        }\n" +
//                    "                    ],\n" +
//                    "                    \"paymentDetails\": [\n" +
//                    "                        {\n" +
//                    "                            \"taxLists\": [\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"27093668\",\n" +
//                    "                                    \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                                },\n" +
//                    "                                {\n" +
//                    "                                    \"taxAmount\": \"13546839\",\n" +
//                    "                                    \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                                }\n" +
//                    "                            ],\n" +
//                    "                            \"applyAmount\": \"-260000\",\n" +
//                    "                            \"applyType\": \"1\",\n" +
//                    "                            \"billCycleId\": \"20220501\",\n" +
//                    "                            \"chargeAmount\": \"451561\",\n" +
//                    "                            \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                            \"discountAmount\": \"0\",\n" +
//                    "                            \"invoiceDate\": \"20220624071224\",\n" +
//                    "                            \"invoiceDetailID\": \"6815452365\",\n" +
//                    "                            \"invoiceID\": \"1785638277\",\n" +
//                    "                            \"invoiceNo\": \"14010329-06376528\",\n" +
//                    "                            \"taxList\": {\n" +
//                    "                                \"taxAmount\": \"13546839\",\n" +
//                    "                                \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                            }\n" +
//                    "                        }\n" +
//                    "                    ],\n" +
//                    "                    \"accessMode\": \"3\",\n" +
//                    "                    \"acctKey\": \"2911000169688085\",\n" +
//                    "                    \"amount\": \"260000\",\n" +
//                    "                    \"curAmount\": \"-94\",\n" +
//                    "                    \"currencyID\": \"1069\",\n" +
//                    "                    \"custKey\": \"2910011061796381\",\n" +
//                    "                    \"deptID\": \"101\",\n" +
//                    "                    \"extTransID\": \"CBSAR29160300597\",\n" +
//                    "                    \"operID\": \"101\",\n" +
//                    "                    \"oriAmount\": \"0\",\n" +
//                    "                    \"payChannelID\": \"80\",\n" +
//                    "                    \"paymentMethod\": \"1001\",\n" +
//                    "                    \"paymentTime\": \"20220702033000\",\n" +
//                    "                    \"primaryIdentity\": \"9125053921\",\n" +
//                    "                    \"status\": \"N\",\n" +
//                    "                    \"subKey\": \"2911000167149586\",\n" +
//                    "                    \"totalPaymentAmount\": \"260000\",\n" +
//                    "                    \"transID\": \"29160300598\",\n" +
//                    "                    \"transType\": \"PPM\",\n" +
//                    "                    \"additionalProperty\": {\n" +
//                    "                        \"code\": \"CreationDate\",\n" +
//                    "                        \"value\": \"14010411033000\"\n" +
//                    "                    },\n" +
//                    "                    \"bankInfo\": {\n" +
//                    "                        \"bankBranchCode\": \"300000\",\n" +
//                    "                        \"bankCode\": \"33\"\n" +
//                    "                    },\n" +
//                    "                    \"paymentDetail\": {\n" +
//                    "                        \"taxLists\": [\n" +
//                    "                            {\n" +
//                    "                                \"taxAmount\": \"27093668\",\n" +
//                    "                                \"taxCode\": \"C_VAT_TAX_CHARGE_CODE\"\n" +
//                    "                            },\n" +
//                    "                            {\n" +
//                    "                                \"taxAmount\": \"13546839\",\n" +
//                    "                                \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                            }\n" +
//                    "                        ],\n" +
//                    "                        \"applyAmount\": \"-260000\",\n" +
//                    "                        \"applyType\": \"1\",\n" +
//                    "                        \"billCycleId\": \"20220501\",\n" +
//                    "                        \"chargeAmount\": \"451561\",\n" +
//                    "                        \"chargeCode\": \"C_VOICE_CHARGECODE\",\n" +
//                    "                        \"discountAmount\": \"0\",\n" +
//                    "                        \"invoiceDate\": \"20220624071224\",\n" +
//                    "                        \"invoiceDetailID\": \"6815452365\",\n" +
//                    "                        \"invoiceID\": \"1785638277\",\n" +
//                    "                        \"invoiceNo\": \"14010329-06376528\",\n" +
//                    "                        \"taxList\": {\n" +
//                    "                            \"taxAmount\": \"13546839\",\n" +
//                    "                            \"taxCode\": \"C_DUTY_TAX_CHARGE_CODE\"\n" +
//                    "                        }\n" +
//                    "                    }\n" +
//                    "                },\n" +
//                    "                \"totalRowNum\": \"7\",\n" +
//                    "                \"beginRowNum\": \"0\",\n" +
//                    "                \"fetchRowNum\": \"7\"\n" +
//                    "            }\n" +
//                    "        }\n" +
//                    "    }\n" +
//                    "}";
        }
    }
}
