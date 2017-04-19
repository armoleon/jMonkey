package org.jmonkey.module.survey.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

import java.util.List;

public class QuestionEntity extends BaseEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("visible")
    private String visible;

    @JsonProperty("family")
    private String family;

    @JsonProperty("subtype")
    private String subtype;

    @JsonProperty("headings")
    private List<HeadingEntity> headings;

    @JsonProperty("answers")
    private AnswerEntity answers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public List<HeadingEntity> getHeadings() {
        return headings;
    }

    public void setHeadings(List<HeadingEntity> headings) {
        this.headings = headings;
    }

    public AnswerEntity getAnswers() {
        return answers;
    }

    public void setAnswers(AnswerEntity answers) {
        this.answers = answers;
    }
}
