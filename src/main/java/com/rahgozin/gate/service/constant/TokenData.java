package com.rahgozin.gate.service.constant;

import java.util.HashMap;
import java.util.Map;

public class TokenData {

    private static Map<String, String> externalTokens = new HashMap<>();

    private static String queryImsiToken = "imsi_token";
    private static String queryBusinessFeeToken = "business_fee_token";
    private static String queryEntityIdToken = "entity_id_token";
    private static String querySubscriberToken = "subscriber_token";
    private static String queryCustomBillingToken = "custom_billing_token";
    private static String queryBalanceToken = "query_balance_token";
    private static String queryCustomerInfoToken = "query-customer-info";
    private static String queryAccountInfoToken = "query-account-info";
    private static String queryPaymentLogToken = "query-payment-log";
    private static String customerClubInquiryScoreToken = "customer-club-inquiry-score";
    private static String changeImsiReportToken = "change-imsi-report";
    private static String queryFreeUnitToken = "query-free-unit";

    public static String getQueryFreeUnitToken() {
        return externalTokens.get(queryFreeUnitToken);
    }

    public static void addQueryFreeUnitToken(String token) {
        externalTokens.put(queryFreeUnitToken, "Bearer " + token);
    }

    public static String getChangeImsiReportToken() {
        return externalTokens.get(changeImsiReportToken);
    }

    public static void addChangeImsiReportToken(String token) {
        externalTokens.put(changeImsiReportToken, "Bearer " + token);
    }

    public static String getCustomerClubInquiryScoreToken() {
        return externalTokens.get(customerClubInquiryScoreToken);
    }

    public static void addCustomerClubInquiryScoreToken(String token) {
        externalTokens.put(customerClubInquiryScoreToken, "Bearer " + token);
    }

    public static String getQueryPaymentLogToken() {
        return externalTokens.get(queryPaymentLogToken);
    }

    public static void addQueryPaymentLogToken(String token) {
        externalTokens.put(queryPaymentLogToken, "Bearer " + token);
    }

    public static String getQueryAccountInfoToken() {
        return externalTokens.get(queryAccountInfoToken);
    }

    public static void addQueryAccountInfoToken(String token) {
        externalTokens.put(queryAccountInfoToken, "Bearer " + token);
    }

    public static String getQueryCustomerInfoToken() {
        return externalTokens.get(queryCustomerInfoToken);
    }

    public static void addQueryCustomerInfoToken(String token) {
        externalTokens.put(queryCustomerInfoToken, "Bearer " + token);
    }

    public static String getQueryBalanceToken() {
        return externalTokens.get(queryBalanceToken);
    }

    public static void addQueryBalanceToken(String token) {
        externalTokens.put(queryBalanceToken, "Bearer " + token);
    }

    public static String getQueryCustomBillingToken() {
        return externalTokens.get(queryCustomBillingToken);
    }

    public static void addQueryCustomBillingToken(String token) {
        externalTokens.put(queryCustomBillingToken, "Bearer " + token);
    }

    public static String getQueryBusinessFeeToken() {
        return externalTokens.get(queryBusinessFeeToken);
    }

    public static void addQueryBusinessFeeToken(String token) {
        externalTokens.put(queryBusinessFeeToken, "Bearer " + token);
    }

    public static String getQueryEntityIdToken() {
        return externalTokens.get(queryEntityIdToken);
    }

    public static void addQueryEntityIdToken(String token) {
        externalTokens.put(queryEntityIdToken, "Bearer " + token);
    }

    public static String getQuerySubscriberToken() {
        return externalTokens.get(querySubscriberToken);
    }

    public static void addQuerySubscriberToken(String token) {
        externalTokens.put(querySubscriberToken, "Bearer " + token);
    }

    public static String getQueryImsiToken() {
        return externalTokens.get(queryImsiToken);
    }

    public static void addQueryImsiToken(String token) {
        externalTokens.put(queryImsiToken, "Bearer " + token);
    }
}