package com.rahgozin.gate.dto.queryAccountInfo.response;

import javax.xml.bind.annotation.XmlAttribute;

public class QueryAccountInfoResResultHeader {
    String version;
    String resultCode;
    String resultDesc;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlAttribute(name = "resultCode")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @XmlAttribute(name = "resultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "version")
    public String getVersion() {
        return version;
    }
}