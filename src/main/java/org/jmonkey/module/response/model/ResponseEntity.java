package org.jmonkey.module.response.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;
import org.jmonkey.module.page.model.PageResponseEntity;

import java.util.List;

public class ResponseEntity extends BaseEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("survey_id")
    private String surveyId;

    @JsonProperty("collector_id")
    private String collectorId;

    @JsonProperty("recipient_id")
    private String recipientId;

    @JsonProperty("response_status")
    private String responseStatus;

    @JsonProperty("href")
    private String href;

    @JsonProperty("date_created")
    private String dateCreated;

    @JsonProperty("date_modified")
    private String dateModified;

    @JsonProperty("pages")
    private List<PageResponseEntity> pages;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(String collectorId) {
        this.collectorId = collectorId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public List<PageResponseEntity> getPages() {
        return pages;
    }

    public void setPages(List<PageResponseEntity> pages) {
        this.pages = pages;
    }
}
