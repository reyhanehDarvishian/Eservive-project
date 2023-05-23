package com.rahgozin.gate.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "application.properties")
public class ApplicationProperties {
    private QuerySubscriberConnection querySubscriberConnection;
    private QueryImsiInfoConnection queryImsiInfoConnection;
    private QueryEntityIdConnection queryEntityIdConnection;
    private QueryBusinessFeeConnection queryBusinessFeeConnection;
    private QueryBillingInfoConnection queryBillingInfoConnection;
    private QueryRequestOrderConnection queryRequestOrderConnection;
    private QueryConfirmOrderConnection queryConfirmOrderConnection;
    private ProductTypeListConnection productTypeListConnection;
    private ProductListConnection productListConnection;
    private TopInConnection topInConnection;
    private QueryBalanceConnection queryBalanceConnection;
    private ChangeSubIdentityConnection changeSubIdentityConnection;
    private QueryCustomerInfoConnection queryCustomerInfoConnection;
    private QueryAccountInfoConnection queryAccountInfoConnection;
    private QueryPaymentLogConnection queryPaymentLogConnection;
    private CustomerClubInquiryScoreConnection customerClubInquiryScoreConnection;
    private ChangeImsiReportConnection changeImsiReportConnection;
    private QueryFreeUnitConnection queryFreeUnitConnection;
    private GetToken getToken;
    private Map<String, String> desc = new HashMap<>();
    private Map<String, String> billing = new HashMap<>();

    public Map<String, String> getBilling() {
        return billing;
    }

    public void setBilling(Map<String, String> billing) {
        this.billing = billing;
    }

    public QueryFreeUnitConnection getQueryFreeUnitConnection() {
        return queryFreeUnitConnection;
    }

    public ApplicationProperties setQueryFreeUnitConnection(QueryFreeUnitConnection queryFreeUnitConnection) {
        this.queryFreeUnitConnection = queryFreeUnitConnection;
        return this;
    }

    public Map<String, String> getDesc() {
        return desc;
    }

    public void setDesc(Map<String, String> desc) {
        this.desc = desc;
    }

    public static class QueryFreeUnitConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String version;
        private String businessCode;
        private String messageSeq;
        private String beId;
        private String loginSystemCode;
        private String password;
        private String operatorId;
        private String channelId;
        private String primaryIdentity;


        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryFreeUnitConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryFreeUnitConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryFreeUnitConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public QueryFreeUnitConnection setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryFreeUnitConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryFreeUnitConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public QueryFreeUnitConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public String getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryFreeUnitConnection setLoginSystemCode(String loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryFreeUnitConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getOperatorId() {
            return operatorId;
        }

        public QueryFreeUnitConnection setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getChannelId() {
            return channelId;
        }

        public QueryFreeUnitConnection setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        public QueryFreeUnitConnection setPrimaryIdentity(String primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }
    }

    public ChangeImsiReportConnection getChangeImsiReportConnection() {
        return changeImsiReportConnection;
    }

    public ApplicationProperties setChangeImsiReportConnection(ChangeImsiReportConnection changeImsiReportConnection) {
        this.changeImsiReportConnection = changeImsiReportConnection;
        return this;
    }

    public static class ChangeImsiReportConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String version;
        private String businessCode;
        private String messageSeq;
        private String beId;
        private String regionId;
        private String loginSystemCode;
        private String password;
        private String operatorId;
        private String channelType;
        private String serviceNumber;
        private String startDate;
        private String endDate;

        public String getBaseUrl() {
            return baseUrl;
        }

        public ChangeImsiReportConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public ChangeImsiReportConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public ChangeImsiReportConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public ChangeImsiReportConnection setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public ChangeImsiReportConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public ChangeImsiReportConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public ChangeImsiReportConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public String getRegionId() {
            return regionId;
        }

        public ChangeImsiReportConnection setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public String getLoginSystemCode() {
            return loginSystemCode;
        }

        public ChangeImsiReportConnection setLoginSystemCode(String loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public ChangeImsiReportConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getOperatorId() {
            return operatorId;
        }

        public ChangeImsiReportConnection setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getChannelType() {
            return channelType;
        }

        public ChangeImsiReportConnection setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        public String getServiceNumber() {
            return serviceNumber;
        }

        public ChangeImsiReportConnection setServiceNumber(String serviceNumber) {
            this.serviceNumber = serviceNumber;
            return this;
        }

        public String getStartDate() {
            return startDate;
        }

        public ChangeImsiReportConnection setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public String getEndDate() {
            return endDate;
        }

        public ChangeImsiReportConnection setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
    }

    public CustomerClubInquiryScoreConnection getCustomerClubInquiryScoreConnection() {
        return customerClubInquiryScoreConnection;
    }

    public ApplicationProperties setCustomerClubInquiryScoreConnection(CustomerClubInquiryScoreConnection customerClubInquiryScoreConnection) {
        this.customerClubInquiryScoreConnection = customerClubInquiryScoreConnection;
        return this;
    }

    public static class CustomerClubInquiryScoreConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String channel;
        private String mobileNumber;

        public String getBaseUrl() {
            return baseUrl;
        }

        public CustomerClubInquiryScoreConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public CustomerClubInquiryScoreConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public CustomerClubInquiryScoreConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getChannel() {
            return channel;
        }

        public CustomerClubInquiryScoreConnection setChannel(String channel) {
            this.channel = channel;
            return this;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public CustomerClubInquiryScoreConnection setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
    }

    public QueryPaymentLogConnection getQueryPaymentLogConnection() {
        return queryPaymentLogConnection;
    }

    public ApplicationProperties setQueryPaymentLogConnection(QueryPaymentLogConnection queryPaymentLogConnection) {
        this.queryPaymentLogConnection = queryPaymentLogConnection;
        return this;
    }

    public static class QueryPaymentLogConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String version;
        private String businessCode;
        private String messageSeq;
        private String beId;
        private String loginSystemCode;
        private String password;
        private String operatorId;
        private String channelId;
        private String primaryIdentity;
        private String totalRowNum;
        private String beginRowNum;
        private String fetchRowNum;
        private String startTime;
        private String endTime;

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryPaymentLogConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryPaymentLogConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryPaymentLogConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public QueryPaymentLogConnection setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryPaymentLogConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryPaymentLogConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public QueryPaymentLogConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public String getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryPaymentLogConnection setLoginSystemCode(String loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryPaymentLogConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getOperatorId() {
            return operatorId;
        }

        public QueryPaymentLogConnection setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getChannelId() {
            return channelId;
        }

        public QueryPaymentLogConnection setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        public QueryPaymentLogConnection setPrimaryIdentity(String primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }

        public String getTotalRowNum() {
            return totalRowNum;
        }

        public QueryPaymentLogConnection setTotalRowNum(String totalRowNum) {
            this.totalRowNum = totalRowNum;
            return this;
        }

        public String getBeginRowNum() {
            return beginRowNum;
        }

        public QueryPaymentLogConnection setBeginRowNum(String beginRowNum) {
            this.beginRowNum = beginRowNum;
            return this;
        }

        public String getFetchRowNum() {
            return fetchRowNum;
        }

        public QueryPaymentLogConnection setFetchRowNum(String fetchRowNum) {
            this.fetchRowNum = fetchRowNum;
            return this;
        }

        public String getStartTime() {
            return startTime;
        }

        public QueryPaymentLogConnection setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public String getEndTime() {
            return endTime;
        }

        public QueryPaymentLogConnection setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
    }

    public QueryAccountInfoConnection getQueryAccountInfoConnection() {
        return queryAccountInfoConnection;
    }

    public ApplicationProperties setQueryAccountInfoConnection(QueryAccountInfoConnection queryAccountInfoConnection) {
        this.queryAccountInfoConnection = queryAccountInfoConnection;
        return this;
    }

    public static class QueryAccountInfoConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String version;
        private String businessCode;
        private String messageSeq;
        private String beId;
        private String regionId;
        private String loginSystemCode;
        private String password;
        private String operatorId;
        private String orgId;
        private String channelType;
        private String accountId;
        private String includeAcctBillCycleFlag;
        private String includeAcctCreditLimitFlag;
        private String includeDeactivationFlag;
        private String includePaymentChannelFlag;
        private String includeContactPersonFlag;
        private String includeBillMediumFlag;

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryAccountInfoConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryAccountInfoConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryAccountInfoConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public QueryAccountInfoConnection setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryAccountInfoConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryAccountInfoConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public QueryAccountInfoConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public String getRegionId() {
            return regionId;
        }

        public QueryAccountInfoConnection setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public String getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryAccountInfoConnection setLoginSystemCode(String loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryAccountInfoConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getOperatorId() {
            return operatorId;
        }

        public QueryAccountInfoConnection setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getOrgId() {
            return orgId;
        }

        public QueryAccountInfoConnection setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        public String getChannelType() {
            return channelType;
        }

        public QueryAccountInfoConnection setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        public String getAccountId() {
            return accountId;
        }

        public QueryAccountInfoConnection setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public String getIncludeAcctBillCycleFlag() {
            return includeAcctBillCycleFlag;
        }

        public QueryAccountInfoConnection setIncludeAcctBillCycleFlag(String includeAcctBillCycleFlag) {
            this.includeAcctBillCycleFlag = includeAcctBillCycleFlag;
            return this;
        }

        public String getIncludeAcctCreditLimitFlag() {
            return includeAcctCreditLimitFlag;
        }

        public QueryAccountInfoConnection setIncludeAcctCreditLimitFlag(String includeAcctCreditLimitFlag) {
            this.includeAcctCreditLimitFlag = includeAcctCreditLimitFlag;
            return this;
        }

        public String getIncludeDeactivationFlag() {
            return includeDeactivationFlag;
        }

        public QueryAccountInfoConnection setIncludeDeactivationFlag(String includeDeactivationFlag) {
            this.includeDeactivationFlag = includeDeactivationFlag;
            return this;
        }

        public String getIncludePaymentChannelFlag() {
            return includePaymentChannelFlag;
        }

        public QueryAccountInfoConnection setIncludePaymentChannelFlag(String includePaymentChannelFlag) {
            this.includePaymentChannelFlag = includePaymentChannelFlag;
            return this;
        }

        public String getIncludeContactPersonFlag() {
            return includeContactPersonFlag;
        }

        public QueryAccountInfoConnection setIncludeContactPersonFlag(String includeContactPersonFlag) {
            this.includeContactPersonFlag = includeContactPersonFlag;
            return this;
        }

        public String getIncludeBillMediumFlag() {
            return includeBillMediumFlag;
        }

        public QueryAccountInfoConnection setIncludeBillMediumFlag(String includeBillMediumFlag) {
            this.includeBillMediumFlag = includeBillMediumFlag;
            return this;
        }
    }

    public QueryCustomerInfoConnection getQueryCustomerInfoConnection() {
        return queryCustomerInfoConnection;
    }

    public ApplicationProperties setQueryCustomerInfoConnection(QueryCustomerInfoConnection queryCustomerInfoConnection) {
        this.queryCustomerInfoConnection = queryCustomerInfoConnection;
        return this;
    }

    public static class QueryCustomerInfoConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String version;
        private String businessCode;
        private String messageSeq;
        private String beId;
        private String regionId;
        private String loginSystemCode;
        private String password;
        private String operatorId;
        private String orgId;
        private String channelType;
        private String primaryIdentity;
        private String includeAddrFlag;

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryCustomerInfoConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryCustomerInfoConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryCustomerInfoConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public QueryCustomerInfoConnection setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryCustomerInfoConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryCustomerInfoConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public QueryCustomerInfoConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public String getRegionId() {
            return regionId;
        }

        public QueryCustomerInfoConnection setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public String getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryCustomerInfoConnection setLoginSystemCode(String loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryCustomerInfoConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getOperatorId() {
            return operatorId;
        }

        public QueryCustomerInfoConnection setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getOrgId() {
            return orgId;
        }

        public QueryCustomerInfoConnection setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        public String getChannelType() {
            return channelType;
        }

        public QueryCustomerInfoConnection setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        public QueryCustomerInfoConnection setPrimaryIdentity(String primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }

        public String getIncludeAddrFlag() {
            return includeAddrFlag;
        }

        public QueryCustomerInfoConnection setIncludeAddrFlag(String includeAddrFlag) {
            this.includeAddrFlag = includeAddrFlag;
            return this;
        }
    }

    public ChangeSubIdentityConnection getChangeSubIdentityConnection() {
        return changeSubIdentityConnection;
    }

    public ApplicationProperties setChangeSubIdentityConnection(ChangeSubIdentityConnection changeSubIdentityConnection) {
        this.changeSubIdentityConnection = changeSubIdentityConnection;
        return this;
    }

    public static class ChangeSubIdentityConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String version;
        private String businessCode;
        private String messageSeq;
        private String beId;
        private String regionId;
        private String loginSystemCode;
        private String password;
        private String operatorId;
        private String orgId;
        private String channelType;
        private String primaryIdentity;

        public String getBaseUrl() {
            return baseUrl;
        }

        public ChangeSubIdentityConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public ChangeSubIdentityConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public ChangeSubIdentityConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public ChangeSubIdentityConnection setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public ChangeSubIdentityConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public ChangeSubIdentityConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public ChangeSubIdentityConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public String getRegionId() {
            return regionId;
        }

        public ChangeSubIdentityConnection setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public String getLoginSystemCode() {
            return loginSystemCode;
        }

        public ChangeSubIdentityConnection setLoginSystemCode(String loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public ChangeSubIdentityConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getOperatorId() {
            return operatorId;
        }

        public ChangeSubIdentityConnection setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getOrgId() {
            return orgId;
        }

        public ChangeSubIdentityConnection setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        public String getChannelType() {
            return channelType;
        }

        public ChangeSubIdentityConnection setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        public ChangeSubIdentityConnection setPrimaryIdentity(String primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }
    }

    public TopInConnection getTopInConnection() {
        return topInConnection;
    }

    public ApplicationProperties setTopInConnection(TopInConnection topInConnection) {
        this.topInConnection = topInConnection;
        return this;
    }

    public QueryBalanceConnection getQueryBalanceConnection() {
        return queryBalanceConnection;
    }

    public ApplicationProperties setQueryBalanceConnection(QueryBalanceConnection queryBalanceConnection) {
        this.queryBalanceConnection = queryBalanceConnection;
        return this;
    }

    public static class QueryBalanceConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private Integer version;
        private String businessCode;
        private String messageSeq;
        private String ownershipInfo;
        private Integer loginSystemCode;
        private String password;
        private Integer operatorID;
        private Integer channelID;
        private String primaryIdentity;
        private String beId;

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryBalanceConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryBalanceConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryBalanceConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public QueryBalanceConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public Integer getVersion() {
            return version;
        }

        public QueryBalanceConnection setVersion(Integer version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryBalanceConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryBalanceConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getOwnershipInfo() {
            return ownershipInfo;
        }

        public QueryBalanceConnection setOwnershipInfo(String ownershipInfo) {
            this.ownershipInfo = ownershipInfo;
            return this;
        }

        public Integer getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryBalanceConnection setLoginSystemCode(Integer loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryBalanceConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public Integer getOperatorID() {
            return operatorID;
        }

        public QueryBalanceConnection setOperatorID(Integer operatorID) {
            this.operatorID = operatorID;
            return this;
        }

        public Integer getChannelID() {
            return channelID;
        }

        public QueryBalanceConnection setChannelID(Integer channelID) {
            this.channelID = channelID;
            return this;
        }

        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        public QueryBalanceConnection setPrimaryIdentity(String primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }
    }

    public static class TopInConnection {
        private String username;
        private String password;
        private String token;

        public String getToken() {
            return token;
        }

        public TopInConnection setToken(String token) {
            this.token = token;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public TopInConnection setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public TopInConnection setPassword(String password) {
            this.password = password;
            return this;
        }
    }

    public ProductTypeListConnection getProductTypeListConnection() {
        return productTypeListConnection;
    }

    public ApplicationProperties setProductTypeListConnection(ProductTypeListConnection productTypeListConnection) {
        this.productTypeListConnection = productTypeListConnection;
        return this;
    }

    public ProductListConnection getProductListConnection() {
        return productListConnection;
    }

    public ApplicationProperties setProductListConnection(ProductListConnection productListConnection) {
        this.productListConnection = productListConnection;
        return this;
    }

    public QueryConfirmOrderConnection getQueryConfirmOrderConnection() {
        return queryConfirmOrderConnection;
    }

    public ApplicationProperties setQueryConfirmOrderConnection(QueryConfirmOrderConnection queryConfirmOrderConnection) {
        this.queryConfirmOrderConnection = queryConfirmOrderConnection;
        return this;
    }

    public static class ProductTypeListConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public ProductTypeListConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public ProductTypeListConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public ProductTypeListConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
    }

    public static class ProductListConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public ProductListConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public ProductListConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public ProductListConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
    }

    public static class QueryConfirmOrderConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String orderId;
        private String bankCode;
        private String cardNo;
        private String cardType;
        private String RRN;

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryConfirmOrderConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryConfirmOrderConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryConfirmOrderConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getOrderId() {
            return orderId;
        }

        public QueryConfirmOrderConnection setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public String getBankCode() {
            return bankCode;
        }

        public QueryConfirmOrderConnection setBankCode(String bankCode) {
            this.bankCode = bankCode;
            return this;
        }

        public String getCardNo() {
            return cardNo;
        }

        public QueryConfirmOrderConnection setCardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }

        public String getCardType() {
            return cardType;
        }

        public QueryConfirmOrderConnection setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        public String getRRN() {
            return RRN;
        }

        public QueryConfirmOrderConnection setRRN(String RRN) {
            this.RRN = RRN;
            return this;
        }


    }

    public static class QueryRequestOrderConnection {

        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String telNum;
        private String telGift;
        private String amount;
        private String productId;
        private String payloadId;
        private String channelId;

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryRequestOrderConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryRequestOrderConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryRequestOrderConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public String getTelNum() {
            return telNum;
        }

        public QueryRequestOrderConnection setTelNum(String telNum) {
            this.telNum = telNum;
            return this;
        }

        public String getTelGift() {
            return telGift;
        }

        public QueryRequestOrderConnection setTelGift(String telGift) {
            this.telGift = telGift;
            return this;
        }

        public String getAmount() {
            return amount;
        }

        public QueryRequestOrderConnection setAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public String getProductId() {
            return productId;
        }

        public QueryRequestOrderConnection setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public String getPayloadId() {
            return payloadId;
        }

        public QueryRequestOrderConnection setPayloadId(String payloadId) {
            this.payloadId = payloadId;
            return this;
        }

        public String getChannelId() {
            return channelId;
        }

        public QueryRequestOrderConnection setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
    }

    public QueryRequestOrderConnection getQueryRequestOrderConnection() {
        return queryRequestOrderConnection;
    }

    public ApplicationProperties setQueryRequestOrderConnection(QueryRequestOrderConnection queryRequestOrderConnection) {
        this.queryRequestOrderConnection = queryRequestOrderConnection;
        return this;
    }

    public QueryBillingInfoConnection getQueryBillingInfoConnection() {
        return queryBillingInfoConnection;
    }

    public ApplicationProperties setQueryBillingInfoConnection(QueryBillingInfoConnection queryBillingInfoConnection) {
        this.queryBillingInfoConnection = queryBillingInfoConnection;
        return this;
    }

    public GetToken getGetToken() {
        return getToken;
    }

    public ApplicationProperties setGetToken(GetToken getToken) {
        this.getToken = getToken;
        return this;
    }

    public QueryBusinessFeeConnection getQueryBusinessFeeConnection() {
        return queryBusinessFeeConnection;
    }

    public ApplicationProperties setQueryBusinessFeeConnection(QueryBusinessFeeConnection queryBusinessFeeConnection) {
        this.queryBusinessFeeConnection = queryBusinessFeeConnection;
        return this;
    }

    public QueryImsiInfoConnection getQueryImsiInfoConnection() {
        return queryImsiInfoConnection;
    }

    public ApplicationProperties setQueryImsiInfoConnection(QueryImsiInfoConnection queryImsiInfoConnection) {
        this.queryImsiInfoConnection = queryImsiInfoConnection;
        return this;
    }

    public QueryEntityIdConnection getQueryEntityIdConnection() {
        return queryEntityIdConnection;
    }

    public ApplicationProperties setQueryEntityIdConnection(QueryEntityIdConnection queryEntityIdConnection) {
        this.queryEntityIdConnection = queryEntityIdConnection;
        return this;
    }

    public QuerySubscriberConnection getQuerySubscriberConnection() {
        return querySubscriberConnection;
    }

    public ApplicationProperties setQuerySubscriberConnection(QuerySubscriberConnection querySubscriberConnection) {
        this.querySubscriberConnection = querySubscriberConnection;
        return this;
    }

    public static class QueryBillingInfoConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private Integer version;
        private Integer businessCode;
        private String messageSeq;
        private Integer beId;
        private Integer brId;
        private Integer loginSystemCode;
        private String password;
        private Integer operatorId;
        private String primaryIdentity;
        private String billCycleID;
        private Integer optType;

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryBillingInfoConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryBillingInfoConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryBillingInfoConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public Integer getOptType() {
            return optType;
        }

        public QueryBillingInfoConnection setOptType(Integer optType) {
            this.optType = optType;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryBillingInfoConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public Integer getVersion() {
            return version;
        }

        public QueryBillingInfoConnection setVersion(Integer version) {
            this.version = version;
            return this;
        }

        public Integer getBusinessCode() {
            return businessCode;
        }

        public QueryBillingInfoConnection setBusinessCode(Integer businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryBillingInfoConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public Integer getBeId() {
            return beId;
        }

        public QueryBillingInfoConnection setBeId(Integer beId) {
            this.beId = beId;
            return this;
        }

        public Integer getBrId() {
            return brId;
        }

        public QueryBillingInfoConnection setBrId(Integer brId) {
            this.brId = brId;
            return this;
        }

        public Integer getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryBillingInfoConnection setLoginSystemCode(Integer loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public Integer getOperatorId() {
            return operatorId;
        }

        public QueryBillingInfoConnection setOperatorId(Integer operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        public QueryBillingInfoConnection setPrimaryIdentity(String primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }

        public String getBillCycleID() {
            return billCycleID;
        }

        public QueryBillingInfoConnection setBillCycleID(String billCycleID) {
            this.billCycleID = billCycleID;
            return this;
        }
    }

    public static class QueryBusinessFeeConnection {
        public static class BusinessFeeSimpleProperty {
            private String code;
            private Integer value;

            public String getCode() {
                return code;
            }

            public BusinessFeeSimpleProperty setCode(String code) {
                this.code = code;
                return this;
            }

            public Integer getValue() {
                return value;
            }

            public BusinessFeeSimpleProperty setValue(Integer value) {
                this.value = value;
                return this;
            }

            public BusinessFeeSimpleProperty(String code, Integer value) {
                this.code = code;
                this.value = value;
            }
        }

        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private Integer version;
        private String businessCode;
        private String messageSeq;
        private Integer beId;
        private Integer regionId;
        private Integer loginSystemCode;
        private String password;
        private Integer operatorId;
        private Integer orgId;
        private Integer channelType;
        private String primaryIdentity;
        private String businessCode2;
        //        private List<BusinessFeeSimpleProperty> businessFeeSimpleProperties;
        List<BusinessFeeSimpleProperty> businessFeeSimplePropertyList;

        public List<BusinessFeeSimpleProperty> getBusinessFeeSimplePropertyList() {
            return businessFeeSimplePropertyList;
        }

        public QueryBusinessFeeConnection
        setBusinessFeeSimplePropertyList(List<BusinessFeeSimpleProperty> businessFeeSimplePropertyList) {
            this.businessFeeSimplePropertyList = businessFeeSimplePropertyList;
            return this;
        }
        //        public List<BusinessFeeSimpleProperty> getBusinessFeeSimpleProperties() {
//            return businessFeeSimpleProperties;
//        }
//
//        public QueryBusinessFeeConnection
//        setBusinessFeeSimpleProperties(List<BusinessFeeSimpleProperty> businessFeeSimpleProperties) {
//            this.businessFeeSimpleProperties = businessFeeSimpleProperties;
//            return this;
//        }

        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        public QueryBusinessFeeConnection setPrimaryIdentity(String primaryIdentity) {
            this.primaryIdentity = primaryIdentity;
            return this;
        }

        public String getBusinessCode2() {
            return businessCode2;
        }

        public QueryBusinessFeeConnection setBusinessCode2(String businessCode2) {
            this.businessCode2 = businessCode2;
            return this;
        }

        public Integer getVersion() {
            return version;
        }

        public QueryBusinessFeeConnection setVersion(Integer version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryBusinessFeeConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryBusinessFeeConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public Integer getBeId() {
            return beId;
        }

        public QueryBusinessFeeConnection setBeId(Integer beId) {
            this.beId = beId;
            return this;
        }

        public Integer getRegionId() {
            return regionId;
        }

        public QueryBusinessFeeConnection setRegionId(Integer regionId) {
            this.regionId = regionId;
            return this;
        }

        public Integer getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryBusinessFeeConnection setLoginSystemCode(Integer loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryBusinessFeeConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public Integer getOperatorId() {
            return operatorId;
        }

        public QueryBusinessFeeConnection setOperatorId(Integer operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public Integer getOrgId() {
            return orgId;
        }

        public QueryBusinessFeeConnection setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        public Integer getChannelType() {
            return channelType;
        }

        public QueryBusinessFeeConnection setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryBusinessFeeConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryBusinessFeeConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryBusinessFeeConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
    }

    public static class QuerySubscriberConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String businessCode;
        private Integer version;
        private String messageSeq;
        private Integer beId;
        private Integer regionId;
        private Integer loginSystemCode;
        private String password;
        private Integer operatorId;
        private String includeOfferFlag;
        private String includeHistoryFlag;
        private String includeProdFlag;
        private String includeContractFlag;

        public String getIncludeOfferFlag() {
            return includeOfferFlag;
        }

        public QuerySubscriberConnection setIncludeOfferFlag(String includeOfferFlag) {
            this.includeOfferFlag = includeOfferFlag;
            return this;
        }

        public String getIncludeHistoryFlag() {
            return includeHistoryFlag;
        }

        public QuerySubscriberConnection setIncludeHistoryFlag(String includeHistoryFlag) {
            this.includeHistoryFlag = includeHistoryFlag;
            return this;
        }

        public String getIncludeProdFlag() {
            return includeProdFlag;
        }

        public QuerySubscriberConnection setIncludeProdFlag(String includeProdFlag) {
            this.includeProdFlag = includeProdFlag;
            return this;
        }

        public String getIncludeContractFlag() {
            return includeContractFlag;
        }

        public QuerySubscriberConnection setIncludeContractFlag(String includeContractFlag) {
            this.includeContractFlag = includeContractFlag;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QuerySubscriberConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public Integer getBeId() {
            return beId;
        }

        public QuerySubscriberConnection setBeId(Integer beId) {
            this.beId = beId;
            return this;
        }

        public Integer getRegionId() {
            return regionId;
        }

        public QuerySubscriberConnection setRegionId(Integer regionId) {
            this.regionId = regionId;
            return this;
        }

        public Integer getLoginSystemCode() {
            return loginSystemCode;
        }

        public QuerySubscriberConnection setLoginSystemCode(Integer loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QuerySubscriberConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public Integer getOperatorId() {
            return operatorId;
        }

        public QuerySubscriberConnection setOperatorId(Integer operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public Integer getVersion() {
            return version;
        }

        public QuerySubscriberConnection setVersion(Integer version) {
            this.version = version;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QuerySubscriberConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public QuerySubscriberConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QuerySubscriberConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QuerySubscriberConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
    }

    public static class QueryImsiInfoConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String businessCode;
        private Integer version;
        private String messageSeq;
        private Integer beId;
        private Integer regionId;
        private Integer loginSystemCode;
        private String password;
        private Integer orgId;
        private Integer operatorId;
        private Integer channelType;

        public Integer getChannelType() {
            return channelType;
        }

        public QueryImsiInfoConnection setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryImsiInfoConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public Integer getVersion() {
            return version;
        }

        public QueryImsiInfoConnection setVersion(Integer version) {
            this.version = version;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryImsiInfoConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public Integer getBeId() {
            return beId;
        }

        public QueryImsiInfoConnection setBeId(Integer beId) {
            this.beId = beId;
            return this;
        }

        public Integer getRegionId() {
            return regionId;
        }

        public QueryImsiInfoConnection setRegionId(Integer regionId) {
            this.regionId = regionId;
            return this;
        }

        public Integer getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryImsiInfoConnection setLoginSystemCode(Integer loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryImsiInfoConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public Integer getOrgId() {
            return orgId;
        }

        public QueryImsiInfoConnection setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        public Integer getOperatorId() {
            return operatorId;
        }

        public QueryImsiInfoConnection setOperatorId(Integer operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryImsiInfoConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryImsiInfoConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryImsiInfoConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
    }

    public static class QueryEntityIdConnection {
        private String baseUrl;
        private Integer readTimeout;
        private Integer connectionTimeout;
        private String businessCode;
        private String version;
        private String messageSeq;
        private String beId;
        private String regionId;
        private String loginSystemCode;
        private String password;
        private String orgId;
        private String operatorId;
        private String channelType;

        public String getBusinessCode() {
            return businessCode;
        }

        public QueryEntityIdConnection setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public QueryEntityIdConnection setVersion(String version) {
            this.version = version;
            return this;
        }

        public String getMessageSeq() {
            return messageSeq;
        }

        public QueryEntityIdConnection setMessageSeq(String messageSeq) {
            this.messageSeq = messageSeq;
            return this;
        }

        public String getBeId() {
            return beId;
        }

        public QueryEntityIdConnection setBeId(String beId) {
            this.beId = beId;
            return this;
        }

        public String getRegionId() {
            return regionId;
        }

        public QueryEntityIdConnection setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public String getLoginSystemCode() {
            return loginSystemCode;
        }

        public QueryEntityIdConnection setLoginSystemCode(String loginSystemCode) {
            this.loginSystemCode = loginSystemCode;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public QueryEntityIdConnection setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getOrgId() {
            return orgId;
        }

        public QueryEntityIdConnection setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        public String getOperatorId() {
            return operatorId;
        }

        public QueryEntityIdConnection setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public String getChannelType() {
            return channelType;
        }

        public QueryEntityIdConnection setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public QueryEntityIdConnection setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public QueryEntityIdConnection setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public QueryEntityIdConnection setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
    }

    public static class GetToken {
        private String basic64Str;
        private String clientId;
        private String clientSecret;

        public String getBasic64Str() {
            return basic64Str;
        }

        public GetToken setBasic64Str(String basic64Str) {
            this.basic64Str = basic64Str;
            return this;
        }

        public String getClientId() {
            return clientId;
        }

        public GetToken setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public GetToken setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
    }
}