package com.rahgozin.gate.dto.queryImsiinfo.response;

import javax.xml.bind.annotation.XmlAttribute;


public class QueryImsiResResultHeader {
    String resultCode = "";
    String resultDesc = "";
    String version = "";

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