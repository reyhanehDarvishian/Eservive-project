package com.rahgozin.gate.dto.changeImsiReport.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Body"
})
@Generated("jsonschema2pojo")
public class ChangeImsiReportResEnvelope {
    @JsonProperty("body")
    private ChangeImsiReportResBody changeImsiReportResBody;

    @JsonProperty("body")
    public ChangeImsiReportResBody getBody() {
        if (changeImsiReportResBody == null) changeImsiReportResBody = new ChangeImsiReportResBody();
        return changeImsiReportResBody;
    }

    @JsonProperty("Body")
    public void setBody(ChangeImsiReportResBody changeImsiReportResBody) {
        this.changeImsiReportResBody = changeImsiReportResBody;
    }

}