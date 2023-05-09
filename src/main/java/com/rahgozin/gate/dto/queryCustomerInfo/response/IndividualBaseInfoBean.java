package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


public class IndividualBaseInfoBean {
    String birthday="";
    String firstName="";
    String gender="";
    String individualId="";
    String lastName="";
    String nationality="";
    String nativePlace="";
    String phoneticLang="";
    String title="";
    String writtenLang="";
    String textContent="";
@JsonProperty("individualProperty") 
    IndividualPropertyBean individualPropertyBean ;
  public void setBirthday(String birthday) { 
		this.birthday=birthday;
	} 
    @XmlAttribute(name = "birthday")
    public String getBirthday() { 
		return birthday;
	} 
  public void setFirstName(String firstName) { 
		this.firstName=firstName;
	} 
    @XmlAttribute(name = "firstName")
    public String getFirstName() { 
		return firstName;
	} 
  public void setGender(String gender) { 
		this.gender=gender;
	} 
    @XmlAttribute(name = "gender")
    public String getGender() { 
		return gender;
	} 
  public void setIndividualId(String individualId) { 
		this.individualId=individualId;
	} 
    @XmlAttribute(name = "individualId")
    public String getIndividualId() { 
		return individualId;
	} 
  public void setLastName(String lastName) { 
		this.lastName=lastName;
	} 
    @XmlAttribute(name = "lastName")
    public String getLastName() { 
		return lastName;
	} 
  public void setNationality(String nationality) { 
		this.nationality=nationality;
	} 
    @XmlAttribute(name = "nationality")
    public String getNationality() { 
		return nationality;
	} 
  public void setNativePlace(String nativePlace) { 
		this.nativePlace=nativePlace;
	} 
    @XmlAttribute(name = "nativePlace")
    public String getNativePlace() { 
		return nativePlace;
	} 
  public void setPhoneticLang(String phoneticLang) { 
		this.phoneticLang=phoneticLang;
	} 
    @XmlAttribute(name = "phoneticLang")
    public String getPhoneticLang() { 
		return phoneticLang;
	} 
  public void setTitle(String title) { 
		this.title=title;
	} 
    @XmlAttribute(name = "title")
    public String getTitle() { 
		return title;
	} 
  public void setWrittenLang(String writtenLang) { 
		this.writtenLang=writtenLang;
	} 
    @XmlAttribute(name = "writtenLang")
    public String getWrittenLang() { 
		return writtenLang;
	} 
  public void setTextContent(String textContent) { 
		this.textContent=textContent;
	} 
    @XmlAttribute(name = "TextContent")
    public String getTextContent() { 
		return textContent;
	} 
    @XmlElement(name = "individualProperty")
    public IndividualPropertyBean getIndividualPropertyBean() { 
		if(individualPropertyBean==null) individualPropertyBean=new IndividualPropertyBean(); 
		return individualPropertyBean;
	} 
  public void setIndividualPropertyBean( IndividualPropertyBean individualPropertyBean ) { 
		this.individualPropertyBean=individualPropertyBean;
	} 

}