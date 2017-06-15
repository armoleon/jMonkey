package org.jmonkey.module.question.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.answer.model.GivenAnswerEntity;
import org.jmonkey.module.heading.model.HeadingEntity;

import java.util.List;

public class AnsweredQuestionEntity {
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
    private List<GivenAnswerEntity> answers;

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

    public List<GivenAnswerEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(List<GivenAnswerEntity> answers) {
        this.answers = answers;
    }
}
