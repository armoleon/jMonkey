package org.jmonkey.module.question.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.answer.model.AnswerEntity;
import org.jmonkey.module.base.model.BaseEntity;
import org.jmonkey.module.heading.model.HeadingEntity;

import java.util.List;

public class QuestionEntity extends BaseEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("visible")
    private Boolean visible;

    @JsonProperty("family")
    private String family;

    @JsonProperty("subtype")
    private String subtype;

    @JsonProperty("position")
    private Integer position;

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

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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
