package com.rahgozin.gate.dto.queryCustomerInfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rahgozin.gate.dto.queryEntityId.response.EntityInfo;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "individualId",
        "firstName",
        "lastName",
        "title",
        "gender",
        "birthday",
        "nationality",
        "nativePlace",
        "writtenLang",
        "phoneticLang",
        "individualProperty"
})
@Generated("jsonschema2pojo")
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

    @JsonProperty("birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    public void setIndividualId(String individualId) {
        this.individualId = individualId;
    }

    @JsonProperty("individualId")
    public String getIndividualId() {
        return individualId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @JsonProperty("nativePlace")
    public String getNativePlace() {
        return nativePlace;
    }

    public void setPhoneticLang(String phoneticLang) {
        this.phoneticLang = phoneticLang;
    }

    @JsonProperty("phoneticLang")
    public String getPhoneticLang() {
        return phoneticLang;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setWrittenLang(String writtenLang) {
        this.writtenLang = writtenLang;
    }

    @JsonProperty("writtenLang")
    public String getWrittenLang() {
        return writtenLang;
    }

    @JsonProperty("individualProperty")
    public IndividualProperty getIndividualProperty() {
        return individualProperty;
    }

    @JsonProperty("individualProperty")
    public void setIndividualProperty(IndividualProperty individualProperty) {
		addToIndividualProperties(individualProperty);
        this.individualProperty = individualProperty;
    }

}