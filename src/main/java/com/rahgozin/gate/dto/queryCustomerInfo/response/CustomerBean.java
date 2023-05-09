package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;



public class CustomerBean {
    String customerId="";
@JsonProperty("addressInfo") 
    AddressInfoBean addressInfoBean ;
@JsonProperty("custBasicInfo") 
    CustBasicInfoBean custBasicInfoBean ;
@JsonProperty("individualInfo") 
    IndividualInfoBean individualInfoBean ;
  public void setCustomerId(String customerId) { 
		this.customerId=customerId;
	} 
    @XmlAttribute(name = "customerId")
    @XmlElement(name = "addressInfo")
    public AddressInfoBean getAddressInfoBean() { 
		if(addressInfoBean==null) addressInfoBean=new AddressInfoBean(); 
		return addressInfoBean;
	} 
  public void setAddressInfoBean( AddressInfoBean addressInfoBean ) { 
		this.addressInfoBean=addressInfoBean;
	} 
    @XmlElement(name = "custBasicInfo")
    public CustBasicInfoBean getCustBasicInfoBean() { 
		if(custBasicInfoBean==null) custBasicInfoBean=new CustBasicInfoBean(); 
		return custBasicInfoBean;
	} 
  public void setCustBasicInfoBean( CustBasicInfoBean custBasicInfoBean ) { 
		this.custBasicInfoBean=custBasicInfoBean;
	} 
    @XmlElement(name = "individualInfo")
    public IndividualInfoBean getIndividualInfoBean() { 
		if(individualInfoBean==null) individualInfoBean=new IndividualInfoBean(); 
		return individualInfoBean;
	} 
  public void setIndividualInfoBean( IndividualInfoBean individualInfoBean ) { 
		this.individualInfoBean=individualInfoBean;
	}
}