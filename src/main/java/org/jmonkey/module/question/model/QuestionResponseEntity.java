package org.jmonkey.module.question.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.answer.model.AnswerResponseEntity;
import org.jmonkey.module.heading.model.HeadingEntity;

import java.util.List;

public class QuestionResponseEntity {
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
    private List<AnswerResponseEntity> answers;

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

    public List<AnswerResponseEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerResponseEntity> answers) {
        this.answers = answers;
    }
}
