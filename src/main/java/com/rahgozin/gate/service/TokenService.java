package com.rahgozin.gate.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahgozin.gate.config.ApplicationProperties;
import com.rahgozin.gate.dto.token.CRMToken;
import com.rahgozin.gate.service.constant.TokenData;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;

@Service
public class TokenService {
    private final ApplicationProperties applicationProperties;

    public TokenService(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    //    queryCustomerInfo
    public String getQueryCustomerInfo() {
        String accessToken = TokenData.getQueryCustomerInfoToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-customer-info.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryCustomerInfoToken(accessToken);
            return TokenData.getQueryCustomerInfoToken();
        } else {
            return accessToken;
        }
    }

    public void reNewQueryCustomerInfoToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-customer-info.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryCustomerInfoToken(accessToken);
    }

    //    changeImsiReport
    public String getChangeImsiReportToken() {
        String accessToken = TokenData.getChangeImsiReportToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.change-imsi-report.write");
            accessToken = crmToken.getAccessToken();
            TokenData.addChangeImsiReportToken(accessToken);
            return TokenData.getChangeImsiReportToken();
        } else {
            return accessToken;
        }
    }

    public void reNewChangeImsiReportToken() {
        CRMToken crmToken = this.getCrmToken("ecare.change-imsi-report.write");
        String accessToken = crmToken.getAccessToken();
        TokenData.addChangeImsiReportToken(accessToken);
    }

    //    queryPaymentLog
    public String getQueryPaymentLogToken() {
        String accessToken = TokenData.getQueryPaymentLogToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-payment-log.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryPaymentLogToken(accessToken);
            return TokenData.getQueryPaymentLogToken();
        } else {
            return accessToken;
        }
    }

    public void reNewQueryPaymentLogToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-payment-log.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryPaymentLogToken(accessToken);
    }

    //   get queryAccountInfo token
    public String getQueryAccountInfo() {
        String accessToken = TokenData.getQueryAccountInfoToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-account-info-soap.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryAccountInfoToken(accessToken);
            return TokenData.getQueryAccountInfoToken();
        } else {
            return accessToken;
        }
    }

    public void reNewQueryAccountInfoToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-account-info-soap.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryAccountInfoToken(accessToken);
    }

    //get imsi token
    public String getImsiToken() {
        String accessToken = TokenData.getQueryImsiToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-imsi-info.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryImsiToken(accessToken);
            return TokenData.getQueryImsiToken();
        } else {
            return accessToken;
        }
    }

    public void reNewImsiToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-imsi-info.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryImsiToken(accessToken);
    }

    //free unit token
    public String getQueryFreeUnitToken() {
        String accessToken = TokenData.getQueryFreeUnitToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-free-unit.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryFreeUnitToken(accessToken);
            return TokenData.getQueryFreeUnitToken();
        } else {
            return accessToken;
        }
    }

    public void reNewQueryFreeUnitToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-free-unit.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryFreeUnitToken(accessToken);
    }
    //get business fee token
    public void reNewBusinessFeeToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-business-fee-soap.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryBusinessFeeToken(accessToken);
    }

    public String getBusinessFeeToken() {
        String accessToken = TokenData.getQueryBusinessFeeToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-business-fee-soap.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryBusinessFeeToken(accessToken);
            return TokenData.getQueryBusinessFeeToken();
        } else {
            return accessToken;
        }
    }

    //get entity id token
    public void reNewEntityIdToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-entity-id-soap.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryEntityIdToken(accessToken);
    }

    public String getEntityIdToken() {
        String accessToken = TokenData.getQueryEntityIdToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-entity-id-soap.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryEntityIdToken(accessToken);
            return TokenData.getQueryEntityIdToken();
        } else {
            return accessToken;
        }
    }

    //get Customer inquiry club score token
    public void reNewCustomerClubInquiryScoreToken() {
        CRMToken crmToken = this.getCrmToken("ecare.customer-club-inquiry-score.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addCustomerClubInquiryScoreToken(accessToken);
    }

    public String getCustomerClubInquiryScoreToken() {
        String accessToken = TokenData.getCustomerClubInquiryScoreToken();
        System.out.println("accessToken: " + accessToken);
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.customer-club-inquiry-score.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addCustomerClubInquiryScoreToken(accessToken);
            return TokenData.getCustomerClubInquiryScoreToken();
        } else {
            return accessToken;
        }
    }

    //get subscriber token
    public void reNewSubscriberToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-subscriber.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQuerySubscriberToken(accessToken);
    }

    public String getSubscriberToken() {
        String accessToken = TokenData.getQuerySubscriberToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-subscriber.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQuerySubscriberToken(accessToken);
            return TokenData.getQuerySubscriberToken();
        } else {
            return accessToken;
        }
    }

    //get query balance token
    public void reNewQueryBalanceToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-balance.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryBalanceToken(accessToken);
    }

    public String getQueryBalanceToken() {
        String accessToken = TokenData.getQueryBalanceToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-balance.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryBalanceToken(accessToken);
            return TokenData.getQueryBalanceToken();
        } else {
            return accessToken;
        }
    }

    //get custom billing token
    public void reNewBillingToken() {
        CRMToken crmToken = this.getCrmToken("ecare.query-custom-billing-info-soap.read");
        String accessToken = crmToken.getAccessToken();
        TokenData.addQueryCustomBillingToken(accessToken);
    }

    public String getBillingToken() {
        String accessToken = TokenData.getQueryCustomBillingToken();
        if (accessToken == null) {
            CRMToken crmToken = this.getCrmToken("ecare.query-custom-billing-info-soap.read");
            accessToken = crmToken.getAccessToken();
            TokenData.addQueryCustomBillingToken(accessToken);
            return TokenData.getQueryCustomBillingToken();
        } else {
            return accessToken;
        }
    }

    public String getTopInAuthPassword(String username, String password, String token) {
        System.out.println("TokenService => getTopInAuthPassword => U: " + username + " P: " + password + " T: " + token);
        return Hash(username.toUpperCase() + "|" + password + "|" + token);
    }

    public static String Hash(String toHash) {

        MessageDigest md = null;
        byte[] result = null;
        try {
            md = MessageDigest.getInstance("MD5");
            result = md.digest(toHash.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return Arrays.toString(result);
    }

    public String getRequestHeaderAuthorization(String username, String password, String token) {
        System.out.println("TokenService => getRequestHeaderAuthorization => U: " + username + "  P: " + password + " token: " + token);
        String topInAuthPassword = getTopInAuthPassword(username, password, token);
        System.out.println("TokenService => getRequestHeaderAuthorization => topInAuthPassword: " + topInAuthPassword);
        Base64.Encoder encoder = Base64.getEncoder();
        String auth = username + ":" + topInAuthPassword;
        System.out.println("TokenService => getRequestHeaderAuthorization => auth: " + auth);
        String encodedAuth = encoder.encodeToString(auth.getBytes());
        System.out.println("TokenService => getRequestHeaderAuthorization => encodedAuth: " + encodedAuth);
        return "Basic " + encodedAuth;
    }

    public String getTopInToken(String username, String password) {
        System.out.println("TokenService => getTopInToken => U: " + username + "  P: " + password);
        String topInToken = "";
        String tokenId = "";
        JSONObject json = null;
        HttpHeaders tokenHeaders = new HttpHeaders();
        tokenHeaders.add(HttpHeaders.AUTHORIZATION, getRequestHeaderAuthorization(username, password, topInToken));
        tokenHeaders.add(HttpHeaders.ACCEPT_ENCODING, "gzip,deflate");
        tokenHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");
        tokenHeaders.add(HttpHeaders.CONTENT_LENGTH, "0");
        topInToken = new RestTemplate()
                .postForEntity(applicationProperties.getTopInConnection().getToken(), tokenHeaders, String.class).getBody();
        try {
            json = new JSONObject(topInToken);
            tokenId = json.getString("TokenID");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        System.out.println("TokenService => tokenId: " + tokenId);
        return tokenId;
    }

    private CRMToken getCrmToken(String scope) {
        System.out.println(scope);
        HttpHeaders tokenHeaders = new HttpHeaders();
        tokenHeaders.add(HttpHeaders.AUTHORIZATION, applicationProperties.getGetToken().getBasic64Str());
        tokenHeaders.add(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
        tokenHeaders.add(HttpHeaders.ACCEPT, "*/*");
        tokenHeaders.add(HttpHeaders.CONNECTION, "keep-alive");
        MultiValueMap<String, String> mapValue = new LinkedMultiValueMap<String, String>();
        mapValue.add("grant_type", "client_credentials");
        mapValue.add("scope", scope);
        mapValue.add("client_id", applicationProperties.getGetToken().getClientId());
        mapValue.add("client_secret", applicationProperties.getGetToken().getClientSecret());
        HttpEntity<MultiValueMap<String, String>> requestBody = new HttpEntity<>(mapValue, tokenHeaders);
        Map body = new RestTemplate().postForEntity("https://sandbox.mci.ir/api/auth/token", requestBody, Map.class).getBody();
        CRMToken crmToken = new ObjectMapper().convertValue(body, CRMToken.class);
        return crmToken;
    }
}