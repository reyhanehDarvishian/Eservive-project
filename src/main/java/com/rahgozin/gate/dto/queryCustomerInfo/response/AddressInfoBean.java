package com.rahgozin.gate.dto.queryCustomerInfo.response;

import javax.xml.bind.annotation.XmlAttribute;


public class AddressInfoBean {
    String addr1="";
    String addr2="";
    String addr3="";
    String addrClass="";
    String addrId="";
    String postalCode="";
    String usAddr="";
  public void setAddr1(String addr1) {
		this.addr1=addr1;
	} 
    @XmlAttribute(name = "addr1")
    public String getAddr1() { 
		return addr1;
	} 
  public void setAddr2(String addr2) { 
		this.addr2=addr2;
	} 
    @XmlAttribute(name = "addr2")
    public String getAddr2() { 
		return addr2;
	} 
  public void setAddr3(String addr3) { 
		this.addr3=addr3;
	} 
    @XmlAttribute(name = "addr3")
    public String getAddr3() { 
		return addr3;
	} 
  public void setAddrClass(String addrClass) { 
		this.addrClass=addrClass;
	} 
    @XmlAttribute(name = "addrClass")
    public String getAddrClass() { 
		return addrClass;
	} 
  public void setAddrId(String addrId) { 
		this.addrId=addrId;
	} 
    @XmlAttribute(name = "addrId")
    public String getAddrId() { 
		return addrId;
	} 
  public void setPostalCode(String postalCode) { 
		this.postalCode=postalCode;
	} 
    @XmlAttribute(name = "postalCode")
    public String getPostalCode() { 
		return postalCode;
	} 
  public void setUsAddr(String usAddr) { 
		this.usAddr=usAddr;
	} 
    @XmlAttribute(name = "usAddr")
    public String getUsAddr() { 
		return usAddr;
	} 



}