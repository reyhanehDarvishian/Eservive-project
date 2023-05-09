package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class IndividualInfoBean {
    String textContent="";
@JsonProperty("individualBaseInfo") 
    IndividualBaseInfoBean individualBaseInfoBean ;
  public void setTextContent(String textContent) { 
		this.textContent=textContent;
	} 
    @XmlAttribute(name = "TextContent")
    public String getTextContent() { 
		return textContent;
	} 
    @XmlElement(name = "individualBaseInfo")
    public IndividualBaseInfoBean getIndividualBaseInfoBean() { 
		if(individualBaseInfoBean==null) individualBaseInfoBean=new IndividualBaseInfoBean(); 
		return individualBaseInfoBean;
	} 
  public void setIndividualBaseInfoBean( IndividualBaseInfoBean individualBaseInfoBean ) { 
		this.individualBaseInfoBean=individualBaseInfoBean;
	} 


}