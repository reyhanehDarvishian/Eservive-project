package com.rahgozin.gate.dto.queryCustomerInfo.response;

import javax.xml.bind.annotation.XmlAttribute;


public class CustBasicInfoBean {
    String custClass="";
    String custCode="";
    String custType="";
    String partyId="";
    String regionId="";
  public void setCustClass(String custClass) {
		this.custClass=custClass;
	} 
    @XmlAttribute(name = "custClass")
    public String getCustClass() { 
		return custClass;
	} 
  public void setCustCode(String custCode) { 
		this.custCode=custCode;
	} 
    @XmlAttribute(name = "custCode")
    public String getCustCode() { 
		return custCode;
	} 
  public void setCustType(String custType) { 
		this.custType=custType;
	} 
    @XmlAttribute(name = "custType")
    public String getCustType() { 
		return custType;
	} 
  public void setPartyId(String partyId) { 
		this.partyId=partyId;
	} 
    @XmlAttribute(name = "partyId")
    public String getPartyId() { 
		return partyId;
	} 
  public void setRegionId(String regionId) { 
		this.regionId=regionId;
	} 
    @XmlAttribute(name = "regionId")
    public String getRegionId() { 
		return regionId;
	} 



}