package org.jmonkey.module.question.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.answer.model.Answer;
import org.jmonkey.module.base.model.BaseDto;
import org.jmonkey.module.heading.model.Heading;

import java.util.List;

public class Question extends BaseDto {
    private String id;
    private Boolean visible;
    private String family;
    private String subtype;
    private Integer position;
    private Answer answers;

    @BeanCollection(elementType = Heading.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Heading> headings;


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

    public List<Heading> getHeadings() {
        return headings;
    }

    public void setHeadings(List<Heading> headings) {
        this.headings = headings;
    }

    public Answer getAnswers() {
        return answers;
    }

    public void setAnswers(Answer answers) {
        this.answers = answers;
    }
}

