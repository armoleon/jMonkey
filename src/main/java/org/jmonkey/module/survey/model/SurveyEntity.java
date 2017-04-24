package org.jmonkey.module.survey.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;
import org.jmonkey.module.page.model.Page;
import org.jmonkey.module.page.model.PageEntity;

import java.util.List;

public class SurveyEntity extends BaseEntity {

    @JsonProperty("id")
    private String surveyId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("nickname")
    private String nickName;

    @JsonProperty("category")
    private String category;

    @JsonProperty("language")
    private String language;

    @JsonProperty("question_count")
    private String questionCount;

    @JsonProperty("response_count")
    private String responseCount;

    @JsonProperty("page_count")
    private String pageCount;

    @JsonProperty("date_created")
    private String dateCreated;

    @JsonProperty("date_modified")
    private String dateModified;

    @JsonProperty("href")
    private String href;

    @JsonProperty("footer")
    private String footer;

    @JsonProperty("preview")
    private String preview;

    @JsonProperty("edit_url")
    private String editUrl;

    @JsonProperty("collect_url")
    private String collectUrl;

    @JsonProperty("analyze_url")
    private String analyzeUrl;

    @JsonProperty("summary_url")
    private String summaryUrl;

    @JsonProperty("pages")
    private List<PageEntity> pages;

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(String questionCount) {
        this.questionCount = questionCount;
    }

    public String getResponseCount() {
        return responseCount;
    }

    public void setResponseCount(String responseCount) {
        this.responseCount = responseCount;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
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

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getEditUrl() {
        return editUrl;
    }

    public void setEditUrl(String editUrl) {
        this.editUrl = editUrl;
    }

    public String getCollectUrl() {
        return collectUrl;
    }

    public void setCollectUrl(String collectUrl) {
        this.collectUrl = collectUrl;
    }

    public String getAnalyzeUrl() {
        return analyzeUrl;
    }

    public void setAnalyzeUrl(String analyzeUrl) {
        this.analyzeUrl = analyzeUrl;
    }

    public String getSummaryUrl() {
        return summaryUrl;
    }

    public void setSummaryUrl(String summaryUrl) {
        this.summaryUrl = summaryUrl;
    }

    public List<PageEntity> getPages() {
        return pages;
    }

    public void setPages(List<PageEntity> pages) {
        this.pages = pages;
    }

    public Survey toDto() {
        return getBeanMapperBuilder().addPackagePrefix(Page.class).build().map(this, Survey.class);
    }

}
