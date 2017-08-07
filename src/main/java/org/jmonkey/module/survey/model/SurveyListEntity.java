package org.jmonkey.module.survey.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.common.model.PaginationEntity;
import org.jmonkey.module.link.model.Link;
import org.jmonkey.module.link.model.LinkEntity;

import java.util.List;

public class SurveyListEntity extends PaginationEntity {

    @JsonProperty("data")
    private List<SurveyEntity> surveys;

    @JsonProperty("links")
    private LinkEntity links;

    public List<SurveyEntity> getSurveys() {
        return surveys;
    }

    public void setSurveys(List<SurveyEntity> surveys) {
        this.surveys = surveys;
    }

    public LinkEntity getLinks() {
        return links;
    }

    public void setLinks(LinkEntity links) {
        this.links = links;
    }

    public SurveyList toDto() {
        return getBeanMapperBuilder().addPackagePrefix(Link.class).build().map(this, SurveyList.class);
    }
}
