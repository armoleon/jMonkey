package org.jmonkey.module.survey.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.base.model.BaseDto;

import java.util.List;

public class Question extends BaseDto {
    private String id;
    private String visible;
    private String family;
    private String subtype;
    private Answer answers;

    @BeanCollection(elementType = Heading.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Heading> headings;


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

