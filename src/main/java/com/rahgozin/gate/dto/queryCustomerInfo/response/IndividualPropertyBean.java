package com.rahgozin.gate.dto.queryCustomerInfo.response;

import javax.xml.bind.annotation.XmlAttribute;


public class IndividualPropertyBean {
    String code="";
    String value="";
    String textContent="";
  public void setCode(String code) { 
		this.code=code;
	} 
    @XmlAttribute(name = "code")
    public String getCode() { 
		return code;
	} 
  public void setValue(String value) { 
		this.value=value;
	} 
    @XmlAttribute(name = "value")
    public String getValue() { 
		return value;
	} 
  public void setTextContent(String textContent) { 
		this.textContent=textContent;
	} 
    @XmlAttribute(name = "TextContent")
    public String getTextContent() { 
		return textContent;
	} 


}