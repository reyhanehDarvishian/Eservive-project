package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class QueryCustomerInfoResResultHeader {
    String resultCode="";
    String resultDesc="";
    String textContent="";
@JsonProperty("version") 
    VersionBean versionBean ;
  public void setResultCode(String resultCode) { 
		this.resultCode=resultCode;
	} 
    @XmlAttribute(name = "resultCode")
    public String getResultCode() { 
		return resultCode;
	} 
  public void setResultDesc(String resultDesc) { 
		this.resultDesc=resultDesc;
	} 
    @XmlAttribute(name = "resultDesc")
    public String getResultDesc() { 
		return resultDesc;
	} 
  public void setTextContent(String textContent) { 
		this.textContent=textContent;
	} 
    @XmlAttribute(name = "TextContent")
    public String getTextContent() { 
		return textContent;
	} 
    @XmlElement(name = "version")
    public VersionBean getVersionBean() { 
		if(versionBean==null) versionBean=new VersionBean(); 
		return versionBean;
	} 
  public void setVersionBean( VersionBean versionBean ) { 
		this.versionBean=versionBean;
	} 


}