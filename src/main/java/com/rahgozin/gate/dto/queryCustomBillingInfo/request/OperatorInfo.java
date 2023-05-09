package com.rahgozin.gate.dto.queryCustomBillingInfo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;


public class OperatorInfo {
    @JsonProperty("cbs:ChannelID")
    String channelID="";
    @JsonProperty("cbs:OperatorID")
    String operatorID="";
  public void setChannelID(String channelID) { 
		this.channelID=channelID;
	} 
    @XmlAttribute(name = "cbs:ChannelID")
    public String getChannelID() { 
		return channelID;
	} 
  public void setOperatorID(String operatorID) { 
		this.operatorID=operatorID;
	} 
    @XmlAttribute(name = "cbs:OperatorID")
    public String getOperatorID() { 
		return operatorID;
	} 

}