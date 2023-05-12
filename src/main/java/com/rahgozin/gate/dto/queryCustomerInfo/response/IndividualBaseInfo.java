package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahgozin.gate.dto.queryEntityId.response.EntityInfo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


public class IndividualBaseInfo {
	String individualId = "";
	String firstName = "";
	String lastName = "";
	String title = "";
	String gender = "";
    String birthday = "";
    String nationality = "";
    String nativePlace = "";
	String writtenLang = "";
    String phoneticLang = "";
    @JsonProperty("individualProperty")
	IndividualProperty individualProperty;
	private List<IndividualProperty> individualProperties = new ArrayList<>();

	public void addToIndividualProperties(IndividualProperty individualProperty) {
		individualProperties.add(individualProperty);
	}


	public List<IndividualProperty> getIndividualProperties() {
		return individualProperties;
	}

	public void setIndividualProperties(List<IndividualProperty> individualProperties) {
		this.individualProperties = individualProperties;
	}

	public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @XmlAttribute(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlAttribute(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @XmlAttribute(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setIndividualId(String individualId) {
        this.individualId = individualId;
    }

    @XmlAttribute(name = "individualId")
    public String getIndividualId() {
        return individualId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlAttribute(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @XmlAttribute(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @XmlAttribute(name = "nativePlace")
    public String getNativePlace() {
        return nativePlace;
    }

    public void setPhoneticLang(String phoneticLang) {
        this.phoneticLang = phoneticLang;
    }

    @XmlAttribute(name = "phoneticLang")
    public String getPhoneticLang() {
        return phoneticLang;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlAttribute(name = "title")
    public String getTitle() {
        return title;
    }

    public void setWrittenLang(String writtenLang) {
        this.writtenLang = writtenLang;
    }

    @XmlAttribute(name = "writtenLang")
    public String getWrittenLang() {
        return writtenLang;
    }

    @XmlElement(name = "individualProperty")
    public IndividualProperty getIndividualProperty() {
        if (individualProperty == null) individualProperty = new IndividualProperty();
        return individualProperty;
    }

    public void setIndividualProperty(IndividualProperty individualProperty) {
		addToIndividualProperties(individualProperty);
        this.individualProperty = individualProperty;
    }

}