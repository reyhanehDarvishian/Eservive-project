package com.rahgozin.gate.dto.queryCustomerInfo.response;



import javax.xml.bind.annotation.XmlAttribute;


public class VersionBean {
    String version="";
    String textContent="";
  public void setVersion(String version) { 
		this.version=version;
	} 
    @XmlAttribute(name = "version")
    public String getVersion() { 
		return version;
	} 
  public void setTextContent(String textContent) { 
		this.textContent=textContent;
	} 
    @XmlAttribute(name = "TextContent")
    public String getTextContent() { 
		return textContent;
	} 


}