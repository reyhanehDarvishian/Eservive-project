package com.rahgozin.gate.dto.queryCustomBillingInfo.response;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryCustomBillingInfoResultHeader {
    String msgLanguageCode;
    String resultCode;
    String resultDesc;
    String version;

    public void setMsgLanguageCode(String msgLanguageCode) {
        this.msgLanguageCode = msgLanguageCode;
    }

    @XmlAttribute(name = "MsgLanguageCode")
    public String getMsgLanguageCode() {
        return msgLanguageCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlAttribute(name = "ResultCode")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @XmlAttribute(name = "ResultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "Version")
    public String getVersion() {
        return version;
    }
}